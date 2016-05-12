package tr.com.epias.web.test.gen.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;




/**
 * This field model keeps Side Payment Detail for Advance.
 **/
@ApiModel(description = "This field model keeps Side Payment Detail for Advance.")
public class AdvanceSidePayment   {
  
  @SerializedName("totalOfPurchasingTowards")
  private BigDecimal totalOfPurchasingTowards = null;
  
  @SerializedName("totalOfSalesTowards")
  private BigDecimal totalOfSalesTowards = null;
  
  @SerializedName("total")
  private BigDecimal total = null;
  
  @SerializedName("countOfOrganization")
  private Long countOfOrganization = null;
  
  @SerializedName("totalOfConstantSidePayment")
  private BigDecimal totalOfConstantSidePayment = null;
  
  @SerializedName("quantityOfMatch")
  private Long quantityOfMatch = null;
  
  @SerializedName("quantityOfMatchByOrganization")
  private Long quantityOfMatchByOrganization = null;
  
  @SerializedName("totalOfVariableSidePayment")
  private BigDecimal totalOfVariableSidePayment = null;
  

  
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

  
  /**
   * This field keeps Total.
   **/
  @ApiModelProperty(value = "This field keeps Total.")
  public BigDecimal getTotal() {
    return total;
  }
  public void setTotal(BigDecimal total) {
    this.total = total;
  }

  
  /**
   * This field keeps Organization Count without *YEKDEM.
   **/
  @ApiModelProperty(value = "This field keeps Organization Count without *YEKDEM.")
  public Long getCountOfOrganization() {
    return countOfOrganization;
  }
  public void setCountOfOrganization(Long countOfOrganization) {
    this.countOfOrganization = countOfOrganization;
  }

  
  /**
   * This field keeps Constant Total.
   **/
  @ApiModelProperty(value = "This field keeps Constant Total.")
  public BigDecimal getTotalOfConstantSidePayment() {
    return totalOfConstantSidePayment;
  }
  public void setTotalOfConstantSidePayment(BigDecimal totalOfConstantSidePayment) {
    this.totalOfConstantSidePayment = totalOfConstantSidePayment;
  }

  
  /**
   * This field keeps Quantity of Match.
   **/
  @ApiModelProperty(value = "This field keeps Quantity of Match.")
  public Long getQuantityOfMatch() {
    return quantityOfMatch;
  }
  public void setQuantityOfMatch(Long quantityOfMatch) {
    this.quantityOfMatch = quantityOfMatch;
  }

  
  /**
   * This field keeps Quantity of Match by Organization.
   **/
  @ApiModelProperty(value = "This field keeps Quantity of Match by Organization.")
  public Long getQuantityOfMatchByOrganization() {
    return quantityOfMatchByOrganization;
  }
  public void setQuantityOfMatchByOrganization(Long quantityOfMatchByOrganization) {
    this.quantityOfMatchByOrganization = quantityOfMatchByOrganization;
  }

  
  /**
   * This field keeps Variable Total.
   **/
  @ApiModelProperty(value = "This field keeps Variable Total.")
  public BigDecimal getTotalOfVariableSidePayment() {
    return totalOfVariableSidePayment;
  }
  public void setTotalOfVariableSidePayment(BigDecimal totalOfVariableSidePayment) {
    this.totalOfVariableSidePayment = totalOfVariableSidePayment;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvanceSidePayment advanceSidePayment = (AdvanceSidePayment) o;
    return Objects.equals(this.totalOfPurchasingTowards, advanceSidePayment.totalOfPurchasingTowards) &&
        Objects.equals(this.totalOfSalesTowards, advanceSidePayment.totalOfSalesTowards) &&
        Objects.equals(this.total, advanceSidePayment.total) &&
        Objects.equals(this.countOfOrganization, advanceSidePayment.countOfOrganization) &&
        Objects.equals(this.totalOfConstantSidePayment, advanceSidePayment.totalOfConstantSidePayment) &&
        Objects.equals(this.quantityOfMatch, advanceSidePayment.quantityOfMatch) &&
        Objects.equals(this.quantityOfMatchByOrganization, advanceSidePayment.quantityOfMatchByOrganization) &&
        Objects.equals(this.totalOfVariableSidePayment, advanceSidePayment.totalOfVariableSidePayment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalOfPurchasingTowards, totalOfSalesTowards, total, countOfOrganization, totalOfConstantSidePayment, quantityOfMatch, quantityOfMatchByOrganization, totalOfVariableSidePayment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvanceSidePayment {\n");
    
    sb.append("    totalOfPurchasingTowards: ").append(toIndentedString(totalOfPurchasingTowards)).append("\n");
    sb.append("    totalOfSalesTowards: ").append(toIndentedString(totalOfSalesTowards)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    countOfOrganization: ").append(toIndentedString(countOfOrganization)).append("\n");
    sb.append("    totalOfConstantSidePayment: ").append(toIndentedString(totalOfConstantSidePayment)).append("\n");
    sb.append("    quantityOfMatch: ").append(toIndentedString(quantityOfMatch)).append("\n");
    sb.append("    quantityOfMatchByOrganization: ").append(toIndentedString(quantityOfMatchByOrganization)).append("\n");
    sb.append("    totalOfVariableSidePayment: ").append(toIndentedString(totalOfVariableSidePayment)).append("\n");
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
