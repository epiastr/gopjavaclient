package tr.com.epias.web.test.gen.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;
import tr.com.epias.web.test.gen.model.ContractOfferRequest;

import com.google.gson.annotations.SerializedName;




/**
 * This model keeps Information of Contract.
 **/
@ApiModel(description = "This model keeps Information of Contract.")
public class ContractRequest   {
  
  @SerializedName("deliveryDay")
  private LocalDateTime deliveryDay = null;
  
  @SerializedName("counterEic")
  private String counterEic = null;
  
  @SerializedName("counterRegionCode")
  private String counterRegionCode = null;
  
  @SerializedName("offer")
  private ContractOfferRequest offer = null;
  

  
  /**
   * This field keeps date. Its format must be ISO8601.
   **/
  @ApiModelProperty(required = true, value = "This field keeps date. Its format must be ISO8601.")
  public LocalDateTime getDeliveryDay() {
    return deliveryDay;
  }
  public void setDeliveryDay(LocalDateTime deliveryDay) {
    this.deliveryDay = deliveryDay;
  }

  
  /**
   * This field keeps the EIC code information of the participant which will make a counter offer.
   **/
  @ApiModelProperty(required = true, value = "This field keeps the EIC code information of the participant which will make a counter offer.")
  public String getCounterEic() {
    return counterEic;
  }
  public void setCounterEic(String counterEic) {
    this.counterEic = counterEic;
  }

  
  /**
   * This field keeps the region information of the participant which will make a counter offer.
   **/
  @ApiModelProperty(required = true, value = "This field keeps the region information of the participant which will make a counter offer.")
  public String getCounterRegionCode() {
    return counterRegionCode;
  }
  public void setCounterRegionCode(String counterRegionCode) {
    this.counterRegionCode = counterRegionCode;
  }

  
  /**
   * This field keeps the offer information of the participant which will make a counter offer.
   **/
  @ApiModelProperty(required = true, value = "This field keeps the offer information of the participant which will make a counter offer.")
  public ContractOfferRequest getOffer() {
    return offer;
  }
  public void setOffer(ContractOfferRequest offer) {
    this.offer = offer;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractRequest contractRequest = (ContractRequest) o;
    return Objects.equals(this.deliveryDay, contractRequest.deliveryDay) &&
        Objects.equals(this.counterEic, contractRequest.counterEic) &&
        Objects.equals(this.counterRegionCode, contractRequest.counterRegionCode) &&
        Objects.equals(this.offer, contractRequest.offer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryDay, counterEic, counterRegionCode, offer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractRequest {\n");
    
    sb.append("    deliveryDay: ").append(toIndentedString(deliveryDay)).append("\n");
    sb.append("    counterEic: ").append(toIndentedString(counterEic)).append("\n");
    sb.append("    counterRegionCode: ").append(toIndentedString(counterRegionCode)).append("\n");
    sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
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
