package tr.com.epias.web.test.gen.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;

import com.google.gson.annotations.SerializedName;





public class MinMaxPriceListRequest   {
  
  @SerializedName("effectiveDate")
  private LocalDateTime effectiveDate = null;
  

  
  /**
   **/
  @ApiModelProperty(value = "")
  public LocalDateTime getEffectiveDate() {
    return effectiveDate;
  }
  public void setEffectiveDate(LocalDateTime effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MinMaxPriceListRequest minMaxPriceListRequest = (MinMaxPriceListRequest) o;
    return Objects.equals(this.effectiveDate, minMaxPriceListRequest.effectiveDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effectiveDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MinMaxPriceListRequest {\n");
    
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
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
