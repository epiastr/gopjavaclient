package tr.com.epias.web.test.gen.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import tr.com.epias.web.test.gen.model.OfferResponse;

import com.google.gson.annotations.SerializedName;




/**
 * This model keeps general Offer Response Information.
 **/
@ApiModel(description = "This model keeps general Offer Response Information.")
public class QueryOfferResponse   {
  
  @SerializedName("offers")
  private List<OfferResponse> offers = new ArrayList<OfferResponse>();
  

  
  /**
   * This field keeps Offer Information.
   **/
  @ApiModelProperty(value = "This field keeps Offer Information.")
  public List<OfferResponse> getOffers() {
    return offers;
  }
  public void setOffers(List<OfferResponse> offers) {
    this.offers = offers;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryOfferResponse queryOfferResponse = (QueryOfferResponse) o;
    return Objects.equals(this.offers, queryOfferResponse.offers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryOfferResponse {\n");
    
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
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
