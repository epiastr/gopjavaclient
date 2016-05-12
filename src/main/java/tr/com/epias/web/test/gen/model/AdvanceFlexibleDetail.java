package tr.com.epias.web.test.gen.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;




/**
 * This model keeps Flexible Offer Detail for Advance.
 **/
@ApiModel(description = "This model keeps Flexible Offer Detail for Advance.")
public class AdvanceFlexibleDetail   {
  
  @SerializedName("offerPrice")
  private BigDecimal offerPrice = null;
  
  @SerializedName("amount")
  private Integer amount = null;
  
  @SerializedName("matchAmount")
  private Integer matchAmount = null;
  
  @SerializedName("currentPrice")
  private BigDecimal currentPrice = null;
  
  @SerializedName("totalOfPurchasingTowards")
  private BigDecimal totalOfPurchasingTowards = null;
  
  @SerializedName("totalOfSalesTowards")
  private BigDecimal totalOfSalesTowards = null;
  

  
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

  
  /**
   * This field keeps Match Amount.
   **/
  @ApiModelProperty(value = "This field keeps Match Amount.")
  public Integer getMatchAmount() {
    return matchAmount;
  }
  public void setMatchAmount(Integer matchAmount) {
    this.matchAmount = matchAmount;
  }

  
  /**
   * This field keeps Current Price.
   **/
  @ApiModelProperty(value = "This field keeps Current Price.")
  public BigDecimal getCurrentPrice() {
    return currentPrice;
  }
  public void setCurrentPrice(BigDecimal currentPrice) {
    this.currentPrice = currentPrice;
  }

  
  /**
   * This field keeps Total of Purchasing Towards.
   **/
  @ApiModelProperty(value = "This field keeps Total of Purchasing Towards.")
  public BigDecimal getTotalOfPurchasingTowards() {
    return totalOfPurchasingTowards;
  }
  public void setTotalOfPurchasingTowards(BigDecimal totalOfPurchasingTowards) {
    this.totalOfPurchasingTowards = totalOfPurchasingTowards;
  }

  
  /**
   * This field keeps Total of Sales Towards.
   **/
  @ApiModelProperty(value = "This field keeps Total of Sales Towards.")
  public BigDecimal getTotalOfSalesTowards() {
    return totalOfSalesTowards;
  }
  public void setTotalOfSalesTowards(BigDecimal totalOfSalesTowards) {
    this.totalOfSalesTowards = totalOfSalesTowards;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvanceFlexibleDetail advanceFlexibleDetail = (AdvanceFlexibleDetail) o;
    return Objects.equals(this.offerPrice, advanceFlexibleDetail.offerPrice) &&
        Objects.equals(this.amount, advanceFlexibleDetail.amount) &&
        Objects.equals(this.matchAmount, advanceFlexibleDetail.matchAmount) &&
        Objects.equals(this.currentPrice, advanceFlexibleDetail.currentPrice) &&
        Objects.equals(this.totalOfPurchasingTowards, advanceFlexibleDetail.totalOfPurchasingTowards) &&
        Objects.equals(this.totalOfSalesTowards, advanceFlexibleDetail.totalOfSalesTowards);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerPrice, amount, matchAmount, currentPrice, totalOfPurchasingTowards, totalOfSalesTowards);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvanceFlexibleDetail {\n");
    
    sb.append("    offerPrice: ").append(toIndentedString(offerPrice)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    matchAmount: ").append(toIndentedString(matchAmount)).append("\n");
    sb.append("    currentPrice: ").append(toIndentedString(currentPrice)).append("\n");
    sb.append("    totalOfPurchasingTowards: ").append(toIndentedString(totalOfPurchasingTowards)).append("\n");
    sb.append("    totalOfSalesTowards: ").append(toIndentedString(totalOfSalesTowards)).append("\n");
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
