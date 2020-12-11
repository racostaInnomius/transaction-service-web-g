
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
    "holder",
    "number",
    "kind",
    "IBAN",
    "swift_bic",
    "bank",
    "metadata"
})
public class OtherAccount implements Serializable
{

    @JsonProperty("id")
    @ApiModelProperty(notes = "Id of this account", name="id")
    private String id;
    @JsonProperty("holder")
    @ApiModelProperty(notes = "Holder info", name="holder")
    private Holder_ holder;
    @JsonProperty("number")
    @ApiModelProperty(notes = "Account's number", name="number")
    private String number;
    @JsonProperty("kind")
    @ApiModelProperty(notes = "Kind of Account", name="kind")
    private String kind;
    @JsonProperty("IBAN")
    @ApiModelProperty(notes = "iBAN", name="iban")
    private String iBAN;
    @JsonProperty("swift_bic")
    @ApiModelProperty(notes = "SwiftBic", name="swift_bic")
    private Object swiftBic;
    @JsonProperty("bank")
    @ApiModelProperty(notes = "Bank info", name="bank")
    private Bank_ bank;
    @JsonProperty("metadata")
    @ApiModelProperty(notes = "Metadata info", name="metadata")
    private Metadata metadata;
    private final static long serialVersionUID = -2279781010595767416L;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("holder")
    public Holder_ getHolder() {
        return holder;
    }

    @JsonProperty("holder")
    public void setHolder(Holder_ holder) {
        this.holder = holder;
    }

    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    @JsonProperty("IBAN")
    public String getIBAN() {
        return iBAN;
    }

    @JsonProperty("IBAN")
    public void setIBAN(String iBAN) {
        this.iBAN = iBAN;
    }

    @JsonProperty("swift_bic")
    public Object getSwiftBic() {
        return swiftBic;
    }

    @JsonProperty("swift_bic")
    public void setSwiftBic(Object swiftBic) {
        this.swiftBic = swiftBic;
    }

    @JsonProperty("bank")
    public Bank_ getBank() {
        return bank;
    }

    @JsonProperty("bank")
    public void setBank(Bank_ bank) {
        this.bank = bank;
    }

    @JsonProperty("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    @JsonProperty("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("holder", holder).append("number", number).append("kind", kind).append("iBAN", iBAN).append("swiftBic", swiftBic).append("bank", bank).append("metadata", metadata).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(number).append(bank).append(metadata).append(swiftBic).append(kind).append(iBAN).append(holder).append(id).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OtherAccount) == false) {
            return false;
        }
        OtherAccount rhs = ((OtherAccount) other);
        return new EqualsBuilder().append(number, rhs.number).append(bank, rhs.bank).append(metadata, rhs.metadata).append(swiftBic, rhs.swiftBic).append(kind, rhs.kind).append(iBAN, rhs.iBAN).append(holder, rhs.holder).append(id, rhs.id).isEquals();
    }

}
