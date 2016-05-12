package tr.com.epias.web.test.gen.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;

import com.google.gson.annotations.SerializedName;





public class MinMaxPriceResponse   {
  
  @SerializedName("minMaxPriceId")
  private Long minMaxPriceId = null;
  
  @SerializedName("minimumPrice")
  private Double minimumPrice = null;
  
  @SerializedName("maximumPrice")
  private Double maximumPrice = null;
  
  @SerializedName("startDate")
  private LocalDateTime startDate = null;
  
  @SerializedName("endDate")
  private LocalDateTime endDate = null;
  
  @SerializedName("active")
  private Boolean active = false;
  

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getMinMaxPriceId() {
    return minMaxPriceId;
  }
  public void setMinMaxPriceId(Long minMaxPriceId) {
    this.minMaxPriceId = minMaxPriceId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getMinimumPrice() {
    return minimumPrice;
  }
  public void setMinimumPrice(Double minimumPrice) {
    this.minimumPrice = minimumPrice;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getMaximumPrice() {
    return maximumPrice;
  }
  public void setMaximumPrice(Double maximumPrice) {
    this.maximumPrice = maximumPrice;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public LocalDateTime getStartDate() {
    return startDate;
  }
  public void setStartDate(LocalDateTime startDate) {
    this.startDate = startDate;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public LocalDateTime getEndDate() {
    return endDate;
  }
  public void setEndDate(LocalDateTime endDate) {
    this.endDate = endDate;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MinMaxPriceResponse minMaxPriceResponse = (MinMaxPriceResponse) o;
    return Objects.equals(this.minMaxPriceId, minMaxPriceResponse.minMaxPriceId) &&
        Objects.equals(this.minimumPrice, minMaxPriceResponse.minimumPrice) &&
        Objects.equals(this.maximumPrice, minMaxPriceResponse.maximumPrice) &&
        Objects.equals(this.startDate, minMaxPriceResponse.startDate) &&
        Objects.equals(this.endDate, minMaxPriceResponse.endDate) &&
        Objects.equals(this.active, minMaxPriceResponse.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minMaxPriceId, minimumPrice, maximumPrice, startDate, endDate, active);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MinMaxPriceResponse {\n");
    
    sb.append("    minMaxPriceId: ").append(toIndentedString(minMaxPriceId)).append("\n");
    sb.append("    minimumPrice: ").append(toIndentedString(minimumPrice)).append("\n");
    sb.append("    maximumPrice: ").append(toIndentedString(maximumPrice)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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
