package tr.com.epias.web.test.gen.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;




/**
 * \u0130\u015Flem bilgisini Tutar
 **/
@ApiModel(description = "\u0130\u015Flem bilgisini Tutar")
public class Operation   {
  
  @SerializedName("entryDate")
  private LocalDateTime entryDate = null;
  
  @SerializedName("id")
  private Long id = null;
  
  @SerializedName("organizationEic")
  private String organizationEic = null;
  
  @SerializedName("organizationName")
  private String organizationName = null;
  
  @SerializedName("organizationShortName")
  private String organizationShortName = null;
  
  @SerializedName("user")
  private String user = null;
  
  @SerializedName("description")
  private String description = null;
  
  @SerializedName("operationName")
  private String operationName = null;
  
  @SerializedName("priority")
  private String priority = null;
  
  @SerializedName("params")
  private Map<String, String> params = new HashMap<String, String>();
  

  
  /**
   * \u0130\u015Flem tarihi bilgisini tutar.
   **/
  @ApiModelProperty(value = "\u0130\u015Flem tarihi bilgisini tutar.")
  public LocalDateTime getEntryDate() {
    return entryDate;
  }
  public void setEntryDate(LocalDateTime entryDate) {
    this.entryDate = entryDate;
  }

  
  /**
   * \u0130\u015Flem id bilgisini tutar.
   **/
  @ApiModelProperty(value = "\u0130\u015Flem id bilgisini tutar.")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * \u0130\u015Flenim ilgili oldu\u011Fu organizasyonun kodunu tutar.
   **/
  @ApiModelProperty(value = "\u0130\u015Flenim ilgili oldu\u011Fu organizasyonun kodunu tutar.")
  public String getOrganizationEic() {
    return organizationEic;
  }
  public void setOrganizationEic(String organizationEic) {
    this.organizationEic = organizationEic;
  }

  
  /**
   * \u0130\u015Flemin ilgili oldu\u011Fu organizasyonun ismini tutar.
   **/
  @ApiModelProperty(value = "\u0130\u015Flemin ilgili oldu\u011Fu organizasyonun ismini tutar.")
  public String getOrganizationName() {
    return organizationName;
  }
  public void setOrganizationName(String organizationName) {
    this.organizationName = organizationName;
  }

  
  /**
   * \u0130\u015Flemin ilgili oldu\u011Fu organizasyonun k\u0131sa ismini tutar.
   **/
  @ApiModelProperty(value = "\u0130\u015Flemin ilgili oldu\u011Fu organizasyonun k\u0131sa ismini tutar.")
  public String getOrganizationShortName() {
    return organizationShortName;
  }
  public void setOrganizationShortName(String organizationShortName) {
    this.organizationShortName = organizationShortName;
  }

  
  /**
   * \u0130\u015Flemin ilgili oldu\u011Fu kullan\u0131c\u0131 bilgisini tutar.
   **/
  @ApiModelProperty(value = "\u0130\u015Flemin ilgili oldu\u011Fu kullan\u0131c\u0131 bilgisini tutar.")
  public String getUser() {
    return user;
  }
  public void setUser(String user) {
    this.user = user;
  }

  
  /**
   * \u0130\u015Flem ile ilgili a\u00E7\u0131klama bilgisini tutar.
   **/
  @ApiModelProperty(value = "\u0130\u015Flem ile ilgili a\u00E7\u0131klama bilgisini tutar.")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * \u0130\u015Flem isim bilgisini tutar.
   **/
  @ApiModelProperty(value = "\u0130\u015Flem isim bilgisini tutar.")
  public String getOperationName() {
    return operationName;
  }
  public void setOperationName(String operationName) {
    this.operationName = operationName;
  }

  
  /**
   * \u0130\u015Flem \u00F6ncelik bilgisi tutar.
   **/
  @ApiModelProperty(value = "\u0130\u015Flem \u00F6ncelik bilgisi tutar.")
  public String getPriority() {
    return priority;
  }
  public void setPriority(String priority) {
    this.priority = priority;
  }

  
  /**
   * \u0130\u015Flem ile ilgili parametreleri tutar.
   **/
  @ApiModelProperty(value = "\u0130\u015Flem ile ilgili parametreleri tutar.")
  public Map<String, String> getParams() {
    return params;
  }
  public void setParams(Map<String, String> params) {
    this.params = params;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Operation operation = (Operation) o;
    return Objects.equals(this.entryDate, operation.entryDate) &&
        Objects.equals(this.id, operation.id) &&
        Objects.equals(this.organizationEic, operation.organizationEic) &&
        Objects.equals(this.organizationName, operation.organizationName) &&
        Objects.equals(this.organizationShortName, operation.organizationShortName) &&
        Objects.equals(this.user, operation.user) &&
        Objects.equals(this.description, operation.description) &&
        Objects.equals(this.operationName, operation.operationName) &&
        Objects.equals(this.priority, operation.priority) &&
        Objects.equals(this.params, operation.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryDate, id, organizationEic, organizationName, organizationShortName, user, description, operationName, priority, params);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Operation {\n");
    
    sb.append("    entryDate: ").append(toIndentedString(entryDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organizationEic: ").append(toIndentedString(organizationEic)).append("\n");
    sb.append("    organizationName: ").append(toIndentedString(organizationName)).append("\n");
    sb.append("    organizationShortName: ").append(toIndentedString(organizationShortName)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    operationName: ").append(toIndentedString(operationName)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
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
