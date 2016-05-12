package tr.com.epias.web.test.gen.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;




/**
 * This model keeps Block Offer Details for Advance.
 **/
@ApiModel(description = "This model keeps Block Offer Details for Advance.")
public class AdvanceBlockDetail   {
  
  @SerializedName("startPeriod")
  private Integer startPeriod = null;
  
  @SerializedName("periodDescription")
  private String periodDescription = null;
  
  @SerializedName("endPeriod")
  private Integer endPeriod = null;
  
  @SerializedName("offerPrice")
  private BigDecimal offerPrice = null;
  
  @SerializedName("amount")
  private Integer amount = null;
  
  @SerializedName("avgMarketTradePrice")
  private BigDecimal avgMarketTradePrice = null;
  
  @SerializedName("currentPrice")
  private BigDecimal currentPrice = null;
  
  @SerializedName("totalOfPurchasingTowards")
  private BigDecimal totalOfPurchasingTowards = null;
  
  @SerializedName("totalOfSalesTowards")
  private BigDecimal totalOfSalesTowards = null;
  

  
  /**
   * This field keeps Start Period Information.
   **/
  @ApiModelProperty(value = "This field keeps Start Period Information.")
  public Integer getStartPeriod() {
    return startPeriod;
  }
  public void setStartPeriod(Integer startPeriod) {
    this.startPeriod = startPeriod;
  }

  
  /**
   * Periyot A\u00E7\u0131klamas\u0131
   **/
  @ApiModelProperty(value = "Periyot A\u00E7\u0131klamas\u0131")
  public String getPeriodDescription() {
    return periodDescription;
  }
  public void setPeriodDescription(String periodDescription) {
    this.periodDescription = periodDescription;
  }

  
  /**
   * This field keeps Finish Period Information.
   **/
  @ApiModelProperty(value = "This field keeps Finish Period Information.")
  public Integer getEndPeriod() {
    return endPeriod;
  }
  public void setEndPeriod(Integer endPeriod) {
    this.endPeriod = endPeriod;
  }

  
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
   * This field keeps Average Market Clearing Price
   **/
  @ApiModelProperty(value = "This field keeps Average Market Clearing Price")
  public BigDecimal getAvgMarketTradePrice() {
    return avgMarketTradePrice;
  }
  public void setAvgMarketTradePrice(BigDecimal avgMarketTradePrice) {
    this.avgMarketTradePrice = avgMarketTradePrice;
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
    AdvanceBlockDetail advanceBlockDetail = (AdvanceBlockDetail) o;
    return Objects.equals(this.startPeriod, advanceBlockDetail.startPeriod) &&
        Objects.equals(this.periodDescription, advanceBlockDetail.periodDescription) &&
        Objects.equals(this.endPeriod, advanceBlockDetail.endPeriod) &&
        Objects.equals(this.offerPrice, advanceBlockDetail.offerPrice) &&
        Objects.equals(this.amount, advanceBlockDetail.amount) &&
        Objects.equals(this.avgMarketTradePrice, advanceBlockDetail.avgMarketTradePrice) &&
        Objects.equals(this.currentPrice, advanceBlockDetail.currentPrice) &&
        Objects.equals(this.totalOfPurchasingTowards, advanceBlockDetail.totalOfPurchasingTowards) &&
        Objects.equals(this.totalOfSalesTowards, advanceBlockDetail.totalOfSalesTowards);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startPeriod, periodDescription, endPeriod, offerPrice, amount, avgMarketTradePrice, currentPrice, totalOfPurchasingTowards, totalOfSalesTowards);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvanceBlockDetail {\n");
    
    sb.append("    startPeriod: ").append(toIndentedString(startPeriod)).append("\n");
    sb.append("    periodDescription: ").append(toIndentedString(periodDescription)).append("\n");
    sb.append("    endPeriod: ").append(toIndentedString(endPeriod)).append("\n");
    sb.append("    offerPrice: ").append(toIndentedString(offerPrice)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    avgMarketTradePrice: ").append(toIndentedString(avgMarketTradePrice)).append("\n");
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
