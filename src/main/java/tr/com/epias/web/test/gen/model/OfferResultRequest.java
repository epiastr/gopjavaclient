package tr.com.epias.web.test.gen.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;

import com.google.gson.annotations.SerializedName;




/**
 * This model keeps Information of Offer Result.
 **/
@ApiModel(description = "This model keeps Information of Offer Result.")
public class OfferResultRequest   {
  
  @SerializedName("deliveryDay")
  private LocalDateTime deliveryDay = null;
  
  @SerializedName("region")
  private String region = null;
  

  
  /**
   * This field keeps Delivery Date.
   **/
  @ApiModelProperty(value = "This field keeps Delivery Date.")
  public LocalDateTime getDeliveryDay() {
    return deliveryDay;
  }
  public void setDeliveryDay(LocalDateTime deliveryDay) {
    this.deliveryDay = deliveryDay;
  }

  
  /**
   * This field keeps Region Information.
   **/
  @ApiModelProperty(value = "This field keeps Region Information.")
  public String getRegion() {
    return region;
  }
  public void setRegion(String region) {
    this.region = region;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferResultRequest offerResultRequest = (OfferResultRequest) o;
    return Objects.equals(this.deliveryDay, offerResultRequest.deliveryDay) &&
        Objects.equals(this.region, offerResultRequest.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryDay, region);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferResultRequest {\n");
    
    sb.append("    deliveryDay: ").append(toIndentedString(deliveryDay)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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
