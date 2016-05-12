package tr.com.epias.web.test.gen.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import tr.com.epias.web.test.gen.model.ContractBlockHour;

import com.google.gson.annotations.SerializedName;




/**
 * This field keeps the period information that the contracts are entered within.
 **/
@ApiModel(description = "This field keeps the period information that the contracts are entered within.")
public class QueryContractPeriodResponse   {
  
  @SerializedName("contractHourPeriods")
  private List<ContractBlockHour> contractHourPeriods = new ArrayList<ContractBlockHour>();
  

  
  /**
   * Period List of Contract
   **/
  @ApiModelProperty(value = "Period List of Contract")
  public List<ContractBlockHour> getContractHourPeriods() {
    return contractHourPeriods;
  }
  public void setContractHourPeriods(List<ContractBlockHour> contractHourPeriods) {
    this.contractHourPeriods = contractHourPeriods;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryContractPeriodResponse queryContractPeriodResponse = (QueryContractPeriodResponse) o;
    return Objects.equals(this.contractHourPeriods, queryContractPeriodResponse.contractHourPeriods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractHourPeriods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryContractPeriodResponse {\n");
    
    sb.append("    contractHourPeriods: ").append(toIndentedString(contractHourPeriods)).append("\n");
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
