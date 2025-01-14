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
 * UpdateBatchContactsModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-02T23:12:13.151+05:30")
public class UpdateBatchContactsModel {
  @SerializedName("successIds")
  private List<Long> successIds = null;

  @SerializedName("failureIds")
  private List<Long> failureIds = null;

  public UpdateBatchContactsModel successIds(List<Long> successIds) {
    this.successIds = successIds;
    return this;
  }

  public UpdateBatchContactsModel addSuccessIdsItem(Long successIdsItem) {
    if (this.successIds == null) {
      this.successIds = new ArrayList<Long>();
    }
    this.successIds.add(successIdsItem);
    return this;
  }

   /**
   * Get successIds
   * @return successIds
  **/
  @ApiModelProperty(example = "\"1,2\"", value = "")
  public List<Long> getSuccessIds() {
    return successIds;
  }

  public void setSuccessIds(List<Long> successIds) {
    this.successIds = successIds;
  }

  public UpdateBatchContactsModel failureIds(List<Long> failureIds) {
    this.failureIds = failureIds;
    return this;
  }

  public UpdateBatchContactsModel addFailureIdsItem(Long failureIdsItem) {
    if (this.failureIds == null) {
      this.failureIds = new ArrayList<Long>();
    }
    this.failureIds.add(failureIdsItem);
    return this;
  }

   /**
   * Get failureIds
   * @return failureIds
  **/
  @ApiModelProperty(example = "\"3,4\"", value = "")
  public List<Long> getFailureIds() {
    return failureIds;
  }

  public void setFailureIds(List<Long> failureIds) {
    this.failureIds = failureIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateBatchContactsModel updateBatchContactsModel = (UpdateBatchContactsModel) o;
    return Objects.equals(this.successIds, updateBatchContactsModel.successIds) &&
        Objects.equals(this.failureIds, updateBatchContactsModel.failureIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successIds, failureIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateBatchContactsModel {\n");
    
    sb.append("    successIds: ").append(toIndentedString(successIds)).append("\n");
    sb.append("    failureIds: ").append(toIndentedString(failureIds)).append("\n");
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

