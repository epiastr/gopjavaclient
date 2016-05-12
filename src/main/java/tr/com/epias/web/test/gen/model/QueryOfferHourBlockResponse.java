package tr.com.epias.web.test.gen.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import tr.com.epias.web.test.gen.model.OfferBlockHour;

import com.google.gson.annotations.SerializedName;




/**
 * 
 **/
@ApiModel(description = "")
public class QueryOfferHourBlockResponse   {
  
  @SerializedName("offerBlockHours")
  private List<OfferBlockHour> offerBlockHours = new ArrayList<OfferBlockHour>();
  

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public List<OfferBlockHour> getOfferBlockHours() {
    return offerBlockHours;
  }
  public void setOfferBlockHours(List<OfferBlockHour> offerBlockHours) {
    this.offerBlockHours = offerBlockHours;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryOfferHourBlockResponse queryOfferHourBlockResponse = (QueryOfferHourBlockResponse) o;
    return Objects.equals(this.offerBlockHours, queryOfferHourBlockResponse.offerBlockHours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerBlockHours);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryOfferHourBlockResponse {\n");
    
    sb.append("    offerBlockHours: ").append(toIndentedString(offerBlockHours)).append("\n");
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
