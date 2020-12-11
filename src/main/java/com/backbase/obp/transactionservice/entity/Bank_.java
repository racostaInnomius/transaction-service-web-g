
package com.backbase.obp.transactionservice.entity;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "national_identifier",
    "name"
})
public class Bank_ implements Serializable
{

    @JsonProperty("national_identifier")
    private Object nationalIdentifier;
    @JsonProperty("name")
    private String name;
    private final static long serialVersionUID = 7626260547185143715L;

    @JsonProperty("national_identifier")
    public Object getNationalIdentifier() {
        return nationalIdentifier;
    }

    @JsonProperty("national_identifier")
    public void setNationalIdentifier(Object nationalIdentifier) {
        this.nationalIdentifier = nationalIdentifier;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("nationalIdentifier", nationalIdentifier).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(nationalIdentifier).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Bank_) == false) {
            return false;
        }
        Bank_ rhs = ((Bank_) other);
        return new EqualsBuilder().append(name, rhs.name).append(nationalIdentifier, rhs.nationalIdentifier).isEquals();
    }

}
