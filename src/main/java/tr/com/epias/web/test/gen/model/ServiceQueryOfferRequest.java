package tr.com.epias.web.test.gen.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import tr.com.epias.web.test.gen.model.Header;
import tr.com.epias.web.test.gen.model.QueryOfferRequest;

import com.google.gson.annotations.SerializedName;





public class ServiceQueryOfferRequest   {
  
  @SerializedName("header")
  private List<Header> header = new ArrayList<Header>();
  
  @SerializedName("body")
  private QueryOfferRequest body = null;
  

  
  /**
   * Request header bilgisini tutar.
   **/
  @ApiModelProperty(value = "Request header bilgisini tutar.")
  public List<Header> getHeader() {
    return header;
  }
  public void setHeader(List<Header> header) {
    this.header = header;
  }

  
  /**
   * Request body bilgisini tutar.
   **/
  @ApiModelProperty(value = "Request body bilgisini tutar.")
  public QueryOfferRequest getBody() {
    return body;
  }
  public void setBody(QueryOfferRequest body) {
    this.body = body;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceQueryOfferRequest serviceQueryOfferRequest = (ServiceQueryOfferRequest) o;
    return Objects.equals(this.header, serviceQueryOfferRequest.header) &&
        Objects.equals(this.body, serviceQueryOfferRequest.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, body);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceQueryOfferRequest {\n");
    
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
