package tr.com.epias.web.test.gen.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class BooleanServiceResponse   {
  
  @SerializedName("resultCode")
  private String resultCode = null;
  
  @SerializedName("resultDescription")
  private String resultDescription = null;
  
  @SerializedName("body")
  private Boolean body = false;
  

public enum ResultTypeEnum {
  @SerializedName("SUCCESS")
  SUCCESS("SUCCESS"),

  @SerializedName("BUSINESSERROR")
  BUSINESSERROR("BUSINESSERROR"),

  @SerializedName("SYSTEMERROR")
  SYSTEMERROR("SYSTEMERROR");

  private String value;

  ResultTypeEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  @SerializedName("resultType")
  private ResultTypeEnum resultType = null;
  

  
  /**
   * 0 means success other values may differ for each request
   **/
  @ApiModelProperty(value = "0 means success other values may differ for each request")
  public String getResultCode() {
    return resultCode;
  }
  public void setResultCode(String resultCode) {
    this.resultCode = resultCode;
  }

  
  /**
   * if requests succeed return OK otherwise returns error description
   **/
  @ApiModelProperty(value = "if requests succeed return OK otherwise returns error description")
  public String getResultDescription() {
    return resultDescription;
  }
  public void setResultDescription(String resultDescription) {
    this.resultDescription = resultDescription;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getBody() {
    return body;
  }
  public void setBody(Boolean body) {
    this.body = body;
  }

  
  /**
   * returns SUCCESS for valid operation, if you violate a business rule you will get BUSINESSERROR , if our system can not process your request, you will get SYSTEMERROR
   **/
  @ApiModelProperty(value = "returns SUCCESS for valid operation, if you violate a business rule you will get BUSINESSERROR , if our system can not process your request, you will get SYSTEMERROR")
  public ResultTypeEnum getResultType() {
    return resultType;
  }
  public void setResultType(ResultTypeEnum resultType) {
    this.resultType = resultType;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BooleanServiceResponse booleanServiceResponse = (BooleanServiceResponse) o;
    return Objects.equals(this.resultCode, booleanServiceResponse.resultCode) &&
        Objects.equals(this.resultDescription, booleanServiceResponse.resultDescription) &&
        Objects.equals(this.body, booleanServiceResponse.body) &&
        Objects.equals(this.resultType, booleanServiceResponse.resultType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultCode, resultDescription, body, resultType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BooleanServiceResponse {\n");
    
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
    sb.append("    resultDescription: ").append(toIndentedString(resultDescription)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    resultType: ").append(toIndentedString(resultType)).append("\n");
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
