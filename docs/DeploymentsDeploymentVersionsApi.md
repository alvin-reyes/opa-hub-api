# DeploymentsDeploymentVersionsApi

All URIs are relative to *https://opa-1228-sc.qb.lan/opa_1228_sc/opa-hub/api/12.2.8*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteDeploymentVersion**](DeploymentsDeploymentVersionsApi.md#deleteDeploymentVersion) | **DELETE** /deployments/{deployment-name}/versions/{deployment-version-versionNo} | Delete a deployment version
[**getDeploymentVersion**](DeploymentsDeploymentVersionsApi.md#getDeploymentVersion) | **GET** /deployments/{deployment-name}/versions/{deployment-version-versionNo} | Get a deployment version
[**getDeploymentVersions**](DeploymentsDeploymentVersionsApi.md#getDeploymentVersions) | **GET** /deployments/{deployment-name}/versions | Get one or more deployment versions
[**getSnapshot**](DeploymentsDeploymentVersionsApi.md#getSnapshot) | **GET** /deployments/{deployment-name}/versions/{deployment-version-versionNo}/snapshot | Get a snapshot
[**insertDeploymentVersions**](DeploymentsDeploymentVersionsApi.md#insertDeploymentVersions) | **POST** /deployments/{deployment-name}/versions | Insert one or more deployment versions
[**updateDeploymentVersion**](DeploymentsDeploymentVersionsApi.md#updateDeploymentVersion) | **PATCH** /deployments/{deployment-name}/versions/{deployment-version-versionNo} | Update a deployment version


<a name="deleteDeploymentVersion"></a>
# **deleteDeploymentVersion**
> deleteDeploymentVersion(deploymentVersionVersionNo, deploymentName)

Delete a deployment version

This operation will delete a deployment version

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsDeploymentVersionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: opa_auth
ApiKeyAuth opa_auth = (ApiKeyAuth) defaultClient.getAuthentication("opa_auth");
opa_auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//opa_auth.setApiKeyPrefix("Token");

DeploymentsDeploymentVersionsApi apiInstance = new DeploymentsDeploymentVersionsApi();
String deploymentVersionVersionNo = "deploymentVersionVersionNo_example"; // String | 
String deploymentName = "deploymentName_example"; // String | 
try {
    apiInstance.deleteDeploymentVersion(deploymentVersionVersionNo, deploymentName);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsDeploymentVersionsApi#deleteDeploymentVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentVersionVersionNo** | **String**|  |
 **deploymentName** | **String**|  |

### Return type

null (empty response body)

### Authorization

[opa_auth](../README.md#opa_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDeploymentVersion"></a>
# **getDeploymentVersion**
> DeploymentVersion getDeploymentVersion(deploymentVersionVersionNo, deploymentName)

Get a deployment version

This operation will get a deployment version. The deployment version id is an integer, or the aliases \&quot;latest\&quot; or \&quot;active\&quot;.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsDeploymentVersionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: opa_auth
ApiKeyAuth opa_auth = (ApiKeyAuth) defaultClient.getAuthentication("opa_auth");
opa_auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//opa_auth.setApiKeyPrefix("Token");

DeploymentsDeploymentVersionsApi apiInstance = new DeploymentsDeploymentVersionsApi();
String deploymentVersionVersionNo = "deploymentVersionVersionNo_example"; // String | 
String deploymentName = "deploymentName_example"; // String | 
try {
    DeploymentVersion result = apiInstance.getDeploymentVersion(deploymentVersionVersionNo, deploymentName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsDeploymentVersionsApi#getDeploymentVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentVersionVersionNo** | **String**|  |
 **deploymentName** | **String**|  |

### Return type

[**DeploymentVersion**](DeploymentVersion.md)

### Authorization

[opa_auth](../README.md#opa_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDeploymentVersions"></a>
# **getDeploymentVersions**
> DeploymentVersions getDeploymentVersions(deploymentName)

Get one or more deployment versions

This operation will get one or more deployment versions

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsDeploymentVersionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: opa_auth
ApiKeyAuth opa_auth = (ApiKeyAuth) defaultClient.getAuthentication("opa_auth");
opa_auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//opa_auth.setApiKeyPrefix("Token");

DeploymentsDeploymentVersionsApi apiInstance = new DeploymentsDeploymentVersionsApi();
String deploymentName = "deploymentName_example"; // String | 
try {
    DeploymentVersions result = apiInstance.getDeploymentVersions(deploymentName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsDeploymentVersionsApi#getDeploymentVersions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentName** | **String**|  |

### Return type

[**DeploymentVersions**](DeploymentVersions.md)

### Authorization

[opa_auth](../README.md#opa_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSnapshot"></a>
# **getSnapshot**
> Snapshot getSnapshot(deploymentVersionVersionNo, deploymentName)

Get a snapshot

This operation will get a deployment snapshot as a base-64 encoded string. To receive a deployment snapshot as binary data, send an HTTP Accept header of \&quot;Accept: application/zip\&quot;.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsDeploymentVersionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: opa_auth
ApiKeyAuth opa_auth = (ApiKeyAuth) defaultClient.getAuthentication("opa_auth");
opa_auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//opa_auth.setApiKeyPrefix("Token");

DeploymentsDeploymentVersionsApi apiInstance = new DeploymentsDeploymentVersionsApi();
String deploymentVersionVersionNo = "deploymentVersionVersionNo_example"; // String | 
String deploymentName = "deploymentName_example"; // String | 
try {
    Snapshot result = apiInstance.getSnapshot(deploymentVersionVersionNo, deploymentName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsDeploymentVersionsApi#getSnapshot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentVersionVersionNo** | **String**|  |
 **deploymentName** | **String**|  |

### Return type

[**Snapshot**](Snapshot.md)

### Authorization

[opa_auth](../README.md#opa_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="insertDeploymentVersions"></a>
# **insertDeploymentVersions**
> insertDeploymentVersions(deploymentName, body)

Insert one or more deployment versions

This operation will insert one or more deployment versions

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsDeploymentVersionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: opa_auth
ApiKeyAuth opa_auth = (ApiKeyAuth) defaultClient.getAuthentication("opa_auth");
opa_auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//opa_auth.setApiKeyPrefix("Token");

DeploymentsDeploymentVersionsApi apiInstance = new DeploymentsDeploymentVersionsApi();
String deploymentName = "deploymentName_example"; // String | 
DeploymentVersions body = new DeploymentVersions(); // DeploymentVersions | deployment-versions to insert
try {
    apiInstance.insertDeploymentVersions(deploymentName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsDeploymentVersionsApi#insertDeploymentVersions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentName** | **String**|  |
 **body** | [**DeploymentVersions**](DeploymentVersions.md)| deployment-versions to insert |

### Return type

null (empty response body)

### Authorization

[opa_auth](../README.md#opa_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDeploymentVersion"></a>
# **updateDeploymentVersion**
> DeploymentVersion updateDeploymentVersion(deploymentVersionVersionNo, deploymentName, body)

Update a deployment version

This operation will update a deployment version

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsDeploymentVersionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: opa_auth
ApiKeyAuth opa_auth = (ApiKeyAuth) defaultClient.getAuthentication("opa_auth");
opa_auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//opa_auth.setApiKeyPrefix("Token");

DeploymentsDeploymentVersionsApi apiInstance = new DeploymentsDeploymentVersionsApi();
String deploymentVersionVersionNo = "deploymentVersionVersionNo_example"; // String | 
String deploymentName = "deploymentName_example"; // String | 
DeploymentVersion body = new DeploymentVersion(); // DeploymentVersion | deployment-version to update
try {
    DeploymentVersion result = apiInstance.updateDeploymentVersion(deploymentVersionVersionNo, deploymentName, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsDeploymentVersionsApi#updateDeploymentVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentVersionVersionNo** | **String**|  |
 **deploymentName** | **String**|  |
 **body** | [**DeploymentVersion**](DeploymentVersion.md)| deployment-version to update |

### Return type

[**DeploymentVersion**](DeploymentVersion.md)

### Authorization

[opa_auth](../README.md#opa_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

