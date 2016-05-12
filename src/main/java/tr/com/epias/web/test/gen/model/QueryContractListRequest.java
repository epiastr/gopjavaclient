package tr.com.epias.web.test.gen.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import tr.com.epias.web.test.gen.model.QueryContractRequest;

import com.google.gson.annotations.SerializedName;




/**
 * This model keeps Information of Delete Contract Request.
 **/
@ApiModel(description = "This model keeps Information of Delete Contract Request.")
public class QueryContractListRequest   {
  
  @SerializedName("contracts")
  private List<QueryContractRequest> contracts = new ArrayList<QueryContractRequest>();
  

  
  /**
   * This field keeps the counter offer information that is wanted to be deleted.
   **/
  @ApiModelProperty(value = "This field keeps the counter offer information that is wanted to be deleted.")
  public List<QueryContractRequest> getContracts() {
    return contracts;
  }
  public void setContracts(List<QueryContractRequest> contracts) {
    this.contracts = contracts;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryContractListRequest queryContractListRequest = (QueryContractListRequest) o;
    return Objects.equals(this.contracts, queryContractListRequest.contracts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contracts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryContractListRequest {\n");
    
    sb.append("    contracts: ").append(toIndentedString(contracts)).append("\n");
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
