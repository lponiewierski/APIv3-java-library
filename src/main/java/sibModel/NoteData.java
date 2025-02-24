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

/**
 * Note data to be saved
 */
@ApiModel(description = "Note data to be saved")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-02T23:12:13.151+05:30")
public class NoteData {
  @SerializedName("text")
  private String text = null;

  @SerializedName("contactIds")
  private List<Integer> contactIds = null;

  @SerializedName("dealIds")
  private List<String> dealIds = null;

  public NoteData text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Text content of a note
   * @return text
  **/
  @ApiModelProperty(example = "In communication with client for resolution of queries.", required = true, value = "Text content of a note")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public NoteData contactIds(List<Integer> contactIds) {
    this.contactIds = contactIds;
    return this;
  }

  public NoteData addContactIdsItem(Integer contactIdsItem) {
    if (this.contactIds == null) {
      this.contactIds = new ArrayList<Integer>();
    }
    this.contactIds.add(contactIdsItem);
    return this;
  }

   /**
   * Contact Ids linked to a note
   * @return contactIds
  **/
  @ApiModelProperty(example = "[247,1,2]", value = "Contact Ids linked to a note")
  public List<Integer> getContactIds() {
    return contactIds;
  }

  public void setContactIds(List<Integer> contactIds) {
    this.contactIds = contactIds;
  }

  public NoteData dealIds(List<String> dealIds) {
    this.dealIds = dealIds;
    return this;
  }

  public NoteData addDealIdsItem(String dealIdsItem) {
    if (this.dealIds == null) {
      this.dealIds = new ArrayList<String>();
    }
    this.dealIds.add(dealIdsItem);
    return this;
  }

   /**
   * Deal Ids linked to a note
   * @return dealIds
  **/
  @ApiModelProperty(example = "[\"61a5ce58c5d4795761045990\",\"61a5ce58c5d4795761045991\"]", value = "Deal Ids linked to a note")
  public List<String> getDealIds() {
    return dealIds;
  }

  public void setDealIds(List<String> dealIds) {
    this.dealIds = dealIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NoteData noteData = (NoteData) o;
    return Objects.equals(this.text, noteData.text) &&
        Objects.equals(this.contactIds, noteData.contactIds) &&
        Objects.equals(this.dealIds, noteData.dealIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, contactIds, dealIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NoteData {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    contactIds: ").append(toIndentedString(contactIds)).append("\n");
    sb.append("    dealIds: ").append(toIndentedString(dealIds)).append("\n");
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

