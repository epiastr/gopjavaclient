package tr.com.epias.web.test.gen.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import tr.com.epias.web.test.gen.model.OfferDetailResponse;
import tr.com.epias.web.test.gen.model.Organization;

import com.google.gson.annotations.SerializedName;




/**
 * This model keeps Offer Matching Results.
 **/
@ApiModel(description = "This model keeps Offer Matching Results.")
public class OptimizationSummaryByOrganization   {
  
  @SerializedName("period")
  private Integer period = null;
  
  @SerializedName("duration")
  private Integer duration = null;
  
  @SerializedName("periodDescription")
  private String periodDescription = null;
  
  @SerializedName("offerCode")
  private Long offerCode = null;
  
  @SerializedName("offerType")
  private String offerType = null;
  
  @SerializedName("offerVersion")
  private Long offerVersion = null;
  
  @SerializedName("volume")
  private Integer volume = null;
  
  @SerializedName("marketTradePrice")
  private BigDecimal marketTradePrice = null;
  
  @SerializedName("offerDetailResponses")
  private List<OfferDetailResponse> offerDetailResponses = new ArrayList<OfferDetailResponse>();
  
  @SerializedName("organization")
  private Organization organization = null;
  

  
  /**
   * This field keeps Result Period
   **/
  @ApiModelProperty(value = "This field keeps Result Period")
  public Integer getPeriod() {
    return period;
  }
  public void setPeriod(Integer period) {
    this.period = period;
  }

  
  /**
   * This field keeps Result Perioc Count.
   **/
  @ApiModelProperty(value = "This field keeps Result Perioc Count.")
  public Integer getDuration() {
    return duration;
  }
  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  
  /**
   * This field keeps Result Period Duration.
   **/
  @ApiModelProperty(value = "This field keeps Result Period Duration.")
  public String getPeriodDescription() {
    return periodDescription;
  }
  public void setPeriodDescription(String periodDescription) {
    this.periodDescription = periodDescription;
  }

  
  /**
   * This field keeps Offer' s Unique Number.
   **/
  @ApiModelProperty(value = "This field keeps Offer' s Unique Number.")
  public Long getOfferCode() {
    return offerCode;
  }
  public void setOfferCode(Long offerCode) {
    this.offerCode = offerCode;
  }

  
  /**
   * This field keeps Offer Type.
   **/
  @ApiModelProperty(value = "This field keeps Offer Type.")
  public String getOfferType() {
    return offerType;
  }
  public void setOfferType(String offerType) {
    this.offerType = offerType;
  }

  
  /**
   * This field keeps Offer Version Number.
   **/
  @ApiModelProperty(value = "This field keeps Offer Version Number.")
  public Long getOfferVersion() {
    return offerVersion;
  }
  public void setOfferVersion(Long offerVersion) {
    this.offerVersion = offerVersion;
  }

  
  /**
   * This field keeps Result Amount.
   **/
  @ApiModelProperty(value = "This field keeps Result Amount.")
  public Integer getVolume() {
    return volume;
  }
  public void setVolume(Integer volume) {
    this.volume = volume;
  }

  
  /**
   * This field keeps Result Price.
   **/
  @ApiModelProperty(value = "This field keeps Result Price.")
  public BigDecimal getMarketTradePrice() {
    return marketTradePrice;
  }
  public void setMarketTradePrice(BigDecimal marketTradePrice) {
    this.marketTradePrice = marketTradePrice;
  }

  
  /**
   * This field keeps Offer Detail Information.
   **/
  @ApiModelProperty(value = "This field keeps Offer Detail Information.")
  public List<OfferDetailResponse> getOfferDetailResponses() {
    return offerDetailResponses;
  }
  public void setOfferDetailResponses(List<OfferDetailResponse> offerDetailResponses) {
    this.offerDetailResponses = offerDetailResponses;
  }

  
  /**
   * This field keeps Organization Informatiom 
   **/
  @ApiModelProperty(value = "This field keeps Organization Informatiom ")
  public Organization getOrganization() {
    return organization;
  }
  public void setOrganization(Organization organization) {
    this.organization = organization;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizationSummaryByOrganization optimizationSummaryByOrganization = (OptimizationSummaryByOrganization) o;
    return Objects.equals(this.period, optimizationSummaryByOrganization.period) &&
        Objects.equals(this.duration, optimizationSummaryByOrganization.duration) &&
        Objects.equals(this.periodDescription, optimizationSummaryByOrganization.periodDescription) &&
        Objects.equals(this.offerCode, optimizationSummaryByOrganization.offerCode) &&
        Objects.equals(this.offerType, optimizationSummaryByOrganization.offerType) &&
        Objects.equals(this.offerVersion, optimizationSummaryByOrganization.offerVersion) &&
        Objects.equals(this.volume, optimizationSummaryByOrganization.volume) &&
        Objects.equals(this.marketTradePrice, optimizationSummaryByOrganization.marketTradePrice) &&
        Objects.equals(this.offerDetailResponses, optimizationSummaryByOrganization.offerDetailResponses) &&
        Objects.equals(this.organization, optimizationSummaryByOrganization.organization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(period, duration, periodDescription, offerCode, offerType, offerVersion, volume, marketTradePrice, offerDetailResponses, organization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizationSummaryByOrganization {\n");
    
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    periodDescription: ").append(toIndentedString(periodDescription)).append("\n");
    sb.append("    offerCode: ").append(toIndentedString(offerCode)).append("\n");
    sb.append("    offerType: ").append(toIndentedString(offerType)).append("\n");
    sb.append("    offerVersion: ").append(toIndentedString(offerVersion)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    marketTradePrice: ").append(toIndentedString(marketTradePrice)).append("\n");
    sb.append("    offerDetailResponses: ").append(toIndentedString(offerDetailResponses)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
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
