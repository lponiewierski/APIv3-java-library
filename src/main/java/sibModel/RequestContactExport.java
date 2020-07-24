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
import sibModel.RequestContactExportCustomContactFilter;

/**
 * RequestContactExport
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-16T12:59:25.669+05:30")
public class RequestContactExport {
  @SerializedName("exportAttributes")
  private List<String> exportAttributes = null;

  @SerializedName("contactFilter")
  private Object contactFilter = null;

  @SerializedName("customContactFilter")
  private RequestContactExportCustomContactFilter customContactFilter = null;

  @SerializedName("notifyUrl")
  private String notifyUrl = null;

  public RequestContactExport exportAttributes(List<String> exportAttributes) {
    this.exportAttributes = exportAttributes;
    return this;
  }

  public RequestContactExport addExportAttributesItem(String exportAttributesItem) {
    if (this.exportAttributes == null) {
      this.exportAttributes = new ArrayList<String>();
    }
    this.exportAttributes.add(exportAttributesItem);
    return this;
  }

   /**
   * List of all the attributes that you want to export. These attributes must be present in your contact database. For example, [&#39;fname&#39;, &#39;lname&#39;, &#39;email&#39;].
   * @return exportAttributes
  **/
  @ApiModelProperty(value = "List of all the attributes that you want to export. These attributes must be present in your contact database. For example, ['fname', 'lname', 'email'].")
  public List<String> getExportAttributes() {
    return exportAttributes;
  }

  public void setExportAttributes(List<String> exportAttributes) {
    this.exportAttributes = exportAttributes;
  }

  public RequestContactExport contactFilter(Object contactFilter) {
    this.contactFilter = contactFilter;
    return this;
  }

   /**
   * This attribute has been deprecated and will be removed by January 1st, 2021. Only one of the two filter options (contactFilter or customContactFilter) can be passed in the request. Set the filter for the contacts to be exported. For example, {\&quot;blacklisted\&quot;:true} will export all the blacklisted contacts. 
   * @return contactFilter
  **/
  @ApiModelProperty(example = "{\"blacklisted\":true,\"listid.id\":32}", value = "This attribute has been deprecated and will be removed by January 1st, 2021. Only one of the two filter options (contactFilter or customContactFilter) can be passed in the request. Set the filter for the contacts to be exported. For example, {\"blacklisted\":true} will export all the blacklisted contacts. ")
  public Object getContactFilter() {
    return contactFilter;
  }

  public void setContactFilter(Object contactFilter) {
    this.contactFilter = contactFilter;
  }

  public RequestContactExport customContactFilter(RequestContactExportCustomContactFilter customContactFilter) {
    this.customContactFilter = customContactFilter;
    return this;
  }

   /**
   * Get customContactFilter
   * @return customContactFilter
  **/
  @ApiModelProperty(value = "")
  public RequestContactExportCustomContactFilter getCustomContactFilter() {
    return customContactFilter;
  }

  public void setCustomContactFilter(RequestContactExportCustomContactFilter customContactFilter) {
    this.customContactFilter = customContactFilter;
  }

  public RequestContactExport notifyUrl(String notifyUrl) {
    this.notifyUrl = notifyUrl;
    return this;
  }

   /**
   * Webhook that will be called once the export process is finished. For reference, https://help.sendinblue.com/hc/en-us/articles/360007666479
   * @return notifyUrl
  **/
  @ApiModelProperty(example = "http://requestb.in/173lyyx1", value = "Webhook that will be called once the export process is finished. For reference, https://help.sendinblue.com/hc/en-us/articles/360007666479")
  public String getNotifyUrl() {
    return notifyUrl;
  }

  public void setNotifyUrl(String notifyUrl) {
    this.notifyUrl = notifyUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    RequestContactExport requestContactExport = (RequestContactExport) o;
    return ObjectUtils.equals(this.exportAttributes, requestContactExport.exportAttributes) &&
    ObjectUtils.equals(this.contactFilter, requestContactExport.contactFilter) &&
    ObjectUtils.equals(this.customContactFilter, requestContactExport.customContactFilter) &&
    ObjectUtils.equals(this.notifyUrl, requestContactExport.notifyUrl);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(exportAttributes, contactFilter, customContactFilter, notifyUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestContactExport {\n");
    
    sb.append("    exportAttributes: ").append(toIndentedString(exportAttributes)).append("\n");
    sb.append("    contactFilter: ").append(toIndentedString(contactFilter)).append("\n");
    sb.append("    customContactFilter: ").append(toIndentedString(customContactFilter)).append("\n");
    sb.append("    notifyUrl: ").append(toIndentedString(notifyUrl)).append("\n");
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

