
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
    "public_alias",
    "private_alias",
    "more_info",
    "URL",
    "image_URL",
    "open_corporates_URL",
    "corporate_location",
    "physical_location"
})
public class Metadata implements Serializable
{

    @JsonProperty("public_alias")
    private String publicAlias;
    @JsonProperty("private_alias")
    private String privateAlias;
    @JsonProperty("more_info")
    private String moreInfo;
    @JsonProperty("URL")
    private String uRL;
    @JsonProperty("image_URL")
    private String imageURL;
    @JsonProperty("open_corporates_URL")
    private String openCorporatesURL;
    @JsonProperty("corporate_location")
    private String corporateLocation;
    @JsonProperty("physical_location")
    private String physicalLocation;
    private final static long serialVersionUID = 8371918301331161684L;

    @JsonProperty("public_alias")
    public String getPublicAlias() {
        return publicAlias;
    }

    @JsonProperty("public_alias")
    public void setPublicAlias(String publicAlias) {
        this.publicAlias = publicAlias;
    }

    @JsonProperty("private_alias")
    public String getPrivateAlias() {
        return privateAlias;
    }

    @JsonProperty("private_alias")
    public void setPrivateAlias(String privateAlias) {
        this.privateAlias = privateAlias;
    }

    @JsonProperty("more_info")
    public String getMoreInfo() {
        return moreInfo;
    }

    @JsonProperty("more_info")
    public void setMoreInfo(String moreInfo) {
        this.moreInfo = moreInfo;
    }

    @JsonProperty("URL")
    public String getURL() {
        return uRL;
    }

    @JsonProperty("URL")
    public void setURL(String uRL) {
        this.uRL = uRL;
    }

    @JsonProperty("image_URL")
    public String getImageURL() {
        return imageURL;
    }

    @JsonProperty("image_URL")
    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @JsonProperty("open_corporates_URL")
    public String getOpenCorporatesURL() {
        return openCorporatesURL;
    }

    @JsonProperty("open_corporates_URL")
    public void setOpenCorporatesURL(String openCorporatesURL) {
        this.openCorporatesURL = openCorporatesURL;
    }

    @JsonProperty("corporate_location")
    public String getCorporateLocation() {
        return corporateLocation;
    }

    @JsonProperty("corporate_location")
    public void setCorporateLocation(String corporateLocation) {
        this.corporateLocation = corporateLocation;
    }

    @JsonProperty("physical_location")
    public String getPhysicalLocation() {
        return physicalLocation;
    }

    @JsonProperty("physical_location")
    public void setPhysicalLocation(String physicalLocation) {
        this.physicalLocation = physicalLocation;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("publicAlias", publicAlias).append("privateAlias", privateAlias).append("moreInfo", moreInfo).append("uRL", uRL).append("imageURL", imageURL).append("openCorporatesURL", openCorporatesURL).append("corporateLocation", corporateLocation).append("physicalLocation", physicalLocation).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(publicAlias).append(privateAlias).append(openCorporatesURL).append(physicalLocation).append(imageURL).append(corporateLocation).append(moreInfo).append(uRL).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Metadata) == false) {
            return false;
        }
        Metadata rhs = ((Metadata) other);
        return new EqualsBuilder().append(publicAlias, rhs.publicAlias).append(privateAlias, rhs.privateAlias).append(openCorporatesURL, rhs.openCorporatesURL).append(physicalLocation, rhs.physicalLocation).append(imageURL, rhs.imageURL).append(corporateLocation, rhs.corporateLocation).append(moreInfo, rhs.moreInfo).append(uRL, rhs.uRL).isEquals();
    }

}
