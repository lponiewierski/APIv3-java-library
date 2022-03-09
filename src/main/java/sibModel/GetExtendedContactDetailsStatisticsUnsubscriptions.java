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
import sibModel.GetExtendedContactDetailsStatisticsUnsubscriptionsAdminUnsubscription;
import sibModel.GetExtendedContactDetailsStatisticsUnsubscriptionsUserUnsubscription;

/**
 * Listing of the unsubscription for the contact
 */
@ApiModel(description = "Listing of the unsubscription for the contact")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-02T23:12:13.151+05:30")
public class GetExtendedContactDetailsStatisticsUnsubscriptions {
  @SerializedName("userUnsubscription")
  private List<GetExtendedContactDetailsStatisticsUnsubscriptionsUserUnsubscription> userUnsubscription = new ArrayList<GetExtendedContactDetailsStatisticsUnsubscriptionsUserUnsubscription>();

  @SerializedName("adminUnsubscription")
  private List<GetExtendedContactDetailsStatisticsUnsubscriptionsAdminUnsubscription> adminUnsubscription = new ArrayList<GetExtendedContactDetailsStatisticsUnsubscriptionsAdminUnsubscription>();

  public GetExtendedContactDetailsStatisticsUnsubscriptions userUnsubscription(List<GetExtendedContactDetailsStatisticsUnsubscriptionsUserUnsubscription> userUnsubscription) {
    this.userUnsubscription = userUnsubscription;
    return this;
  }

  public GetExtendedContactDetailsStatisticsUnsubscriptions addUserUnsubscriptionItem(GetExtendedContactDetailsStatisticsUnsubscriptionsUserUnsubscription userUnsubscriptionItem) {
    this.userUnsubscription.add(userUnsubscriptionItem);
    return this;
  }

   /**
   * Contact unsubscribe via unsubscription link in a campaign
   * @return userUnsubscription
  **/
  @ApiModelProperty(required = true, value = "Contact unsubscribe via unsubscription link in a campaign")
  public List<GetExtendedContactDetailsStatisticsUnsubscriptionsUserUnsubscription> getUserUnsubscription() {
    return userUnsubscription;
  }

  public void setUserUnsubscription(List<GetExtendedContactDetailsStatisticsUnsubscriptionsUserUnsubscription> userUnsubscription) {
    this.userUnsubscription = userUnsubscription;
  }

  public GetExtendedContactDetailsStatisticsUnsubscriptions adminUnsubscription(List<GetExtendedContactDetailsStatisticsUnsubscriptionsAdminUnsubscription> adminUnsubscription) {
    this.adminUnsubscription = adminUnsubscription;
    return this;
  }

  public GetExtendedContactDetailsStatisticsUnsubscriptions addAdminUnsubscriptionItem(GetExtendedContactDetailsStatisticsUnsubscriptionsAdminUnsubscription adminUnsubscriptionItem) {
    this.adminUnsubscription.add(adminUnsubscriptionItem);
    return this;
  }

   /**
   * Contact has been unsubscribed from the administrator
   * @return adminUnsubscription
  **/
  @ApiModelProperty(required = true, value = "Contact has been unsubscribed from the administrator")
  public List<GetExtendedContactDetailsStatisticsUnsubscriptionsAdminUnsubscription> getAdminUnsubscription() {
    return adminUnsubscription;
  }

  public void setAdminUnsubscription(List<GetExtendedContactDetailsStatisticsUnsubscriptionsAdminUnsubscription> adminUnsubscription) {
    this.adminUnsubscription = adminUnsubscription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetExtendedContactDetailsStatisticsUnsubscriptions getExtendedContactDetailsStatisticsUnsubscriptions = (GetExtendedContactDetailsStatisticsUnsubscriptions) o;
    return Objects.equals(this.userUnsubscription, getExtendedContactDetailsStatisticsUnsubscriptions.userUnsubscription) &&
        Objects.equals(this.adminUnsubscription, getExtendedContactDetailsStatisticsUnsubscriptions.adminUnsubscription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userUnsubscription, adminUnsubscription);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetExtendedContactDetailsStatisticsUnsubscriptions {\n");
    
    sb.append("    userUnsubscription: ").append(toIndentedString(userUnsubscription)).append("\n");
    sb.append("    adminUnsubscription: ").append(toIndentedString(adminUnsubscription)).append("\n");
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

