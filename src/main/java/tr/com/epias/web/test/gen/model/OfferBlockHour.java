package tr.com.epias.web.test.gen.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * This model keeps Offer Period Detail
 **/
@ApiModel(description = "This model keeps Offer Period Detail")
public class OfferBlockHour   {
  
  @SerializedName("text")
  private String text = null;
  
  @SerializedName("period")
  private Integer period = null;
  

  
  /**
   * This field keeps Offer Period Value.
   **/
  @ApiModelProperty(value = "This field keeps Offer Period Value.")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  
  /**
   * This field keeps Offer Period Explanation.
   **/
  @ApiModelProperty(value = "This field keeps Offer Period Explanation.")
  public Integer getPeriod() {
    return period;
  }
  public void setPeriod(Integer period) {
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
    OfferBlockHour offerBlockHour = (OfferBlockHour) o;
    return Objects.equals(this.text, offerBlockHour.text) &&
        Objects.equals(this.period, offerBlockHour.period);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, period);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferBlockHour {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
