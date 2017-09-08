
package com.schibsted.plain.sendgrid;

import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "index",
    "type"
})
public class UrlOffset {

    /**
     * Links are indexed beginning at 0. index indicates which link was clicked based on that index
     * 
     */
    @JsonProperty("index")
    @JsonPropertyDescription("Links are indexed beginning at 0. index indicates which link was clicked based on that index")
    private Integer index;
    /**
     * Indicates the type of the link that was clicked. Can be either text, HTML, or a header
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Indicates the type of the link that was clicked. Can be either text, HTML, or a header")
    private String type;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Links are indexed beginning at 0. index indicates which link was clicked based on that index
     * 
     */
    @JsonProperty("index")
    public Integer getIndex() {
        return index;
    }

    /**
     * Links are indexed beginning at 0. index indicates which link was clicked based on that index
     * 
     */
    @JsonProperty("index")
    public void setIndex(Integer index) {
        this.index = index;
    }

    /**
     * Indicates the type of the link that was clicked. Can be either text, HTML, or a header
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Indicates the type of the link that was clicked. Can be either text, HTML, or a header
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(index).append(type).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UrlOffset) == false) {
            return false;
        }
        UrlOffset rhs = ((UrlOffset) other);
        return new EqualsBuilder().append(index, rhs.index).append(type, rhs.type).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
