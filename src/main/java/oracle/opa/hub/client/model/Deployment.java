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
import oracle.opa.hub.client.model.DeploymentLogs;
import oracle.opa.hub.client.model.DeploymentServiceURLs;
import oracle.opa.hub.client.model.DeploymentVersions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Deployment
 */
public class Deployment {
  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("compatibilityMode")
  private String compatibilityMode = null;

  @SerializedName("collections")
  private List<String> collections = null;

  @SerializedName("services")
  private List<String> services = null;

  @SerializedName("serviceURLs")
  private DeploymentServiceURLs serviceURLs = null;

  @SerializedName("versions")
  private List<DeploymentVersions> versions = null;

  @SerializedName("logs")
  private List<DeploymentLogs> logs = null;

  public Deployment name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the deployment.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the deployment.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Deployment description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the deployment. Optional.
   * @return description
  **/
  @ApiModelProperty(value = "The description of the deployment. Optional.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Deployment compatibilityMode(String compatibilityMode) {
    this.compatibilityMode = compatibilityMode;
    return this;
  }

   /**
   * Compatibility for the currently-active deployment. One of \&quot;latest\&quot;, \&quot;current\&quot;, and \&quot;previous\&quot;. If unspecified, \&quot;latest\&quot; is assumed.
   * @return compatibilityMode
  **/
  @ApiModelProperty(value = "Compatibility for the currently-active deployment. One of \"latest\", \"current\", and \"previous\". If unspecified, \"latest\" is assumed.")
  public String getCompatibilityMode() {
    return compatibilityMode;
  }

  public void setCompatibilityMode(String compatibilityMode) {
    this.compatibilityMode = compatibilityMode;
  }

  public Deployment collections(List<String> collections) {
    this.collections = collections;
    return this;
  }

  public Deployment addCollectionsItem(String collectionsItem) {
    if (this.collections == null) {
      this.collections = new ArrayList<String>();
    }
    this.collections.add(collectionsItem);
    return this;
  }

   /**
   * Collection of which the deployment is a member.
   * @return collections
  **/
  @ApiModelProperty(value = "Collection of which the deployment is a member.")
  public List<String> getCollections() {
    return collections;
  }

  public void setCollections(List<String> collections) {
    this.collections = collections;
  }

  public Deployment services(List<String> services) {
    this.services = services;
    return this;
  }

  public Deployment addServicesItem(String servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<String>();
    }
    this.services.add(servicesItem);
    return this;
  }

   /**
   * The services to which the deployment may be activated. Any of \&quot;interview\&quot;, \&quot;webservice\&quot;, \&quot;javaScriptSessions\&quot;, and \&quot;mobile\&quot;.
   * @return services
  **/
  @ApiModelProperty(value = "The services to which the deployment may be activated. Any of \"interview\", \"webservice\", \"javaScriptSessions\", and \"mobile\".")
  public List<String> getServices() {
    return services;
  }

  public void setServices(List<String> services) {
    this.services = services;
  }

  public Deployment serviceURLs(DeploymentServiceURLs serviceURLs) {
    this.serviceURLs = serviceURLs;
    return this;
  }

   /**
   * URLs for activated services. Read-only property.
   * @return serviceURLs
  **/
  @ApiModelProperty(value = "URLs for activated services. Read-only property.")
  public DeploymentServiceURLs getServiceURLs() {
    return serviceURLs;
  }

  public void setServiceURLs(DeploymentServiceURLs serviceURLs) {
    this.serviceURLs = serviceURLs;
  }

  public Deployment versions(List<DeploymentVersions> versions) {
    this.versions = versions;
    return this;
  }

  public Deployment addVersionsItem(DeploymentVersions versionsItem) {
    if (this.versions == null) {
      this.versions = new ArrayList<DeploymentVersions>();
    }
    this.versions.add(versionsItem);
    return this;
  }

   /**
   * Get versions
   * @return versions
  **/
  @ApiModelProperty(value = "")
  public List<DeploymentVersions> getVersions() {
    return versions;
  }

  public void setVersions(List<DeploymentVersions> versions) {
    this.versions = versions;
  }

  public Deployment logs(List<DeploymentLogs> logs) {
    this.logs = logs;
    return this;
  }

  public Deployment addLogsItem(DeploymentLogs logsItem) {
    if (this.logs == null) {
      this.logs = new ArrayList<DeploymentLogs>();
    }
    this.logs.add(logsItem);
    return this;
  }

   /**
   * Get logs
   * @return logs
  **/
  @ApiModelProperty(value = "")
  public List<DeploymentLogs> getLogs() {
    return logs;
  }

  public void setLogs(List<DeploymentLogs> logs) {
    this.logs = logs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Deployment deployment = (Deployment) o;
    return Objects.equals(this.name, deployment.name) &&
        Objects.equals(this.description, deployment.description) &&
        Objects.equals(this.compatibilityMode, deployment.compatibilityMode) &&
        Objects.equals(this.collections, deployment.collections) &&
        Objects.equals(this.services, deployment.services) &&
        Objects.equals(this.serviceURLs, deployment.serviceURLs) &&
        Objects.equals(this.versions, deployment.versions) &&
        Objects.equals(this.logs, deployment.logs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, compatibilityMode, collections, services, serviceURLs, versions, logs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Deployment {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    compatibilityMode: ").append(toIndentedString(compatibilityMode)).append("\n");
    sb.append("    collections: ").append(toIndentedString(collections)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    serviceURLs: ").append(toIndentedString(serviceURLs)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
    sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
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

