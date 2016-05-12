package tr.com.epias.web.test.gen.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * This model keeps Information of Contract Amount.
 **/
@ApiModel(description = "This model keeps Information of Contract Amount.")
public class ContractOfferAmountResponseModel   {
  
  @SerializedName("period")
  private Integer period = null;
  
  @SerializedName("amount")
  private Double amount = null;
  

  
  /**
   * This field keeps Information of Period.
   **/
  @ApiModelProperty(value = "This field keeps Information of Period.")
  public Integer getPeriod() {
    return period;
  }
  public void setPeriod(Integer period) {
    this.period = period;
  }

  
  /**
   * This field keeps Information of Amount.
   **/
  @ApiModelProperty(value = "This field keeps Information of Amount.")
  public Double getAmount() {
    return amount;
  }
  public void setAmount(Double amount) {
    this.amount = amount;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractOfferAmountResponseModel contractOfferAmountResponseModel = (ContractOfferAmountResponseModel) o;
    return Objects.equals(this.period, contractOfferAmountResponseModel.period) &&
        Objects.equals(this.amount, contractOfferAmountResponseModel.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(period, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractOfferAmountResponseModel {\n");
    
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
