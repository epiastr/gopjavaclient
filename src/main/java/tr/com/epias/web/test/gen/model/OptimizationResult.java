package tr.com.epias.web.test.gen.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import tr.com.epias.web.test.gen.model.OptimizationSummary;

import com.google.gson.annotations.SerializedName;




/**
 * This model keeps Information of Regional Result.
 **/
@ApiModel(description = "This model keeps Information of Regional Result.")
public class OptimizationResult   {
  
  @SerializedName("summaries")
  private List<OptimizationSummary> summaries = new ArrayList<OptimizationSummary>();
  

  
  /**
   * This field keeps Regional Result.
   **/
  @ApiModelProperty(value = "This field keeps Regional Result.")
  public List<OptimizationSummary> getSummaries() {
    return summaries;
  }
  public void setSummaries(List<OptimizationSummary> summaries) {
    this.summaries = summaries;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizationResult optimizationResult = (OptimizationResult) o;
    return Objects.equals(this.summaries, optimizationResult.summaries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(summaries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizationResult {\n");
    
    sb.append("    summaries: ").append(toIndentedString(summaries)).append("\n");
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
