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
import org.threeten.bp.OffsetDateTime;

/**
 * GetWebhook
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-24T12:07:09.251+05:30")
public class GetWebhook {
  @SerializedName("url")
  private String url = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("events")
  private List<String> events = new ArrayList<String>();

  /**
   * Type of webhook (marketing or transac)
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    MARKETING("marketing"),
    
    TRANSAC("transac");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("createdAt")
  private OffsetDateTime createdAt = null;

  @SerializedName("modifiedAt")
  private OffsetDateTime modifiedAt = null;

  public GetWebhook url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL of the webhook
   * @return url
  **/
  @ApiModelProperty(example = "http://requestb.in/173lyyx1", required = true, value = "URL of the webhook")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public GetWebhook id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the webhook
   * @return id
  **/
  @ApiModelProperty(example = "654", required = true, value = "ID of the webhook")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GetWebhook description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the webhook
   * @return description
  **/
  @ApiModelProperty(example = "Webhook triggered on campaign openings", required = true, value = "Description of the webhook")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GetWebhook events(List<String> events) {
    this.events = events;
    return this;
  }

  public GetWebhook addEventsItem(String eventsItem) {
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getEvents() {
    return events;
  }

  public void setEvents(List<String> events) {
    this.events = events;
  }

  public GetWebhook type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of webhook (marketing or transac)
   * @return type
  **/
  @ApiModelProperty(example = "marketing", required = true, value = "Type of webhook (marketing or transac)")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public GetWebhook createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Creation UTC date-time of the webhook (YYYY-MM-DDTHH:mm:ss.SSSZ)
   * @return createdAt
  **/
  @ApiModelProperty(example = "2016-12-01T12:50:00Z", required = true, value = "Creation UTC date-time of the webhook (YYYY-MM-DDTHH:mm:ss.SSSZ)")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public GetWebhook modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

   /**
   * Last modification UTC date-time of the webhook (YYYY-MM-DDTHH:mm:ss.SSSZ)
   * @return modifiedAt
  **/
  @ApiModelProperty(example = "2017-05-12T13:15:00Z", required = true, value = "Last modification UTC date-time of the webhook (YYYY-MM-DDTHH:mm:ss.SSSZ)")
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(OffsetDateTime modifiedAt) {
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
    GetWebhook getWebhook = (GetWebhook) o;
    return ObjectUtils.equals(this.url, getWebhook.url) &&
    ObjectUtils.equals(this.id, getWebhook.id) &&
    ObjectUtils.equals(this.description, getWebhook.description) &&
    ObjectUtils.equals(this.events, getWebhook.events) &&
    ObjectUtils.equals(this.type, getWebhook.type) &&
    ObjectUtils.equals(this.createdAt, getWebhook.createdAt) &&
    ObjectUtils.equals(this.modifiedAt, getWebhook.modifiedAt);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(url, id, description, events, type, createdAt, modifiedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetWebhook {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

