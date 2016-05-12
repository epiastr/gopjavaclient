package tr.com.epias.web.test.gen.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import tr.com.epias.web.test.gen.model.Contract;

import com.google.gson.annotations.SerializedName;




/**
 * This model keeps Contract Information.
 **/
@ApiModel(description = "This model keeps Contract Information.")
public class ContractResponse   {
  
  @SerializedName("contracts")
  private List<Contract> contracts = new ArrayList<Contract>();
  

  
  /**
   * #{CONTRACT_RESPONSE_FIELD_CONTRACT_RESPONSE_MODEL}
   **/
  @ApiModelProperty(value = "#{CONTRACT_RESPONSE_FIELD_CONTRACT_RESPONSE_MODEL}")
  public List<Contract> getContracts() {
    return contracts;
  }
  public void setContracts(List<Contract> contracts) {
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
    ContractResponse contractResponse = (ContractResponse) o;
    return Objects.equals(this.contracts, contractResponse.contracts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contracts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractResponse {\n");
    
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
