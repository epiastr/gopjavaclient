package tr.com.epias.web.test.gen.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;




/**
 * This model keeps Hourly Offer Detail for Advance.
 **/
@ApiModel(description = "This model keeps Hourly Offer Detail for Advance.")
public class AdvanceHourlyDetail   {
  
  @SerializedName("offerPrice")
  private BigDecimal offerPrice = null;
  
  @SerializedName("amount")
  private Integer amount = null;
  

  
  /**
   * This field keeps Offer Price.
   **/
  @ApiModelProperty(value = "This field keeps Offer Price.")
  public BigDecimal getOfferPrice() {
    return offerPrice;
  }
  public void setOfferPrice(BigDecimal offerPrice) {
    this.offerPrice = offerPrice;
  }

  
  /**
   * This field keeps Offer Amount.
   **/
  @ApiModelProperty(value = "This field keeps Offer Amount.")
  public Integer getAmount() {
    return amount;
  }
  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvanceHourlyDetail advanceHourlyDetail = (AdvanceHourlyDetail) o;
    return Objects.equals(this.offerPrice, advanceHourlyDetail.offerPrice) &&
        Objects.equals(this.amount, advanceHourlyDetail.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerPrice, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvanceHourlyDetail {\n");
    
    sb.append("    offerPrice: ").append(toIndentedString(offerPrice)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
