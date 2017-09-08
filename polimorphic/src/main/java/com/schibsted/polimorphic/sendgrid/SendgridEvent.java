
package com.schibsted.polimorphic.sendgrid;

import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
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
    "BaseEvent",
    "SendgridObject"
})
public class SendgridEvent {

    /**
     * BaseEvent
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BaseEvent")
    @Valid
    @NotNull
    private BaseEvent baseEvent;
    /**
     * Email events from Sendgrid Webhook
     * (Required)
     * 
     */
    @JsonProperty("SendgridObject")
    @JsonPropertyDescription("Email events from Sendgrid Webhook")
    @NotNull
    private Object sendgridObject;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * BaseEvent
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BaseEvent")
    public BaseEvent getBaseEvent() {
        return baseEvent;
    }

    /**
     * BaseEvent
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("BaseEvent")
    public void setBaseEvent(BaseEvent baseEvent) {
        this.baseEvent = baseEvent;
    }

    /**
     * Email events from Sendgrid Webhook
     * (Required)
     * 
     */
    @JsonProperty("SendgridObject")
    public Object getSendgridObject() {
        return sendgridObject;
    }

    /**
     * Email events from Sendgrid Webhook
     * (Required)
     * 
     */
    @JsonProperty("SendgridObject")
    public void setSendgridObject(Object sendgridObject) {
        this.sendgridObject = sendgridObject;
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
        return new HashCodeBuilder().append(baseEvent).append(sendgridObject).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SendgridEvent) == false) {
            return false;
        }
        SendgridEvent rhs = ((SendgridEvent) other);
        return new EqualsBuilder().append(baseEvent, rhs.baseEvent).append(sendgridObject, rhs.sendgridObject).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
