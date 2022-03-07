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
import sibModel.SubAccountDetailsResponsePlanInfoFeaturesInbox;
import sibModel.SubAccountDetailsResponsePlanInfoFeaturesLandingPage;
import sibModel.SubAccountDetailsResponsePlanInfoFeaturesUsers;

/**
 * Sub-account features and addons quota details
 */
@ApiModel(description = "Sub-account features and addons quota details")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-02T23:12:13.151+05:30")
public class SubAccountDetailsResponsePlanInfoFeatures {
  @SerializedName("inbox")
  private SubAccountDetailsResponsePlanInfoFeaturesInbox inbox = null;

  @SerializedName("landingPage")
  private SubAccountDetailsResponsePlanInfoFeaturesLandingPage landingPage = null;

  @SerializedName("users")
  private SubAccountDetailsResponsePlanInfoFeaturesUsers users = null;

  public SubAccountDetailsResponsePlanInfoFeatures inbox(SubAccountDetailsResponsePlanInfoFeaturesInbox inbox) {
    this.inbox = inbox;
    return this;
  }

   /**
   * Get inbox
   * @return inbox
  **/
  @ApiModelProperty(value = "")
  public SubAccountDetailsResponsePlanInfoFeaturesInbox getInbox() {
    return inbox;
  }

  public void setInbox(SubAccountDetailsResponsePlanInfoFeaturesInbox inbox) {
    this.inbox = inbox;
  }

  public SubAccountDetailsResponsePlanInfoFeatures landingPage(SubAccountDetailsResponsePlanInfoFeaturesLandingPage landingPage) {
    this.landingPage = landingPage;
    return this;
  }

   /**
   * Get landingPage
   * @return landingPage
  **/
  @ApiModelProperty(value = "")
  public SubAccountDetailsResponsePlanInfoFeaturesLandingPage getLandingPage() {
    return landingPage;
  }

  public void setLandingPage(SubAccountDetailsResponsePlanInfoFeaturesLandingPage landingPage) {
    this.landingPage = landingPage;
  }

  public SubAccountDetailsResponsePlanInfoFeatures users(SubAccountDetailsResponsePlanInfoFeaturesUsers users) {
    this.users = users;
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  @ApiModelProperty(value = "")
  public SubAccountDetailsResponsePlanInfoFeaturesUsers getUsers() {
    return users;
  }

  public void setUsers(SubAccountDetailsResponsePlanInfoFeaturesUsers users) {
    this.users = users;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubAccountDetailsResponsePlanInfoFeatures subAccountDetailsResponsePlanInfoFeatures = (SubAccountDetailsResponsePlanInfoFeatures) o;
    return Objects.equals(this.inbox, subAccountDetailsResponsePlanInfoFeatures.inbox) &&
        Objects.equals(this.landingPage, subAccountDetailsResponsePlanInfoFeatures.landingPage) &&
        Objects.equals(this.users, subAccountDetailsResponsePlanInfoFeatures.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inbox, landingPage, users);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubAccountDetailsResponsePlanInfoFeatures {\n");
    
    sb.append("    inbox: ").append(toIndentedString(inbox)).append("\n");
    sb.append("    landingPage: ").append(toIndentedString(landingPage)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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
