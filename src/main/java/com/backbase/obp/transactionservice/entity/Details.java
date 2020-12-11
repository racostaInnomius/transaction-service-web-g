
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
    "type",
    "description",
    "posted",
    "completed",
    "new_balance",
    "value"
})
public class Details implements Serializable
{

    @JsonProperty("type")
    private String type;
    @JsonProperty("description")
    private String description;
    @JsonProperty("posted")
    private String posted;
    @JsonProperty("completed")
    private String completed;
    @JsonProperty("new_balance")
    private NewBalance newBalance;
    @JsonProperty("value")
    private Value value;
    private final static long serialVersionUID = -6303881436594206942L;

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("posted")
    public String getPosted() {
        return posted;
    }

    @JsonProperty("posted")
    public void setPosted(String posted) {
        this.posted = posted;
    }

    @JsonProperty("completed")
    public String getCompleted() {
        return completed;
    }

    @JsonProperty("completed")
    public void setCompleted(String completed) {
        this.completed = completed;
    }

    @JsonProperty("new_balance")
    public NewBalance getNewBalance() {
        return newBalance;
    }

    @JsonProperty("new_balance")
    public void setNewBalance(NewBalance newBalance) {
        this.newBalance = newBalance;
    }

    @JsonProperty("value")
    public Value getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("description", description).append("posted", posted).append("completed", completed).append("newBalance", newBalance).append("value", value).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(newBalance).append(description).append(completed).append(type).append(value).append(posted).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Details) == false) {
            return false;
        }
        Details rhs = ((Details) other);
        return new EqualsBuilder().append(newBalance, rhs.newBalance).append(description, rhs.description).append(completed, rhs.completed).append(type, rhs.type).append(value, rhs.value).append(posted, rhs.posted).isEquals();
    }

}
