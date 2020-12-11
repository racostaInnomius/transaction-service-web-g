
package com.backbase.obp.transactionservice.entity;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "narrative",
    "comments",
    "tags",
    "images",
    "where"
})
public class Metadata_ implements Serializable
{

    @JsonProperty("narrative")
    private Object narrative;
    @JsonProperty("comments")
    private List<Object> comments = null;
    @JsonProperty("tags")
    private List<Object> tags = null;
    @JsonProperty("images")
    private List<Object> images = null;
    @JsonProperty("where")
    private Object where;
    private final static long serialVersionUID = -1772033873804404231L;

    @JsonProperty("narrative")
    public Object getNarrative() {
        return narrative;
    }

    @JsonProperty("narrative")
    public void setNarrative(Object narrative) {
        this.narrative = narrative;
    }

    @JsonProperty("comments")
    public List<Object> getComments() {
        return comments;
    }

    @JsonProperty("comments")
    public void setComments(List<Object> comments) {
        this.comments = comments;
    }

    @JsonProperty("tags")
    public List<Object> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    @JsonProperty("images")
    public List<Object> getImages() {
        return images;
    }

    @JsonProperty("images")
    public void setImages(List<Object> images) {
        this.images = images;
    }

    @JsonProperty("where")
    public Object getWhere() {
        return where;
    }

    @JsonProperty("where")
    public void setWhere(Object where) {
        this.where = where;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("narrative", narrative).append("comments", comments).append("tags", tags).append("images", images).append("where", where).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(images).append(where).append(comments).append(narrative).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Metadata_) == false) {
            return false;
        }
        Metadata_ rhs = ((Metadata_) other);
        return new EqualsBuilder().append(images, rhs.images).append(where, rhs.where).append(comments, rhs.comments).append(narrative, rhs.narrative).append(tags, rhs.tags).isEquals();
    }

}
