package tr.com.epias.web.test.gen.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;

import com.google.gson.annotations.SerializedName;




/**
 * Organization&#39;s ID and Current Status Period 
 **/
@ApiModel(description = "Organization's ID and Current Status Period ")
public class OrganizationId   {
  
  @SerializedName("id")
  private Long id = null;
  
  @SerializedName("period")
  private LocalDateTime period = null;
  

  
  /**
   * This field keeps Organization' s ID.
   **/
  @ApiModelProperty(value = "This field keeps Organization' s ID.")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * This field keeps Organization Status Period.
   **/
  @ApiModelProperty(value = "This field keeps Organization Status Period.")
  public LocalDateTime getPeriod() {
    return period;
  }
  public void setPeriod(LocalDateTime period) {
    this.period = period;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationId organizationId = (OrganizationId) o;
    return Objects.equals(this.id, organizationId.id) &&
        Objects.equals(this.period, organizationId.period);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, period);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationId {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
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
