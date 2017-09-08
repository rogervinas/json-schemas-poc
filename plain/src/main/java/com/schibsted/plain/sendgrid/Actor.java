
package com.schibsted.plain.sendgrid;

import javax.validation.constraints.Pattern;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * Actor
 * <p>
 * A representation of an actor based on the common properties of Person and Organziation.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "@id",
    "remoteAddress"
})
public class Actor {

    /**
     * This is the account ID of a logged-in user. This field does not present in the data when the actor is not a logged-in user or not a user. The section after sdrn specifies the login system. The login realms are 'spid.no' for SPiD Norway, 'schibsted.com' for SPiD Sweden and global, 'leboncoin.fr' for Leboncoin, 'tori.fi' for Tori. Other login systems can be indicated with a custom string. The string is normally the login domain, e.g. 'coches.com', 'subito.it'. If a login system is used on multiple domains, please choose one single realm name to make sure that it is aligned on the different domains.
     * 
     */
    @JsonProperty("@id")
    @JsonPropertyDescription("This is the account ID of a logged-in user. This field does not present in the data when the actor is not a logged-in user or not a user. The section after sdrn specifies the login system. The login realms are 'spid.no' for SPiD Norway, 'schibsted.com' for SPiD Sweden and global, 'leboncoin.fr' for Leboncoin, 'tori.fi' for Tori. Other login systems can be indicated with a custom string. The string is normally the login domain, e.g. 'coches.com', 'subito.it'. If a login system is used on multiple domains, please choose one single realm name to make sure that it is aligned on the different domains.")
    private String id;
    /**
     * The IP address of the client
     * 
     */
    @JsonProperty("remoteAddress")
    @JsonPropertyDescription("The IP address of the client")
    @Pattern(regexp = "\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}")
    private Object remoteAddress;

    /**
     * This is the account ID of a logged-in user. This field does not present in the data when the actor is not a logged-in user or not a user. The section after sdrn specifies the login system. The login realms are 'spid.no' for SPiD Norway, 'schibsted.com' for SPiD Sweden and global, 'leboncoin.fr' for Leboncoin, 'tori.fi' for Tori. Other login systems can be indicated with a custom string. The string is normally the login domain, e.g. 'coches.com', 'subito.it'. If a login system is used on multiple domains, please choose one single realm name to make sure that it is aligned on the different domains.
     * 
     */
    @JsonProperty("@id")
    public String getId() {
        return id;
    }

    /**
     * This is the account ID of a logged-in user. This field does not present in the data when the actor is not a logged-in user or not a user. The section after sdrn specifies the login system. The login realms are 'spid.no' for SPiD Norway, 'schibsted.com' for SPiD Sweden and global, 'leboncoin.fr' for Leboncoin, 'tori.fi' for Tori. Other login systems can be indicated with a custom string. The string is normally the login domain, e.g. 'coches.com', 'subito.it'. If a login system is used on multiple domains, please choose one single realm name to make sure that it is aligned on the different domains.
     * 
     */
    @JsonProperty("@id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The IP address of the client
     * 
     */
    @JsonProperty("remoteAddress")
    public Object getRemoteAddress() {
        return remoteAddress;
    }

    /**
     * The IP address of the client
     * 
     */
    @JsonProperty("remoteAddress")
    public void setRemoteAddress(Object remoteAddress) {
        this.remoteAddress = remoteAddress;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(remoteAddress).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Actor) == false) {
            return false;
        }
        Actor rhs = ((Actor) other);
        return new EqualsBuilder().append(id, rhs.id).append(remoteAddress, rhs.remoteAddress).isEquals();
    }

}
