package ${configYAML.apiPackagePath}.internal.resource;

import ${configYAML.apiPackagePath}.resource.${schemaName}Resource;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * @author ${configYAML.author}
 */
@Component(
	property = {
		"api.version=${openAPIYAML.info.version}",
		"osgi.jaxrs.application.select=(osgi.jaxrs.name=${configYAML.application.name}.rest)",
		"osgi.jaxrs.resource=true"
	},
	scope = ServiceScope.PROTOTYPE, service = ${schemaName}Resource.class)
public class ${schemaName}ResourceImpl extends Base${schemaName}ResourceImpl {
}