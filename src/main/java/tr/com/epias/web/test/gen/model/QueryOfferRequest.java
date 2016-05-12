package tr.com.epias.web.test.gen.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;

import com.google.gson.annotations.SerializedName;




/**
 * This model is used to list Offers. If version field isn&#39;t set, service only fetches active Offer List. If version field is set, service fetches active or pasive Offer belonging given version.
 **/
@ApiModel(description = "This model is used to list Offers. If version field isn't set, service only fetches active Offer List. If version field is set, service fetches active or pasive Offer belonging given version.")
public class QueryOfferRequest   {
  
  @SerializedName("start")
  private LocalDateTime start = null;
  
  @SerializedName("end")
  private LocalDateTime end = null;
  

public enum OfferTypeEnum {
  @SerializedName("HOURLY")
  HOURLY("HOURLY"),

  @SerializedName("BLOCK")
  BLOCK("BLOCK"),

  @SerializedName("FLEXIBLE")
  FLEXIBLE("FLEXIBLE");

  private String value;

  OfferTypeEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  @SerializedName("offerType")
  private OfferTypeEnum offerType = null;
  
  @SerializedName("regionCode")
  private String regionCode = null;
  
  @SerializedName("version")
  private Integer version = null;
  

  
  /**
   * This model is used to list Offers. If version field isn't set, service only fetches active Offer List. If version field is set, service fetches active or pasive Offer belonging given version.
   **/
  @ApiModelProperty(required = true, value = "This model is used to list Offers. If version field isn't set, service only fetches active Offer List. If version field is set, service fetches active or pasive Offer belonging given version.")
  public LocalDateTime getStart() {
    return start;
  }
  public void setStart(LocalDateTime start) {
    this.start = start;
  }

  
  /**
   * This model is used to list Offers. If version field isn't set, service only fetches active Offer List. If version field is set, service fetches active or pasive Offer belonging given version.
   **/
  @ApiModelProperty(required = true, value = "This model is used to list Offers. If version field isn't set, service only fetches active Offer List. If version field is set, service fetches active or pasive Offer belonging given version.")
  public LocalDateTime getEnd() {
    return end;
  }
  public void setEnd(LocalDateTime end) {
    this.end = end;
  }

  
  /**
   * This model is used to list Offers. If version field isn't set, service only fetches active Offer List. If version field is set, service fetches active or pasive Offer belonging given version.
   **/
  @ApiModelProperty(required = true, value = "This model is used to list Offers. If version field isn't set, service only fetches active Offer List. If version field is set, service fetches active or pasive Offer belonging given version.")
  public OfferTypeEnum getOfferType() {
    return offerType;
  }
  public void setOfferType(OfferTypeEnum offerType) {
    this.offerType = offerType;
  }

  
  /**
   * This model is used to list Offers. If version field isn't set, service only fetches active Offer List. If version field is set, service fetches active or pasive Offer belonging given version.
   **/
  @ApiModelProperty(required = true, value = "This model is used to list Offers. If version field isn't set, service only fetches active Offer List. If version field is set, service fetches active or pasive Offer belonging given version.")
  public String getRegionCode() {
    return regionCode;
  }
  public void setRegionCode(String regionCode) {
    this.regionCode = regionCode;
  }

  
  /**
   * This model is used to list Offers. If version field isn't set, service only fetches active Offer List. If version field is set, service fetches active or pasive Offer belonging given version.
   **/
  @ApiModelProperty(required = true, value = "This model is used to list Offers. If version field isn't set, service only fetches active Offer List. If version field is set, service fetches active or pasive Offer belonging given version.")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryOfferRequest queryOfferRequest = (QueryOfferRequest) o;
    return Objects.equals(this.start, queryOfferRequest.start) &&
        Objects.equals(this.end, queryOfferRequest.end) &&
        Objects.equals(this.offerType, queryOfferRequest.offerType) &&
        Objects.equals(this.regionCode, queryOfferRequest.regionCode) &&
        Objects.equals(this.version, queryOfferRequest.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end, offerType, regionCode, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryOfferRequest {\n");
    
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    offerType: ").append(toIndentedString(offerType)).append("\n");
    sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
