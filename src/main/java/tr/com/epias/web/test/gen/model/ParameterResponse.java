package tr.com.epias.web.test.gen.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * This model keeps Information of System Parametric Variable.
 **/
@ApiModel(description = "This model keeps Information of System Parametric Variable.")
public class ParameterResponse   {
  
  @SerializedName("value")
  private String value = null;
  
  @SerializedName("description")
  private String description = null;
  

  
  /**
   * This field keeps value of System Parametric Variable.
   **/
  @ApiModelProperty(value = "This field keeps value of System Parametric Variable.")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  
  /**
   * This field keeps Description of System Parametric Variable.
   **/
  @ApiModelProperty(value = "This field keeps Description of System Parametric Variable.")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParameterResponse parameterResponse = (ParameterResponse) o;
    return Objects.equals(this.value, parameterResponse.value) &&
        Objects.equals(this.description, parameterResponse.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParameterResponse {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
