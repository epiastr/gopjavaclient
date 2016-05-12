package tr.com.epias.web.test.gen.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;

import com.google.gson.annotations.SerializedName;





public class CurrencyInfo   {
  
  @SerializedName("date")
  private LocalDateTime date = null;
  
  @SerializedName("dollar")
  private Double dollar = null;
  
  @SerializedName("euro")
  private Double euro = null;
  
  @SerializedName("turkishLira")
  private Double turkishLira = null;
  

  
  /**
   **/
  @ApiModelProperty(value = "")
  public LocalDateTime getDate() {
    return date;
  }
  public void setDate(LocalDateTime date) {
    this.date = date;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getDollar() {
    return dollar;
  }
  public void setDollar(Double dollar) {
    this.dollar = dollar;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getEuro() {
    return euro;
  }
  public void setEuro(Double euro) {
    this.euro = euro;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getTurkishLira() {
    return turkishLira;
  }
  public void setTurkishLira(Double turkishLira) {
    this.turkishLira = turkishLira;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrencyInfo currencyInfo = (CurrencyInfo) o;
    return Objects.equals(this.date, currencyInfo.date) &&
        Objects.equals(this.dollar, currencyInfo.dollar) &&
        Objects.equals(this.euro, currencyInfo.euro) &&
        Objects.equals(this.turkishLira, currencyInfo.turkishLira);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, dollar, euro, turkishLira);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencyInfo {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dollar: ").append(toIndentedString(dollar)).append("\n");
    sb.append("    euro: ").append(toIndentedString(euro)).append("\n");
    sb.append("    turkishLira: ").append(toIndentedString(turkishLira)).append("\n");
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
