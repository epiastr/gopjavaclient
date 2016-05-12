package tr.com.epias.web.test.gen.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;




/**
 * This model keeps Information of Offer Price.
 **/
@ApiModel(description = "This model keeps Information of Offer Price.")
public class OfferPrice   {
  
  @SerializedName("price")
  private BigDecimal price = null;
  
  @SerializedName("amount")
  private Double amount = null;
  

  
  /**
   * This field keeps Price.
   **/
  @ApiModelProperty(value = "This field keeps Price.")
  public BigDecimal getPrice() {
    return price;
  }
  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  
  /**
   * This field keeps Amount.
   **/
  @ApiModelProperty(value = "This field keeps Amount.")
  public Double getAmount() {
    return amount;
  }
  public void setAmount(Double amount) {
    this.amount = amount;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferPrice offerPrice = (OfferPrice) o;
    return Objects.equals(this.price, offerPrice.price) &&
        Objects.equals(this.amount, offerPrice.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferPrice {\n");
    
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
