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
import sibModel.CreateSmsCampaignRecipients;

/**
 * UpdateSmsCampaign
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-02T23:12:13.151+05:30")
public class UpdateSmsCampaign {
  @SerializedName("name")
  private String name = null;

  @SerializedName("sender")
  private String sender = null;

  @SerializedName("content")
  private String content = null;

  @SerializedName("recipients")
  private CreateSmsCampaignRecipients recipients = null;

  @SerializedName("scheduledAt")
  private String scheduledAt = null;

  @SerializedName("unicodeEnabled")
  private Boolean unicodeEnabled = false;

  public UpdateSmsCampaign name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the campaign
   * @return name
  **/
  @ApiModelProperty(example = "Spring Promo Code", value = "Name of the campaign")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdateSmsCampaign sender(String sender) {
    this.sender = sender;
    return this;
  }

   /**
   * Name of the sender. **The number of characters is limited to 11 for alphanumeric characters and 15 for numeric characters**
   * @return sender
  **/
  @ApiModelProperty(example = "MyShop", value = "Name of the sender. **The number of characters is limited to 11 for alphanumeric characters and 15 for numeric characters**")
  public String getSender() {
    return sender;
  }

  public void setSender(String sender) {
    this.sender = sender;
  }

  public UpdateSmsCampaign content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Content of the message. The maximum characters used per SMS is 160, if used more than that, it will be counted as more than one SMS
   * @return content
  **/
  @ApiModelProperty(example = "Get a discount by visiting our NY store and saying : Happy Spring!", value = "Content of the message. The maximum characters used per SMS is 160, if used more than that, it will be counted as more than one SMS")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public UpdateSmsCampaign recipients(CreateSmsCampaignRecipients recipients) {
    this.recipients = recipients;
    return this;
  }

   /**
   * Get recipients
   * @return recipients
  **/
  @ApiModelProperty(value = "")
  public CreateSmsCampaignRecipients getRecipients() {
    return recipients;
  }

  public void setRecipients(CreateSmsCampaignRecipients recipients) {
    this.recipients = recipients;
  }

  public UpdateSmsCampaign scheduledAt(String scheduledAt) {
    this.scheduledAt = scheduledAt;
    return this;
  }

   /**
   * UTC date-time on which the campaign has to run (YYYY-MM-DDTHH:mm:ss.SSSZ). Prefer to pass your timezone in date-time format for accurate result.
   * @return scheduledAt
  **/
  @ApiModelProperty(example = "2017-05-05T12:30:00+02:00", value = "UTC date-time on which the campaign has to run (YYYY-MM-DDTHH:mm:ss.SSSZ). Prefer to pass your timezone in date-time format for accurate result.")
  public String getScheduledAt() {
    return scheduledAt;
  }

  public void setScheduledAt(String scheduledAt) {
    this.scheduledAt = scheduledAt;
  }

  public UpdateSmsCampaign unicodeEnabled(Boolean unicodeEnabled) {
    this.unicodeEnabled = unicodeEnabled;
    return this;
  }

   /**
   * Format of the message. It indicates whether the content should be treated as unicode or not.
   * @return unicodeEnabled
  **/
  @ApiModelProperty(example = "true", value = "Format of the message. It indicates whether the content should be treated as unicode or not.")
  public Boolean isUnicodeEnabled() {
    return unicodeEnabled;
  }

  public void setUnicodeEnabled(Boolean unicodeEnabled) {
    this.unicodeEnabled = unicodeEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSmsCampaign updateSmsCampaign = (UpdateSmsCampaign) o;
    return Objects.equals(this.name, updateSmsCampaign.name) &&
        Objects.equals(this.sender, updateSmsCampaign.sender) &&
        Objects.equals(this.content, updateSmsCampaign.content) &&
        Objects.equals(this.recipients, updateSmsCampaign.recipients) &&
        Objects.equals(this.scheduledAt, updateSmsCampaign.scheduledAt) &&
        Objects.equals(this.unicodeEnabled, updateSmsCampaign.unicodeEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, sender, content, recipients, scheduledAt, unicodeEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSmsCampaign {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    scheduledAt: ").append(toIndentedString(scheduledAt)).append("\n");
    sb.append("    unicodeEnabled: ").append(toIndentedString(unicodeEnabled)).append("\n");
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

