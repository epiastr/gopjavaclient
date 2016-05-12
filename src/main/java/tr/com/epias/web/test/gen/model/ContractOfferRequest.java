package tr.com.epias.web.test.gen.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import tr.com.epias.web.test.gen.model.ContractOfferAmountRequest;

import com.google.gson.annotations.SerializedName;




/**
 * This model keeps Generel Contract Request Object.
 **/
@ApiModel(description = "This model keeps Generel Contract Request Object.")
public class ContractOfferRequest   {
  
  @SerializedName("regionCode")
  private String regionCode = null;
  
  @SerializedName("contractOfferAmounts")
  private List<ContractOfferAmountRequest> contractOfferAmounts = new ArrayList<ContractOfferAmountRequest>();
  

  
  /**
   * This field keeps Region Code of Contract Organization.
   **/
  @ApiModelProperty(value = "This field keeps Region Code of Contract Organization.")
  public String getRegionCode() {
    return regionCode;
  }
  public void setRegionCode(String regionCode) {
    this.regionCode = regionCode;
  }

  
  /**
   * This field keeps Information of Amount and Period.
   **/
  @ApiModelProperty(value = "This field keeps Information of Amount and Period.")
  public List<ContractOfferAmountRequest> getContractOfferAmounts() {
    return contractOfferAmounts;
  }
  public void setContractOfferAmounts(List<ContractOfferAmountRequest> contractOfferAmounts) {
    this.contractOfferAmounts = contractOfferAmounts;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractOfferRequest contractOfferRequest = (ContractOfferRequest) o;
    return Objects.equals(this.regionCode, contractOfferRequest.regionCode) &&
        Objects.equals(this.contractOfferAmounts, contractOfferRequest.contractOfferAmounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regionCode, contractOfferAmounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractOfferRequest {\n");
    
    sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
    sb.append("    contractOfferAmounts: ").append(toIndentedString(contractOfferAmounts)).append("\n");
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
