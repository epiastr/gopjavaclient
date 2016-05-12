package tr.com.epias.web.test.gen.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;

import com.google.gson.annotations.SerializedName;




/**
 * This model is used to list Operation History.
 **/
@ApiModel(description = "This model is used to list Operation History.")
public class OperationHistorySearchRequest   {
  
  @SerializedName("startDate")
  private LocalDateTime startDate = null;
  
  @SerializedName("endDate")
  private LocalDateTime endDate = null;
  
  @SerializedName("userName")
  private String userName = null;
  
  @SerializedName("organizationEic")
  private String organizationEic = null;
  
  @SerializedName("operationCode")
  private Integer operationCode = null;
  

public enum OperationTypeEnum {
  @SerializedName("USER")
  USER("USER"),

  @SerializedName("SYSTEM")
  SYSTEM("SYSTEM");

  private String value;

  OperationTypeEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  @SerializedName("operationType")
  private OperationTypeEnum operationType = null;
  

public enum OperationPriorityEnum {
  @SerializedName("INFO")
  INFO("INFO"),

  @SerializedName("WARNING")
  WARNING("WARNING"),

  @SerializedName("ERROR")
  ERROR("ERROR");

  private String value;

  OperationPriorityEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  @SerializedName("operationPriority")
  private OperationPriorityEnum operationPriority = null;
  

  
  /**
   * This field keeps Start Date.
   **/
  @ApiModelProperty(value = "This field keeps Start Date.")
  public LocalDateTime getStartDate() {
    return startDate;
  }
  public void setStartDate(LocalDateTime startDate) {
    this.startDate = startDate;
  }

  
  /**
   * This field keeps Finish Date.
   **/
  @ApiModelProperty(value = "This field keeps Finish Date.")
  public LocalDateTime getEndDate() {
    return endDate;
  }
  public void setEndDate(LocalDateTime endDate) {
    this.endDate = endDate;
  }

  
  /**
   * This field keeps User Name.
   **/
  @ApiModelProperty(value = "This field keeps User Name.")
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }

  
  /**
   * This field keeps Organization Code.
   **/
  @ApiModelProperty(value = "This field keeps Organization Code.")
  public String getOrganizationEic() {
    return organizationEic;
  }
  public void setOrganizationEic(String organizationEic) {
    this.organizationEic = organizationEic;
  }

  
  /**
   * This field keeps Operation Code.
   **/
  @ApiModelProperty(value = "This field keeps Operation Code.")
  public Integer getOperationCode() {
    return operationCode;
  }
  public void setOperationCode(Integer operationCode) {
    this.operationCode = operationCode;
  }

  
  /**
   * This field keeps Operation Type.
   **/
  @ApiModelProperty(value = "This field keeps Operation Type.")
  public OperationTypeEnum getOperationType() {
    return operationType;
  }
  public void setOperationType(OperationTypeEnum operationType) {
    this.operationType = operationType;
  }

  
  /**
   * This field keeps Operation Priority.
   **/
  @ApiModelProperty(value = "This field keeps Operation Priority.")
  public OperationPriorityEnum getOperationPriority() {
    return operationPriority;
  }
  public void setOperationPriority(OperationPriorityEnum operationPriority) {
    this.operationPriority = operationPriority;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationHistorySearchRequest operationHistorySearchRequest = (OperationHistorySearchRequest) o;
    return Objects.equals(this.startDate, operationHistorySearchRequest.startDate) &&
        Objects.equals(this.endDate, operationHistorySearchRequest.endDate) &&
        Objects.equals(this.userName, operationHistorySearchRequest.userName) &&
        Objects.equals(this.organizationEic, operationHistorySearchRequest.organizationEic) &&
        Objects.equals(this.operationCode, operationHistorySearchRequest.operationCode) &&
        Objects.equals(this.operationType, operationHistorySearchRequest.operationType) &&
        Objects.equals(this.operationPriority, operationHistorySearchRequest.operationPriority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, userName, organizationEic, operationCode, operationType, operationPriority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationHistorySearchRequest {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    organizationEic: ").append(toIndentedString(organizationEic)).append("\n");
    sb.append("    operationCode: ").append(toIndentedString(operationCode)).append("\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
    sb.append("    operationPriority: ").append(toIndentedString(operationPriority)).append("\n");
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
