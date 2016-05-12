package tr.com.epias.web.test.gen.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;

import com.google.gson.annotations.SerializedName;




/**
 * This model keeps Information of Contract.
 **/
@ApiModel(description = "This model keeps Information of Contract.")
public class QueryContractRequest   {
  
  @SerializedName("deliveryDay")
  private LocalDateTime deliveryDay = null;
  
  @SerializedName("regionCode")
  private String regionCode = null;
  
  @SerializedName("counterRegionCode")
  private String counterRegionCode = null;
  
  @SerializedName("eic")
  private String eic = null;
  
  @SerializedName("counterEic")
  private String counterEic = null;
  

public enum StatusEnum {
  @SerializedName("APPROVED")
  APPROVED("APPROVED"),

  @SerializedName("WAITING_FOR_APPROVAL")
  WAITING_FOR_APPROVAL("WAITING_FOR_APPROVAL"),

  @SerializedName("INVALID")
  INVALID("INVALID");

  private String value;

  StatusEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  @SerializedName("status")
  private StatusEnum status = null;
  

  
  /**
   * This field keeps date. Its format must be ISO8601.
   **/
  @ApiModelProperty(value = "This field keeps date. Its format must be ISO8601.")
  public LocalDateTime getDeliveryDay() {
    return deliveryDay;
  }
  public void setDeliveryDay(LocalDateTime deliveryDay) {
    this.deliveryDay = deliveryDay;
  }

  
  /**
   * This field keeps Information of Region.
   **/
  @ApiModelProperty(value = "This field keeps Information of Region.")
  public String getRegionCode() {
    return regionCode;
  }
  public void setRegionCode(String regionCode) {
    this.regionCode = regionCode;
  }

  
  /**
   * This field keeps Information of Counter Region.
   **/
  @ApiModelProperty(value = "This field keeps Information of Counter Region.")
  public String getCounterRegionCode() {
    return counterRegionCode;
  }
  public void setCounterRegionCode(String counterRegionCode) {
    this.counterRegionCode = counterRegionCode;
  }

  
  /**
   * This field keeps Information of EIC.
   **/
  @ApiModelProperty(value = "This field keeps Information of EIC.")
  public String getEic() {
    return eic;
  }
  public void setEic(String eic) {
    this.eic = eic;
  }

  
  /**
   * This field keeps Information of Counter Organization' s EIC.
   **/
  @ApiModelProperty(value = "This field keeps Information of Counter Organization' s EIC.")
  public String getCounterEic() {
    return counterEic;
  }
  public void setCounterEic(String counterEic) {
    this.counterEic = counterEic;
  }

  
  /**
   * This field keeps Information of Offer Type.
   **/
  @ApiModelProperty(value = "This field keeps Information of Offer Type.")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryContractRequest queryContractRequest = (QueryContractRequest) o;
    return Objects.equals(this.deliveryDay, queryContractRequest.deliveryDay) &&
        Objects.equals(this.regionCode, queryContractRequest.regionCode) &&
        Objects.equals(this.counterRegionCode, queryContractRequest.counterRegionCode) &&
        Objects.equals(this.eic, queryContractRequest.eic) &&
        Objects.equals(this.counterEic, queryContractRequest.counterEic) &&
        Objects.equals(this.status, queryContractRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryDay, regionCode, counterRegionCode, eic, counterEic, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryContractRequest {\n");
    
    sb.append("    deliveryDay: ").append(toIndentedString(deliveryDay)).append("\n");
    sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
    sb.append("    counterRegionCode: ").append(toIndentedString(counterRegionCode)).append("\n");
    sb.append("    eic: ").append(toIndentedString(eic)).append("\n");
    sb.append("    counterEic: ").append(toIndentedString(counterEic)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
