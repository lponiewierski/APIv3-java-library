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
 * Email sending credentials including subject, body, to, cc etc.
 */
@ApiModel(description = "Email sending credentials including subject, body, to, cc etc.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-24T12:07:09.251+05:30")
public class SendReportEmail {
  @SerializedName("subject")
  private String subject = null;

  @SerializedName("to")
  private List<String> to = null;

  /**
   * Type of the message body
   */
  @JsonAdapter(ContentTypeEnum.Adapter.class)
  public enum ContentTypeEnum {
    TEXT("text"),
    
    HTML("html");

    private String value;

    ContentTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ContentTypeEnum fromValue(String text) {
      for (ContentTypeEnum b : ContentTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ContentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ContentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ContentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ContentTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("contentType")
  private ContentTypeEnum contentType = null;

  @SerializedName("bcc")
  private List<String> bcc = null;

  @SerializedName("cc")
  private List<String> cc = null;

  @SerializedName("body")
  private String body = null;

  public SendReportEmail subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Subject of the email message
   * @return subject
  **/
  @ApiModelProperty(example = "Report of the last campaign", value = "Subject of the email message")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public SendReportEmail to(List<String> to) {
    this.to = to;
    return this;
  }

  public SendReportEmail addToItem(String toItem) {
    if (this.to == null) {
      this.to = new ArrayList<String>();
    }
    this.to.add(toItem);
    return this;
  }

   /**
   * Email addresses of the recipients
   * @return to
  **/
  @ApiModelProperty(value = "Email addresses of the recipients")
  public List<String> getTo() {
    return to;
  }

  public void setTo(List<String> to) {
    this.to = to;
  }

  public SendReportEmail contentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * Type of the message body
   * @return contentType
  **/
  @ApiModelProperty(example = "html", value = "Type of the message body")
  public ContentTypeEnum getContentType() {
    return contentType;
  }

  public void setContentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
  }

  public SendReportEmail bcc(List<String> bcc) {
    this.bcc = bcc;
    return this;
  }

  public SendReportEmail addBccItem(String bccItem) {
    if (this.bcc == null) {
      this.bcc = new ArrayList<String>();
    }
    this.bcc.add(bccItem);
    return this;
  }

   /**
   * Email addresses of the recipients in bcc
   * @return bcc
  **/
  @ApiModelProperty(value = "Email addresses of the recipients in bcc")
  public List<String> getBcc() {
    return bcc;
  }

  public void setBcc(List<String> bcc) {
    this.bcc = bcc;
  }

  public SendReportEmail cc(List<String> cc) {
    this.cc = cc;
    return this;
  }

  public SendReportEmail addCcItem(String ccItem) {
    if (this.cc == null) {
      this.cc = new ArrayList<String>();
    }
    this.cc.add(ccItem);
    return this;
  }

   /**
   * Email addresses of the recipients in cc
   * @return cc
  **/
  @ApiModelProperty(value = "Email addresses of the recipients in cc")
  public List<String> getCc() {
    return cc;
  }

  public void setCc(List<String> cc) {
    this.cc = cc;
  }

  public SendReportEmail body(String body) {
    this.body = body;
    return this;
  }

   /**
   * Body of the email message
   * @return body
  **/
  @ApiModelProperty(example = "Please find attached the report of our last email campaign.", value = "Body of the email message")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    SendReportEmail sendReportEmail = (SendReportEmail) o;
    return ObjectUtils.equals(this.subject, sendReportEmail.subject) &&
    ObjectUtils.equals(this.to, sendReportEmail.to) &&
    ObjectUtils.equals(this.contentType, sendReportEmail.contentType) &&
    ObjectUtils.equals(this.bcc, sendReportEmail.bcc) &&
    ObjectUtils.equals(this.cc, sendReportEmail.cc) &&
    ObjectUtils.equals(this.body, sendReportEmail.body);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(subject, to, contentType, bcc, cc, body);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendReportEmail {\n");
    
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    bcc: ").append(toIndentedString(bcc)).append("\n");
    sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

