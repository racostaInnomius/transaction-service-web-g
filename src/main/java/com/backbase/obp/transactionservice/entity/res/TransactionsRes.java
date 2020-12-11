
package com.backbase.obp.transactionservice.entity.res;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "transactions"
})
public class TransactionsRes {

    @JsonProperty("transactions")
    private List<TransactionRes> transactions = null;

    @JsonProperty("transactions")
    public List<TransactionRes> getTransactions() {
        return transactions;
    }

    @JsonProperty("transactions")
    public void setTransactions(List<TransactionRes> transactions) {
        this.transactions = transactions;
    }

}
