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
 * Sender details including id or email and name (optional). Only one of either Sender&#39;s email or Sender&#39;s ID shall be passed in one request at a time. For example &#x60;{\&quot;name\&quot;:\&quot;xyz\&quot;, \&quot;email\&quot;:\&quot;example@abc.com\&quot;}&#x60; , &#x60;{\&quot;name\&quot;:\&quot;xyz\&quot;, \&quot;id\&quot;:123}&#x60;
 */
@ApiModel(description = "Sender details including id or email and name (optional). Only one of either Sender's email or Sender's ID shall be passed in one request at a time. For example `{\"name\":\"xyz\", \"email\":\"example@abc.com\"}` , `{\"name\":\"xyz\", \"id\":123}`")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-23T17:54:09.105+05:30")
public class UpdateSmtpTemplateSender {
  @SerializedName("name")
  private String name = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("id")
  private Long id = null;

  public UpdateSmtpTemplateSender name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the sender
   * @return name
  **/
  @ApiModelProperty(example = "Mary from MyShop", value = "Name of the sender")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdateSmtpTemplateSender email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email of the sender
   * @return email
  **/
  @ApiModelProperty(example = "contact@myshop.com", value = "Email of the sender")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UpdateSmtpTemplateSender id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Select the sender for the template on the basis of sender id. In order to select a sender with specific pool of IP’s, dedicated ip users shall pass id (instead of email).
   * @return id
  **/
  @ApiModelProperty(example = "3", value = "Select the sender for the template on the basis of sender id. In order to select a sender with specific pool of IP’s, dedicated ip users shall pass id (instead of email).")
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
    UpdateSmtpTemplateSender updateSmtpTemplateSender = (UpdateSmtpTemplateSender) o;
    return ObjectUtils.equals(this.name, updateSmtpTemplateSender.name) &&
    ObjectUtils.equals(this.email, updateSmtpTemplateSender.email) &&
    ObjectUtils.equals(this.id, updateSmtpTemplateSender.id);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(name, email, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSmtpTemplateSender {\n");
    
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

