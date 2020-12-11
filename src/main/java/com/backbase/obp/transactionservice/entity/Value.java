
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
    "currency",
    "amount"
})
public class Value implements Serializable
{

    @JsonProperty("currency")
    private String currency;
    @JsonProperty("amount")
    private String amount;
    private final static long serialVersionUID = 7902730166315972176L;

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("amount")
    public String getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("currency", currency).append("amount", amount).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(currency).append(amount).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Value) == false) {
            return false;
        }
        Value rhs = ((Value) other);
        return new EqualsBuilder().append(currency, rhs.currency).append(amount, rhs.amount).isEquals();
    }

}
