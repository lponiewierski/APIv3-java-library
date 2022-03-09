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
 * CreateDoiContact
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-02T23:12:13.151+05:30")
public class CreateDoiContact {
  @SerializedName("email")
  private String email = null;

  @SerializedName("attributes")
  private Object attributes = null;

  @SerializedName("includeListIds")
  private List<Long> includeListIds = new ArrayList<Long>();

  @SerializedName("excludeListIds")
  private List<Long> excludeListIds = null;

  @SerializedName("templateId")
  private Long templateId = null;

  @SerializedName("redirectionUrl")
  private String redirectionUrl = null;

  public CreateDoiContact email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email address where the confirmation email will be sent. This email address will be the identifier for all other contact attributes.
   * @return email
  **/
  @ApiModelProperty(example = "elly@example.com", required = true, value = "Email address where the confirmation email will be sent. This email address will be the identifier for all other contact attributes.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CreateDoiContact attributes(Object attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Pass the set of attributes and their values. These attributes must be present in your SendinBlue account. For eg. {&#39;FNAME&#39;:&#39;Elly&#39;, &#39;LNAME&#39;:&#39;Roger&#39;}
   * @return attributes
  **/
  @ApiModelProperty(example = "{\"FNAME\":\"Elly\",\"LNAME\":\"Roger\"}", value = "Pass the set of attributes and their values. These attributes must be present in your SendinBlue account. For eg. {'FNAME':'Elly', 'LNAME':'Roger'}")
  public Object getAttributes() {
    return attributes;
  }

  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }

  public CreateDoiContact includeListIds(List<Long> includeListIds) {
    this.includeListIds = includeListIds;
    return this;
  }

  public CreateDoiContact addIncludeListIdsItem(Long includeListIdsItem) {
    this.includeListIds.add(includeListIdsItem);
    return this;
  }

   /**
   * Lists under user account where contact should be added
   * @return includeListIds
  **/
  @ApiModelProperty(required = true, value = "Lists under user account where contact should be added")
  public List<Long> getIncludeListIds() {
    return includeListIds;
  }

  public void setIncludeListIds(List<Long> includeListIds) {
    this.includeListIds = includeListIds;
  }

  public CreateDoiContact excludeListIds(List<Long> excludeListIds) {
    this.excludeListIds = excludeListIds;
    return this;
  }

  public CreateDoiContact addExcludeListIdsItem(Long excludeListIdsItem) {
    if (this.excludeListIds == null) {
      this.excludeListIds = new ArrayList<Long>();
    }
    this.excludeListIds.add(excludeListIdsItem);
    return this;
  }

   /**
   * Lists under user account where contact should not be added
   * @return excludeListIds
  **/
  @ApiModelProperty(value = "Lists under user account where contact should not be added")
  public List<Long> getExcludeListIds() {
    return excludeListIds;
  }

  public void setExcludeListIds(List<Long> excludeListIds) {
    this.excludeListIds = excludeListIds;
  }

  public CreateDoiContact templateId(Long templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * Id of the Double opt-in (DOI) template
   * @return templateId
  **/
  @ApiModelProperty(example = "2", required = true, value = "Id of the Double opt-in (DOI) template")
  public Long getTemplateId() {
    return templateId;
  }

  public void setTemplateId(Long templateId) {
    this.templateId = templateId;
  }

  public CreateDoiContact redirectionUrl(String redirectionUrl) {
    this.redirectionUrl = redirectionUrl;
    return this;
  }

   /**
   * URL of the web page that user will be redirected to after clicking on the double opt in URL. When editing your DOI template you can reference this URL by using the tag {{ params.DOIurl }}.
   * @return redirectionUrl
  **/
  @ApiModelProperty(example = "http://requestb.in/173lyyx1", required = true, value = "URL of the web page that user will be redirected to after clicking on the double opt in URL. When editing your DOI template you can reference this URL by using the tag {{ params.DOIurl }}.")
  public String getRedirectionUrl() {
    return redirectionUrl;
  }

  public void setRedirectionUrl(String redirectionUrl) {
    this.redirectionUrl = redirectionUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDoiContact createDoiContact = (CreateDoiContact) o;
    return Objects.equals(this.email, createDoiContact.email) &&
        Objects.equals(this.attributes, createDoiContact.attributes) &&
        Objects.equals(this.includeListIds, createDoiContact.includeListIds) &&
        Objects.equals(this.excludeListIds, createDoiContact.excludeListIds) &&
        Objects.equals(this.templateId, createDoiContact.templateId) &&
        Objects.equals(this.redirectionUrl, createDoiContact.redirectionUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, attributes, includeListIds, excludeListIds, templateId, redirectionUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDoiContact {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    includeListIds: ").append(toIndentedString(includeListIds)).append("\n");
    sb.append("    excludeListIds: ").append(toIndentedString(excludeListIds)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    redirectionUrl: ").append(toIndentedString(redirectionUrl)).append("\n");
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

