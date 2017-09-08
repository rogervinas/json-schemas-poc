
package com.schibsted.plain.sendgrid;

import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
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
 * BaseEvent
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "@id",
    "@type",
    "actor",
    "published",
    "provider",
    "schema",
    "action"
})
public class BaseEvent {

    /**
     * UUIDv4 - xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx
     * (Required)
     * 
     */
    @JsonProperty("@id")
    @JsonPropertyDescription("UUIDv4 - xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx")
    @Pattern(regexp = "^[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-4[0-9A-Fa-f]{3}-[89ABab][0-9A-Fa-f]{3}-[0-9A-Fa-f]{12}$")
    @NotNull
    private String id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("@type")
    @NotNull
    private String type;
    /**
     * Actor
     * <p>
     * A representation of an actor based on the common properties of Person and Organziation.
     * 
     */
    @JsonProperty("actor")
    @JsonPropertyDescription("A representation of an actor based on the common properties of Person and Organziation.")
    @Valid
    private Actor actor;
    /**
     * Date and time formatted according to Activity Streams 2.0: https://www.w3.org/TR/activitystreams-core/#dates
     * (Required)
     * 
     */
    @JsonProperty("published")
    @JsonPropertyDescription("Date and time formatted according to Activity Streams 2.0: https://www.w3.org/TR/activitystreams-core/#dates")
    @Pattern(regexp = "^([0-9]+)-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])[Tt]([01][0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9]|60)(\\.[0-9]+)?(([Zz])|([\\+|\\-]([01][0-9]|2[0-3]):[0-5][0-9])){1}$")
    @NotNull
    private String published;
    /**
     * Provider
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("provider")
    @Valid
    @NotNull
    private Provider provider;
    /**
     * This field specifies which schema this event should comply to.
     * (Required)
     * 
     */
    @JsonProperty("schema")
    @JsonPropertyDescription("This field specifies which schema this event should comply to.")
    @NotNull
    private String schema;
    /**
     * This field specifies which schema this event should comply to.
     * 
     */
    @JsonProperty("action")
    @JsonPropertyDescription("This field specifies which schema this event should comply to.")
    private BaseEvent.Action action;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * UUIDv4 - xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx
     * (Required)
     * 
     */
    @JsonProperty("@id")
    public String getId() {
        return id;
    }

    /**
     * UUIDv4 - xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx
     * (Required)
     * 
     */
    @JsonProperty("@id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("@type")
    public String getType() {
        return type;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("@type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Actor
     * <p>
     * A representation of an actor based on the common properties of Person and Organziation.
     * 
     */
    @JsonProperty("actor")
    public Actor getActor() {
        return actor;
    }

    /**
     * Actor
     * <p>
     * A representation of an actor based on the common properties of Person and Organziation.
     * 
     */
    @JsonProperty("actor")
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    /**
     * Date and time formatted according to Activity Streams 2.0: https://www.w3.org/TR/activitystreams-core/#dates
     * (Required)
     * 
     */
    @JsonProperty("published")
    public String getPublished() {
        return published;
    }

    /**
     * Date and time formatted according to Activity Streams 2.0: https://www.w3.org/TR/activitystreams-core/#dates
     * (Required)
     * 
     */
    @JsonProperty("published")
    public void setPublished(String published) {
        this.published = published;
    }

    /**
     * Provider
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("provider")
    public Provider getProvider() {
        return provider;
    }

    /**
     * Provider
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("provider")
    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    /**
     * This field specifies which schema this event should comply to.
     * (Required)
     * 
     */
    @JsonProperty("schema")
    public String getSchema() {
        return schema;
    }

    /**
     * This field specifies which schema this event should comply to.
     * (Required)
     * 
     */
    @JsonProperty("schema")
    public void setSchema(String schema) {
        this.schema = schema;
    }

    /**
     * This field specifies which schema this event should comply to.
     * 
     */
    @JsonProperty("action")
    public BaseEvent.Action getAction() {
        return action;
    }

    /**
     * This field specifies which schema this event should comply to.
     * 
     */
    @JsonProperty("action")
    public void setAction(BaseEvent.Action action) {
        this.action = action;
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
        return new HashCodeBuilder().append(id).append(type).append(actor).append(published).append(provider).append(schema).append(action).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BaseEvent) == false) {
            return false;
        }
        BaseEvent rhs = ((BaseEvent) other);
        return new EqualsBuilder().append(id, rhs.id).append(type, rhs.type).append(actor, rhs.actor).append(published, rhs.published).append(provider, rhs.provider).append(schema, rhs.schema).append(action, rhs.action).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    public enum Action {

        CREATE("Create"),
        UPDATE("Update"),
        DELETE("Delete"),
        READ("Read");
        private final String value;
        private final static Map<String, BaseEvent.Action> CONSTANTS = new HashMap<String, BaseEvent.Action>();

        static {
            for (BaseEvent.Action c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Action(String value) {
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
        public static BaseEvent.Action fromValue(String value) {
            BaseEvent.Action constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
