/*
 * Hub Administration
 * This version of the API allows management of OPA Hub users, deployments, and version information.
 *
 * OpenAPI spec version: 12.2.8
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package oracle.opa.hub.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DeploymentServiceURLs
 */

public class DeploymentServiceURLs {
  @SerializedName("interview")
  private String interview = null;

  @SerializedName("webservice")
  private String webservice = null;

  @SerializedName("javaScriptSessions")
  private String javaScriptSessions = null;

  public DeploymentServiceURLs interview(String interview) {
    this.interview = interview;
    return this;
  }

   /**
   * The start-session URL for the deployment&#39;s interview.
   * @return interview
  **/
  @ApiModelProperty(value = "The start-session URL for the deployment's interview.")
  public String getInterview() {
    return interview;
  }

  public void setInterview(String interview) {
    this.interview = interview;
  }

  public DeploymentServiceURLs webservice(String webservice) {
    this.webservice = webservice;
    return this;
  }

   /**
   * The URL for the deployment&#39;s web services.
   * @return webservice
  **/
  @ApiModelProperty(value = "The URL for the deployment's web services.")
  public String getWebservice() {
    return webservice;
  }

  public void setWebservice(String webservice) {
    this.webservice = webservice;
  }

  public DeploymentServiceURLs javaScriptSessions(String javaScriptSessions) {
    this.javaScriptSessions = javaScriptSessions;
    return this;
  }

   /**
   * The URL for the deployment&#39;s JavaScript Sessions API.
   * @return javaScriptSessions
  **/
  @ApiModelProperty(value = "The URL for the deployment's JavaScript Sessions API.")
  public String getJavaScriptSessions() {
    return javaScriptSessions;
  }

  public void setJavaScriptSessions(String javaScriptSessions) {
    this.javaScriptSessions = javaScriptSessions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentServiceURLs deploymentServiceURLs = (DeploymentServiceURLs) o;
    return Objects.equals(this.interview, deploymentServiceURLs.interview) &&
        Objects.equals(this.webservice, deploymentServiceURLs.webservice) &&
        Objects.equals(this.javaScriptSessions, deploymentServiceURLs.javaScriptSessions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interview, webservice, javaScriptSessions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentServiceURLs {\n");
    
    sb.append("    interview: ").append(toIndentedString(interview)).append("\n");
    sb.append("    webservice: ").append(toIndentedString(webservice)).append("\n");
    sb.append("    javaScriptSessions: ").append(toIndentedString(javaScriptSessions)).append("\n");
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

