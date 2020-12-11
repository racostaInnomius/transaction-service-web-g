
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
    "transactions"
})
public class Transactions implements Serializable
{

    @JsonProperty("transactions")
    @ApiModelProperty(notes = "Collection of Transactions", name="transactions")
    private List<Transaction> transactions = null;
    private final static long serialVersionUID = 3405506245783483181L;

    @JsonProperty("transactions")
    public List<Transaction> getTransactions() {
        return transactions;
    }

    @JsonProperty("transactions")
    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("transactions", transactions).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(transactions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Transactions) == false) {
            return false;
        }
        Transactions rhs = ((Transactions) other);
        return new EqualsBuilder().append(transactions, rhs.transactions).isEquals();
    }

}
