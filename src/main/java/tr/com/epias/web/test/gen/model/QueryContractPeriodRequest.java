package tr.com.epias.web.test.gen.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;

import com.google.gson.annotations.SerializedName;




/**
 * This model keeps Period Information of Contract.
 **/
@ApiModel(description = "This model keeps Period Information of Contract.")
public class QueryContractPeriodRequest   {
  
  @SerializedName("deliveryDay")
  private LocalDateTime deliveryDay = null;
  

  
  /**
   * It keeps the delivery day information of period list that is going to be returned.
   **/
  @ApiModelProperty(value = "It keeps the delivery day information of period list that is going to be returned.")
  public LocalDateTime getDeliveryDay() {
    return deliveryDay;
  }
  public void setDeliveryDay(LocalDateTime deliveryDay) {
    this.deliveryDay = deliveryDay;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryContractPeriodRequest queryContractPeriodRequest = (QueryContractPeriodRequest) o;
    return Objects.equals(this.deliveryDay, queryContractPeriodRequest.deliveryDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryDay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryContractPeriodRequest {\n");
    
    sb.append("    deliveryDay: ").append(toIndentedString(deliveryDay)).append("\n");
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
