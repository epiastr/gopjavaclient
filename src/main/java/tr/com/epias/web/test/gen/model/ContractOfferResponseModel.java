package tr.com.epias.web.test.gen.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import tr.com.epias.web.test.gen.model.ContractOfferAmountResponseModel;

import com.google.gson.annotations.SerializedName;




/**
 * This model keeps Offer Information of Contract.
 **/
@ApiModel(description = "This model keeps Offer Information of Contract.")
public class ContractOfferResponseModel   {
  
  @SerializedName("eicCode")
  private String eicCode = null;
  
  @SerializedName("organization")
  private String organization = null;
  
  @SerializedName("regionCode")
  private String regionCode = null;
  
  @SerializedName("regionName")
  private String regionName = null;
  
  @SerializedName("offerAmount")
  private List<ContractOfferAmountResponseModel> offerAmount = new ArrayList<ContractOfferAmountResponseModel>();
  
  @SerializedName("user")
  private String user = null;
  

  
  /**
   * This field keeps Information of EIC Code.
   **/
  @ApiModelProperty(value = "This field keeps Information of EIC Code.")
  public String getEicCode() {
    return eicCode;
  }
  public void setEicCode(String eicCode) {
    this.eicCode = eicCode;
  }

  
  /**
   * This field keeps Organization Short Name.
   **/
  @ApiModelProperty(value = "This field keeps Organization Short Name.")
  public String getOrganization() {
    return organization;
  }
  public void setOrganization(String organization) {
    this.organization = organization;
  }

  
  /**
   * This field keeps Information of Region Code.
   **/
  @ApiModelProperty(value = "This field keeps Information of Region Code.")
  public String getRegionCode() {
    return regionCode;
  }
  public void setRegionCode(String regionCode) {
    this.regionCode = regionCode;
  }

  
  /**
   * This field keeps Information of Region Name.
   **/
  @ApiModelProperty(value = "This field keeps Information of Region Name.")
  public String getRegionName() {
    return regionName;
  }
  public void setRegionName(String regionName) {
    this.regionName = regionName;
  }

  
  /**
   * This field keeps Information of Offer Amount.
   **/
  @ApiModelProperty(value = "This field keeps Information of Offer Amount.")
  public List<ContractOfferAmountResponseModel> getOfferAmount() {
    return offerAmount;
  }
  public void setOfferAmount(List<ContractOfferAmountResponseModel> offerAmount) {
    this.offerAmount = offerAmount;
  }

  
  /**
   * This field keeps the information of user who did the most recent update on offer.
   **/
  @ApiModelProperty(value = "This field keeps the information of user who did the most recent update on offer.")
  public String getUser() {
    return user;
  }
  public void setUser(String user) {
    this.user = user;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractOfferResponseModel contractOfferResponseModel = (ContractOfferResponseModel) o;
    return Objects.equals(this.eicCode, contractOfferResponseModel.eicCode) &&
        Objects.equals(this.organization, contractOfferResponseModel.organization) &&
        Objects.equals(this.regionCode, contractOfferResponseModel.regionCode) &&
        Objects.equals(this.regionName, contractOfferResponseModel.regionName) &&
        Objects.equals(this.offerAmount, contractOfferResponseModel.offerAmount) &&
        Objects.equals(this.user, contractOfferResponseModel.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eicCode, organization, regionCode, regionName, offerAmount, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractOfferResponseModel {\n");
    
    sb.append("    eicCode: ").append(toIndentedString(eicCode)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
    sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
    sb.append("    offerAmount: ").append(toIndentedString(offerAmount)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
