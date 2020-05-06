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
 * SendSms
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-23T17:54:09.105+05:30")
public class SendSms {
  @SerializedName("reference")
  private String reference = null;

  @SerializedName("messageId")
  private Long messageId = null;

  @SerializedName("smsCount")
  private Long smsCount = null;

  @SerializedName("usedCredits")
  private Float usedCredits = null;

  @SerializedName("remainingCredits")
  private Float remainingCredits = null;

  public SendSms reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @ApiModelProperty(example = "ab1cde2fgh3i4jklmno", required = true, value = "")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public SendSms messageId(Long messageId) {
    this.messageId = messageId;
    return this;
  }

   /**
   * Get messageId
   * @return messageId
  **/
  @ApiModelProperty(example = "1511882900176220", required = true, value = "")
  public Long getMessageId() {
    return messageId;
  }

  public void setMessageId(Long messageId) {
    this.messageId = messageId;
  }

  public SendSms smsCount(Long smsCount) {
    this.smsCount = smsCount;
    return this;
  }

   /**
   * Count of SMS&#39;s to send multiple text messages
   * @return smsCount
  **/
  @ApiModelProperty(example = "2", value = "Count of SMS's to send multiple text messages")
  public Long getSmsCount() {
    return smsCount;
  }

  public void setSmsCount(Long smsCount) {
    this.smsCount = smsCount;
  }

  public SendSms usedCredits(Float usedCredits) {
    this.usedCredits = usedCredits;
    return this;
  }

   /**
   * SMS credits used per text message
   * @return usedCredits
  **/
  @ApiModelProperty(example = "0.7", value = "SMS credits used per text message")
  public Float getUsedCredits() {
    return usedCredits;
  }

  public void setUsedCredits(Float usedCredits) {
    this.usedCredits = usedCredits;
  }

  public SendSms remainingCredits(Float remainingCredits) {
    this.remainingCredits = remainingCredits;
    return this;
  }

   /**
   * Remaining SMS credits of the user
   * @return remainingCredits
  **/
  @ApiModelProperty(example = "82.85", value = "Remaining SMS credits of the user")
  public Float getRemainingCredits() {
    return remainingCredits;
  }

  public void setRemainingCredits(Float remainingCredits) {
    this.remainingCredits = remainingCredits;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    SendSms sendSms = (SendSms) o;
    return ObjectUtils.equals(this.reference, sendSms.reference) &&
    ObjectUtils.equals(this.messageId, sendSms.messageId) &&
    ObjectUtils.equals(this.smsCount, sendSms.smsCount) &&
    ObjectUtils.equals(this.usedCredits, sendSms.usedCredits) &&
    ObjectUtils.equals(this.remainingCredits, sendSms.remainingCredits);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(reference, messageId, smsCount, usedCredits, remainingCredits);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendSms {\n");
    
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    smsCount: ").append(toIndentedString(smsCount)).append("\n");
    sb.append("    usedCredits: ").append(toIndentedString(usedCredits)).append("\n");
    sb.append("    remainingCredits: ").append(toIndentedString(remainingCredits)).append("\n");
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

