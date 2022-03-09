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
import java.util.ArrayList;
import java.util.List;
import sibModel.GetContactCampaignStatsClicked;
import sibModel.GetContactCampaignStatsOpened;
import sibModel.GetContactCampaignStatsTransacAttributes;
import sibModel.GetContactCampaignStatsUnsubscriptions;
import sibModel.GetExtendedContactDetailsStatisticsMessagesSent;

/**
 * Campaign Statistics for the contact
 */
@ApiModel(description = "Campaign Statistics for the contact")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-02T23:12:13.151+05:30")
public class GetContactCampaignStats {
  @SerializedName("messagesSent")
  private List<GetExtendedContactDetailsStatisticsMessagesSent> messagesSent = null;

  @SerializedName("hardBounces")
  private List<GetExtendedContactDetailsStatisticsMessagesSent> hardBounces = null;

  @SerializedName("softBounces")
  private List<GetExtendedContactDetailsStatisticsMessagesSent> softBounces = null;

  @SerializedName("complaints")
  private List<GetExtendedContactDetailsStatisticsMessagesSent> complaints = null;

  @SerializedName("unsubscriptions")
  private GetContactCampaignStatsUnsubscriptions unsubscriptions = null;

  @SerializedName("opened")
  private List<GetContactCampaignStatsOpened> opened = null;

  @SerializedName("clicked")
  private List<GetContactCampaignStatsClicked> clicked = null;

  @SerializedName("transacAttributes")
  private List<GetContactCampaignStatsTransacAttributes> transacAttributes = null;

  @SerializedName("delivered")
  private List<GetExtendedContactDetailsStatisticsMessagesSent> delivered = null;

  public GetContactCampaignStats messagesSent(List<GetExtendedContactDetailsStatisticsMessagesSent> messagesSent) {
    this.messagesSent = messagesSent;
    return this;
  }

  public GetContactCampaignStats addMessagesSentItem(GetExtendedContactDetailsStatisticsMessagesSent messagesSentItem) {
    if (this.messagesSent == null) {
      this.messagesSent = new ArrayList<GetExtendedContactDetailsStatisticsMessagesSent>();
    }
    this.messagesSent.add(messagesSentItem);
    return this;
  }

   /**
   * Get messagesSent
   * @return messagesSent
  **/
  @ApiModelProperty(value = "")
  public List<GetExtendedContactDetailsStatisticsMessagesSent> getMessagesSent() {
    return messagesSent;
  }

  public void setMessagesSent(List<GetExtendedContactDetailsStatisticsMessagesSent> messagesSent) {
    this.messagesSent = messagesSent;
  }

  public GetContactCampaignStats hardBounces(List<GetExtendedContactDetailsStatisticsMessagesSent> hardBounces) {
    this.hardBounces = hardBounces;
    return this;
  }

  public GetContactCampaignStats addHardBouncesItem(GetExtendedContactDetailsStatisticsMessagesSent hardBouncesItem) {
    if (this.hardBounces == null) {
      this.hardBounces = new ArrayList<GetExtendedContactDetailsStatisticsMessagesSent>();
    }
    this.hardBounces.add(hardBouncesItem);
    return this;
  }

   /**
   * Get hardBounces
   * @return hardBounces
  **/
  @ApiModelProperty(value = "")
  public List<GetExtendedContactDetailsStatisticsMessagesSent> getHardBounces() {
    return hardBounces;
  }

  public void setHardBounces(List<GetExtendedContactDetailsStatisticsMessagesSent> hardBounces) {
    this.hardBounces = hardBounces;
  }

  public GetContactCampaignStats softBounces(List<GetExtendedContactDetailsStatisticsMessagesSent> softBounces) {
    this.softBounces = softBounces;
    return this;
  }

  public GetContactCampaignStats addSoftBouncesItem(GetExtendedContactDetailsStatisticsMessagesSent softBouncesItem) {
    if (this.softBounces == null) {
      this.softBounces = new ArrayList<GetExtendedContactDetailsStatisticsMessagesSent>();
    }
    this.softBounces.add(softBouncesItem);
    return this;
  }

   /**
   * Get softBounces
   * @return softBounces
  **/
  @ApiModelProperty(value = "")
  public List<GetExtendedContactDetailsStatisticsMessagesSent> getSoftBounces() {
    return softBounces;
  }

  public void setSoftBounces(List<GetExtendedContactDetailsStatisticsMessagesSent> softBounces) {
    this.softBounces = softBounces;
  }

  public GetContactCampaignStats complaints(List<GetExtendedContactDetailsStatisticsMessagesSent> complaints) {
    this.complaints = complaints;
    return this;
  }

  public GetContactCampaignStats addComplaintsItem(GetExtendedContactDetailsStatisticsMessagesSent complaintsItem) {
    if (this.complaints == null) {
      this.complaints = new ArrayList<GetExtendedContactDetailsStatisticsMessagesSent>();
    }
    this.complaints.add(complaintsItem);
    return this;
  }

   /**
   * Get complaints
   * @return complaints
  **/
  @ApiModelProperty(value = "")
  public List<GetExtendedContactDetailsStatisticsMessagesSent> getComplaints() {
    return complaints;
  }

  public void setComplaints(List<GetExtendedContactDetailsStatisticsMessagesSent> complaints) {
    this.complaints = complaints;
  }

  public GetContactCampaignStats unsubscriptions(GetContactCampaignStatsUnsubscriptions unsubscriptions) {
    this.unsubscriptions = unsubscriptions;
    return this;
  }

   /**
   * Get unsubscriptions
   * @return unsubscriptions
  **/
  @ApiModelProperty(value = "")
  public GetContactCampaignStatsUnsubscriptions getUnsubscriptions() {
    return unsubscriptions;
  }

  public void setUnsubscriptions(GetContactCampaignStatsUnsubscriptions unsubscriptions) {
    this.unsubscriptions = unsubscriptions;
  }

  public GetContactCampaignStats opened(List<GetContactCampaignStatsOpened> opened) {
    this.opened = opened;
    return this;
  }

  public GetContactCampaignStats addOpenedItem(GetContactCampaignStatsOpened openedItem) {
    if (this.opened == null) {
      this.opened = new ArrayList<GetContactCampaignStatsOpened>();
    }
    this.opened.add(openedItem);
    return this;
  }

   /**
   * Get opened
   * @return opened
  **/
  @ApiModelProperty(value = "")
  public List<GetContactCampaignStatsOpened> getOpened() {
    return opened;
  }

  public void setOpened(List<GetContactCampaignStatsOpened> opened) {
    this.opened = opened;
  }

  public GetContactCampaignStats clicked(List<GetContactCampaignStatsClicked> clicked) {
    this.clicked = clicked;
    return this;
  }

  public GetContactCampaignStats addClickedItem(GetContactCampaignStatsClicked clickedItem) {
    if (this.clicked == null) {
      this.clicked = new ArrayList<GetContactCampaignStatsClicked>();
    }
    this.clicked.add(clickedItem);
    return this;
  }

   /**
   * Get clicked
   * @return clicked
  **/
  @ApiModelProperty(value = "")
  public List<GetContactCampaignStatsClicked> getClicked() {
    return clicked;
  }

  public void setClicked(List<GetContactCampaignStatsClicked> clicked) {
    this.clicked = clicked;
  }

  public GetContactCampaignStats transacAttributes(List<GetContactCampaignStatsTransacAttributes> transacAttributes) {
    this.transacAttributes = transacAttributes;
    return this;
  }

  public GetContactCampaignStats addTransacAttributesItem(GetContactCampaignStatsTransacAttributes transacAttributesItem) {
    if (this.transacAttributes == null) {
      this.transacAttributes = new ArrayList<GetContactCampaignStatsTransacAttributes>();
    }
    this.transacAttributes.add(transacAttributesItem);
    return this;
  }

   /**
   * Get transacAttributes
   * @return transacAttributes
  **/
  @ApiModelProperty(value = "")
  public List<GetContactCampaignStatsTransacAttributes> getTransacAttributes() {
    return transacAttributes;
  }

  public void setTransacAttributes(List<GetContactCampaignStatsTransacAttributes> transacAttributes) {
    this.transacAttributes = transacAttributes;
  }

  public GetContactCampaignStats delivered(List<GetExtendedContactDetailsStatisticsMessagesSent> delivered) {
    this.delivered = delivered;
    return this;
  }

  public GetContactCampaignStats addDeliveredItem(GetExtendedContactDetailsStatisticsMessagesSent deliveredItem) {
    if (this.delivered == null) {
      this.delivered = new ArrayList<GetExtendedContactDetailsStatisticsMessagesSent>();
    }
    this.delivered.add(deliveredItem);
    return this;
  }

   /**
   * Get delivered
   * @return delivered
  **/
  @ApiModelProperty(value = "")
  public List<GetExtendedContactDetailsStatisticsMessagesSent> getDelivered() {
    return delivered;
  }

  public void setDelivered(List<GetExtendedContactDetailsStatisticsMessagesSent> delivered) {
    this.delivered = delivered;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetContactCampaignStats getContactCampaignStats = (GetContactCampaignStats) o;
    return Objects.equals(this.messagesSent, getContactCampaignStats.messagesSent) &&
        Objects.equals(this.hardBounces, getContactCampaignStats.hardBounces) &&
        Objects.equals(this.softBounces, getContactCampaignStats.softBounces) &&
        Objects.equals(this.complaints, getContactCampaignStats.complaints) &&
        Objects.equals(this.unsubscriptions, getContactCampaignStats.unsubscriptions) &&
        Objects.equals(this.opened, getContactCampaignStats.opened) &&
        Objects.equals(this.clicked, getContactCampaignStats.clicked) &&
        Objects.equals(this.transacAttributes, getContactCampaignStats.transacAttributes) &&
        Objects.equals(this.delivered, getContactCampaignStats.delivered);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messagesSent, hardBounces, softBounces, complaints, unsubscriptions, opened, clicked, transacAttributes, delivered);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetContactCampaignStats {\n");
    
    sb.append("    messagesSent: ").append(toIndentedString(messagesSent)).append("\n");
    sb.append("    hardBounces: ").append(toIndentedString(hardBounces)).append("\n");
    sb.append("    softBounces: ").append(toIndentedString(softBounces)).append("\n");
    sb.append("    complaints: ").append(toIndentedString(complaints)).append("\n");
    sb.append("    unsubscriptions: ").append(toIndentedString(unsubscriptions)).append("\n");
    sb.append("    opened: ").append(toIndentedString(opened)).append("\n");
    sb.append("    clicked: ").append(toIndentedString(clicked)).append("\n");
    sb.append("    transacAttributes: ").append(toIndentedString(transacAttributes)).append("\n");
    sb.append("    delivered: ").append(toIndentedString(delivered)).append("\n");
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

