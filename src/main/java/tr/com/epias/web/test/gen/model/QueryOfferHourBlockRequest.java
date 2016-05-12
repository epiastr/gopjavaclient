package tr.com.epias.web.test.gen.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;

import com.google.gson.annotations.SerializedName;




/**
 * Request Criteria of Offer Period List
 **/
@ApiModel(description = "Request Criteria of Offer Period List")
public class QueryOfferHourBlockRequest   {
  
  @SerializedName("date")
  private LocalDateTime date = null;
  

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
  

  
  /**
   * This field keeps the date information of periods that are wanted to be listed.
   **/
  @ApiModelProperty(value = "This field keeps the date information of periods that are wanted to be listed.")
  public LocalDateTime getDate() {
    return date;
  }
  public void setDate(LocalDateTime date) {
    this.date = date;
  }

  
  /**
   * This field keeps Offer Type.
   **/
  @ApiModelProperty(value = "This field keeps Offer Type.")
  public OfferTypeEnum getOfferType() {
    return offerType;
  }
  public void setOfferType(OfferTypeEnum offerType) {
    this.offerType = offerType;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryOfferHourBlockRequest queryOfferHourBlockRequest = (QueryOfferHourBlockRequest) o;
    return Objects.equals(this.date, queryOfferHourBlockRequest.date) &&
        Objects.equals(this.offerType, queryOfferHourBlockRequest.offerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, offerType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryOfferHourBlockRequest {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    offerType: ").append(toIndentedString(offerType)).append("\n");
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
