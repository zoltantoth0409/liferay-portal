<#list entities as entity>
	<import class="${apiPackagePath}.model.${entity.name}" />
</#list>

<#list entities as entity>
	<class
		<#if entity.isDynamicUpdateEnabled()>
			dynamic-update="true"
		</#if>

		name="${packagePath}.model.impl.${entity.name}Impl" table="${entity.table}"
	>
		<#if entity.hasCompoundPK()>
			<composite-id class="${apiPackagePath}.service.persistence.${entity.name}PK" name="primaryKey">
				<#assign pkList = entity.getPKList() />

				<#list pkList as column>
					<key-property

					<#if serviceBuilder.isHBMCamelCasePropertyAccessor(column.name)>
						access="com.liferay.portal.dao.orm.hibernate.CamelCasePropertyAccessor"
					</#if>

					<#if column.name != column.DBName>
						column="${column.DBName}"
					</#if>

					name="${column.name}"

					<#if column.isPrimitiveType() || stringUtil.equals(column.type, "Map") || stringUtil.equals(column.type, "String")>
						type="com.liferay.portal.dao.orm.hibernate.${serviceBuilder.getPrimitiveObj("${column.type}")}Type"
					</#if>

					<#if stringUtil.equals(column.type, "Date")>
						type="org.hibernate.type.TimestampType"
					</#if>

					/>
				</#list>
			</composite-id>
		<#else>
			<#assign column = entity.getPKList()?first />

			<id
				<#if serviceBuilder.isHBMCamelCasePropertyAccessor(column.name)>
					access="com.liferay.portal.dao.orm.hibernate.CamelCasePropertyAccessor"
				</#if>

				<#if column.name != column.DBName>
					column="${column.DBName}"
				</#if>

				name="${column.name}"
				type="<#if !entity.hasPrimitivePK()>java.lang.</#if>${column.type}"

				>

				<#if column.idType??>
					<#assign class = serviceBuilder.getGeneratorClass("${column.idType}") />

					<#if stringUtil.equals(class, "class")>
						<#assign class = column.idParam />
					</#if>
				<#else>
					<#assign class = "assigned" />
				</#if>

				<generator class="${class}"

				<#if stringUtil.equals(class, "sequence")>
						><param name="sequence">${column.idParam}</param>
					</generator>
				<#else>
					/>
				</#if>
			</id>
		</#if>

		<#if entity.isMvccEnabled()>
			<version access="com.liferay.portal.dao.orm.hibernate.PrivatePropertyAccessor" name="mvccVersion" type="long" />
		</#if>

		<#list entity.entityColumns as entityColumn>
			<#if entityColumn.EJBName??>
				<#assign ejbName = true />
			<#else>
				<#assign ejbName = false />
			</#if>

			<#if !entityColumn.isPrimary() && !entityColumn.isCollection() && !ejbName && (!stringUtil.equals(entityColumn.type, "Blob") || (stringUtil.equals(entityColumn.type, "Blob") && !entityColumn.lazy)) && !stringUtil.equals(entityColumn.name, "mvccVersion")>
				<property

				<#if serviceBuilder.isHBMCamelCasePropertyAccessor(entityColumn.name)>
					access="com.liferay.portal.dao.orm.hibernate.CamelCasePropertyAccessor"
				</#if>

				<#if entityColumn.name != entityColumn.DBName>
					entityColumn="${entityColumn.DBName}"
				</#if>

				name="${entityColumn.name}"

				<#if (serviceBuilder.getSqlType(entity.getName(), entityColumn.getName(), entityColumn.getType()) == "CLOB") && !stringUtil.equals(entityColumn.type, "Map")>
					type="com.liferay.portal.dao.orm.hibernate.StringClobType"
				<#elseif entityColumn.isPrimitiveType() || stringUtil.equals(entityColumn.type, "Map") || stringUtil.equals(entityColumn.type, "String")>
					type="com.liferay.portal.dao.orm.hibernate.${serviceBuilder.getPrimitiveObj("${entityColumn.type}")}Type"
				<#else>
					<#if stringUtil.equals(entityColumn.type, "Date")>
						type="org.hibernate.type.TimestampType"
					<#else>
						type="org.hibernate.type.${entityColumn.type}Type"
					</#if>
				</#if>

				/>
			</#if>

			<#if stringUtil.equals(entityColumn.type, "Blob") && entityColumn.lazy>
				<one-to-one access="com.liferay.portal.dao.orm.hibernate.PrivatePropertyAccessor" cascade="save-update" class="${apiPackagePath}.model.${entity.name}${entityColumn.methodName}BlobModel" constrained="true" name="${entityColumn.name}BlobModel" outer-join="false" />
			</#if>
		</#list>
	</class>

	<#list entity.blobEntityColumns as blobEntityColumn>
		<#if blobEntityColumn.lazy>
			<class
				<#if entity.isDynamicUpdateEnabled()>
					dynamic-update="true"
				</#if>

				lazy="true" name="${apiPackagePath}.model.${entity.name}${blobEntityColumn.methodName}BlobModel" table="${entity.table}"
			>
				<#assign column = entity.getPKList()?first />

				<id column="${column.DBName}" name="${column.name}">
					<generator class="foreign">
						<param name="property">${packagePath}.model.impl.${entity.name}Impl</param>
					</generator>
				</id>

				<property column="${blobEntityColumn.DBName}" name="${blobEntityColumn.name}Blob" type="blob" />
			</class>
		</#if>
	</#list>
</#list>