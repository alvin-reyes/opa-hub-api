# AboutApi

All URIs are relative to *https://opa-1228-sc.qb.lan/opa_1228_sc/opa-hub/api/12.2.8*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAbout**](AboutApi.md#getAbout) | **GET** /about | Get an about


<a name="getAbout"></a>
# **getAbout**
> About getAbout()

Get an about

This operation will get basic \&quot;about\&quot; information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AboutApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: opa_auth
ApiKeyAuth opa_auth = (ApiKeyAuth) defaultClient.getAuthentication("opa_auth");
opa_auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//opa_auth.setApiKeyPrefix("Token");

AboutApi apiInstance = new AboutApi();
try {
    About result = apiInstance.getAbout();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AboutApi#getAbout");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**About**](About.md)

### Authorization

[opa_auth](../README.md#opa_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

