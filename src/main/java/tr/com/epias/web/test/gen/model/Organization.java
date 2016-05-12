package tr.com.epias.web.test.gen.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import tr.com.epias.web.test.gen.model.OrganizationId;

import com.google.gson.annotations.SerializedName;




/**
 * This model keeps Information of Organization.
 **/
@ApiModel(description = "This model keeps Information of Organization.")
public class Organization   {
  
  @SerializedName("name")
  private String name = null;
  
  @SerializedName("shortName")
  private String shortName = null;
  
  @SerializedName("eic")
  private String eic = null;
  
  @SerializedName("organizationId")
  private OrganizationId organizationId = null;
  
  @SerializedName("status")
  private Long status = null;
  

  
  /**
   * This field keeps Organization Name.
   **/
  @ApiModelProperty(value = "This field keeps Organization Name.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * This field keeps Organization Short Name.
   **/
  @ApiModelProperty(value = "This field keeps Organization Short Name.")
  public String getShortName() {
    return shortName;
  }
  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  
  /**
   * This field keeps EIC Code.
   **/
  @ApiModelProperty(value = "This field keeps EIC Code.")
  public String getEic() {
    return eic;
  }
  public void setEic(String eic) {
    this.eic = eic;
  }

  
  /**
   * Organization's ID and Current Status Period 
   **/
  @ApiModelProperty(value = "Organization's ID and Current Status Period ")
  public OrganizationId getOrganizationId() {
    return organizationId;
  }
  public void setOrganizationId(OrganizationId organizationId) {
    this.organizationId = organizationId;
  }

  
  /**
   * This field keeps Organization Status.
   **/
  @ApiModelProperty(value = "This field keeps Organization Status.")
  public Long getStatus() {
    return status;
  }
  public void setStatus(Long status) {
    this.status = status;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Organization organization = (Organization) o;
    return Objects.equals(this.name, organization.name) &&
        Objects.equals(this.shortName, organization.shortName) &&
        Objects.equals(this.eic, organization.eic) &&
        Objects.equals(this.organizationId, organization.organizationId) &&
        Objects.equals(this.status, organization.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, shortName, eic, organizationId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Organization {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    eic: ").append(toIndentedString(eic)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
