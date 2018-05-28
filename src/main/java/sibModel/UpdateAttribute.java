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
import sibModel.UpdateAttributeEnumeration;

/**
 * UpdateAttribute
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-24T12:07:09.251+05:30")
public class UpdateAttribute {
  @SerializedName("value")
  private String value = null;

  @SerializedName("enumeration")
  private List<UpdateAttributeEnumeration> enumeration = null;

  public UpdateAttribute value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Value of the attribute to update. Use only if the attribute&#39;s category is &#39;calculated&#39; or &#39;global&#39;
   * @return value
  **/
  @ApiModelProperty(example = "COUNT[BLACKLISTED,BLACKLISTED,<,NOW()]", value = "Value of the attribute to update. Use only if the attribute's category is 'calculated' or 'global'")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public UpdateAttribute enumeration(List<UpdateAttributeEnumeration> enumeration) {
    this.enumeration = enumeration;
    return this;
  }

  public UpdateAttribute addEnumerationItem(UpdateAttributeEnumeration enumerationItem) {
    if (this.enumeration == null) {
      this.enumeration = new ArrayList<UpdateAttributeEnumeration>();
    }
    this.enumeration.add(enumerationItem);
    return this;
  }

   /**
   * List of the values and labels that the attribute can take. Use only if the attribute&#39;s category is \&quot;category\&quot;. For example, [{&#39;value&#39;:1, &#39;label&#39;:&#39;male&#39;}, {&#39;value&#39;:2, &#39;label&#39;:&#39;female&#39;}]
   * @return enumeration
  **/
  @ApiModelProperty(value = "List of the values and labels that the attribute can take. Use only if the attribute's category is \"category\". For example, [{'value':1, 'label':'male'}, {'value':2, 'label':'female'}]")
  public List<UpdateAttributeEnumeration> getEnumeration() {
    return enumeration;
  }

  public void setEnumeration(List<UpdateAttributeEnumeration> enumeration) {
    this.enumeration = enumeration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    UpdateAttribute updateAttribute = (UpdateAttribute) o;
    return ObjectUtils.equals(this.value, updateAttribute.value) &&
    ObjectUtils.equals(this.enumeration, updateAttribute.enumeration);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(value, enumeration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAttribute {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    enumeration: ").append(toIndentedString(enumeration)).append("\n");
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

