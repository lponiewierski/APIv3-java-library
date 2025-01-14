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
 * GetSmsCampaignOverview
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-02T23:12:13.151+05:30")
public class GetSmsCampaignOverview {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  /**
   * Status of the SMS Campaign
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    DRAFT("draft"),
    
    SENT("sent"),
    
    ARCHIVE("archive"),
    
    QUEUED("queued"),
    
    SUSPENDED("suspended"),
    
    INPROCESS("inProcess");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("content")
  private String content = null;

  @SerializedName("scheduledAt")
  private String scheduledAt = null;

  @SerializedName("sender")
  private String sender = null;

  @SerializedName("createdAt")
  private String createdAt = null;

  @SerializedName("modifiedAt")
  private String modifiedAt = null;

  public GetSmsCampaignOverview id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the SMS Campaign
   * @return id
  **/
  @ApiModelProperty(example = "2", required = true, value = "ID of the SMS Campaign")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GetSmsCampaignOverview name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the SMS Campaign
   * @return name
  **/
  @ApiModelProperty(example = "PROMO CODE", required = true, value = "Name of the SMS Campaign")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetSmsCampaignOverview status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the SMS Campaign
   * @return status
  **/
  @ApiModelProperty(example = "draft", required = true, value = "Status of the SMS Campaign")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public GetSmsCampaignOverview content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Content of the SMS Campaign
   * @return content
  **/
  @ApiModelProperty(example = "Visit our Store and get some discount !", required = true, value = "Content of the SMS Campaign")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public GetSmsCampaignOverview scheduledAt(String scheduledAt) {
    this.scheduledAt = scheduledAt;
    return this;
  }

   /**
   * UTC date-time on which SMS campaign is scheduled. Should be in YYYY-MM-DDTHH:mm:ss.SSSZ format
   * @return scheduledAt
  **/
  @ApiModelProperty(example = "2017-06-01T12:30:00Z", value = "UTC date-time on which SMS campaign is scheduled. Should be in YYYY-MM-DDTHH:mm:ss.SSSZ format")
  public String getScheduledAt() {
    return scheduledAt;
  }

  public void setScheduledAt(String scheduledAt) {
    this.scheduledAt = scheduledAt;
  }

  public GetSmsCampaignOverview sender(String sender) {
    this.sender = sender;
    return this;
  }

   /**
   * Sender of the SMS Campaign
   * @return sender
  **/
  @ApiModelProperty(example = "MyCompany", required = true, value = "Sender of the SMS Campaign")
  public String getSender() {
    return sender;
  }

  public void setSender(String sender) {
    this.sender = sender;
  }

  public GetSmsCampaignOverview createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Creation UTC date-time of the SMS campaign (YYYY-MM-DDTHH:mm:ss.SSSZ)
   * @return createdAt
  **/
  @ApiModelProperty(example = "2017-06-01T12:30:00Z", required = true, value = "Creation UTC date-time of the SMS campaign (YYYY-MM-DDTHH:mm:ss.SSSZ)")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public GetSmsCampaignOverview modifiedAt(String modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

   /**
   * UTC date-time of last modification of the SMS campaign (YYYY-MM-DDTHH:mm:ss.SSSZ)
   * @return modifiedAt
  **/
  @ApiModelProperty(example = "2017-05-01T12:30:00Z", required = true, value = "UTC date-time of last modification of the SMS campaign (YYYY-MM-DDTHH:mm:ss.SSSZ)")
  public String getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(String modifiedAt) {
    this.modifiedAt = modifiedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSmsCampaignOverview getSmsCampaignOverview = (GetSmsCampaignOverview) o;
    return Objects.equals(this.id, getSmsCampaignOverview.id) &&
        Objects.equals(this.name, getSmsCampaignOverview.name) &&
        Objects.equals(this.status, getSmsCampaignOverview.status) &&
        Objects.equals(this.content, getSmsCampaignOverview.content) &&
        Objects.equals(this.scheduledAt, getSmsCampaignOverview.scheduledAt) &&
        Objects.equals(this.sender, getSmsCampaignOverview.sender) &&
        Objects.equals(this.createdAt, getSmsCampaignOverview.createdAt) &&
        Objects.equals(this.modifiedAt, getSmsCampaignOverview.modifiedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, status, content, scheduledAt, sender, createdAt, modifiedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSmsCampaignOverview {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    scheduledAt: ").append(toIndentedString(scheduledAt)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
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

