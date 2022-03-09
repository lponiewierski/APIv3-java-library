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
 * Task reminder date/time for a task
 */
@ApiModel(description = "Task reminder date/time for a task")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-02T23:12:13.151+05:30")
public class TaskReminder {
  @SerializedName("value")
  private Integer value = null;

  /**
   * Unit of time before reminder is to be sent
   */
  @JsonAdapter(UnitEnum.Adapter.class)
  public enum UnitEnum {
    MINUTES("minutes"),
    
    HOURS("hours"),
    
    WEEKS("weeks"),
    
    DAYS("days");

    private String value;

    UnitEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UnitEnum fromValue(String text) {
      for (UnitEnum b : UnitEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<UnitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UnitEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UnitEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return UnitEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("unit")
  private UnitEnum unit = null;

  @SerializedName("types")
  private List<String> types = new ArrayList<String>();

  public TaskReminder value(Integer value) {
    this.value = value;
    return this;
  }

   /**
   * Value of time unit before reminder is to be sent
   * @return value
  **/
  @ApiModelProperty(example = "10", required = true, value = "Value of time unit before reminder is to be sent")
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  public TaskReminder unit(UnitEnum unit) {
    this.unit = unit;
    return this;
  }

   /**
   * Unit of time before reminder is to be sent
   * @return unit
  **/
  @ApiModelProperty(example = "minutes", required = true, value = "Unit of time before reminder is to be sent")
  public UnitEnum getUnit() {
    return unit;
  }

  public void setUnit(UnitEnum unit) {
    this.unit = unit;
  }

  public TaskReminder types(List<String> types) {
    this.types = types;
    return this;
  }

  public TaskReminder addTypesItem(String typesItem) {
    this.types.add(typesItem);
    return this;
  }

   /**
   * Type of task reminder
   * @return types
  **/
  @ApiModelProperty(example = "[\"email\"]", required = true, value = "Type of task reminder")
  public List<String> getTypes() {
    return types;
  }

  public void setTypes(List<String> types) {
    this.types = types;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskReminder taskReminder = (TaskReminder) o;
    return Objects.equals(this.value, taskReminder.value) &&
        Objects.equals(this.unit, taskReminder.unit) &&
        Objects.equals(this.types, taskReminder.types);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, unit, types);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskReminder {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
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

