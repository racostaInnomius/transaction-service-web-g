
package com.backbase.obp.transactionservice.entity;

import java.io.Serializable;
import java.util.List;
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
    "holders",
    "number",
    "kind",
    "IBAN",
    "swift_bic",
    "bank"
})
public class ThisAccount implements Serializable
{

    @JsonProperty("id")
    @ApiModelProperty(notes = "Id of this account", name="id")
    private String id;
    @JsonProperty("holders")
    @ApiModelProperty(notes = "Collection of Holders", name="holders")
    private List<Holder> holders = null;
    @JsonProperty("number")
    @ApiModelProperty(notes = "Account's number", name="number")
    private String number;
    @JsonProperty("kind")
    @ApiModelProperty(notes = "Kind of Account", name="kind")
    private String kind;
    @JsonProperty("IBAN")
    @ApiModelProperty(notes = "iBAN", name="iban")
    private Object iBAN;
    @JsonProperty("swift_bic")
    @ApiModelProperty(notes = "SwiftBic", name="swift_bic")
    private Object swiftBic;
    @JsonProperty("bank")
    @ApiModelProperty(notes = "Bank info", name="bank")
    private Bank bank;
    private final static long serialVersionUID = -473807779454232984L;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("holders")
    public List<Holder> getHolders() {
        return holders;
    }

    @JsonProperty("holders")
    public void setHolders(List<Holder> holders) {
        this.holders = holders;
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
    public Object getIBAN() {
        return iBAN;
    }

    @JsonProperty("IBAN")
    public void setIBAN(Object iBAN) {
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
    public Bank getBank() {
        return bank;
    }

    @JsonProperty("bank")
    public void setBank(Bank bank) {
        this.bank = bank;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("holders", holders).append("number", number).append("kind", kind).append("iBAN", iBAN).append("swiftBic", swiftBic).append("bank", bank).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(number).append(bank).append(holders).append(swiftBic).append(kind).append(iBAN).append(id).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ThisAccount) == false) {
            return false;
        }
        ThisAccount rhs = ((ThisAccount) other);
        return new EqualsBuilder().append(number, rhs.number).append(bank, rhs.bank).append(holders, rhs.holders).append(swiftBic, rhs.swiftBic).append(kind, rhs.kind).append(iBAN, rhs.iBAN).append(id, rhs.id).isEquals();
    }

}
