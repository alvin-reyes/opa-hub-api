# DeploymentsApi

All URIs are relative to *https://opa-1228-sc.qb.lan/opa_1228_sc/opa-hub/api/12.2.8*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteDeployment**](DeploymentsApi.md#deleteDeployment) | **DELETE** /deployments/{deployment-name} | Delete a deployment
[**getDeployment**](DeploymentsApi.md#getDeployment) | **GET** /deployments/{deployment-name} | Get a deployment
[**getDeployments**](DeploymentsApi.md#getDeployments) | **GET** /deployments | Get one or more deployments
[**insertDeployments**](DeploymentsApi.md#insertDeployments) | **POST** /deployments | Insert one or more deployments
[**updateDeployment**](DeploymentsApi.md#updateDeployment) | **PATCH** /deployments/{deployment-name} | Update a deployment


<a name="deleteDeployment"></a>
# **deleteDeployment**
> deleteDeployment(deploymentName)

Delete a deployment

This operation will delete a deployment

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: opa_auth
ApiKeyAuth opa_auth = (ApiKeyAuth) defaultClient.getAuthentication("opa_auth");
opa_auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//opa_auth.setApiKeyPrefix("Token");

DeploymentsApi apiInstance = new DeploymentsApi();
String deploymentName = "deploymentName_example"; // String | 
try {
    apiInstance.deleteDeployment(deploymentName);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#deleteDeployment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentName** | **String**|  |

### Return type

null (empty response body)

### Authorization

[opa_auth](../README.md#opa_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDeployment"></a>
# **getDeployment**
> Deployment getDeployment(deploymentName)

Get a deployment

This operation will get a deployment

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: opa_auth
ApiKeyAuth opa_auth = (ApiKeyAuth) defaultClient.getAuthentication("opa_auth");
opa_auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//opa_auth.setApiKeyPrefix("Token");

DeploymentsApi apiInstance = new DeploymentsApi();
String deploymentName = "deploymentName_example"; // String | 
try {
    Deployment result = apiInstance.getDeployment(deploymentName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#getDeployment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentName** | **String**|  |

### Return type

[**Deployment**](Deployment.md)

### Authorization

[opa_auth](../README.md#opa_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDeployments"></a>
# **getDeployments**
> Deployments getDeployments()

Get one or more deployments

This operation will get one or more deployments

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: opa_auth
ApiKeyAuth opa_auth = (ApiKeyAuth) defaultClient.getAuthentication("opa_auth");
opa_auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//opa_auth.setApiKeyPrefix("Token");

DeploymentsApi apiInstance = new DeploymentsApi();
try {
    Deployments result = apiInstance.getDeployments();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#getDeployments");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Deployments**](Deployments.md)

### Authorization

[opa_auth](../README.md#opa_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="insertDeployments"></a>
# **insertDeployments**
> insertDeployments(body)

Insert one or more deployments

This operation will insert one or more deployments

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: opa_auth
ApiKeyAuth opa_auth = (ApiKeyAuth) defaultClient.getAuthentication("opa_auth");
opa_auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//opa_auth.setApiKeyPrefix("Token");

DeploymentsApi apiInstance = new DeploymentsApi();
Deployments body = new Deployments(); // Deployments | deployments to insert
try {
    apiInstance.insertDeployments(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#insertDeployments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Deployments**](Deployments.md)| deployments to insert |

### Return type

null (empty response body)

### Authorization

[opa_auth](../README.md#opa_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDeployment"></a>
# **updateDeployment**
> Deployment updateDeployment(deploymentName, body)

Update a deployment

This operation will update a deployment

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: opa_auth
ApiKeyAuth opa_auth = (ApiKeyAuth) defaultClient.getAuthentication("opa_auth");
opa_auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//opa_auth.setApiKeyPrefix("Token");

DeploymentsApi apiInstance = new DeploymentsApi();
String deploymentName = "deploymentName_example"; // String | 
Deployment body = new Deployment(); // Deployment | deployment to update
try {
    Deployment result = apiInstance.updateDeployment(deploymentName, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#updateDeployment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentName** | **String**|  |
 **body** | [**Deployment**](Deployment.md)| deployment to update |

### Return type

[**Deployment**](Deployment.md)

### Authorization

[opa_auth](../README.md#opa_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

