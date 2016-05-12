package tr.com.epias.web.test.gen.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * This model keeps Contract Status.
 **/
@ApiModel(description = "This model keeps Contract Status.")
public class ContractStatus   {
  
  @SerializedName("status")
  private String status = null;
  
  @SerializedName("description")
  private String description = null;
  

  
  /**
   * This field keeps Contract Status.
   **/
  @ApiModelProperty(value = "This field keeps Contract Status.")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * This field keeps Explanation of Contract Status.
   **/
  @ApiModelProperty(value = "This field keeps Explanation of Contract Status.")
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
    ContractStatus contractStatus = (ContractStatus) o;
    return Objects.equals(this.status, contractStatus.status) &&
        Objects.equals(this.description, contractStatus.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractStatus {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
