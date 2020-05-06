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
import java.util.ArrayList;
import java.util.List;

/**
 * CreateSmsCampaignRecipients
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-23T17:54:09.105+05:30")
public class CreateSmsCampaignRecipients {
  @SerializedName("listIds")
  private List<Long> listIds = new ArrayList<Long>();

  @SerializedName("exclusionListIds")
  private List<Long> exclusionListIds = null;

  public CreateSmsCampaignRecipients listIds(List<Long> listIds) {
    this.listIds = listIds;
    return this;
  }

  public CreateSmsCampaignRecipients addListIdsItem(Long listIdsItem) {
    this.listIds.add(listIdsItem);
    return this;
  }

   /**
   * Lists Ids to send the campaign to. REQUIRED if scheduledAt is not empty
   * @return listIds
  **/
  @ApiModelProperty(required = true, value = "Lists Ids to send the campaign to. REQUIRED if scheduledAt is not empty")
  public List<Long> getListIds() {
    return listIds;
  }

  public void setListIds(List<Long> listIds) {
    this.listIds = listIds;
  }

  public CreateSmsCampaignRecipients exclusionListIds(List<Long> exclusionListIds) {
    this.exclusionListIds = exclusionListIds;
    return this;
  }

  public CreateSmsCampaignRecipients addExclusionListIdsItem(Long exclusionListIdsItem) {
    if (this.exclusionListIds == null) {
      this.exclusionListIds = new ArrayList<Long>();
    }
    this.exclusionListIds.add(exclusionListIdsItem);
    return this;
  }

   /**
   * List ids which have to be excluded from a campaign
   * @return exclusionListIds
  **/
  @ApiModelProperty(value = "List ids which have to be excluded from a campaign")
  public List<Long> getExclusionListIds() {
    return exclusionListIds;
  }

  public void setExclusionListIds(List<Long> exclusionListIds) {
    this.exclusionListIds = exclusionListIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    CreateSmsCampaignRecipients createSmsCampaignRecipients = (CreateSmsCampaignRecipients) o;
    return ObjectUtils.equals(this.listIds, createSmsCampaignRecipients.listIds) &&
    ObjectUtils.equals(this.exclusionListIds, createSmsCampaignRecipients.exclusionListIds);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(listIds, exclusionListIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSmsCampaignRecipients {\n");
    
    sb.append("    listIds: ").append(toIndentedString(listIds)).append("\n");
    sb.append("    exclusionListIds: ").append(toIndentedString(exclusionListIds)).append("\n");
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

