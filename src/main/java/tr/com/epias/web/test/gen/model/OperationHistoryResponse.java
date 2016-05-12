package tr.com.epias.web.test.gen.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import tr.com.epias.web.test.gen.model.Operation;

import com.google.gson.annotations.SerializedName;




/**
 * This model keeps Information of Operation History.
 **/
@ApiModel(description = "This model keeps Information of Operation History.")
public class OperationHistoryResponse   {
  
  @SerializedName("operationHistories")
  private List<Operation> operationHistories = new ArrayList<Operation>();
  

  
  /**
   * This field keeps Information List of Operation History.
   **/
  @ApiModelProperty(value = "This field keeps Information List of Operation History.")
  public List<Operation> getOperationHistories() {
    return operationHistories;
  }
  public void setOperationHistories(List<Operation> operationHistories) {
    this.operationHistories = operationHistories;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationHistoryResponse operationHistoryResponse = (OperationHistoryResponse) o;
    return Objects.equals(this.operationHistories, operationHistoryResponse.operationHistories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationHistories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationHistoryResponse {\n");
    
    sb.append("    operationHistories: ").append(toIndentedString(operationHistories)).append("\n");
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
