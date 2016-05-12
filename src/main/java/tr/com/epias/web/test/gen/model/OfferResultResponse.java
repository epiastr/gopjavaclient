package tr.com.epias.web.test.gen.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import tr.com.epias.web.test.gen.model.OptimizationSummaryByOrganization;

import com.google.gson.annotations.SerializedName;




/**
 * This model keeps Offer Matching Result Response Details.
 **/
@ApiModel(description = "This model keeps Offer Matching Result Response Details.")
public class OfferResultResponse   {
  
  @SerializedName("optimizationSummaryByOrganizations")
  private List<OptimizationSummaryByOrganization> optimizationSummaryByOrganizations = new ArrayList<OptimizationSummaryByOrganization>();
  

  
  /**
   * This field keeps Offer Matching Result Information
   **/
  @ApiModelProperty(required = true, value = "This field keeps Offer Matching Result Information")
  public List<OptimizationSummaryByOrganization> getOptimizationSummaryByOrganizations() {
    return optimizationSummaryByOrganizations;
  }
  public void setOptimizationSummaryByOrganizations(List<OptimizationSummaryByOrganization> optimizationSummaryByOrganizations) {
    this.optimizationSummaryByOrganizations = optimizationSummaryByOrganizations;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferResultResponse offerResultResponse = (OfferResultResponse) o;
    return Objects.equals(this.optimizationSummaryByOrganizations, offerResultResponse.optimizationSummaryByOrganizations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(optimizationSummaryByOrganizations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferResultResponse {\n");
    
    sb.append("    optimizationSummaryByOrganizations: ").append(toIndentedString(optimizationSummaryByOrganizations)).append("\n");
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
