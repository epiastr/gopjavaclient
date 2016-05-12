package tr.com.epias.web.test.gen.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;

import com.google.gson.annotations.SerializedName;




/**
 * Request Criteria of Offer Delete
 **/
@ApiModel(description = "Request Criteria of Offer Delete")
public class DeleteOfferRequest   {
  
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
  

  
  /**
   * Delivery Day
   **/
  @ApiModelProperty(value = "Delivery Day")
  public LocalDateTime getDeliveryDay() {
    return deliveryDay;
  }
  public void setDeliveryDay(LocalDateTime deliveryDay) {
    this.deliveryDay = deliveryDay;
  }

  
  /**
   * Offer Type
   **/
  @ApiModelProperty(value = "Offer Type")
  public OfferTypeEnum getOfferType() {
    return offerType;
  }
  public void setOfferType(OfferTypeEnum offerType) {
    this.offerType = offerType;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteOfferRequest deleteOfferRequest = (DeleteOfferRequest) o;
    return Objects.equals(this.deliveryDay, deleteOfferRequest.deliveryDay) &&
        Objects.equals(this.offerType, deleteOfferRequest.offerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryDay, offerType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteOfferRequest {\n");
    
    sb.append("    deliveryDay: ").append(toIndentedString(deliveryDay)).append("\n");
    sb.append("    offerType: ").append(toIndentedString(offerType)).append("\n");
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
