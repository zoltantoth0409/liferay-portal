package ${configYAML.apiPackagePath}.client.parser.${escapedVersion};

<#list allSchemas?keys as schemaName>
	import ${configYAML.apiPackagePath}.client.dto.${escapedVersion}.${schemaName};
</#list>

import java.util.Collection;
import java.util.Date;

import javax.annotation.Generated;

/**
 * @author ${configYAML.author}
 * @generated
 */
@Generated("")
public class ${schemaName}Parser {

	<#assign
		enumSchemas = freeMarkerTool.getDTOEnumSchemas(schema)
		properties = freeMarkerTool.getDTOProperties(configYAML, openAPIYAML, schema)
	/>

	public static String toJSON(${schemaName} ${schemaVarName}) {
		if (${schemaVarName} == null) {
			return "{}";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		<#list properties?keys as propertyName>
			<#if !propertyName?is_first>
				sb.append(", ");
			</#if>

			<#if enumSchemas?keys?seq_contains(properties[propertyName])>
				${schemaName}.
			</#if>

			<#assign
				propertyType = properties[propertyName]
			/>

			${propertyType} ${propertyName} = ${schemaVarName}.get${propertyName?cap_first}();

			sb.append("\"${propertyName}\": ");

			<#if properties[propertyName]?contains("[]")>
				if (${propertyName} == null) {
					sb.append("null");
				}
				else {
					sb.append("[");

					for (int i = 0; i < ${propertyName}.length; i++) {
						<#if stringUtil.equals(properties[propertyName], "Date[]") || stringUtil.equals(properties[propertyName], "String[]") || enumSchemas?keys?seq_contains(properties[propertyName])>
							sb.append("\"");
							sb.append(${propertyName}[i]);
							sb.append("\"");
						<#else>
							sb.append(${propertyName}[i]);
						</#if>

						if ((i + 1) < ${propertyName}.length) {
							sb.append(", ");
						}
					}

					sb.append("]");
				}
			<#else>
				<#if properties[propertyName]?ends_with("Date") || properties[propertyName]?ends_with("String") || enumSchemas?keys?seq_contains(properties[propertyName])>
					sb.append("\"");
					sb.append(${propertyName});
					sb.append("\"");
				<#else>
					sb.append(${propertyName});
				</#if>
			</#if>
		</#list>

		sb.append("}");

		return sb.toString();
	}

	public static String toJSON(Collection<${schemaName}> ${schemaVarNames}) {
		if (${schemaVarNames} == null) {
			return "[]";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("[");

		for (${schemaName} ${schemaVarName} : ${schemaVarNames}) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append(toJSON(${schemaVarName}));
		}

		sb.append("]");

		return sb.toString();
	}

	public static ${schemaName} to${schemaName}(String json) {
		return null;
	}

	public static ${schemaName}[] to${schemaNames}(String json) {
		return null;
	}

}