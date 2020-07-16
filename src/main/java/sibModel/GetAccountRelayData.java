/*
 * SendinBlue API
 * SendinBlue provide a RESTFul API that can be used with any languages. With this API, you will be able to :   - Manage your campaigns and get the statistics   - Manage your contacts   - Send transactional Emails and SMS   - and much more...  You can download our wrappers at https://github.com/orgs/sendinblue  **Possible responses**   | Code | Message |   | :-------------: | ------------- |   | 200  | OK. Successful Request  |   | 201  | OK. Successful Creation |   | 202  | OK. Request accepted |   | 204  | OK. Successful Update/Deletion  |   | 400  | Error. Bad Request  |   | 401  | Error. Authentication Needed  |   | 402  | Error. Not enough credit, plan upgrade needed  |   | 403  | Error. Permission denied  |   | 404  | Error. Object does not exist |   | 405  | Error. Method not allowed  |   | 406  | Error. Not Acceptable  | 
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
 * Data regarding the transactional email account
 */
@ApiModel(description = "Data regarding the transactional email account")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-16T12:59:25.669+05:30")
public class GetAccountRelayData {
  @SerializedName("userName")
  private String userName = null;

  @SerializedName("relay")
  private String relay = null;

  @SerializedName("port")
  private Integer port = null;

  public GetAccountRelayData userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Email to use as login on transactional platform
   * @return userName
  **/
  @ApiModelProperty(example = "john.smith@example.com", required = true, value = "Email to use as login on transactional platform")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public GetAccountRelayData relay(String relay) {
    this.relay = relay;
    return this;
  }

   /**
   * URL of the SMTP Relay
   * @return relay
  **/
  @ApiModelProperty(example = "relay.domain.com", required = true, value = "URL of the SMTP Relay")
  public String getRelay() {
    return relay;
  }

  public void setRelay(String relay) {
    this.relay = relay;
  }

  public GetAccountRelayData port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Port used for SMTP Relay
   * @return port
  **/
  @ApiModelProperty(example = "125", required = true, value = "Port used for SMTP Relay")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    GetAccountRelayData getAccountRelayData = (GetAccountRelayData) o;
    return ObjectUtils.equals(this.userName, getAccountRelayData.userName) &&
    ObjectUtils.equals(this.relay, getAccountRelayData.relay) &&
    ObjectUtils.equals(this.port, getAccountRelayData.port);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(userName, relay, port);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccountRelayData {\n");
    
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    relay: ").append(toIndentedString(relay)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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

