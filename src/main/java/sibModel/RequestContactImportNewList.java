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

/**
 * RequestContactImportNewList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-13T14:27:50.128+05:30")
public class RequestContactImportNewList {
  @SerializedName("listName")
  private String listName = null;

  @SerializedName("folderId")
  private Long folderId = null;

  public RequestContactImportNewList listName(String listName) {
    this.listName = listName;
    return this;
  }

   /**
   * List with listName will be created first and users will be imported in it (Mandatory if listIds is empty).
   * @return listName
  **/
  @ApiModelProperty(example = "ContactImport - 2017-05", value = "List with listName will be created first and users will be imported in it (Mandatory if listIds is empty).")
  public String getListName() {
    return listName;
  }

  public void setListName(String listName) {
    this.listName = listName;
  }

  public RequestContactImportNewList folderId(Long folderId) {
    this.folderId = folderId;
    return this;
  }

   /**
   * Folder id will be used with listName to make newly created list’s desired parent (Mandatory if listName is not empty).
   * @return folderId
  **/
  @ApiModelProperty(example = "2", value = "Folder id will be used with listName to make newly created list’s desired parent (Mandatory if listName is not empty).")
  public Long getFolderId() {
    return folderId;
  }

  public void setFolderId(Long folderId) {
    this.folderId = folderId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    RequestContactImportNewList requestContactImportNewList = (RequestContactImportNewList) o;
    return ObjectUtils.equals(this.listName, requestContactImportNewList.listName) &&
    ObjectUtils.equals(this.folderId, requestContactImportNewList.folderId);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(listName, folderId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestContactImportNewList {\n");
    
    sb.append("    listName: ").append(toIndentedString(listName)).append("\n");
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
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
