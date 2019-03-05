package ${configYAML.apiPackagePath}.internal.resource.${escapedVersion};

import com.liferay.portal.vulcan.resource.DocumentationResource;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Generated;

import javax.servlet.ServletConfig;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * @author ${configYAML.author}
 * @generated
 */
@Component(
	properties = "OSGI-INF/liferay/rest/${escapedVersion}/documentation.properties",
	service = DocumentationResourceImpl.class
)
@Generated("")
@Path("/${openAPIYAML.info.version}")
public class DocumentationResourceImpl {

	@GET
	@Path("/openapi.{type:json|yaml}")
	@Produces({MediaType.APPLICATION_JSON, "application/yaml"})
	public Response getOpenAPI(@Context HttpHeaders httpHeaders, @Context UriInfo uriInfo, @PathParam("type") String type) throws Exception {
		return _documentationResource.getOpenAPI(_application, httpHeaders, _resourceClasses, _servletConfig, type, uriInfo);
	}

	@Context
	private Application _application;

	@Reference
	private DocumentationResource _documentationResource;

	private final Set<Class<?>> _resourceClasses = new HashSet<Class<?>>() {
		{
			<#list openAPIYAML.components.schemas?keys as schemaName>
				<#assign javaMethodSignatures = freeMarkerTool.getResourceJavaMethodSignatures(configYAML, openAPIYAML, schemaName) />

				<#if javaMethodSignatures?has_content>
					add(${schemaName}ResourceImpl.class);
				</#if>
			</#list>
		}
	};

	@Context
	private ServletConfig _servletConfig;

}