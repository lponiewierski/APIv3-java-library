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
import sibModel.MasterDetailsResponseBillingInfoAddress;
import sibModel.MasterDetailsResponseBillingInfoName;

/**
 * Billing details of the master account organization
 */
@ApiModel(description = "Billing details of the master account organization")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-02T23:12:13.151+05:30")
public class MasterDetailsResponseBillingInfo {
  @SerializedName("email")
  private String email = null;

  @SerializedName("companyName")
  private String companyName = null;

  @SerializedName("name")
  private MasterDetailsResponseBillingInfoName name = null;

  @SerializedName("address")
  private MasterDetailsResponseBillingInfoAddress address = null;

  public MasterDetailsResponseBillingInfo email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Billing email id of master account
   * @return email
  **/
  @ApiModelProperty(value = "Billing email id of master account")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public MasterDetailsResponseBillingInfo companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Company name of master account
   * @return companyName
  **/
  @ApiModelProperty(value = "Company name of master account")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public MasterDetailsResponseBillingInfo name(MasterDetailsResponseBillingInfoName name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public MasterDetailsResponseBillingInfoName getName() {
    return name;
  }

  public void setName(MasterDetailsResponseBillingInfoName name) {
    this.name = name;
  }

  public MasterDetailsResponseBillingInfo address(MasterDetailsResponseBillingInfoAddress address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public MasterDetailsResponseBillingInfoAddress getAddress() {
    return address;
  }

  public void setAddress(MasterDetailsResponseBillingInfoAddress address) {
    this.address = address;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MasterDetailsResponseBillingInfo masterDetailsResponseBillingInfo = (MasterDetailsResponseBillingInfo) o;
    return Objects.equals(this.email, masterDetailsResponseBillingInfo.email) &&
        Objects.equals(this.companyName, masterDetailsResponseBillingInfo.companyName) &&
        Objects.equals(this.name, masterDetailsResponseBillingInfo.name) &&
        Objects.equals(this.address, masterDetailsResponseBillingInfo.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, companyName, name, address);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MasterDetailsResponseBillingInfo {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

