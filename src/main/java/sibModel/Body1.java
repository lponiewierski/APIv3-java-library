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
import org.threeten.bp.OffsetDateTime;
import sibModel.TaskReminder;

/**
 * Body1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-02T23:12:13.151+05:30")
public class Body1 {
  @SerializedName("name")
  private String name = null;

  @SerializedName("duration")
  private Integer duration = null;

  @SerializedName("taskTypeId")
  private String taskTypeId = null;

  @SerializedName("date")
  private OffsetDateTime date = null;

  @SerializedName("notes")
  private String notes = null;

  @SerializedName("done")
  private Boolean done = null;

  @SerializedName("assignToId")
  private String assignToId = null;

  @SerializedName("contactsIds")
  private List<Integer> contactsIds = null;

  @SerializedName("dealsIds")
  private List<String> dealsIds = null;

  @SerializedName("companiesIds")
  private List<String> companiesIds = null;

  @SerializedName("reminder")
  private TaskReminder reminder = null;

  public Body1 name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of task
   * @return name
  **/
  @ApiModelProperty(example = "Task: Connect with client", required = true, value = "Name of task")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Body1 duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Duration of task
   * @return duration
  **/
  @ApiModelProperty(example = "900000", value = "Duration of task")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public Body1 taskTypeId(String taskTypeId) {
    this.taskTypeId = taskTypeId;
    return this;
  }

   /**
   * Id for type of task e.g Call / Email / Meeting etc.
   * @return taskTypeId
  **/
  @ApiModelProperty(example = "61a5cd07ca1347c82306ad09", required = true, value = "Id for type of task e.g Call / Email / Meeting etc.")
  public String getTaskTypeId() {
    return taskTypeId;
  }

  public void setTaskTypeId(String taskTypeId) {
    this.taskTypeId = taskTypeId;
  }

  public Body1 date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * Task date/time
   * @return date
  **/
  @ApiModelProperty(example = "2021-11-01T17:44:54.668Z", required = true, value = "Task date/time")
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public Body1 notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Notes added to a task
   * @return notes
  **/
  @ApiModelProperty(example = "In communication with client for resolution of queries.", value = "Notes added to a task")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public Body1 done(Boolean done) {
    this.done = done;
    return this;
  }

   /**
   * Task marked as done
   * @return done
  **/
  @ApiModelProperty(example = "false", value = "Task marked as done")
  public Boolean isDone() {
    return done;
  }

  public void setDone(Boolean done) {
    this.done = done;
  }

  public Body1 assignToId(String assignToId) {
    this.assignToId = assignToId;
    return this;
  }

   /**
   * User id to whom task is assigned
   * @return assignToId
  **/
  @ApiModelProperty(example = "5faab4b7f195bb3c4c31e62a", value = "User id to whom task is assigned")
  public String getAssignToId() {
    return assignToId;
  }

  public void setAssignToId(String assignToId) {
    this.assignToId = assignToId;
  }

  public Body1 contactsIds(List<Integer> contactsIds) {
    this.contactsIds = contactsIds;
    return this;
  }

  public Body1 addContactsIdsItem(Integer contactsIdsItem) {
    if (this.contactsIds == null) {
      this.contactsIds = new ArrayList<Integer>();
    }
    this.contactsIds.add(contactsIdsItem);
    return this;
  }

   /**
   * Contact ids for contacts linked to this task
   * @return contactsIds
  **/
  @ApiModelProperty(example = "[1,2,3]", value = "Contact ids for contacts linked to this task")
  public List<Integer> getContactsIds() {
    return contactsIds;
  }

  public void setContactsIds(List<Integer> contactsIds) {
    this.contactsIds = contactsIds;
  }

  public Body1 dealsIds(List<String> dealsIds) {
    this.dealsIds = dealsIds;
    return this;
  }

  public Body1 addDealsIdsItem(String dealsIdsItem) {
    if (this.dealsIds == null) {
      this.dealsIds = new ArrayList<String>();
    }
    this.dealsIds.add(dealsIdsItem);
    return this;
  }

   /**
   * Deal ids for deals a task is linked to
   * @return dealsIds
  **/
  @ApiModelProperty(example = "[\"61a5ce58c5d4795761045990\",\"61a5ce58c5d4795761045991\",\"61a5ce58c5d4795761045992\"]", value = "Deal ids for deals a task is linked to")
  public List<String> getDealsIds() {
    return dealsIds;
  }

  public void setDealsIds(List<String> dealsIds) {
    this.dealsIds = dealsIds;
  }

  public Body1 companiesIds(List<String> companiesIds) {
    this.companiesIds = companiesIds;
    return this;
  }

  public Body1 addCompaniesIdsItem(String companiesIdsItem) {
    if (this.companiesIds == null) {
      this.companiesIds = new ArrayList<String>();
    }
    this.companiesIds.add(companiesIdsItem);
    return this;
  }

   /**
   * Companies ids for companies a task is linked to
   * @return companiesIds
  **/
  @ApiModelProperty(example = "[\"61a5ce58c5d4795761045990\",\"61a5ce58c5d4795761045991\",\"61a5ce58c5d4795761045992\"]", value = "Companies ids for companies a task is linked to")
  public List<String> getCompaniesIds() {
    return companiesIds;
  }

  public void setCompaniesIds(List<String> companiesIds) {
    this.companiesIds = companiesIds;
  }

  public Body1 reminder(TaskReminder reminder) {
    this.reminder = reminder;
    return this;
  }

   /**
   * Get reminder
   * @return reminder
  **/
  @ApiModelProperty(value = "")
  public TaskReminder getReminder() {
    return reminder;
  }

  public void setReminder(TaskReminder reminder) {
    this.reminder = reminder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body1 body1 = (Body1) o;
    return Objects.equals(this.name, body1.name) &&
        Objects.equals(this.duration, body1.duration) &&
        Objects.equals(this.taskTypeId, body1.taskTypeId) &&
        Objects.equals(this.date, body1.date) &&
        Objects.equals(this.notes, body1.notes) &&
        Objects.equals(this.done, body1.done) &&
        Objects.equals(this.assignToId, body1.assignToId) &&
        Objects.equals(this.contactsIds, body1.contactsIds) &&
        Objects.equals(this.dealsIds, body1.dealsIds) &&
        Objects.equals(this.companiesIds, body1.companiesIds) &&
        Objects.equals(this.reminder, body1.reminder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, duration, taskTypeId, date, notes, done, assignToId, contactsIds, dealsIds, companiesIds, reminder);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body1 {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    taskTypeId: ").append(toIndentedString(taskTypeId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    done: ").append(toIndentedString(done)).append("\n");
    sb.append("    assignToId: ").append(toIndentedString(assignToId)).append("\n");
    sb.append("    contactsIds: ").append(toIndentedString(contactsIds)).append("\n");
    sb.append("    dealsIds: ").append(toIndentedString(dealsIds)).append("\n");
    sb.append("    companiesIds: ").append(toIndentedString(companiesIds)).append("\n");
    sb.append("    reminder: ").append(toIndentedString(reminder)).append("\n");
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

