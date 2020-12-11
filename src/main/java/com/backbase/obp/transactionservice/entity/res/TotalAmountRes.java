
package com.backbase.obp.transactionservice.entity.res;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "transactionType",
    "transactionAmount"
})
public class TotalAmountRes {

    @JsonProperty("transactionType")
    private String transactionType;
    @JsonProperty("transactionAmount")
    private Double transactionAmount;

    @JsonProperty("transactionType")
    public String getTransactionType() {
        return transactionType;
    }

    @JsonProperty("transactionType")
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    @JsonProperty("transactionAmount")
    public Double getTransactionAmount() {
        return transactionAmount;
    }

    @JsonProperty("transactionAmount")
    public void setTransactionAmount(Double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

}
