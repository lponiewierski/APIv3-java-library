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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Mandatory if &#x60;templateId&#x60; is not passed. Pass &#x60;name&#x60; (optional) and &#x60;email&#x60; OR &#x60;id&#x60; of sender from which emails will be sent. &#x60;name&#x60; will be ignored if passed along with sender &#x60;id&#x60;. For example, {&quot;name&quot;:&quot;Mary from MyShop&quot;, &quot;email&quot;:&quot;no-reply@myshop.com&quot;} or {&quot;id&quot;:2}
 */
@ApiModel(description = "Mandatory if `templateId` is not passed. Pass `name` (optional) and `email` OR `id` of sender from which emails will be sent. `name` will be ignored if passed along with sender `id`. For example, {\"name\":\"Mary from MyShop\", \"email\":\"no-reply@myshop.com\"} or {\"id\":2}")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-02T23:12:13.151+05:30")
public class SendSmtpEmailSender {
  @SerializedName("name")
  private String name = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("id")
  private Long id = null;

  public SendSmtpEmailSender name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the sender from which the emails will be sent. Maximum allowed characters are 70. Applicable only when email is passed.
   * @return name
  **/
  @ApiModelProperty(example = "Mary from MyShop", value = "Name of the sender from which the emails will be sent. Maximum allowed characters are 70. Applicable only when email is passed.")
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
   * Email of the sender from which the emails will be sent. Mandatory if sender id is not passed.
   * @return email
  **/
  @ApiModelProperty(example = "no-reply@myshop.com", value = "Email of the sender from which the emails will be sent. Mandatory if sender id is not passed.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public SendSmtpEmailSender id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Id of the sender from which the emails will be sent. In order to select a sender with specific pool of IP’s, dedicated ip users shall pass id (instead of email). Mandatory if email is not passed.
   * @return id
  **/
  @ApiModelProperty(example = "2", value = "Id of the sender from which the emails will be sent. In order to select a sender with specific pool of IP’s, dedicated ip users shall pass id (instead of email). Mandatory if email is not passed.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
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
    return Objects.equals(this.name, sendSmtpEmailSender.name) &&
        Objects.equals(this.email, sendSmtpEmailSender.email) &&
        Objects.equals(this.id, sendSmtpEmailSender.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, email, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendSmtpEmailSender {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

