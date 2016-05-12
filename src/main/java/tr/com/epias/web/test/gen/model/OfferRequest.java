package tr.com.epias.web.test.gen.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import tr.com.epias.web.test.gen.model.OfferDetail;

import com.google.gson.annotations.SerializedName;




/**
 * This model keep Information of Offer Request.
 **/
@ApiModel(description = "This model keep Information of Offer Request.")
public class OfferRequest   {
  
  @SerializedName("deliveryDay")
  private LocalDateTime deliveryDay = null;
  

public enum OfferTypeEnum {
  @SerializedName("HOURLY")
  HOURLY("HOURLY"),

  @SerializedName("BLOCK")
  BLOCK("BLOCK"),

  @SerializedName("FLEXIBLE")
  FLEXIBLE("FLEXIBLE");

  private String value;

  OfferTypeEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  @SerializedName("offerType")
  private OfferTypeEnum offerType = null;
  
  @SerializedName("regionCode")
  private String regionCode = null;
  
  @SerializedName("currencyCode")
  private String currencyCode = null;
  
  @SerializedName("offerDetails")
  private List<OfferDetail> offerDetails = new ArrayList<OfferDetail>();
  

  
  /**
   * This model keeps Information of Offer.
   **/
  @ApiModelProperty(value = "This model keeps Information of Offer.")
  public LocalDateTime getDeliveryDay() {
    return deliveryDay;
  }
  public void setDeliveryDay(LocalDateTime deliveryDay) {
    this.deliveryDay = deliveryDay;
  }

  
  /**
   * This field keeps Offer Type.
   **/
  @ApiModelProperty(value = "This field keeps Offer Type.")
  public OfferTypeEnum getOfferType() {
    return offerType;
  }
  public void setOfferType(OfferTypeEnum offerType) {
    this.offerType = offerType;
  }

  
  /**
   * This field keeps Region Code of Offer.
   **/
  @ApiModelProperty(value = "This field keeps Region Code of Offer.")
  public String getRegionCode() {
    return regionCode;
  }
  public void setRegionCode(String regionCode) {
    this.regionCode = regionCode;
  }

  
  /**
   * This field keeps Currency Code of Offer.
   **/
  @ApiModelProperty(value = "This field keeps Currency Code of Offer.")
  public String getCurrencyCode() {
    return currencyCode;
  }
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  
  /**
   * This field keeps Model of Offer Detail.
   **/
  @ApiModelProperty(value = "This field keeps Model of Offer Detail.")
  public List<OfferDetail> getOfferDetails() {
    return offerDetails;
  }
  public void setOfferDetails(List<OfferDetail> offerDetails) {
    this.offerDetails = offerDetails;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferRequest offerRequest = (OfferRequest) o;
    return Objects.equals(this.deliveryDay, offerRequest.deliveryDay) &&
        Objects.equals(this.offerType, offerRequest.offerType) &&
        Objects.equals(this.regionCode, offerRequest.regionCode) &&
        Objects.equals(this.currencyCode, offerRequest.currencyCode) &&
        Objects.equals(this.offerDetails, offerRequest.offerDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryDay, offerType, regionCode, currencyCode, offerDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferRequest {\n");
    
    sb.append("    deliveryDay: ").append(toIndentedString(deliveryDay)).append("\n");
    sb.append("    offerType: ").append(toIndentedString(offerType)).append("\n");
    sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    offerDetails: ").append(toIndentedString(offerDetails)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
