
package com.backbase.obp.transactionservice.entity.res;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "accountId",
    "counterpartyAccount",
    "counterpartyName",
    "counterPartyLogoPath",
    "instructedAmount",
    "instructedCurrency",
    "transactionAmount",
    "transactionCurrency",
    "transactionType",
    "description"
})
public class TransactionRes {

    @JsonProperty("id")
    private String id;
    @JsonProperty("accountId")
    private String accountId;
    @JsonProperty("counterpartyAccount")
    private String counterpartyAccount;
    @JsonProperty("counterpartyName")
    private String counterpartyName;
    @JsonProperty("counterPartyLogoPath")
    private String counterPartyLogoPath;
    @JsonProperty("instructedAmount")
    private String instructedAmount;
    @JsonProperty("instructedCurrency")
    private String instructedCurrency;
    @JsonProperty("transactionAmount")
    private String transactionAmount;
    @JsonProperty("transactionCurrency")
    private String transactionCurrency;
    @JsonProperty("transactionType")
    private String transactionType;
    @JsonProperty("description")
    private String description;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("accountId")
    public String getAccountId() {
        return accountId;
    }

    @JsonProperty("accountId")
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @JsonProperty("counterpartyAccount")
    public String getCounterpartyAccount() {
        return counterpartyAccount;
    }

    @JsonProperty("counterpartyAccount")
    public void setCounterpartyAccount(String counterpartyAccount) {
        this.counterpartyAccount = counterpartyAccount;
    }

    @JsonProperty("counterpartyName")
    public String getCounterpartyName() {
        return counterpartyName;
    }

    @JsonProperty("counterpartyName")
    public void setCounterpartyName(String counterpartyName) {
        this.counterpartyName = counterpartyName;
    }

    @JsonProperty("counterPartyLogoPath")
    public String getCounterPartyLogoPath() {
        return counterPartyLogoPath;
    }

    @JsonProperty("counterPartyLogoPath")
    public void setCounterPartyLogoPath(String counterPartyLogoPath) {
        this.counterPartyLogoPath = counterPartyLogoPath;
    }

    @JsonProperty("instructedAmount")
    public String getInstructedAmount() {
        return instructedAmount;
    }

    @JsonProperty("instructedAmount")
    public void setInstructedAmount(String instructedAmount) {
        this.instructedAmount = instructedAmount;
    }

    @JsonProperty("instructedCurrency")
    public String getInstructedCurrency() {
        return instructedCurrency;
    }

    @JsonProperty("instructedCurrency")
    public void setInstructedCurrency(String instructedCurrency) {
        this.instructedCurrency = instructedCurrency;
    }

    @JsonProperty("transactionAmount")
    public String getTransactionAmount() {
        return transactionAmount;
    }

    @JsonProperty("transactionAmount")
    public void setTransactionAmount(String transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    @JsonProperty("transactionCurrency")
    public String getTransactionCurrency() {
        return transactionCurrency;
    }

    @JsonProperty("transactionCurrency")
    public void setTransactionCurrency(String transactionCurrency) {
        this.transactionCurrency = transactionCurrency;
    }

    @JsonProperty("transactionType")
    public String getTransactionType() {
        return transactionType;
    }

    @JsonProperty("transactionType")
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

}
