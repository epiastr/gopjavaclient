package tr.com.epias.web.test.gen.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;

import com.google.gson.annotations.SerializedName;




/**
 * This model keeps Offer Delete Response Details.
 **/
@ApiModel(description = "This model keeps Offer Delete Response Details.")
public class DeleteOfferResponse   {
  
  @SerializedName("version")
  private Integer version = null;
  
  @SerializedName("lastModifyDate")
  private LocalDateTime lastModifyDate = null;
  

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  
  /**
   * Last Changing Date
   **/
  @ApiModelProperty(value = "Last Changing Date")
  public LocalDateTime getLastModifyDate() {
    return lastModifyDate;
  }
  public void setLastModifyDate(LocalDateTime lastModifyDate) {
    this.lastModifyDate = lastModifyDate;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteOfferResponse deleteOfferResponse = (DeleteOfferResponse) o;
    return Objects.equals(this.version, deleteOfferResponse.version) &&
        Objects.equals(this.lastModifyDate, deleteOfferResponse.lastModifyDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, lastModifyDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteOfferResponse {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    lastModifyDate: ").append(toIndentedString(lastModifyDate)).append("\n");
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
