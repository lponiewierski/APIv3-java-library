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
 * GetAccountMarketingAutomation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-16T12:59:25.669+05:30")
public class GetAccountMarketingAutomation {
  @SerializedName("key")
  private String key = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  public GetAccountMarketingAutomation key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Marketing Automation Tracker ID
   * @return key
  **/
  @ApiModelProperty(example = "iso05aopqych87ysy0jymf", value = "Marketing Automation Tracker ID")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public GetAccountMarketingAutomation enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Status of Marketing Automation Plateform activation for your account (true&#x3D;enabled, false&#x3D;disabled)
   * @return enabled
  **/
  @ApiModelProperty(example = "false", required = true, value = "Status of Marketing Automation Plateform activation for your account (true=enabled, false=disabled)")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    GetAccountMarketingAutomation getAccountMarketingAutomation = (GetAccountMarketingAutomation) o;
    return ObjectUtils.equals(this.key, getAccountMarketingAutomation.key) &&
    ObjectUtils.equals(this.enabled, getAccountMarketingAutomation.enabled);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(key, enabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccountMarketingAutomation {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

