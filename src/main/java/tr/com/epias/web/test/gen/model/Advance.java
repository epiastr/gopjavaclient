package tr.com.epias.web.test.gen.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import tr.com.epias.web.test.gen.model.AdvanceBlockDetail;
import tr.com.epias.web.test.gen.model.AdvanceFlexibleDetail;
import tr.com.epias.web.test.gen.model.AdvanceHourlyDetail;

import com.google.gson.annotations.SerializedName;




/**
 * This model keeps Advance
 **/
@ApiModel(description = "This model keeps Advance")
public class Advance   {
  
  @SerializedName("period")
  private Long period = null;
  
  @SerializedName("periodDescription")
  private String periodDescription = null;
  
  @SerializedName("marketTradePrice")
  private BigDecimal marketTradePrice = null;
  
  @SerializedName("quantityOfMatchHourly")
  private Integer quantityOfMatchHourly = null;
  
  @SerializedName("quantityOfMatchBlock")
  private Integer quantityOfMatchBlock = null;
  
  @SerializedName("quantityOfMatchFlexible")
  private Integer quantityOfMatchFlexible = null;
  
  @SerializedName("totalOfPurchasingTowardsHourly")
  private BigDecimal totalOfPurchasingTowardsHourly = null;
  
  @SerializedName("totalOfPurchasingTowardsBlock")
  private BigDecimal totalOfPurchasingTowardsBlock = null;
  
  @SerializedName("totalOfPurchasingTowards")
  private BigDecimal totalOfPurchasingTowards = null;
  
  @SerializedName("totalOfSalesTowardsHourly")
  private BigDecimal totalOfSalesTowardsHourly = null;
  
  @SerializedName("totalOfSalesTowardsBlock")
  private BigDecimal totalOfSalesTowardsBlock = null;
  
  @SerializedName("totalOfSalesTowardsFlexible")
  private BigDecimal totalOfSalesTowardsFlexible = null;
  
  @SerializedName("totalOfSalesTowards")
  private BigDecimal totalOfSalesTowards = null;
  
  @SerializedName("sidePayment")
  private BigDecimal sidePayment = null;
  
  @SerializedName("blockDetails")
  private List<AdvanceBlockDetail> blockDetails = new ArrayList<AdvanceBlockDetail>();
  
  @SerializedName("hourlyDetails")
  private List<AdvanceHourlyDetail> hourlyDetails = new ArrayList<AdvanceHourlyDetail>();
  
  @SerializedName("flexibleDetails")
  private List<AdvanceFlexibleDetail> flexibleDetails = new ArrayList<AdvanceFlexibleDetail>();
  

  
  /**
   * This field keeps Advance Priod Information.
   **/
  @ApiModelProperty(value = "This field keeps Advance Priod Information.")
  public Long getPeriod() {
    return period;
  }
  public void setPeriod(Long period) {
    this.period = period;
  }

  
  /**
   * This field keeps Advance Period Explanation.
   **/
  @ApiModelProperty(value = "This field keeps Advance Period Explanation.")
  public String getPeriodDescription() {
    return periodDescription;
  }
  public void setPeriodDescription(String periodDescription) {
    this.periodDescription = periodDescription;
  }

  
  /**
   * Market Clearing Price
   **/
  @ApiModelProperty(value = "Market Clearing Price")
  public BigDecimal getMarketTradePrice() {
    return marketTradePrice;
  }
  public void setMarketTradePrice(BigDecimal marketTradePrice) {
    this.marketTradePrice = marketTradePrice;
  }

  
  /**
   * This field keeps Quantity of Match Hourly.
   **/
  @ApiModelProperty(value = "This field keeps Quantity of Match Hourly.")
  public Integer getQuantityOfMatchHourly() {
    return quantityOfMatchHourly;
  }
  public void setQuantityOfMatchHourly(Integer quantityOfMatchHourly) {
    this.quantityOfMatchHourly = quantityOfMatchHourly;
  }

  
  /**
   * This field keeps Quantity of Match Block.
   **/
  @ApiModelProperty(value = "This field keeps Quantity of Match Block.")
  public Integer getQuantityOfMatchBlock() {
    return quantityOfMatchBlock;
  }
  public void setQuantityOfMatchBlock(Integer quantityOfMatchBlock) {
    this.quantityOfMatchBlock = quantityOfMatchBlock;
  }

  
  /**
   * This field keeps Quantity of Match Flexible.
   **/
  @ApiModelProperty(value = "This field keeps Quantity of Match Flexible.")
  public Integer getQuantityOfMatchFlexible() {
    return quantityOfMatchFlexible;
  }
  public void setQuantityOfMatchFlexible(Integer quantityOfMatchFlexible) {
    this.quantityOfMatchFlexible = quantityOfMatchFlexible;
  }

  
  /**
   * This field keeps Total of Purchasing Towards Hourly.
   **/
  @ApiModelProperty(value = "This field keeps Total of Purchasing Towards Hourly.")
  public BigDecimal getTotalOfPurchasingTowardsHourly() {
    return totalOfPurchasingTowardsHourly;
  }
  public void setTotalOfPurchasingTowardsHourly(BigDecimal totalOfPurchasingTowardsHourly) {
    this.totalOfPurchasingTowardsHourly = totalOfPurchasingTowardsHourly;
  }

  
  /**
   * This field keeps Total of Purchasing Towards Block.
   **/
  @ApiModelProperty(value = "This field keeps Total of Purchasing Towards Block.")
  public BigDecimal getTotalOfPurchasingTowardsBlock() {
    return totalOfPurchasingTowardsBlock;
  }
  public void setTotalOfPurchasingTowardsBlock(BigDecimal totalOfPurchasingTowardsBlock) {
    this.totalOfPurchasingTowardsBlock = totalOfPurchasingTowardsBlock;
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
   * This field keeps Total of Sales Towards Hourly.
   **/
  @ApiModelProperty(value = "This field keeps Total of Sales Towards Hourly.")
  public BigDecimal getTotalOfSalesTowardsHourly() {
    return totalOfSalesTowardsHourly;
  }
  public void setTotalOfSalesTowardsHourly(BigDecimal totalOfSalesTowardsHourly) {
    this.totalOfSalesTowardsHourly = totalOfSalesTowardsHourly;
  }

  
  /**
   * This field keeps Total of Sales Towards Block.
   **/
  @ApiModelProperty(value = "This field keeps Total of Sales Towards Block.")
  public BigDecimal getTotalOfSalesTowardsBlock() {
    return totalOfSalesTowardsBlock;
  }
  public void setTotalOfSalesTowardsBlock(BigDecimal totalOfSalesTowardsBlock) {
    this.totalOfSalesTowardsBlock = totalOfSalesTowardsBlock;
  }

  
  /**
   * This field keeps Total of Sales Towards Flexible.
   **/
  @ApiModelProperty(value = "This field keeps Total of Sales Towards Flexible.")
  public BigDecimal getTotalOfSalesTowardsFlexible() {
    return totalOfSalesTowardsFlexible;
  }
  public void setTotalOfSalesTowardsFlexible(BigDecimal totalOfSalesTowardsFlexible) {
    this.totalOfSalesTowardsFlexible = totalOfSalesTowardsFlexible;
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

  
  /**
   * This field keeps Side Payment.
   **/
  @ApiModelProperty(value = "This field keeps Side Payment.")
  public BigDecimal getSidePayment() {
    return sidePayment;
  }
  public void setSidePayment(BigDecimal sidePayment) {
    this.sidePayment = sidePayment;
  }

  
  /**
   * This field keeps Advance Block Details.
   **/
  @ApiModelProperty(value = "This field keeps Advance Block Details.")
  public List<AdvanceBlockDetail> getBlockDetails() {
    return blockDetails;
  }
  public void setBlockDetails(List<AdvanceBlockDetail> blockDetails) {
    this.blockDetails = blockDetails;
  }

  
  /**
   * This field keeps Advance Hourly Details.
   **/
  @ApiModelProperty(value = "This field keeps Advance Hourly Details.")
  public List<AdvanceHourlyDetail> getHourlyDetails() {
    return hourlyDetails;
  }
  public void setHourlyDetails(List<AdvanceHourlyDetail> hourlyDetails) {
    this.hourlyDetails = hourlyDetails;
  }

  
  /**
   * This field keeps Advance Flexible Details.
   **/
  @ApiModelProperty(value = "This field keeps Advance Flexible Details.")
  public List<AdvanceFlexibleDetail> getFlexibleDetails() {
    return flexibleDetails;
  }
  public void setFlexibleDetails(List<AdvanceFlexibleDetail> flexibleDetails) {
    this.flexibleDetails = flexibleDetails;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Advance advance = (Advance) o;
    return Objects.equals(this.period, advance.period) &&
        Objects.equals(this.periodDescription, advance.periodDescription) &&
        Objects.equals(this.marketTradePrice, advance.marketTradePrice) &&
        Objects.equals(this.quantityOfMatchHourly, advance.quantityOfMatchHourly) &&
        Objects.equals(this.quantityOfMatchBlock, advance.quantityOfMatchBlock) &&
        Objects.equals(this.quantityOfMatchFlexible, advance.quantityOfMatchFlexible) &&
        Objects.equals(this.totalOfPurchasingTowardsHourly, advance.totalOfPurchasingTowardsHourly) &&
        Objects.equals(this.totalOfPurchasingTowardsBlock, advance.totalOfPurchasingTowardsBlock) &&
        Objects.equals(this.totalOfPurchasingTowards, advance.totalOfPurchasingTowards) &&
        Objects.equals(this.totalOfSalesTowardsHourly, advance.totalOfSalesTowardsHourly) &&
        Objects.equals(this.totalOfSalesTowardsBlock, advance.totalOfSalesTowardsBlock) &&
        Objects.equals(this.totalOfSalesTowardsFlexible, advance.totalOfSalesTowardsFlexible) &&
        Objects.equals(this.totalOfSalesTowards, advance.totalOfSalesTowards) &&
        Objects.equals(this.sidePayment, advance.sidePayment) &&
        Objects.equals(this.blockDetails, advance.blockDetails) &&
        Objects.equals(this.hourlyDetails, advance.hourlyDetails) &&
        Objects.equals(this.flexibleDetails, advance.flexibleDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(period, periodDescription, marketTradePrice, quantityOfMatchHourly, quantityOfMatchBlock, quantityOfMatchFlexible, totalOfPurchasingTowardsHourly, totalOfPurchasingTowardsBlock, totalOfPurchasingTowards, totalOfSalesTowardsHourly, totalOfSalesTowardsBlock, totalOfSalesTowardsFlexible, totalOfSalesTowards, sidePayment, blockDetails, hourlyDetails, flexibleDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Advance {\n");
    
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    periodDescription: ").append(toIndentedString(periodDescription)).append("\n");
    sb.append("    marketTradePrice: ").append(toIndentedString(marketTradePrice)).append("\n");
    sb.append("    quantityOfMatchHourly: ").append(toIndentedString(quantityOfMatchHourly)).append("\n");
    sb.append("    quantityOfMatchBlock: ").append(toIndentedString(quantityOfMatchBlock)).append("\n");
    sb.append("    quantityOfMatchFlexible: ").append(toIndentedString(quantityOfMatchFlexible)).append("\n");
    sb.append("    totalOfPurchasingTowardsHourly: ").append(toIndentedString(totalOfPurchasingTowardsHourly)).append("\n");
    sb.append("    totalOfPurchasingTowardsBlock: ").append(toIndentedString(totalOfPurchasingTowardsBlock)).append("\n");
    sb.append("    totalOfPurchasingTowards: ").append(toIndentedString(totalOfPurchasingTowards)).append("\n");
    sb.append("    totalOfSalesTowardsHourly: ").append(toIndentedString(totalOfSalesTowardsHourly)).append("\n");
    sb.append("    totalOfSalesTowardsBlock: ").append(toIndentedString(totalOfSalesTowardsBlock)).append("\n");
    sb.append("    totalOfSalesTowardsFlexible: ").append(toIndentedString(totalOfSalesTowardsFlexible)).append("\n");
    sb.append("    totalOfSalesTowards: ").append(toIndentedString(totalOfSalesTowards)).append("\n");
    sb.append("    sidePayment: ").append(toIndentedString(sidePayment)).append("\n");
    sb.append("    blockDetails: ").append(toIndentedString(blockDetails)).append("\n");
    sb.append("    hourlyDetails: ").append(toIndentedString(hourlyDetails)).append("\n");
    sb.append("    flexibleDetails: ").append(toIndentedString(flexibleDetails)).append("\n");
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
