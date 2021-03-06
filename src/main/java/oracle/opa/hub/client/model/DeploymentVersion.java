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
import oracle.opa.hub.client.model.DeploymentVersionDataSource;
import oracle.opa.hub.client.model.Snapshot;

import java.io.IOException;
import org.joda.time.DateTime;

/**
 * DeploymentVersion
 */

public class DeploymentVersion {
  @SerializedName("description")
  private String description = null;

  @SerializedName("versionNo")
  private Integer versionNo = null;

  @SerializedName("addedBy")
  private String addedBy = null;

  @SerializedName("activeVersionFlag")
  private Boolean activeVersionFlag = null;

  @SerializedName("dataSource")
  private DeploymentVersionDataSource dataSource = null;

  @SerializedName("opaVersion")
  private String opaVersion = null;

  @SerializedName("date")
  private DateTime date = null;

  @SerializedName("snapshot")
  private Snapshot snapshot = null;

  public DeploymentVersion description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description for this deployment version.
   * @return description
  **/
  @ApiModelProperty(value = "The description for this deployment version.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DeploymentVersion versionNo(Integer versionNo) {
    this.versionNo = versionNo;
    return this;
  }

   /**
   * The auto-generated version number for this deployment version. Read-only property.
   * @return versionNo
  **/
  @ApiModelProperty(value = "The auto-generated version number for this deployment version. Read-only property.")
  public Integer getVersionNo() {
    return versionNo;
  }

  public void setVersionNo(Integer versionNo) {
    this.versionNo = versionNo;
  }

  public DeploymentVersion addedBy(String addedBy) {
    this.addedBy = addedBy;
    return this;
  }

   /**
   * The user name of the authorized user who uploaded this deployment version. Read-only property.
   * @return addedBy
  **/
  @ApiModelProperty(value = "The user name of the authorized user who uploaded this deployment version. Read-only property.")
  public String getAddedBy() {
    return addedBy;
  }

  public void setAddedBy(String addedBy) {
    this.addedBy = addedBy;
  }

  public DeploymentVersion activeVersionFlag(Boolean activeVersionFlag) {
    this.activeVersionFlag = activeVersionFlag;
    return this;
  }

   /**
   * Indicate whether this version is the currently-active version of this deployment. Only one version of a deployment may be active at any one time.
   * @return activeVersionFlag
  **/
  @ApiModelProperty(value = "Indicate whether this version is the currently-active version of this deployment. Only one version of a deployment may be active at any one time.")
  public Boolean getActiveVersionFlag() {
    return activeVersionFlag;
  }

  public void setActiveVersionFlag(Boolean activeVersionFlag) {
    this.activeVersionFlag = activeVersionFlag;
  }

  public DeploymentVersion dataSource(DeploymentVersionDataSource dataSource) {
    this.dataSource = dataSource;
    return this;
  }

   /**
   * Data service used by this deployment version, extracted from the snapshot data. Read-only property.
   * @return dataSource
  **/
  @ApiModelProperty(value = "Data service used by this deployment version, extracted from the snapshot data. Read-only property.")
  public DeploymentVersionDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(DeploymentVersionDataSource dataSource) {
    this.dataSource = dataSource;
  }

  public DeploymentVersion opaVersion(String opaVersion) {
    this.opaVersion = opaVersion;
    return this;
  }

   /**
   * The version of OPM used to generate this deployment snapshot, extracted from the snapshot data. Read-only property.
   * @return opaVersion
  **/
  @ApiModelProperty(value = "The version of OPM used to generate this deployment snapshot, extracted from the snapshot data. Read-only property.")
  public String getOpaVersion() {
    return opaVersion;
  }

  public void setOpaVersion(String opaVersion) {
    this.opaVersion = opaVersion;
  }

  public DeploymentVersion date(DateTime date) {
    this.date = date;
    return this;
  }

   /**
   * The date and time that this deployment version was uploaded. Read-only property.
   * @return date
  **/
  @ApiModelProperty(value = "The date and time that this deployment version was uploaded. Read-only property.")
  public DateTime getDate() {
    return date;
  }

  public void setDate(DateTime date) {
    this.date = date;
  }

  public DeploymentVersion snapshot(Snapshot snapshot) {
    this.snapshot = snapshot;
    return this;
  }

   /**
   * Get snapshot
   * @return snapshot
  **/
  @ApiModelProperty(value = "")
  public Snapshot getSnapshot() {
    return snapshot;
  }

  public void setSnapshot(Snapshot snapshot) {
    this.snapshot = snapshot;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentVersion deploymentVersion = (DeploymentVersion) o;
    return Objects.equals(this.description, deploymentVersion.description) &&
        Objects.equals(this.versionNo, deploymentVersion.versionNo) &&
        Objects.equals(this.addedBy, deploymentVersion.addedBy) &&
        Objects.equals(this.activeVersionFlag, deploymentVersion.activeVersionFlag) &&
        Objects.equals(this.dataSource, deploymentVersion.dataSource) &&
        Objects.equals(this.opaVersion, deploymentVersion.opaVersion) &&
        Objects.equals(this.date, deploymentVersion.date) &&
        Objects.equals(this.snapshot, deploymentVersion.snapshot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, versionNo, addedBy, activeVersionFlag, dataSource, opaVersion, date, snapshot);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentVersion {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    versionNo: ").append(toIndentedString(versionNo)).append("\n");
    sb.append("    addedBy: ").append(toIndentedString(addedBy)).append("\n");
    sb.append("    activeVersionFlag: ").append(toIndentedString(activeVersionFlag)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    opaVersion: ").append(toIndentedString(opaVersion)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    snapshot: ").append(toIndentedString(snapshot)).append("\n");
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

