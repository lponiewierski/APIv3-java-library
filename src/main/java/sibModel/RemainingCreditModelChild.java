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
 * Credits remaining for child account
 */
@ApiModel(description = "Credits remaining for child account")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-16T12:59:25.669+05:30")
public class RemainingCreditModelChild {
  @SerializedName("sms")
  private Double sms = null;

  @SerializedName("email")
  private Double email = null;

  public RemainingCreditModelChild sms(Double sms) {
    this.sms = sms;
    return this;
  }

   /**
   * SMS Credits remaining for child account
   * @return sms
  **/
  @ApiModelProperty(example = "500.0", required = true, value = "SMS Credits remaining for child account")
  public Double getSms() {
    return sms;
  }

  public void setSms(Double sms) {
    this.sms = sms;
  }

  public RemainingCreditModelChild email(Double email) {
    this.email = email;
    return this;
  }

   /**
   * Email Credits remaining for child account
   * @return email
  **/
  @ApiModelProperty(example = "2000.0", required = true, value = "Email Credits remaining for child account")
  public Double getEmail() {
    return email;
  }

  public void setEmail(Double email) {
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
    RemainingCreditModelChild remainingCreditModelChild = (RemainingCreditModelChild) o;
    return ObjectUtils.equals(this.sms, remainingCreditModelChild.sms) &&
    ObjectUtils.equals(this.email, remainingCreditModelChild.email);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(sms, email);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemainingCreditModelChild {\n");
    
    sb.append("    sms: ").append(toIndentedString(sms)).append("\n");
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

