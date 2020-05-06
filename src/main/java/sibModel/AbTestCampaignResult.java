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

/**
 * AbTestCampaignResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-23T17:54:09.105+05:30")
public class AbTestCampaignResult {
  /**
   * Winning Campaign Info. pending &#x3D; Campaign has been picked for sending and winning version is yet to be decided, tie &#x3D; A tie happened between both the versions, notAvailable &#x3D; Campaign has not yet been picked for sending.
   */
  @JsonAdapter(WinningVersionEnum.Adapter.class)
  public enum WinningVersionEnum {
    NOTAVAILABLE("notAvailable"),
    
    PENDING("pending"),
    
    TIE("tie"),
    
    A("A"),
    
    B("B");

    private String value;

    WinningVersionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WinningVersionEnum fromValue(String text) {
      for (WinningVersionEnum b : WinningVersionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<WinningVersionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WinningVersionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WinningVersionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return WinningVersionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("winningVersion")
  private WinningVersionEnum winningVersion = null;

  /**
   * Criteria choosen for winning version (Open/Click)
   */
  @JsonAdapter(WinningCriteriaEnum.Adapter.class)
  public enum WinningCriteriaEnum {
    OPEN("Open"),
    
    CLICK("Click");

    private String value;

    WinningCriteriaEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WinningCriteriaEnum fromValue(String text) {
      for (WinningCriteriaEnum b : WinningCriteriaEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<WinningCriteriaEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WinningCriteriaEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WinningCriteriaEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return WinningCriteriaEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("winningCriteria")
  private WinningCriteriaEnum winningCriteria = null;

  @SerializedName("winningSubjectLine")
  private String winningSubjectLine = null;

  @SerializedName("openRate")
  private String openRate = null;

  @SerializedName("clickRate")
  private String clickRate = null;

  @SerializedName("winningVersionRate")
  private String winningVersionRate = null;

  public AbTestCampaignResult winningVersion(WinningVersionEnum winningVersion) {
    this.winningVersion = winningVersion;
    return this;
  }

   /**
   * Winning Campaign Info. pending &#x3D; Campaign has been picked for sending and winning version is yet to be decided, tie &#x3D; A tie happened between both the versions, notAvailable &#x3D; Campaign has not yet been picked for sending.
   * @return winningVersion
  **/
  @ApiModelProperty(example = "A", value = "Winning Campaign Info. pending = Campaign has been picked for sending and winning version is yet to be decided, tie = A tie happened between both the versions, notAvailable = Campaign has not yet been picked for sending.")
  public WinningVersionEnum getWinningVersion() {
    return winningVersion;
  }

  public void setWinningVersion(WinningVersionEnum winningVersion) {
    this.winningVersion = winningVersion;
  }

  public AbTestCampaignResult winningCriteria(WinningCriteriaEnum winningCriteria) {
    this.winningCriteria = winningCriteria;
    return this;
  }

   /**
   * Criteria choosen for winning version (Open/Click)
   * @return winningCriteria
  **/
  @ApiModelProperty(example = "Open", value = "Criteria choosen for winning version (Open/Click)")
  public WinningCriteriaEnum getWinningCriteria() {
    return winningCriteria;
  }

  public void setWinningCriteria(WinningCriteriaEnum winningCriteria) {
    this.winningCriteria = winningCriteria;
  }

  public AbTestCampaignResult winningSubjectLine(String winningSubjectLine) {
    this.winningSubjectLine = winningSubjectLine;
    return this;
  }

   /**
   * Subject Line of current winning version
   * @return winningSubjectLine
  **/
  @ApiModelProperty(example = "Subject Line A", value = "Subject Line of current winning version")
  public String getWinningSubjectLine() {
    return winningSubjectLine;
  }

  public void setWinningSubjectLine(String winningSubjectLine) {
    this.winningSubjectLine = winningSubjectLine;
  }

  public AbTestCampaignResult openRate(String openRate) {
    this.openRate = openRate;
    return this;
  }

   /**
   * Open rate for current winning version
   * @return openRate
  **/
  @ApiModelProperty(example = "70%", value = "Open rate for current winning version")
  public String getOpenRate() {
    return openRate;
  }

  public void setOpenRate(String openRate) {
    this.openRate = openRate;
  }

  public AbTestCampaignResult clickRate(String clickRate) {
    this.clickRate = clickRate;
    return this;
  }

   /**
   * Click rate for current winning version
   * @return clickRate
  **/
  @ApiModelProperty(example = "70%", value = "Click rate for current winning version")
  public String getClickRate() {
    return clickRate;
  }

  public void setClickRate(String clickRate) {
    this.clickRate = clickRate;
  }

  public AbTestCampaignResult winningVersionRate(String winningVersionRate) {
    this.winningVersionRate = winningVersionRate;
    return this;
  }

   /**
   * Open/Click rate for the winner version
   * @return winningVersionRate
  **/
  @ApiModelProperty(example = "70%", value = "Open/Click rate for the winner version")
  public String getWinningVersionRate() {
    return winningVersionRate;
  }

  public void setWinningVersionRate(String winningVersionRate) {
    this.winningVersionRate = winningVersionRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    AbTestCampaignResult abTestCampaignResult = (AbTestCampaignResult) o;
    return ObjectUtils.equals(this.winningVersion, abTestCampaignResult.winningVersion) &&
    ObjectUtils.equals(this.winningCriteria, abTestCampaignResult.winningCriteria) &&
    ObjectUtils.equals(this.winningSubjectLine, abTestCampaignResult.winningSubjectLine) &&
    ObjectUtils.equals(this.openRate, abTestCampaignResult.openRate) &&
    ObjectUtils.equals(this.clickRate, abTestCampaignResult.clickRate) &&
    ObjectUtils.equals(this.winningVersionRate, abTestCampaignResult.winningVersionRate);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(winningVersion, winningCriteria, winningSubjectLine, openRate, clickRate, winningVersionRate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbTestCampaignResult {\n");
    
    sb.append("    winningVersion: ").append(toIndentedString(winningVersion)).append("\n");
    sb.append("    winningCriteria: ").append(toIndentedString(winningCriteria)).append("\n");
    sb.append("    winningSubjectLine: ").append(toIndentedString(winningSubjectLine)).append("\n");
    sb.append("    openRate: ").append(toIndentedString(openRate)).append("\n");
    sb.append("    clickRate: ").append(toIndentedString(clickRate)).append("\n");
    sb.append("    winningVersionRate: ").append(toIndentedString(winningVersionRate)).append("\n");
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

