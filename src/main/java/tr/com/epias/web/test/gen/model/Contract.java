package tr.com.epias.web.test.gen.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;
import tr.com.epias.web.test.gen.model.ContractOfferResponseModel;

import com.google.gson.annotations.SerializedName;




/**
 * It keeps the general response structure that is used in contract services such as Listing, Creating and Deleting...
 **/
@ApiModel(description = "It keeps the general response structure that is used in contract services such as Listing, Creating and Deleting...")
public class Contract   {
  
  @SerializedName("contractId")
  private Long contractId = null;
  
  @SerializedName("deliveryDay")
  private LocalDateTime deliveryDay = null;
  
  @SerializedName("version")
  private Integer version = null;
  
  @SerializedName("offer")
  private ContractOfferResponseModel offer = null;
  
  @SerializedName("counterOffer")
  private ContractOfferResponseModel counterOffer = null;
  

public enum StatusEnum {
  @SerializedName("APPROVED")
  APPROVED("APPROVED"),

  @SerializedName("WAITING_FOR_APPROVAL")
  WAITING_FOR_APPROVAL("WAITING_FOR_APPROVAL"),

  @SerializedName("INVALID")
  INVALID("INVALID");

  private String value;

  StatusEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  @SerializedName("status")
  private StatusEnum status = null;
  
  @SerializedName("state")
  private String state = null;
  
  @SerializedName("user")
  private String user = null;
  
  @SerializedName("organizationShortName")
  private String organizationShortName = null;
  

  
  /**
   * This field keeps Contract ID.
   **/
  @ApiModelProperty(value = "This field keeps Contract ID.")
  public Long getContractId() {
    return contractId;
  }
  public void setContractId(Long contractId) {
    this.contractId = contractId;
  }

  
  /**
   * This field keeps Delivery Date of Contract.
   **/
  @ApiModelProperty(value = "This field keeps Delivery Date of Contract.")
  public LocalDateTime getDeliveryDay() {
    return deliveryDay;
  }
  public void setDeliveryDay(LocalDateTime deliveryDay) {
    this.deliveryDay = deliveryDay;
  }

  
  /**
   * This field keeps Information of Contract Version.
   **/
  @ApiModelProperty(value = "This field keeps Information of Contract Version.")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  
  /**
   * This field keeps Offer Information of Contract.
   **/
  @ApiModelProperty(value = "This field keeps Offer Information of Contract.")
  public ContractOfferResponseModel getOffer() {
    return offer;
  }
  public void setOffer(ContractOfferResponseModel offer) {
    this.offer = offer;
  }

  
  /**
   * This field keeps Informat\u0131on of Counter Offer.
   **/
  @ApiModelProperty(value = "This field keeps Informat\u0131on of Counter Offer.")
  public ContractOfferResponseModel getCounterOffer() {
    return counterOffer;
  }
  public void setCounterOffer(ContractOfferResponseModel counterOffer) {
    this.counterOffer = counterOffer;
  }

  
  /**
   * This field keeps Contract Status.
   **/
  @ApiModelProperty(value = "This field keeps Contract Status.")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * This field keeps the reason for increasing the version
   **/
  @ApiModelProperty(value = "This field keeps the reason for increasing the version")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  
  /**
   * This field keeps the information of user who did the most recent update on contracts.
   **/
  @ApiModelProperty(value = "This field keeps the information of user who did the most recent update on contracts.")
  public String getUser() {
    return user;
  }
  public void setUser(String user) {
    this.user = user;
  }

  
  /**
   * This field keeps organization short name for the user who did the most recent update on contracts.
   **/
  @ApiModelProperty(value = "This field keeps organization short name for the user who did the most recent update on contracts.")
  public String getOrganizationShortName() {
    return organizationShortName;
  }
  public void setOrganizationShortName(String organizationShortName) {
    this.organizationShortName = organizationShortName;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contract contract = (Contract) o;
    return Objects.equals(this.contractId, contract.contractId) &&
        Objects.equals(this.deliveryDay, contract.deliveryDay) &&
        Objects.equals(this.version, contract.version) &&
        Objects.equals(this.offer, contract.offer) &&
        Objects.equals(this.counterOffer, contract.counterOffer) &&
        Objects.equals(this.status, contract.status) &&
        Objects.equals(this.state, contract.state) &&
        Objects.equals(this.user, contract.user) &&
        Objects.equals(this.organizationShortName, contract.organizationShortName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractId, deliveryDay, version, offer, counterOffer, status, state, user, organizationShortName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contract {\n");
    
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    deliveryDay: ").append(toIndentedString(deliveryDay)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
    sb.append("    counterOffer: ").append(toIndentedString(counterOffer)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    organizationShortName: ").append(toIndentedString(organizationShortName)).append("\n");
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
