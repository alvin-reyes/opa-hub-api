
# DeploymentLog

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | [**DateTime**](DateTime.md) | The date and time at which the activation occurred. |  [optional]
**description** | **String** | A description of the activated or deactivated deployment version. |  [optional]
**updatedBy** | **String** | The user name of the person performing the action. |  [optional]
**services** | **List&lt;String&gt;** | The services to which the deployment version has been activated. Any of \&quot;interview\&quot;, \&quot;webservice\&quot;, \&quot;javaScriptSessions\&quot;, and \&quot;mobile\&quot;. |  [optional]
**activeVersion** | **Integer** | The active deployment version, or empty if there is no active deployment version. |  [optional]



