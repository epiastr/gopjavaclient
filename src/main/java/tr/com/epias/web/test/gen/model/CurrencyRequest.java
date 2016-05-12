package tr.com.epias.web.test.gen.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;

import com.google.gson.annotations.SerializedName;




/**
 * This model returns Currency List of Offers.
 **/
@ApiModel(description = "This model returns Currency List of Offers.")
public class CurrencyRequest   {
  
  @SerializedName("deliveryDay")
  private LocalDateTime deliveryDay = null;
  

  
  /**
   * This field keeps Delivery Day. This field' s format is ISO8601.
   **/
  @ApiModelProperty(required = true, value = "This field keeps Delivery Day. This field' s format is ISO8601.")
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
    CurrencyRequest currencyRequest = (CurrencyRequest) o;
    return Objects.equals(this.deliveryDay, currencyRequest.deliveryDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryDay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencyRequest {\n");
    
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
