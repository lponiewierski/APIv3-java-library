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
 * GetSmsCampaignStats
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-02T23:12:13.151+05:30")
public class GetSmsCampaignStats {
  @SerializedName("delivered")
  private Long delivered = null;

  @SerializedName("sent")
  private Long sent = null;

  @SerializedName("processing")
  private Long processing = null;

  @SerializedName("softBounces")
  private Long softBounces = null;

  @SerializedName("hardBounces")
  private Long hardBounces = null;

  @SerializedName("unsubscriptions")
  private Long unsubscriptions = null;

  @SerializedName("answered")
  private Long answered = null;

  public GetSmsCampaignStats delivered(Long delivered) {
    this.delivered = delivered;
    return this;
  }

   /**
   * Number of delivered SMS
   * @return delivered
  **/
  @ApiModelProperty(example = "2987", required = true, value = "Number of delivered SMS")
  public Long getDelivered() {
    return delivered;
  }

  public void setDelivered(Long delivered) {
    this.delivered = delivered;
  }

  public GetSmsCampaignStats sent(Long sent) {
    this.sent = sent;
    return this;
  }

   /**
   * Number of sent SMS
   * @return sent
  **/
  @ApiModelProperty(example = "3000", required = true, value = "Number of sent SMS")
  public Long getSent() {
    return sent;
  }

  public void setSent(Long sent) {
    this.sent = sent;
  }

  public GetSmsCampaignStats processing(Long processing) {
    this.processing = processing;
    return this;
  }

   /**
   * Number of processing SMS
   * @return processing
  **/
  @ApiModelProperty(example = "0", required = true, value = "Number of processing SMS")
  public Long getProcessing() {
    return processing;
  }

  public void setProcessing(Long processing) {
    this.processing = processing;
  }

  public GetSmsCampaignStats softBounces(Long softBounces) {
    this.softBounces = softBounces;
    return this;
  }

   /**
   * Number of softbounced SMS
   * @return softBounces
  **/
  @ApiModelProperty(example = "3", required = true, value = "Number of softbounced SMS")
  public Long getSoftBounces() {
    return softBounces;
  }

  public void setSoftBounces(Long softBounces) {
    this.softBounces = softBounces;
  }

  public GetSmsCampaignStats hardBounces(Long hardBounces) {
    this.hardBounces = hardBounces;
    return this;
  }

   /**
   * Number of hardbounced SMS
   * @return hardBounces
  **/
  @ApiModelProperty(example = "1", required = true, value = "Number of hardbounced SMS")
  public Long getHardBounces() {
    return hardBounces;
  }

  public void setHardBounces(Long hardBounces) {
    this.hardBounces = hardBounces;
  }

  public GetSmsCampaignStats unsubscriptions(Long unsubscriptions) {
    this.unsubscriptions = unsubscriptions;
    return this;
  }

   /**
   * Number of unsubscription SMS
   * @return unsubscriptions
  **/
  @ApiModelProperty(example = "3", required = true, value = "Number of unsubscription SMS")
  public Long getUnsubscriptions() {
    return unsubscriptions;
  }

  public void setUnsubscriptions(Long unsubscriptions) {
    this.unsubscriptions = unsubscriptions;
  }

  public GetSmsCampaignStats answered(Long answered) {
    this.answered = answered;
    return this;
  }

   /**
   * Number of replies to the SMS
   * @return answered
  **/
  @ApiModelProperty(example = "2", required = true, value = "Number of replies to the SMS")
  public Long getAnswered() {
    return answered;
  }

  public void setAnswered(Long answered) {
    this.answered = answered;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSmsCampaignStats getSmsCampaignStats = (GetSmsCampaignStats) o;
    return Objects.equals(this.delivered, getSmsCampaignStats.delivered) &&
        Objects.equals(this.sent, getSmsCampaignStats.sent) &&
        Objects.equals(this.processing, getSmsCampaignStats.processing) &&
        Objects.equals(this.softBounces, getSmsCampaignStats.softBounces) &&
        Objects.equals(this.hardBounces, getSmsCampaignStats.hardBounces) &&
        Objects.equals(this.unsubscriptions, getSmsCampaignStats.unsubscriptions) &&
        Objects.equals(this.answered, getSmsCampaignStats.answered);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delivered, sent, processing, softBounces, hardBounces, unsubscriptions, answered);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSmsCampaignStats {\n");
    
    sb.append("    delivered: ").append(toIndentedString(delivered)).append("\n");
    sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
    sb.append("    processing: ").append(toIndentedString(processing)).append("\n");
    sb.append("    softBounces: ").append(toIndentedString(softBounces)).append("\n");
    sb.append("    hardBounces: ").append(toIndentedString(hardBounces)).append("\n");
    sb.append("    unsubscriptions: ").append(toIndentedString(unsubscriptions)).append("\n");
    sb.append("    answered: ").append(toIndentedString(answered)).append("\n");
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

