package tr.com.epias.web.test.gen.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import tr.com.epias.web.test.gen.model.CurrencyInfo;
import tr.com.epias.web.test.gen.model.OfferDetail;
import tr.com.epias.web.test.gen.model.Organization;

import com.google.gson.annotations.SerializedName;




/**
 * This model keeps Offer Response Information.
 **/
@ApiModel(description = "This model keeps Offer Response Information.")
public class OfferResponse   {
  
  @SerializedName("deliveryDay")
  private LocalDateTime deliveryDay = null;
  

public enum OfferTypeEnum {
  @SerializedName("HOURLY")
  HOURLY("HOURLY"),

  @SerializedName("BLOCK")
  BLOCK("BLOCK"),

  @SerializedName("FLEXIBLE")
  FLEXIBLE("FLEXIBLE");

  private String value;

  OfferTypeEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  @SerializedName("offerType")
  private OfferTypeEnum offerType = null;
  
  @SerializedName("regionCode")
  private String regionCode = null;
  
  @SerializedName("currencyCode")
  private String currencyCode = null;
  
  @SerializedName("offerDetails")
  private List<OfferDetail> offerDetails = new ArrayList<OfferDetail>();
  
  @SerializedName("user")
  private String user = null;
  

public enum AvailableActionsEnum {
  @SerializedName("CREATABLE")
  CREATABLE("CREATABLE"),

  @SerializedName("EDITABLE")
  EDITABLE("EDITABLE"),

  @SerializedName("CANCELABLE")
  CANCELABLE("CANCELABLE"),

  @SerializedName("READONLY")
  READONLY("READONLY");

  private String value;

  AvailableActionsEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  @SerializedName("availableActions")
  private List<AvailableActionsEnum> availableActions = new ArrayList<AvailableActionsEnum>();
  
  @SerializedName("currencyName")
  private String currencyName = null;
  
  @SerializedName("regionName")
  private String regionName = null;
  
  @SerializedName("dayLightSavingDay")
  private Boolean dayLightSavingDay = false;
  
  @SerializedName("currencyInfo")
  private CurrencyInfo currencyInfo = null;
  
  @SerializedName("state")
  private String state = null;
  
  @SerializedName("lastModifyDate")
  private LocalDateTime lastModifyDate = null;
  
  @SerializedName("offerVersion")
  private Integer offerVersion = null;
  
  @SerializedName("organization")
  private Organization organization = null;
  

  
  /**
   * This model keeps Information of Offer.
   **/
  @ApiModelProperty(value = "This model keeps Information of Offer.")
  public LocalDateTime getDeliveryDay() {
    return deliveryDay;
  }
  public void setDeliveryDay(LocalDateTime deliveryDay) {
    this.deliveryDay = deliveryDay;
  }

  
  /**
   * This field keeps Offer Type.
   **/
  @ApiModelProperty(value = "This field keeps Offer Type.")
  public OfferTypeEnum getOfferType() {
    return offerType;
  }
  public void setOfferType(OfferTypeEnum offerType) {
    this.offerType = offerType;
  }

  
  /**
   * This field keeps Region Code of Offer.
   **/
  @ApiModelProperty(value = "This field keeps Region Code of Offer.")
  public String getRegionCode() {
    return regionCode;
  }
  public void setRegionCode(String regionCode) {
    this.regionCode = regionCode;
  }

  
  /**
   * This field keeps Currency Code of Offer.
   **/
  @ApiModelProperty(value = "This field keeps Currency Code of Offer.")
  public String getCurrencyCode() {
    return currencyCode;
  }
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  
  /**
   * This field keeps Model of Offer Detail.
   **/
  @ApiModelProperty(value = "This field keeps Model of Offer Detail.")
  public List<OfferDetail> getOfferDetails() {
    return offerDetails;
  }
  public void setOfferDetails(List<OfferDetail> offerDetails) {
    this.offerDetails = offerDetails;
  }

  
  /**
   * This field keeps the information of user who did the most recent update on the offer.
   **/
  @ApiModelProperty(value = "This field keeps the information of user who did the most recent update on the offer.")
  public String getUser() {
    return user;
  }
  public void setUser(String user) {
    this.user = user;
  }

  
  /**
   * This field keeps Offer Actions. CREATABLE, EDITABLE,CANCELABLE,READONLY.
   **/
  @ApiModelProperty(value = "This field keeps Offer Actions. CREATABLE, EDITABLE,CANCELABLE,READONLY.")
  public List<AvailableActionsEnum> getAvailableActions() {
    return availableActions;
  }
  public void setAvailableActions(List<AvailableActionsEnum> availableActions) {
    this.availableActions = availableActions;
  }

  
  /**
   * This field keeps Currency of Offer.
   **/
  @ApiModelProperty(value = "This field keeps Currency of Offer.")
  public String getCurrencyName() {
    return currencyName;
  }
  public void setCurrencyName(String currencyName) {
    this.currencyName = currencyName;
  }

  
  /**
   * This field keeps Region Name of Offer.
   **/
  @ApiModelProperty(value = "This field keeps Region Name of Offer.")
  public String getRegionName() {
    return regionName;
  }
  public void setRegionName(String regionName) {
    this.regionName = regionName;
  }

  
  /**
   * This field keeps Information of Daylight Saving.
   **/
  @ApiModelProperty(value = "This field keeps Information of Daylight Saving.")
  public Boolean getDayLightSavingDay() {
    return dayLightSavingDay;
  }
  public void setDayLightSavingDay(Boolean dayLightSavingDay) {
    this.dayLightSavingDay = dayLightSavingDay;
  }

  
  /**
   * This field keeps Offer Currency Info.
   **/
  @ApiModelProperty(value = "This field keeps Offer Currency Info.")
  public CurrencyInfo getCurrencyInfo() {
    return currencyInfo;
  }
  public void setCurrencyInfo(CurrencyInfo currencyInfo) {
    this.currencyInfo = currencyInfo;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public LocalDateTime getLastModifyDate() {
    return lastModifyDate;
  }
  public void setLastModifyDate(LocalDateTime lastModifyDate) {
    this.lastModifyDate = lastModifyDate;
  }

  
  /**
   * This field keeps Offer Version.
   **/
  @ApiModelProperty(value = "This field keeps Offer Version.")
  public Integer getOfferVersion() {
    return offerVersion;
  }
  public void setOfferVersion(Integer offerVersion) {
    this.offerVersion = offerVersion;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Organization getOrganization() {
    return organization;
  }
  public void setOrganization(Organization organization) {
    this.organization = organization;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferResponse offerResponse = (OfferResponse) o;
    return Objects.equals(this.deliveryDay, offerResponse.deliveryDay) &&
        Objects.equals(this.offerType, offerResponse.offerType) &&
        Objects.equals(this.regionCode, offerResponse.regionCode) &&
        Objects.equals(this.currencyCode, offerResponse.currencyCode) &&
        Objects.equals(this.offerDetails, offerResponse.offerDetails) &&
        Objects.equals(this.user, offerResponse.user) &&
        Objects.equals(this.availableActions, offerResponse.availableActions) &&
        Objects.equals(this.currencyName, offerResponse.currencyName) &&
        Objects.equals(this.regionName, offerResponse.regionName) &&
        Objects.equals(this.dayLightSavingDay, offerResponse.dayLightSavingDay) &&
        Objects.equals(this.currencyInfo, offerResponse.currencyInfo) &&
        Objects.equals(this.state, offerResponse.state) &&
        Objects.equals(this.lastModifyDate, offerResponse.lastModifyDate) &&
        Objects.equals(this.offerVersion, offerResponse.offerVersion) &&
        Objects.equals(this.organization, offerResponse.organization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryDay, offerType, regionCode, currencyCode, offerDetails, user, availableActions, currencyName, regionName, dayLightSavingDay, currencyInfo, state, lastModifyDate, offerVersion, organization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferResponse {\n");
    
    sb.append("    deliveryDay: ").append(toIndentedString(deliveryDay)).append("\n");
    sb.append("    offerType: ").append(toIndentedString(offerType)).append("\n");
    sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    offerDetails: ").append(toIndentedString(offerDetails)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    availableActions: ").append(toIndentedString(availableActions)).append("\n");
    sb.append("    currencyName: ").append(toIndentedString(currencyName)).append("\n");
    sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
    sb.append("    dayLightSavingDay: ").append(toIndentedString(dayLightSavingDay)).append("\n");
    sb.append("    currencyInfo: ").append(toIndentedString(currencyInfo)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    lastModifyDate: ").append(toIndentedString(lastModifyDate)).append("\n");
    sb.append("    offerVersion: ").append(toIndentedString(offerVersion)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
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
