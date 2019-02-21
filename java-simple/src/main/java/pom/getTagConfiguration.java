package pom;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;
import javax.validation.constraints.*;

public class getTagConfiguration extends Configuration {
	@NotEmpty
	private String tagName;
	
	@NotEmpty
	private String defaultTag = "NaN";
	
	@JsonProperty
	public String getTagName() {
		return tagName;
	}
	
	@JsonProperty
	public String getDefaultName() {
		return defaultTag;
	}
	
	
    
	
	
}
