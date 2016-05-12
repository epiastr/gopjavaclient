package tr.com.epias.web.test.gen.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import tr.com.epias.web.test.gen.model.ParameterResponse;

import com.google.gson.annotations.SerializedName;




/**
 * This model keeps Information of System Parametric Variable.
 **/
@ApiModel(description = "This model keeps Information of System Parametric Variable.")
public class ParameterQueryResponse   {
  
  @SerializedName("parameters")
  private List<ParameterResponse> parameters = new ArrayList<ParameterResponse>();
  

  
  /**
   * This field keeps List of System Parametric Variable.
   **/
  @ApiModelProperty(value = "This field keeps List of System Parametric Variable.")
  public List<ParameterResponse> getParameters() {
    return parameters;
  }
  public void setParameters(List<ParameterResponse> parameters) {
    this.parameters = parameters;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParameterQueryResponse parameterQueryResponse = (ParameterQueryResponse) o;
    return Objects.equals(this.parameters, parameterQueryResponse.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParameterQueryResponse {\n");
    
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
