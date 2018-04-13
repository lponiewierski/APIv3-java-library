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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * UpdateContact
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-13T14:27:50.128+05:30")
public class UpdateContact {
  @SerializedName("attributes")
  private Map<String, String> attributes = null;

  @SerializedName("emailBlacklisted")
  private Boolean emailBlacklisted = null;

  @SerializedName("smsBlacklisted")
  private Boolean smsBlacklisted = null;

  @SerializedName("listIds")
  private List<Long> listIds = null;

  @SerializedName("unlinkListIds")
  private List<Long> unlinkListIds = null;

  @SerializedName("smtpBlacklistSender")
  private List<String> smtpBlacklistSender = null;

  public UpdateContact attributes(Map<String, String> attributes) {
    this.attributes = attributes;
    return this;
  }

  public UpdateContact putAttributesItem(String key, String attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<String, String>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getAttributes() {
    return attributes;
  }

  public void setAttributes(Map<String, String> attributes) {
    this.attributes = attributes;
  }

  public UpdateContact emailBlacklisted(Boolean emailBlacklisted) {
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

  public UpdateContact smsBlacklisted(Boolean smsBlacklisted) {
    this.smsBlacklisted = smsBlacklisted;
    return this;
  }

   /**
   * Blacklist the contact for SMS (smsBlacklisted &#x3D; true)
   * @return smsBlacklisted
  **/
  @ApiModelProperty(example = "true", value = "Blacklist the contact for SMS (smsBlacklisted = true)")
  public Boolean isSmsBlacklisted() {
    return smsBlacklisted;
  }

  public void setSmsBlacklisted(Boolean smsBlacklisted) {
    this.smsBlacklisted = smsBlacklisted;
  }

  public UpdateContact listIds(List<Long> listIds) {
    this.listIds = listIds;
    return this;
  }

  public UpdateContact addListIdsItem(Long listIdsItem) {
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

  public UpdateContact unlinkListIds(List<Long> unlinkListIds) {
    this.unlinkListIds = unlinkListIds;
    return this;
  }

  public UpdateContact addUnlinkListIdsItem(Long unlinkListIdsItem) {
    if (this.unlinkListIds == null) {
      this.unlinkListIds = new ArrayList<Long>();
    }
    this.unlinkListIds.add(unlinkListIdsItem);
    return this;
  }

   /**
   * Ids of the lists to remove the contact from
   * @return unlinkListIds
  **/
  @ApiModelProperty(value = "Ids of the lists to remove the contact from")
  public List<Long> getUnlinkListIds() {
    return unlinkListIds;
  }

  public void setUnlinkListIds(List<Long> unlinkListIds) {
    this.unlinkListIds = unlinkListIds;
  }

  public UpdateContact smtpBlacklistSender(List<String> smtpBlacklistSender) {
    this.smtpBlacklistSender = smtpBlacklistSender;
    return this;
  }

  public UpdateContact addSmtpBlacklistSenderItem(String smtpBlacklistSenderItem) {
    if (this.smtpBlacklistSender == null) {
      this.smtpBlacklistSender = new ArrayList<String>();
    }
    this.smtpBlacklistSender.add(smtpBlacklistSenderItem);
    return this;
  }

   /**
   * SMTP forbidden sender for contact. Use only for email Contact
   * @return smtpBlacklistSender
  **/
  @ApiModelProperty(value = "SMTP forbidden sender for contact. Use only for email Contact")
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
    UpdateContact updateContact = (UpdateContact) o;
    return ObjectUtils.equals(this.attributes, updateContact.attributes) &&
    ObjectUtils.equals(this.emailBlacklisted, updateContact.emailBlacklisted) &&
    ObjectUtils.equals(this.smsBlacklisted, updateContact.smsBlacklisted) &&
    ObjectUtils.equals(this.listIds, updateContact.listIds) &&
    ObjectUtils.equals(this.unlinkListIds, updateContact.unlinkListIds) &&
    ObjectUtils.equals(this.smtpBlacklistSender, updateContact.smtpBlacklistSender);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(attributes, emailBlacklisted, smsBlacklisted, listIds, unlinkListIds, smtpBlacklistSender);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateContact {\n");
    
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    emailBlacklisted: ").append(toIndentedString(emailBlacklisted)).append("\n");
    sb.append("    smsBlacklisted: ").append(toIndentedString(smsBlacklisted)).append("\n");
    sb.append("    listIds: ").append(toIndentedString(listIds)).append("\n");
    sb.append("    unlinkListIds: ").append(toIndentedString(unlinkListIds)).append("\n");
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
