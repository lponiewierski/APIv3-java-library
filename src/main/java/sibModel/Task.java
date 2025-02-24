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
import sibModel.Contact;
import sibModel.TaskReminder;

/**
 * Task Details
 */
@ApiModel(description = "Task Details")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-02T23:12:13.151+05:30")
public class Task {
  @SerializedName("firstContact")
  private Contact firstContact = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("taskTypeId")
  private String taskTypeId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("contactsIds")
  private List<Integer> contactsIds = null;

  @SerializedName("contacts")
  private List<Contact> contacts = null;

  @SerializedName("dealsIds")
  private List<String> dealsIds = null;

  @SerializedName("companiesIds")
  private List<String> companiesIds = null;

  @SerializedName("assignToId")
  private String assignToId = null;

  @SerializedName("date")
  private OffsetDateTime date = null;

  @SerializedName("duration")
  private Integer duration = null;

  @SerializedName("notes")
  private String notes = null;

  @SerializedName("done")
  private Boolean done = null;

  @SerializedName("reminder")
  private TaskReminder reminder = null;

  @SerializedName("createdAt")
  private OffsetDateTime createdAt = null;

  @SerializedName("updatedAt")
  private OffsetDateTime updatedAt = null;

  @SerializedName("refs")
  private Object refs = null;

  public Task firstContact(Contact firstContact) {
    this.firstContact = firstContact;
    return this;
  }

   /**
   * Get firstContact
   * @return firstContact
  **/
  @ApiModelProperty(value = "")
  public Contact getFirstContact() {
    return firstContact;
  }

  public void setFirstContact(Contact firstContact) {
    this.firstContact = firstContact;
  }

  public Task id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique task id
   * @return id
  **/
  @ApiModelProperty(example = "61a5cd07ca1347c82306ad06", value = "Unique task id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Task taskTypeId(String taskTypeId) {
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

  public Task name(String name) {
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

  public Task contactsIds(List<Integer> contactsIds) {
    this.contactsIds = contactsIds;
    return this;
  }

  public Task addContactsIdsItem(Integer contactsIdsItem) {
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

  public Task contacts(List<Contact> contacts) {
    this.contacts = contacts;
    return this;
  }

  public Task addContactsItem(Contact contactsItem) {
    if (this.contacts == null) {
      this.contacts = new ArrayList<Contact>();
    }
    this.contacts.add(contactsItem);
    return this;
  }

   /**
   * Contact details for contacts linked to this task
   * @return contacts
  **/
  @ApiModelProperty(example = "[{\"email\":\"contact@example.com\",\"id\":247,\"emailBlacklisted\":true,\"smsBlacklisted\":true,\"createdAt\":\"2017-05-01T17:05:03.000Z\",\"modifiedAt\":\"2017-05-01T17:05:03.000Z\",\"listIds\":[1,2],\"attributes\":{\"SMS\":\"33058407250\",\"IDENTIFICATION\":\"1-3RHQ-259\",\"CIV\":\"MS\",\"LAST_NAME\":\"Brennon\",\"FIRST_NAME\":\"Meg\",\"DOB\":\"1986-05-02T00:00:00.000Z\",\"ADDRESS\":\"1 5th avenue\",\"ZIP_CODE\":\"44300\",\"CITY\":\"New-York\",\"ACTION_CODE\":\"17HH98CH\"}},{\"email\":\"33058407248@mailin-sms.com\",\"id\":245,\"emailBlacklisted\":true,\"smsBlacklisted\":false,\"createdAt\":\"2017-05-01T17:05:03.000Z\",\"modifiedAt\":\"2017-05-01T17:05:03.000Z\",\"listIds\":[1,2,3],\"attributes\":{\"SMS\":\"33058407248\",\"IDENTIFICATION\":\"1-78JS-432\",\"CIV\":\"MS\",\"LAST_NAME\":\"Press\",\"FIRST_NAME\":\"Sophia\",\"DOB\":\"1980-09-11T00:00:00.000Z\",\"ADDRESS\":\"5 Flower Street\",\"ZIP_CODE\":\"44119\",\"CITY\":\"Seattle\",\"ACTION_CODE\":\"17HU765\"}}]", value = "Contact details for contacts linked to this task")
  public List<Contact> getContacts() {
    return contacts;
  }

  public void setContacts(List<Contact> contacts) {
    this.contacts = contacts;
  }

  public Task dealsIds(List<String> dealsIds) {
    this.dealsIds = dealsIds;
    return this;
  }

  public Task addDealsIdsItem(String dealsIdsItem) {
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

  public Task companiesIds(List<String> companiesIds) {
    this.companiesIds = companiesIds;
    return this;
  }

  public Task addCompaniesIdsItem(String companiesIdsItem) {
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

  public Task assignToId(String assignToId) {
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

  public Task date(OffsetDateTime date) {
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

  public Task duration(Integer duration) {
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

  public Task notes(String notes) {
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

  public Task done(Boolean done) {
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

  public Task reminder(TaskReminder reminder) {
    this.reminder = reminder;
    return this;
  }

   /**
   * Task reminder date/time for a task
   * @return reminder
  **/
  @ApiModelProperty(value = "Task reminder date/time for a task")
  public TaskReminder getReminder() {
    return reminder;
  }

  public void setReminder(TaskReminder reminder) {
    this.reminder = reminder;
  }

  public Task createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Task created date/time
   * @return createdAt
  **/
  @ApiModelProperty(example = "2021-11-01T17:44:54.668Z", value = "Task created date/time")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Task updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Task update date/time
   * @return updatedAt
  **/
  @ApiModelProperty(example = "2021-11-01T17:44:54.668Z", value = "Task update date/time")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Task refs(Object refs) {
    this.refs = refs;
    return this;
  }

   /**
   * Get refs
   * @return refs
  **/
  @ApiModelProperty(example = "{\"dealsIds\":[{\"id\":\"61a5ce58c5d4795761045990\",\"attributes\":{\"deal_name\":\"Deal Example\",\"deal_owner\":\"5faab4b7f195bb3c4c31e62a\",\"pipeline\":\"61122683f86562145185b489\",\"deal_stage\":\"3d696d83-c75b-404d-b062-680186b8bbb\",\"stage_updated_at\":\"2017-11-22T09:23:44.213Z\",\"created_at\":\"2017-09-24T12:33:24.657Z\",\"number_of_contacts\":1,\"last_updated_date\":\"2019-11-22T09:23:44.246Z\",\"last_activity_date\":\"2017-09-30T06:44:15.765Z\",\"number_of_activities\":1,\"close_date\":\"2019-11-21T18:30:00.000Z\",\"actual_close_date\":\"2019-11-22T09:23:44.213Z\",\"total_revenue\":0},\"linkedContactsIds\":[247],\"linkedCompaniesIds\":[]}]}", value = "")
  public Object getRefs() {
    return refs;
  }

  public void setRefs(Object refs) {
    this.refs = refs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Task task = (Task) o;
    return Objects.equals(this.firstContact, task.firstContact) &&
        Objects.equals(this.id, task.id) &&
        Objects.equals(this.taskTypeId, task.taskTypeId) &&
        Objects.equals(this.name, task.name) &&
        Objects.equals(this.contactsIds, task.contactsIds) &&
        Objects.equals(this.contacts, task.contacts) &&
        Objects.equals(this.dealsIds, task.dealsIds) &&
        Objects.equals(this.companiesIds, task.companiesIds) &&
        Objects.equals(this.assignToId, task.assignToId) &&
        Objects.equals(this.date, task.date) &&
        Objects.equals(this.duration, task.duration) &&
        Objects.equals(this.notes, task.notes) &&
        Objects.equals(this.done, task.done) &&
        Objects.equals(this.reminder, task.reminder) &&
        Objects.equals(this.createdAt, task.createdAt) &&
        Objects.equals(this.updatedAt, task.updatedAt) &&
        Objects.equals(this.refs, task.refs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstContact, id, taskTypeId, name, contactsIds, contacts, dealsIds, companiesIds, assignToId, date, duration, notes, done, reminder, createdAt, updatedAt, refs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Task {\n");
    
    sb.append("    firstContact: ").append(toIndentedString(firstContact)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    taskTypeId: ").append(toIndentedString(taskTypeId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    contactsIds: ").append(toIndentedString(contactsIds)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    dealsIds: ").append(toIndentedString(dealsIds)).append("\n");
    sb.append("    companiesIds: ").append(toIndentedString(companiesIds)).append("\n");
    sb.append("    assignToId: ").append(toIndentedString(assignToId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    done: ").append(toIndentedString(done)).append("\n");
    sb.append("    reminder: ").append(toIndentedString(reminder)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    refs: ").append(toIndentedString(refs)).append("\n");
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

