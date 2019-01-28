package ${configYAML.apiPackagePath}.dto;

import com.liferay.rest.booster.apio.context.BaseCollection;

import java.util.Collection;
import java.util.Collections;

import javax.annotation.Generated;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * @author ${configYAML.author}
 * @generated
 */
@Generated("")
@XmlRootElement(name = "collection")
@XmlSeeAlso({${schemaName}.class})
public class ${schemaName}Collection<T> extends BaseCollection<T> {

	public ${schemaName}Collection() {
		setItems(Collections.emptyList());
		setTotalCount(0);
	}

	public ${schemaName}Collection(Collection<T> items, int totalCount) {
		setItems(items);
		setTotalCount(totalCount);
	}

}