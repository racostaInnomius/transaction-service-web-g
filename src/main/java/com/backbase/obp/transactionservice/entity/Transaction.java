
package com.backbase.obp.transactionservice.entity;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModelProperty;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "this_account",
    "other_account",
    "details",
    "metadata"
})
public class Transaction implements Serializable
{

    @JsonProperty("id")
    @ApiModelProperty(notes = "Transaction id", name="id")
    private String id;
    @JsonProperty("this_account")
    @ApiModelProperty(notes = "This account", name="this_account")
    private ThisAccount thisAccount;
    @JsonProperty("other_account")
    @ApiModelProperty(notes = "Other account", name="other_account")
    private OtherAccount otherAccount;
    @JsonProperty("details")
    @ApiModelProperty(notes = "Details of account", name="details")
    private Details details;
    @JsonProperty("metadata")
    @ApiModelProperty(notes = "Details of metadata", name="metadata")
    private Metadata_ metadata;
    private final static long serialVersionUID = -2496208276800705029L;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("this_account")
    public ThisAccount getThisAccount() {
        return thisAccount;
    }

    @JsonProperty("this_account")
    public void setThisAccount(ThisAccount thisAccount) {
        this.thisAccount = thisAccount;
    }

    @JsonProperty("other_account")
    public OtherAccount getOtherAccount() {
        return otherAccount;
    }

    @JsonProperty("other_account")
    public void setOtherAccount(OtherAccount otherAccount) {
        this.otherAccount = otherAccount;
    }

    @JsonProperty("details")
    public Details getDetails() {
        return details;
    }

    @JsonProperty("details")
    public void setDetails(Details details) {
        this.details = details;
    }

    @JsonProperty("metadata")
    public Metadata_ getMetadata() {
        return metadata;
    }

    @JsonProperty("metadata")
    public void setMetadata(Metadata_ metadata) {
        this.metadata = metadata;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("thisAccount", thisAccount).append("otherAccount", otherAccount).append("details", details).append("metadata", metadata).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(otherAccount).append(details).append(metadata).append(id).append(thisAccount).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Transaction) == false) {
            return false;
        }
        Transaction rhs = ((Transaction) other);
        return new EqualsBuilder().append(otherAccount, rhs.otherAccount).append(details, rhs.details).append(metadata, rhs.metadata).append(id, rhs.id).append(thisAccount, rhs.thisAccount).isEquals();
    }

}
