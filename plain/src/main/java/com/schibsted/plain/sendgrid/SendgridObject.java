
package com.schibsted.plain.sendgrid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "email",
    "category",
    "timestamp",
    "ip",
    "tls",
    "sg_message_id",
    "sg_event_id",
    "event",
    "cert_err",
    "url",
    "useragent",
    "url_offset",
    "smtp-id",
    "reason",
    "response",
    "attempts",
    "type",
    "status"
})
public class SendgridObject {

    /**
     * Email address of the intended recipient
     * (Required)
     * 
     */
    @JsonProperty("email")
    @JsonPropertyDescription("Email address of the intended recipient")
    @NotNull
    private String email;
    /**
     * List of Sendgrid email categories
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("List of Sendgrid email categories")
    @Valid
    private List<String> category = new ArrayList<String>();
    /**
     * Date and time formatted according to Activity Streams 2.0: https://www.w3.org/TR/activitystreams-core/#dates
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    @JsonPropertyDescription("Date and time formatted according to Activity Streams 2.0: https://www.w3.org/TR/activitystreams-core/#dates")
    @Pattern(regexp = "^([0-9]+)-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])[Tt]([01][0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9]|60)(\\.[0-9]+)?(([Zz])|([\\+|\\-]([01][0-9]|2[0-3]):[0-5][0-9])){1}$")
    @NotNull
    private String timestamp;
    /**
     * Which IP address was used to send the email.
     * 
     */
    @JsonProperty("ip")
    @JsonPropertyDescription("Which IP address was used to send the email.")
    private String ip;
    /**
     * Whether or not TLS was used when sending the email
     * 
     */
    @JsonProperty("tls")
    @JsonPropertyDescription("Whether or not TLS was used when sending the email")
    private Boolean tls;
    /**
     * Sengrid internal message id (same identifier for all unique email events)
     * (Required)
     * 
     */
    @JsonProperty("sg_message_id")
    @JsonPropertyDescription("Sengrid internal message id (same identifier for all unique email events)")
    @NotNull
    private String sgMessageId;
    /**
     * Sendgrid event id (unique)
     * (Required)
     * 
     */
    @JsonProperty("sg_event_id")
    @JsonPropertyDescription("Sendgrid event id (unique)")
    @NotNull
    private String sgEventId;
    /**
     * Event type
     * (Required)
     * 
     */
    @JsonProperty("event")
    @JsonPropertyDescription("Event type")
    @NotNull
    private SendgridObject.Event event;
    /**
     * Whether there was a certificate error on the receiving side
     * 
     */
    @JsonProperty("cert_err")
    @JsonPropertyDescription("Whether there was a certificate error on the receiving side")
    private Boolean certErr;
    /**
     * The url of the link clicked by user. Only for click event
     * 
     */
    @JsonProperty("url")
    @JsonPropertyDescription("The url of the link clicked by user. Only for click event")
    private String url;
    /**
     * The user agent responsible for the event. Only for click, open and spamReport events
     * 
     */
    @JsonProperty("useragent")
    @JsonPropertyDescription("The user agent responsible for the event. Only for click, open and spamReport events")
    private String useragent;
    @JsonProperty("url_offset")
    @Valid
    private UrlOffset urlOffset;
    /**
     * An id attached to the message by the originating system. Only for delivery event
     * 
     */
    @JsonProperty("smtp-id")
    @JsonPropertyDescription("An id attached to the message by the originating system. Only for delivery event")
    private String smtpId;
    /**
     * Reason for dropped event. Only for dropped event
     * 
     */
    @JsonProperty("reason")
    @JsonPropertyDescription("Reason for dropped event. Only for dropped event")
    private String reason;
    /**
     * Server response on deferred email. Only for deferred or bounce event
     * 
     */
    @JsonProperty("response")
    @JsonPropertyDescription("Server response on deferred email. Only for deferred or bounce event")
    private String response;
    /**
     * Delivery attempt. Only for deferred event
     * 
     */
    @JsonProperty("attempts")
    @JsonPropertyDescription("Delivery attempt. Only for deferred event")
    private Integer attempts;
    /**
     * Bounce type. Only for bounce event
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Bounce type. Only for bounce event")
    private String type;
    /**
     * Bounce status. Only for bounce event
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Bounce status. Only for bounce event")
    private String status;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Email address of the intended recipient
     * (Required)
     * 
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * Email address of the intended recipient
     * (Required)
     * 
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * List of Sendgrid email categories
     * 
     */
    @JsonProperty("category")
    public List<String> getCategory() {
        return category;
    }

    /**
     * List of Sendgrid email categories
     * 
     */
    @JsonProperty("category")
    public void setCategory(List<String> category) {
        this.category = category;
    }

    /**
     * Date and time formatted according to Activity Streams 2.0: https://www.w3.org/TR/activitystreams-core/#dates
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Date and time formatted according to Activity Streams 2.0: https://www.w3.org/TR/activitystreams-core/#dates
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Which IP address was used to send the email.
     * 
     */
    @JsonProperty("ip")
    public String getIp() {
        return ip;
    }

    /**
     * Which IP address was used to send the email.
     * 
     */
    @JsonProperty("ip")
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * Whether or not TLS was used when sending the email
     * 
     */
    @JsonProperty("tls")
    public Boolean getTls() {
        return tls;
    }

    /**
     * Whether or not TLS was used when sending the email
     * 
     */
    @JsonProperty("tls")
    public void setTls(Boolean tls) {
        this.tls = tls;
    }

    /**
     * Sengrid internal message id (same identifier for all unique email events)
     * (Required)
     * 
     */
    @JsonProperty("sg_message_id")
    public String getSgMessageId() {
        return sgMessageId;
    }

    /**
     * Sengrid internal message id (same identifier for all unique email events)
     * (Required)
     * 
     */
    @JsonProperty("sg_message_id")
    public void setSgMessageId(String sgMessageId) {
        this.sgMessageId = sgMessageId;
    }

    /**
     * Sendgrid event id (unique)
     * (Required)
     * 
     */
    @JsonProperty("sg_event_id")
    public String getSgEventId() {
        return sgEventId;
    }

    /**
     * Sendgrid event id (unique)
     * (Required)
     * 
     */
    @JsonProperty("sg_event_id")
    public void setSgEventId(String sgEventId) {
        this.sgEventId = sgEventId;
    }

    /**
     * Event type
     * (Required)
     * 
     */
    @JsonProperty("event")
    public SendgridObject.Event getEvent() {
        return event;
    }

    /**
     * Event type
     * (Required)
     * 
     */
    @JsonProperty("event")
    public void setEvent(SendgridObject.Event event) {
        this.event = event;
    }

    /**
     * Whether there was a certificate error on the receiving side
     * 
     */
    @JsonProperty("cert_err")
    public Boolean getCertErr() {
        return certErr;
    }

    /**
     * Whether there was a certificate error on the receiving side
     * 
     */
    @JsonProperty("cert_err")
    public void setCertErr(Boolean certErr) {
        this.certErr = certErr;
    }

    /**
     * The url of the link clicked by user. Only for click event
     * 
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * The url of the link clicked by user. Only for click event
     * 
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * The user agent responsible for the event. Only for click, open and spamReport events
     * 
     */
    @JsonProperty("useragent")
    public String getUseragent() {
        return useragent;
    }

    /**
     * The user agent responsible for the event. Only for click, open and spamReport events
     * 
     */
    @JsonProperty("useragent")
    public void setUseragent(String useragent) {
        this.useragent = useragent;
    }

    @JsonProperty("url_offset")
    public UrlOffset getUrlOffset() {
        return urlOffset;
    }

    @JsonProperty("url_offset")
    public void setUrlOffset(UrlOffset urlOffset) {
        this.urlOffset = urlOffset;
    }

    /**
     * An id attached to the message by the originating system. Only for delivery event
     * 
     */
    @JsonProperty("smtp-id")
    public String getSmtpId() {
        return smtpId;
    }

    /**
     * An id attached to the message by the originating system. Only for delivery event
     * 
     */
    @JsonProperty("smtp-id")
    public void setSmtpId(String smtpId) {
        this.smtpId = smtpId;
    }

    /**
     * Reason for dropped event. Only for dropped event
     * 
     */
    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }

    /**
     * Reason for dropped event. Only for dropped event
     * 
     */
    @JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * Server response on deferred email. Only for deferred or bounce event
     * 
     */
    @JsonProperty("response")
    public String getResponse() {
        return response;
    }

    /**
     * Server response on deferred email. Only for deferred or bounce event
     * 
     */
    @JsonProperty("response")
    public void setResponse(String response) {
        this.response = response;
    }

    /**
     * Delivery attempt. Only for deferred event
     * 
     */
    @JsonProperty("attempts")
    public Integer getAttempts() {
        return attempts;
    }

    /**
     * Delivery attempt. Only for deferred event
     * 
     */
    @JsonProperty("attempts")
    public void setAttempts(Integer attempts) {
        this.attempts = attempts;
    }

    /**
     * Bounce type. Only for bounce event
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Bounce type. Only for bounce event
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Bounce status. Only for bounce event
     * 
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * Bounce status. Only for bounce event
     * 
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
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
        return new HashCodeBuilder().append(email).append(category).append(timestamp).append(ip).append(tls).append(sgMessageId).append(sgEventId).append(event).append(certErr).append(url).append(useragent).append(urlOffset).append(smtpId).append(reason).append(response).append(attempts).append(type).append(status).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SendgridObject) == false) {
            return false;
        }
        SendgridObject rhs = ((SendgridObject) other);
        return new EqualsBuilder().append(email, rhs.email).append(category, rhs.category).append(timestamp, rhs.timestamp).append(ip, rhs.ip).append(tls, rhs.tls).append(sgMessageId, rhs.sgMessageId).append(sgEventId, rhs.sgEventId).append(event, rhs.event).append(certErr, rhs.certErr).append(url, rhs.url).append(useragent, rhs.useragent).append(urlOffset, rhs.urlOffset).append(smtpId, rhs.smtpId).append(reason, rhs.reason).append(response, rhs.response).append(attempts, rhs.attempts).append(type, rhs.type).append(status, rhs.status).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    public enum Event {

        DROPPED("dropped"),
        DELIVERED("delivered"),
        DEFERRED("deferred"),
        BOUNCE("bounce"),
        OPEN("open"),
        CLICK("click"),
        SPAM_REPORT("spamReport");
        private final String value;
        private final static Map<String, SendgridObject.Event> CONSTANTS = new HashMap<String, SendgridObject.Event>();

        static {
            for (SendgridObject.Event c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Event(String value) {
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
        public static SendgridObject.Event fromValue(String value) {
            SendgridObject.Event constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
