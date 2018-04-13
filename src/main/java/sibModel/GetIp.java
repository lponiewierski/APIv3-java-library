/*
 * SendinBlue API
 * SendinBlue provide a RESTFul API that can be used with any languages. With this API, you will be able to :   - Manage your campaigns and get the statistics   - Manage your contacts   - Send transactional Emails and SMS   - and much more...  You can download our wrappers at https://github.com/orgs/sendinblue  **Possible responses**   | Code | Message |   | :-------------: | ------------- |   | 200  | OK. Successful Request  |   | 201  | OK. Successful Creation |   | 202  | OK. Request accepted |   | 204  | OK. Successful Update/Deletion  |   | 400  | Error. Bad Request  |   | 401  | Error. Authentication Needed  |   | 402  | Error. Not enough credit, plan upgrade needed  |   | 403  | Error. Permission denied  |   | 404  | Error. Object does not exist |   | 405  | Error. Method not allowed  | 
 *
 * OpenAPI spec version: 3.0.0
 * Contact: contact@sendinblue.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package sibModel;

import org.apache.commons.lang3.ObjectUtils;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GetIp
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-13T14:27:50.128+05:30")
public class GetIp {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("ip")
  private String ip = null;

  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("domain")
  private String domain = null;

  public GetIp id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the dedicated IP
   * @return id
  **/
  @ApiModelProperty(example = "3", required = true, value = "ID of the dedicated IP")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GetIp ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * Dedicated IP
   * @return ip
  **/
  @ApiModelProperty(example = "123.65.8.22", required = true, value = "Dedicated IP")
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public GetIp active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Status of the IP (true&#x3D;active, false&#x3D;inactive)
   * @return active
  **/
  @ApiModelProperty(example = "true", required = true, value = "Status of the IP (true=active, false=inactive)")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public GetIp domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * Domain associated to the IP
   * @return domain
  **/
  @ApiModelProperty(example = "mailing.myshop.com", required = true, value = "Domain associated to the IP")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    GetIp getIp = (GetIp) o;
    return ObjectUtils.equals(this.id, getIp.id) &&
    ObjectUtils.equals(this.ip, getIp.ip) &&
    ObjectUtils.equals(this.active, getIp.active) &&
    ObjectUtils.equals(this.domain, getIp.domain);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(id, ip, active, domain);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetIp {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

