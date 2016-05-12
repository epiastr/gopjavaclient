package tr.com.epias.web.test.gen.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;




/**
 * This model keeps Offer Matching Result.
 **/
@ApiModel(description = "This model keeps Offer Matching Result.")
public class OfferDetailResponse   {
  
  @SerializedName("price")
  private BigDecimal price = null;
  
  @SerializedName("amount")
  private Double amount = null;
  
  @SerializedName("avgMarketTradePrice")
  private BigDecimal avgMarketTradePrice = null;
  

  
  /**
   * This field keeps Price Information.
   **/
  @ApiModelProperty(value = "This field keeps Price Information.")
  public BigDecimal getPrice() {
    return price;
  }
  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  
  /**
   * This field keeps Amount Information.
   **/
  @ApiModelProperty(value = "This field keeps Amount Information.")
  public Double getAmount() {
    return amount;
  }
  public void setAmount(Double amount) {
    this.amount = amount;
  }

  
  /**
   * Average Market Clearing Price of given period blocks.
   **/
  @ApiModelProperty(value = "Average Market Clearing Price of given period blocks.")
  public BigDecimal getAvgMarketTradePrice() {
    return avgMarketTradePrice;
  }
  public void setAvgMarketTradePrice(BigDecimal avgMarketTradePrice) {
    this.avgMarketTradePrice = avgMarketTradePrice;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferDetailResponse offerDetailResponse = (OfferDetailResponse) o;
    return Objects.equals(this.price, offerDetailResponse.price) &&
        Objects.equals(this.amount, offerDetailResponse.amount) &&
        Objects.equals(this.avgMarketTradePrice, offerDetailResponse.avgMarketTradePrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, amount, avgMarketTradePrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferDetailResponse {\n");
    
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    avgMarketTradePrice: ").append(toIndentedString(avgMarketTradePrice)).append("\n");
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
