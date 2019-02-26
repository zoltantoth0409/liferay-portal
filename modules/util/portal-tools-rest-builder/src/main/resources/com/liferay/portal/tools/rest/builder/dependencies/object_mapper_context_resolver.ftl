package ${configYAML.apiPackagePath}.internal.jaxrs.context.resolver.${versionDirName};

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.util.ISO8601DateFormat;

import javax.annotation.Generated;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

import org.osgi.service.component.annotations.Component;

/**
 * @author ${configYAML.author}
 * @generated
 */
@Component(
	property = {
		"osgi.jaxrs.extension=true",
		"osgi.jaxrs.extension.select=(osgi.jaxrs.name=${configYAML.application.name})",
		"osgi.jaxrs.name=${configYAML.application.name}.${versionDirName}.ObjectMapperContextResolver"
	},
	service = ContextResolver.class
)
@Generated("")
@Provider
public class ObjectMapperContextResolver implements ContextResolver<ObjectMapper> {

	public ObjectMapper getContext(Class<?> clazz) {
		return _objectMapper;
	}

	private static final ObjectMapper _objectMapper = new ObjectMapper() {
		{
			configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true);
			enable(SerializationFeature.INDENT_OUTPUT);
			setDateFormat(new ISO8601DateFormat());
		}
	};

}