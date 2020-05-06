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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sibModel.GetDeviceBrowserStats;

/**
 * GetStatsByDevice
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-23T17:54:09.105+05:30")
public class GetStatsByDevice {
  @SerializedName("desktop")
  private Map<String, GetDeviceBrowserStats> desktop = null;

  @SerializedName("mobile")
  private Map<String, GetDeviceBrowserStats> mobile = null;

  @SerializedName("tablet")
  private Map<String, GetDeviceBrowserStats> tablet = null;

  @SerializedName("unknown")
  private Map<String, GetDeviceBrowserStats> unknown = null;

  public GetStatsByDevice desktop(Map<String, GetDeviceBrowserStats> desktop) {
    this.desktop = desktop;
    return this;
  }

  public GetStatsByDevice putDesktopItem(String key, GetDeviceBrowserStats desktopItem) {
    if (this.desktop == null) {
      this.desktop = new HashMap<String, GetDeviceBrowserStats>();
    }
    this.desktop.put(key, desktopItem);
    return this;
  }

   /**
   * Statistics of the campaign on the basis of desktop devices
   * @return desktop
  **/
  @ApiModelProperty(value = "Statistics of the campaign on the basis of desktop devices")
  public Map<String, GetDeviceBrowserStats> getDesktop() {
    return desktop;
  }

  public void setDesktop(Map<String, GetDeviceBrowserStats> desktop) {
    this.desktop = desktop;
  }

  public GetStatsByDevice mobile(Map<String, GetDeviceBrowserStats> mobile) {
    this.mobile = mobile;
    return this;
  }

  public GetStatsByDevice putMobileItem(String key, GetDeviceBrowserStats mobileItem) {
    if (this.mobile == null) {
      this.mobile = new HashMap<String, GetDeviceBrowserStats>();
    }
    this.mobile.put(key, mobileItem);
    return this;
  }

   /**
   * Statistics of the campaign on the basis of mobile devices
   * @return mobile
  **/
  @ApiModelProperty(value = "Statistics of the campaign on the basis of mobile devices")
  public Map<String, GetDeviceBrowserStats> getMobile() {
    return mobile;
  }

  public void setMobile(Map<String, GetDeviceBrowserStats> mobile) {
    this.mobile = mobile;
  }

  public GetStatsByDevice tablet(Map<String, GetDeviceBrowserStats> tablet) {
    this.tablet = tablet;
    return this;
  }

  public GetStatsByDevice putTabletItem(String key, GetDeviceBrowserStats tabletItem) {
    if (this.tablet == null) {
      this.tablet = new HashMap<String, GetDeviceBrowserStats>();
    }
    this.tablet.put(key, tabletItem);
    return this;
  }

   /**
   * Statistics of the campaign on the basis of tablet devices
   * @return tablet
  **/
  @ApiModelProperty(value = "Statistics of the campaign on the basis of tablet devices")
  public Map<String, GetDeviceBrowserStats> getTablet() {
    return tablet;
  }

  public void setTablet(Map<String, GetDeviceBrowserStats> tablet) {
    this.tablet = tablet;
  }

  public GetStatsByDevice unknown(Map<String, GetDeviceBrowserStats> unknown) {
    this.unknown = unknown;
    return this;
  }

  public GetStatsByDevice putUnknownItem(String key, GetDeviceBrowserStats unknownItem) {
    if (this.unknown == null) {
      this.unknown = new HashMap<String, GetDeviceBrowserStats>();
    }
    this.unknown.put(key, unknownItem);
    return this;
  }

   /**
   * Statistics of the campaign on the basis of unknown devices
   * @return unknown
  **/
  @ApiModelProperty(value = "Statistics of the campaign on the basis of unknown devices")
  public Map<String, GetDeviceBrowserStats> getUnknown() {
    return unknown;
  }

  public void setUnknown(Map<String, GetDeviceBrowserStats> unknown) {
    this.unknown = unknown;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    GetStatsByDevice getStatsByDevice = (GetStatsByDevice) o;
    return ObjectUtils.equals(this.desktop, getStatsByDevice.desktop) &&
    ObjectUtils.equals(this.mobile, getStatsByDevice.mobile) &&
    ObjectUtils.equals(this.tablet, getStatsByDevice.tablet) &&
    ObjectUtils.equals(this.unknown, getStatsByDevice.unknown);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(desktop, mobile, tablet, unknown);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetStatsByDevice {\n");
    
    sb.append("    desktop: ").append(toIndentedString(desktop)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    tablet: ").append(toIndentedString(tablet)).append("\n");
    sb.append("    unknown: ").append(toIndentedString(unknown)).append("\n");
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

