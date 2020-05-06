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
import sibModel.GetProcess;

/**
 * GetProcesses
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-23T17:54:09.105+05:30")
public class GetProcesses {
  @SerializedName("processes")
  private List<GetProcess> processes = null;

  @SerializedName("count")
  private Long count = null;

  public GetProcesses processes(List<GetProcess> processes) {
    this.processes = processes;
    return this;
  }

  public GetProcesses addProcessesItem(GetProcess processesItem) {
    if (this.processes == null) {
      this.processes = new ArrayList<GetProcess>();
    }
    this.processes.add(processesItem);
    return this;
  }

   /**
   * List of processes available on your account
   * @return processes
  **/
  @ApiModelProperty(value = "List of processes available on your account")
  public List<GetProcess> getProcesses() {
    return processes;
  }

  public void setProcesses(List<GetProcess> processes) {
    this.processes = processes;
  }

  public GetProcesses count(Long count) {
    this.count = count;
    return this;
  }

   /**
   * Number of processes available on your account
   * @return count
  **/
  @ApiModelProperty(example = "5", required = true, value = "Number of processes available on your account")
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    GetProcesses getProcesses = (GetProcesses) o;
    return ObjectUtils.equals(this.processes, getProcesses.processes) &&
    ObjectUtils.equals(this.count, getProcesses.count);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(processes, count);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetProcesses {\n");
    
    sb.append("    processes: ").append(toIndentedString(processes)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

