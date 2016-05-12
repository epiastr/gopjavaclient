package tr.com.epias.web.test.gen.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;




/**
 * This model keeps Result Information.
 **/
@ApiModel(description = "This model keeps Result Information.")
public class OptimizationSummary   {
  
  @SerializedName("period")
  private Integer period = null;
  
  @SerializedName("periodDescription")
  private String periodDescription = null;
  
  @SerializedName("marketTradePrice")
  private BigDecimal marketTradePrice = null;
  
  @SerializedName("amountOfPurchasingTowardsMatchHourly")
  private Integer amountOfPurchasingTowardsMatchHourly = null;
  
  @SerializedName("amountOfPurchasingTowardsMatchBlock")
  private Integer amountOfPurchasingTowardsMatchBlock = null;
  
  @SerializedName("amountOfPurchasingTowardsMatchTotal")
  private Integer amountOfPurchasingTowardsMatchTotal = null;
  
  @SerializedName("amountOfSalesTowardsMatchHourly")
  private Integer amountOfSalesTowardsMatchHourly = null;
  
  @SerializedName("amountOfSalesTowardsMatchBlock")
  private Integer amountOfSalesTowardsMatchBlock = null;
  
  @SerializedName("amountOfSalesTowardsMatchFlexible")
  private Integer amountOfSalesTowardsMatchFlexible = null;
  
  @SerializedName("amountOfSalesTowardsMatchTotal")
  private Integer amountOfSalesTowardsMatchTotal = null;
  
  @SerializedName("priceIndependentPurchasing")
  private Integer priceIndependentPurchasing = null;
  
  @SerializedName("priceIndependentSales")
  private Integer priceIndependentSales = null;
  
  @SerializedName("minLevelPurchasing")
  private Integer minLevelPurchasing = null;
  
  @SerializedName("maxLevelSales")
  private Integer maxLevelSales = null;
  
  @SerializedName("purchasingVolume")
  private BigDecimal purchasingVolume = null;
  
  @SerializedName("saleVolume")
  private BigDecimal saleVolume = null;
  
  @SerializedName("sidePayment")
  private BigDecimal sidePayment = null;
  

  
  /**
   * This field keeps Period Information.
   **/
  @ApiModelProperty(value = "This field keeps Period Information.")
  public Integer getPeriod() {
    return period;
  }
  public void setPeriod(Integer period) {
    this.period = period;
  }

  
  /**
   * This field keeps Period Description.
   **/
  @ApiModelProperty(value = "This field keeps Period Description.")
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
   * This field keeps Amount of Purchasing Towards Match Hourly.
   **/
  @ApiModelProperty(value = "This field keeps Amount of Purchasing Towards Match Hourly.")
  public Integer getAmountOfPurchasingTowardsMatchHourly() {
    return amountOfPurchasingTowardsMatchHourly;
  }
  public void setAmountOfPurchasingTowardsMatchHourly(Integer amountOfPurchasingTowardsMatchHourly) {
    this.amountOfPurchasingTowardsMatchHourly = amountOfPurchasingTowardsMatchHourly;
  }

  
  /**
   * This field keeps Amount of Purchasing Towards Match Block.
   **/
  @ApiModelProperty(value = "This field keeps Amount of Purchasing Towards Match Block.")
  public Integer getAmountOfPurchasingTowardsMatchBlock() {
    return amountOfPurchasingTowardsMatchBlock;
  }
  public void setAmountOfPurchasingTowardsMatchBlock(Integer amountOfPurchasingTowardsMatchBlock) {
    this.amountOfPurchasingTowardsMatchBlock = amountOfPurchasingTowardsMatchBlock;
  }

  
  /**
   * This field keeps Amount of Purchasing Towards Match Total.
   **/
  @ApiModelProperty(value = "This field keeps Amount of Purchasing Towards Match Total.")
  public Integer getAmountOfPurchasingTowardsMatchTotal() {
    return amountOfPurchasingTowardsMatchTotal;
  }
  public void setAmountOfPurchasingTowardsMatchTotal(Integer amountOfPurchasingTowardsMatchTotal) {
    this.amountOfPurchasingTowardsMatchTotal = amountOfPurchasingTowardsMatchTotal;
  }

  
  /**
   * This field keeps Amount of Sales Towards Match Hourly.
   **/
  @ApiModelProperty(value = "This field keeps Amount of Sales Towards Match Hourly.")
  public Integer getAmountOfSalesTowardsMatchHourly() {
    return amountOfSalesTowardsMatchHourly;
  }
  public void setAmountOfSalesTowardsMatchHourly(Integer amountOfSalesTowardsMatchHourly) {
    this.amountOfSalesTowardsMatchHourly = amountOfSalesTowardsMatchHourly;
  }

  
  /**
   * This field keeps Amount of Sales Towards Match Block.
   **/
  @ApiModelProperty(value = "This field keeps Amount of Sales Towards Match Block.")
  public Integer getAmountOfSalesTowardsMatchBlock() {
    return amountOfSalesTowardsMatchBlock;
  }
  public void setAmountOfSalesTowardsMatchBlock(Integer amountOfSalesTowardsMatchBlock) {
    this.amountOfSalesTowardsMatchBlock = amountOfSalesTowardsMatchBlock;
  }

  
  /**
   * This field keeps Amount of Sales Towards Match Flex.
   **/
  @ApiModelProperty(value = "This field keeps Amount of Sales Towards Match Flex.")
  public Integer getAmountOfSalesTowardsMatchFlexible() {
    return amountOfSalesTowardsMatchFlexible;
  }
  public void setAmountOfSalesTowardsMatchFlexible(Integer amountOfSalesTowardsMatchFlexible) {
    this.amountOfSalesTowardsMatchFlexible = amountOfSalesTowardsMatchFlexible;
  }

  
  /**
   * This field keeps Amount of Sales Towards Match Total.
   **/
  @ApiModelProperty(value = "This field keeps Amount of Sales Towards Match Total.")
  public Integer getAmountOfSalesTowardsMatchTotal() {
    return amountOfSalesTowardsMatchTotal;
  }
  public void setAmountOfSalesTowardsMatchTotal(Integer amountOfSalesTowardsMatchTotal) {
    this.amountOfSalesTowardsMatchTotal = amountOfSalesTowardsMatchTotal;
  }

  
  /**
   * This field keeps Price Independent Purchasing.
   **/
  @ApiModelProperty(value = "This field keeps Price Independent Purchasing.")
  public Integer getPriceIndependentPurchasing() {
    return priceIndependentPurchasing;
  }
  public void setPriceIndependentPurchasing(Integer priceIndependentPurchasing) {
    this.priceIndependentPurchasing = priceIndependentPurchasing;
  }

  
  /**
   * This field keeps Price Independent Sales.
   **/
  @ApiModelProperty(value = "This field keeps Price Independent Sales.")
  public Integer getPriceIndependentSales() {
    return priceIndependentSales;
  }
  public void setPriceIndependentSales(Integer priceIndependentSales) {
    this.priceIndependentSales = priceIndependentSales;
  }

  
  /**
   * This field keeps Minumum Level Purchasing.
   **/
  @ApiModelProperty(value = "This field keeps Minumum Level Purchasing.")
  public Integer getMinLevelPurchasing() {
    return minLevelPurchasing;
  }
  public void setMinLevelPurchasing(Integer minLevelPurchasing) {
    this.minLevelPurchasing = minLevelPurchasing;
  }

  
  /**
   * This field keeps Maximum Level Sales.
   **/
  @ApiModelProperty(value = "This field keeps Maximum Level Sales.")
  public Integer getMaxLevelSales() {
    return maxLevelSales;
  }
  public void setMaxLevelSales(Integer maxLevelSales) {
    this.maxLevelSales = maxLevelSales;
  }

  
  /**
   * This field keeps Total of Purchasing Volume.
   **/
  @ApiModelProperty(value = "This field keeps Total of Purchasing Volume.")
  public BigDecimal getPurchasingVolume() {
    return purchasingVolume;
  }
  public void setPurchasingVolume(BigDecimal purchasingVolume) {
    this.purchasingVolume = purchasingVolume;
  }

  
  /**
   * This field keeps Total of Sales Volume.
   **/
  @ApiModelProperty(value = "This field keeps Total of Sales Volume.")
  public BigDecimal getSaleVolume() {
    return saleVolume;
  }
  public void setSaleVolume(BigDecimal saleVolume) {
    this.saleVolume = saleVolume;
  }

  
  /**
   * This field keeps Information of Side Payment. 
   **/
  @ApiModelProperty(value = "This field keeps Information of Side Payment. ")
  public BigDecimal getSidePayment() {
    return sidePayment;
  }
  public void setSidePayment(BigDecimal sidePayment) {
    this.sidePayment = sidePayment;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizationSummary optimizationSummary = (OptimizationSummary) o;
    return Objects.equals(this.period, optimizationSummary.period) &&
        Objects.equals(this.periodDescription, optimizationSummary.periodDescription) &&
        Objects.equals(this.marketTradePrice, optimizationSummary.marketTradePrice) &&
        Objects.equals(this.amountOfPurchasingTowardsMatchHourly, optimizationSummary.amountOfPurchasingTowardsMatchHourly) &&
        Objects.equals(this.amountOfPurchasingTowardsMatchBlock, optimizationSummary.amountOfPurchasingTowardsMatchBlock) &&
        Objects.equals(this.amountOfPurchasingTowardsMatchTotal, optimizationSummary.amountOfPurchasingTowardsMatchTotal) &&
        Objects.equals(this.amountOfSalesTowardsMatchHourly, optimizationSummary.amountOfSalesTowardsMatchHourly) &&
        Objects.equals(this.amountOfSalesTowardsMatchBlock, optimizationSummary.amountOfSalesTowardsMatchBlock) &&
        Objects.equals(this.amountOfSalesTowardsMatchFlexible, optimizationSummary.amountOfSalesTowardsMatchFlexible) &&
        Objects.equals(this.amountOfSalesTowardsMatchTotal, optimizationSummary.amountOfSalesTowardsMatchTotal) &&
        Objects.equals(this.priceIndependentPurchasing, optimizationSummary.priceIndependentPurchasing) &&
        Objects.equals(this.priceIndependentSales, optimizationSummary.priceIndependentSales) &&
        Objects.equals(this.minLevelPurchasing, optimizationSummary.minLevelPurchasing) &&
        Objects.equals(this.maxLevelSales, optimizationSummary.maxLevelSales) &&
        Objects.equals(this.purchasingVolume, optimizationSummary.purchasingVolume) &&
        Objects.equals(this.saleVolume, optimizationSummary.saleVolume) &&
        Objects.equals(this.sidePayment, optimizationSummary.sidePayment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(period, periodDescription, marketTradePrice, amountOfPurchasingTowardsMatchHourly, amountOfPurchasingTowardsMatchBlock, amountOfPurchasingTowardsMatchTotal, amountOfSalesTowardsMatchHourly, amountOfSalesTowardsMatchBlock, amountOfSalesTowardsMatchFlexible, amountOfSalesTowardsMatchTotal, priceIndependentPurchasing, priceIndependentSales, minLevelPurchasing, maxLevelSales, purchasingVolume, saleVolume, sidePayment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizationSummary {\n");
    
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    periodDescription: ").append(toIndentedString(periodDescription)).append("\n");
    sb.append("    marketTradePrice: ").append(toIndentedString(marketTradePrice)).append("\n");
    sb.append("    amountOfPurchasingTowardsMatchHourly: ").append(toIndentedString(amountOfPurchasingTowardsMatchHourly)).append("\n");
    sb.append("    amountOfPurchasingTowardsMatchBlock: ").append(toIndentedString(amountOfPurchasingTowardsMatchBlock)).append("\n");
    sb.append("    amountOfPurchasingTowardsMatchTotal: ").append(toIndentedString(amountOfPurchasingTowardsMatchTotal)).append("\n");
    sb.append("    amountOfSalesTowardsMatchHourly: ").append(toIndentedString(amountOfSalesTowardsMatchHourly)).append("\n");
    sb.append("    amountOfSalesTowardsMatchBlock: ").append(toIndentedString(amountOfSalesTowardsMatchBlock)).append("\n");
    sb.append("    amountOfSalesTowardsMatchFlexible: ").append(toIndentedString(amountOfSalesTowardsMatchFlexible)).append("\n");
    sb.append("    amountOfSalesTowardsMatchTotal: ").append(toIndentedString(amountOfSalesTowardsMatchTotal)).append("\n");
    sb.append("    priceIndependentPurchasing: ").append(toIndentedString(priceIndependentPurchasing)).append("\n");
    sb.append("    priceIndependentSales: ").append(toIndentedString(priceIndependentSales)).append("\n");
    sb.append("    minLevelPurchasing: ").append(toIndentedString(minLevelPurchasing)).append("\n");
    sb.append("    maxLevelSales: ").append(toIndentedString(maxLevelSales)).append("\n");
    sb.append("    purchasingVolume: ").append(toIndentedString(purchasingVolume)).append("\n");
    sb.append("    saleVolume: ").append(toIndentedString(saleVolume)).append("\n");
    sb.append("    sidePayment: ").append(toIndentedString(sidePayment)).append("\n");
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
