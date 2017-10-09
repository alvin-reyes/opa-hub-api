
# Deployment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the deployment. |  [optional]
**description** | **String** | The description of the deployment. Optional. |  [optional]
**compatibilityMode** | **String** | Compatibility for the currently-active deployment. One of \&quot;latest\&quot;, \&quot;current\&quot;, and \&quot;previous\&quot;. If unspecified, \&quot;latest\&quot; is assumed. |  [optional]
**collections** | **List&lt;String&gt;** | Collection of which the deployment is a member. |  [optional]
**services** | **List&lt;String&gt;** | The services to which the deployment may be activated. Any of \&quot;interview\&quot;, \&quot;webservice\&quot;, \&quot;javaScriptSessions\&quot;, and \&quot;mobile\&quot;. |  [optional]
**serviceURLs** | [**DeploymentServiceURLs**](DeploymentServiceURLs.md) | URLs for activated services. Read-only property. |  [optional]
**versions** | [**List&lt;DeploymentVersions&gt;**](DeploymentVersions.md) |  |  [optional]
**logs** | [**List&lt;DeploymentLogs&gt;**](DeploymentLogs.md) |  |  [optional]



