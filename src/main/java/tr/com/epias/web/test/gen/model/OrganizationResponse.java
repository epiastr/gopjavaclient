package tr.com.epias.web.test.gen.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import tr.com.epias.web.test.gen.model.Organization;

import com.google.gson.annotations.SerializedName;




/**
 * This field keeps the counter organization that contact is made with.
 **/
@ApiModel(description = "This field keeps the counter organization that contact is made with.")
public class OrganizationResponse   {
  
  @SerializedName("organizations")
  private List<Organization> organizations = new ArrayList<Organization>();
  

  
  /**
   * This field keeps the list of counter organization that contact is made with.
   **/
  @ApiModelProperty(value = "This field keeps the list of counter organization that contact is made with.")
  public List<Organization> getOrganizations() {
    return organizations;
  }
  public void setOrganizations(List<Organization> organizations) {
    this.organizations = organizations;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationResponse organizationResponse = (OrganizationResponse) o;
    return Objects.equals(this.organizations, organizationResponse.organizations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationResponse {\n");
    
    sb.append("    organizations: ").append(toIndentedString(organizations)).append("\n");
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
