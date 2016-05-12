package tr.com.epias.web.test.gen.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import tr.com.epias.web.test.gen.model.ContractStatus;

import com.google.gson.annotations.SerializedName;




/**
 * This field keeps which statues a contact can be.
 **/
@ApiModel(description = "This field keeps which statues a contact can be.")
public class QueryContractStatusResponse   {
  
  @SerializedName("statuses")
  private List<ContractStatus> statuses = new ArrayList<ContractStatus>();
  

  
  /**
   * This field keeps the list of contact statues.
   **/
  @ApiModelProperty(value = "This field keeps the list of contact statues.")
  public List<ContractStatus> getStatuses() {
    return statuses;
  }
  public void setStatuses(List<ContractStatus> statuses) {
    this.statuses = statuses;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryContractStatusResponse queryContractStatusResponse = (QueryContractStatusResponse) o;
    return Objects.equals(this.statuses, queryContractStatusResponse.statuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statuses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryContractStatusResponse {\n");
    
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
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
