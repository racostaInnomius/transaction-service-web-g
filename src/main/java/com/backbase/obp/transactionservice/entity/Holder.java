
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
    "name",
    "is_alias"
})
public class Holder implements Serializable
{

    @JsonProperty("name")
    @ApiModelProperty(notes = "Name of Holder", name="name")
    private String name;
    @JsonProperty("is_alias")
    @ApiModelProperty(notes = "IsAlias", name="isAlias")
    private Boolean isAlias;
    private final static long serialVersionUID = 1116291425899757306L;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("is_alias")
    public Boolean getIsAlias() {
        return isAlias;
    }

    @JsonProperty("is_alias")
    public void setIsAlias(Boolean isAlias) {
        this.isAlias = isAlias;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("isAlias", isAlias).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(isAlias).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Holder) == false) {
            return false;
        }
        Holder rhs = ((Holder) other);
        return new EqualsBuilder().append(name, rhs.name).append(isAlias, rhs.isAlias).isEquals();
    }

}
