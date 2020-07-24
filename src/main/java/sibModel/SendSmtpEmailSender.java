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
 * Mandatory if &#39;templateId&#39; is not passed. Pass name (optional) and email of sender from which emails will be sent. For example, {\&quot;name\&quot;:\&quot;Mary from MyShop\&quot;, \&quot;email\&quot;:\&quot;no-reply@myshop.com\&quot;}
 */
@ApiModel(description = "Mandatory if 'templateId' is not passed. Pass name (optional) and email of sender from which emails will be sent. For example, {\"name\":\"Mary from MyShop\", \"email\":\"no-reply@myshop.com\"}")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-16T12:59:25.669+05:30")
public class SendSmtpEmailSender {
  @SerializedName("name")
  private String name = null;

  @SerializedName("email")
  private String email = null;

  public SendSmtpEmailSender name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the sender from which the emails will be sent. Maximum allowed characters are 70.
   * @return name
  **/
  @ApiModelProperty(example = "Mary from MyShop", value = "Name of the sender from which the emails will be sent. Maximum allowed characters are 70.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SendSmtpEmailSender email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email of the sender from which the emails will be sent
   * @return email
  **/
  @ApiModelProperty(example = "no-reply@myshop.com", required = true, value = "Email of the sender from which the emails will be sent")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    SendSmtpEmailSender sendSmtpEmailSender = (SendSmtpEmailSender) o;
    return ObjectUtils.equals(this.name, sendSmtpEmailSender.name) &&
    ObjectUtils.equals(this.email, sendSmtpEmailSender.email);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(name, email);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendSmtpEmailSender {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

