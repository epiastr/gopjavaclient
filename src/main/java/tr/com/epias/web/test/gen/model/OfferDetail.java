package tr.com.epias.web.test.gen.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import tr.com.epias.web.test.gen.model.OfferPrice;

import com.google.gson.annotations.SerializedName;




/**
 * This model keeps Information of Offer Detail.
 **/
@ApiModel(description = "This model keeps Information of Offer Detail.")
public class OfferDetail   {
  
  @SerializedName("offerDetailId")
  private Long offerDetailId = null;
  
  @SerializedName("startPeriod")
  private Integer startPeriod = null;
  
  @SerializedName("duration")
  private Integer duration = null;
  
  @SerializedName("periodDescription")
  private String periodDescription = null;
  
  @SerializedName("dst")
  private Boolean dst = false;
  
  @SerializedName("offerPrices")
  private List<OfferPrice> offerPrices = new ArrayList<OfferPrice>();
  
  @SerializedName("block")
  private String block = null;
  
  @SerializedName("relatedBlock")
  private String relatedBlock = null;
  

  
  /**
   * This field keeps Offer Detail ID.
   **/
  @ApiModelProperty(value = "This field keeps Offer Detail ID.")
  public Long getOfferDetailId() {
    return offerDetailId;
  }
  public void setOfferDetailId(Long offerDetailId) {
    this.offerDetailId = offerDetailId;
  }

  
  /**
   * This field keeps Start Period.
   **/
  @ApiModelProperty(value = "This field keeps Start Period.")
  public Integer getStartPeriod() {
    return startPeriod;
  }
  public void setStartPeriod(Integer startPeriod) {
    this.startPeriod = startPeriod;
  }

  
  /**
   * This field keeps Period Count.
   **/
  @ApiModelProperty(value = "This field keeps Period Count.")
  public Integer getDuration() {
    return duration;
  }
  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  
  /**
   * This field keeps Period Explanation.
   **/
  @ApiModelProperty(value = "This field keeps Period Explanation.")
  public String getPeriodDescription() {
    return periodDescription;
  }
  public void setPeriodDescription(String periodDescription) {
    this.periodDescription = periodDescription;
  }

  
  /**
   * This field keeps Information of Daylight Saving.
   **/
  @ApiModelProperty(value = "This field keeps Information of Daylight Saving.")
  public Boolean getDst() {
    return dst;
  }
  public void setDst(Boolean dst) {
    this.dst = dst;
  }

  
  /**
   * This field keeps Offer Price Details.
   **/
  @ApiModelProperty(value = "This field keeps Offer Price Details.")
  public List<OfferPrice> getOfferPrices() {
    return offerPrices;
  }
  public void setOfferPrices(List<OfferPrice> offerPrices) {
    this.offerPrices = offerPrices;
  }

  
  /**
   * If Offer is Block Offer, this field keeps Block Offer Name.
   **/
  @ApiModelProperty(value = "If Offer is Block Offer, this field keeps Block Offer Name.")
  public String getBlock() {
    return block;
  }
  public void setBlock(String block) {
    this.block = block;
  }

  
  /**
   * If Offer is Block Offer, this field keeps Related Offer Name of that Block Offer.
   **/
  @ApiModelProperty(value = "If Offer is Block Offer, this field keeps Related Offer Name of that Block Offer.")
  public String getRelatedBlock() {
    return relatedBlock;
  }
  public void setRelatedBlock(String relatedBlock) {
    this.relatedBlock = relatedBlock;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferDetail offerDetail = (OfferDetail) o;
    return Objects.equals(this.offerDetailId, offerDetail.offerDetailId) &&
        Objects.equals(this.startPeriod, offerDetail.startPeriod) &&
        Objects.equals(this.duration, offerDetail.duration) &&
        Objects.equals(this.periodDescription, offerDetail.periodDescription) &&
        Objects.equals(this.dst, offerDetail.dst) &&
        Objects.equals(this.offerPrices, offerDetail.offerPrices) &&
        Objects.equals(this.block, offerDetail.block) &&
        Objects.equals(this.relatedBlock, offerDetail.relatedBlock);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerDetailId, startPeriod, duration, periodDescription, dst, offerPrices, block, relatedBlock);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferDetail {\n");
    
    sb.append("    offerDetailId: ").append(toIndentedString(offerDetailId)).append("\n");
    sb.append("    startPeriod: ").append(toIndentedString(startPeriod)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    periodDescription: ").append(toIndentedString(periodDescription)).append("\n");
    sb.append("    dst: ").append(toIndentedString(dst)).append("\n");
    sb.append("    offerPrices: ").append(toIndentedString(offerPrices)).append("\n");
    sb.append("    block: ").append(toIndentedString(block)).append("\n");
    sb.append("    relatedBlock: ").append(toIndentedString(relatedBlock)).append("\n");
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
