package tr.com.epias.web.test.gen.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import tr.com.epias.web.test.gen.model.Advance;
import tr.com.epias.web.test.gen.model.AdvanceSidePayment;

import com.google.gson.annotations.SerializedName;




/**
 * This model keeps Advance Result Information.
 **/
@ApiModel(description = "This model keeps Advance Result Information.")
public class AdvanceResultResponse   {
  
  @SerializedName("advances")
  private List<Advance> advances = new ArrayList<Advance>();
  
  @SerializedName("sidePayment")
  private AdvanceSidePayment sidePayment = null;
  

  
  /**
   * This model keeps Advance Result Information.
   **/
  @ApiModelProperty(value = "This model keeps Advance Result Information.")
  public List<Advance> getAdvances() {
    return advances;
  }
  public void setAdvances(List<Advance> advances) {
    this.advances = advances;
  }

  
  /**
   * This model keeps Advance Result Information.
   **/
  @ApiModelProperty(value = "This model keeps Advance Result Information.")
  public AdvanceSidePayment getSidePayment() {
    return sidePayment;
  }
  public void setSidePayment(AdvanceSidePayment sidePayment) {
    this.sidePayment = sidePayment;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvanceResultResponse advanceResultResponse = (AdvanceResultResponse) o;
    return Objects.equals(this.advances, advanceResultResponse.advances) &&
        Objects.equals(this.sidePayment, advanceResultResponse.sidePayment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advances, sidePayment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvanceResultResponse {\n");
    
    sb.append("    advances: ").append(toIndentedString(advances)).append("\n");
    sb.append("    sidePayment: ").append(toIndentedString(sidePayment)).append("\n");
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
