
package com.schibsted.polimorphic.sendgrid;

import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * Provider
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "@id",
    "product",
    "channel"
})
public class Provider {

    /**
     * String identifier of the site that originated the event
     * (Required)
     * 
     */
    @JsonProperty("@id")
    @JsonPropertyDescription("String identifier of the site that originated the event")
    @NotNull
    private Provider.Id id;
    /**
     * The exact product if applicable. The use case that originated the event. i.e. Ad management
     * 
     */
    @JsonProperty("product")
    @JsonPropertyDescription("The exact product if applicable. The use case that originated the event. i.e. Ad management")
    private String product;
    /**
     * Identifies the channel that triggered the event
     * (Required)
     * 
     */
    @JsonProperty("channel")
    @JsonPropertyDescription("Identifies the channel that triggered the event")
    @NotNull
    private Provider.Channel channel;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * String identifier of the site that originated the event
     * (Required)
     * 
     */
    @JsonProperty("@id")
    public Provider.Id getId() {
        return id;
    }

    /**
     * String identifier of the site that originated the event
     * (Required)
     * 
     */
    @JsonProperty("@id")
    public void setId(Provider.Id id) {
        this.id = id;
    }

    /**
     * The exact product if applicable. The use case that originated the event. i.e. Ad management
     * 
     */
    @JsonProperty("product")
    public String getProduct() {
        return product;
    }

    /**
     * The exact product if applicable. The use case that originated the event. i.e. Ad management
     * 
     */
    @JsonProperty("product")
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * Identifies the channel that triggered the event
     * (Required)
     * 
     */
    @JsonProperty("channel")
    public Provider.Channel getChannel() {
        return channel;
    }

    /**
     * Identifies the channel that triggered the event
     * (Required)
     * 
     */
    @JsonProperty("channel")
    public void setChannel(Provider.Channel channel) {
        this.channel = channel;
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
        return new HashCodeBuilder().append(id).append(product).append(channel).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Provider) == false) {
            return false;
        }
        Provider rhs = ((Provider) other);
        return new EqualsBuilder().append(id, rhs.id).append(product, rhs.product).append(channel, rhs.channel).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    public enum Channel {

        DESKTOP("desktop"),
        ANDROID("android"),
        IOS("ios"),
        WINDOWS_PHONE("windows-phone"),
        OTHER("other");
        private final String value;
        private final static Map<String, Provider.Channel> CONSTANTS = new HashMap<String, Provider.Channel>();

        static {
            for (Provider.Channel c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Channel(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Provider.Channel fromValue(String value) {
            Provider.Channel constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum Id {

        INFOJOBS("infojobs"),
        FOTOCASA("fotocasa"),
        MILANUNCIOS("milanuncios"),
        COCHES("coches"),
        MOTOS("motos"),
        VIBBO("vibbo"),
        INMOFACTORY("inmofactory"),
        WORKSI("worksi"),
        OTHER("other");
        private final String value;
        private final static Map<String, Provider.Id> CONSTANTS = new HashMap<String, Provider.Id>();

        static {
            for (Provider.Id c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Id(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Provider.Id fromValue(String value) {
            Provider.Id constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
