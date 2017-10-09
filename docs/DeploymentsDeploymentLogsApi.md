# DeploymentsDeploymentLogsApi

All URIs are relative to *https://opa-1228-sc.qb.lan/opa_1228_sc/opa-hub/api/12.2.8*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDeploymentLogs**](DeploymentsDeploymentLogsApi.md#getDeploymentLogs) | **GET** /deployments/{deployment-name}/logs | Get one or more deployment logs


<a name="getDeploymentLogs"></a>
# **getDeploymentLogs**
> DeploymentLogs getDeploymentLogs(deploymentName)

Get one or more deployment logs

This operation will get one or more deployment logs

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsDeploymentLogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: opa_auth
ApiKeyAuth opa_auth = (ApiKeyAuth) defaultClient.getAuthentication("opa_auth");
opa_auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//opa_auth.setApiKeyPrefix("Token");

DeploymentsDeploymentLogsApi apiInstance = new DeploymentsDeploymentLogsApi();
String deploymentName = "deploymentName_example"; // String | 
try {
    DeploymentLogs result = apiInstance.getDeploymentLogs(deploymentName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsDeploymentLogsApi#getDeploymentLogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentName** | **String**|  |

### Return type

[**DeploymentLogs**](DeploymentLogs.md)

### Authorization

[opa_auth](../README.md#opa_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

