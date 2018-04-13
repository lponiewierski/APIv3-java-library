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
import java.util.ArrayList;
import java.util.List;

/**
 * CreateContact
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-13T14:27:50.128+05:30")
public class CreateContact {
  @SerializedName("email")
  private String email = null;

  @SerializedName("attributes")
  private Object attributes = null;

  @SerializedName("emailBlacklisted")
  private Boolean emailBlacklisted = null;

  @SerializedName("smsBlacklisted")
  private Boolean smsBlacklisted = null;

  @SerializedName("listIds")
  private List<Long> listIds = null;

  @SerializedName("updateEnabled")
  private Boolean updateEnabled = false;

  @SerializedName("smtpBlacklistSender")
  private List<String> smtpBlacklistSender = null;

  public CreateContact email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email address of the user. Mandatory if &#x60;attributes.sms&#x60; is not passed
   * @return email
  **/
  @ApiModelProperty(example = "elly@example.com", value = "Email address of the user. Mandatory if `attributes.sms` is not passed")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CreateContact attributes(Object attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Values of the attributes to fill. The attributes must exist in you contact database
   * @return attributes
  **/
  @ApiModelProperty(example = "\"FNAME:Elly, LNAME:Roger\"", value = "Values of the attributes to fill. The attributes must exist in you contact database")
  public Object getAttributes() {
    return attributes;
  }

  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }

  public CreateContact emailBlacklisted(Boolean emailBlacklisted) {
    this.emailBlacklisted = emailBlacklisted;
    return this;
  }

   /**
   * Blacklist the contact for emails (emailBlacklisted &#x3D; true)
   * @return emailBlacklisted
  **/
  @ApiModelProperty(example = "false", value = "Blacklist the contact for emails (emailBlacklisted = true)")
  public Boolean isEmailBlacklisted() {
    return emailBlacklisted;
  }

  public void setEmailBlacklisted(Boolean emailBlacklisted) {
    this.emailBlacklisted = emailBlacklisted;
  }

  public CreateContact smsBlacklisted(Boolean smsBlacklisted) {
    this.smsBlacklisted = smsBlacklisted;
    return this;
  }

   /**
   * Blacklist the contact for SMS (smsBlacklisted &#x3D; true)
   * @return smsBlacklisted
  **/
  @ApiModelProperty(example = "false", value = "Blacklist the contact for SMS (smsBlacklisted = true)")
  public Boolean isSmsBlacklisted() {
    return smsBlacklisted;
  }

  public void setSmsBlacklisted(Boolean smsBlacklisted) {
    this.smsBlacklisted = smsBlacklisted;
  }

  public CreateContact listIds(List<Long> listIds) {
    this.listIds = listIds;
    return this;
  }

  public CreateContact addListIdsItem(Long listIdsItem) {
    if (this.listIds == null) {
      this.listIds = new ArrayList<Long>();
    }
    this.listIds.add(listIdsItem);
    return this;
  }

   /**
   * Ids of the lists to add the contact to
   * @return listIds
  **/
  @ApiModelProperty(value = "Ids of the lists to add the contact to")
  public List<Long> getListIds() {
    return listIds;
  }

  public void setListIds(List<Long> listIds) {
    this.listIds = listIds;
  }

  public CreateContact updateEnabled(Boolean updateEnabled) {
    this.updateEnabled = updateEnabled;
    return this;
  }

   /**
   * Facilitate to update existing contact in same request (updateEnabled &#x3D; true)
   * @return updateEnabled
  **/
  @ApiModelProperty(example = "false", value = "Facilitate to update existing contact in same request (updateEnabled = true)")
  public Boolean isUpdateEnabled() {
    return updateEnabled;
  }

  public void setUpdateEnabled(Boolean updateEnabled) {
    this.updateEnabled = updateEnabled;
  }

  public CreateContact smtpBlacklistSender(List<String> smtpBlacklistSender) {
    this.smtpBlacklistSender = smtpBlacklistSender;
    return this;
  }

  public CreateContact addSmtpBlacklistSenderItem(String smtpBlacklistSenderItem) {
    if (this.smtpBlacklistSender == null) {
      this.smtpBlacklistSender = new ArrayList<String>();
    }
    this.smtpBlacklistSender.add(smtpBlacklistSenderItem);
    return this;
  }

   /**
   * SMTP forbidden sender for contact. Use only for email Contact ( only available if updateEnabled &#x3D; true )
   * @return smtpBlacklistSender
  **/
  @ApiModelProperty(value = "SMTP forbidden sender for contact. Use only for email Contact ( only available if updateEnabled = true )")
  public List<String> getSmtpBlacklistSender() {
    return smtpBlacklistSender;
  }

  public void setSmtpBlacklistSender(List<String> smtpBlacklistSender) {
    this.smtpBlacklistSender = smtpBlacklistSender;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    CreateContact createContact = (CreateContact) o;
    return ObjectUtils.equals(this.email, createContact.email) &&
    ObjectUtils.equals(this.attributes, createContact.attributes) &&
    ObjectUtils.equals(this.emailBlacklisted, createContact.emailBlacklisted) &&
    ObjectUtils.equals(this.smsBlacklisted, createContact.smsBlacklisted) &&
    ObjectUtils.equals(this.listIds, createContact.listIds) &&
    ObjectUtils.equals(this.updateEnabled, createContact.updateEnabled) &&
    ObjectUtils.equals(this.smtpBlacklistSender, createContact.smtpBlacklistSender);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(email, attributes, emailBlacklisted, smsBlacklisted, listIds, updateEnabled, smtpBlacklistSender);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateContact {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    emailBlacklisted: ").append(toIndentedString(emailBlacklisted)).append("\n");
    sb.append("    smsBlacklisted: ").append(toIndentedString(smsBlacklisted)).append("\n");
    sb.append("    listIds: ").append(toIndentedString(listIds)).append("\n");
    sb.append("    updateEnabled: ").append(toIndentedString(updateEnabled)).append("\n");
    sb.append("    smtpBlacklistSender: ").append(toIndentedString(smtpBlacklistSender)).append("\n");
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

