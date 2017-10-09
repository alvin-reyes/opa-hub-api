
# DeploymentVersion

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | The description for this deployment version. |  [optional]
**versionNo** | **Integer** | The auto-generated version number for this deployment version. Read-only property. |  [optional]
**addedBy** | **String** | The user name of the authorized user who uploaded this deployment version. Read-only property. |  [optional]
**activeVersionFlag** | **Boolean** | Indicate whether this version is the currently-active version of this deployment. Only one version of a deployment may be active at any one time. |  [optional]
**dataSource** | [**DeploymentVersionDataSource**](DeploymentVersionDataSource.md) | Data service used by this deployment version, extracted from the snapshot data. Read-only property. |  [optional]
**opaVersion** | **String** | The version of OPM used to generate this deployment snapshot, extracted from the snapshot data. Read-only property. |  [optional]
**date** | [**DateTime**](DateTime.md) | The date and time that this deployment version was uploaded. Read-only property. |  [optional]
**snapshot** | [**Snapshot**](Snapshot.md) |  |  [optional]



