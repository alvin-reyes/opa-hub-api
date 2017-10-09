# UsersApi

All URIs are relative to *https://opa-1228-sc.qb.lan/opa_1228_sc/opa-hub/api/12.2.8*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteUser**](UsersApi.md#deleteUser) | **DELETE** /users/{user-name} | Delete a user
[**getUser**](UsersApi.md#getUser) | **GET** /users/{user-name} | Get a user
[**getUsers**](UsersApi.md#getUsers) | **GET** /users | Get one or more users
[**insertOrReplaceUsers**](UsersApi.md#insertOrReplaceUsers) | **PUT** /users | Insert or replace one or more users
[**insertUsers**](UsersApi.md#insertUsers) | **POST** /users | Insert one or more users
[**updateUsers**](UsersApi.md#updateUsers) | **PATCH** /users | Update one or more users


<a name="deleteUser"></a>
# **deleteUser**
> deleteUser(userName)

Delete a user

This operation will delete a user

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: opa_auth
ApiKeyAuth opa_auth = (ApiKeyAuth) defaultClient.getAuthentication("opa_auth");
opa_auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//opa_auth.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
String userName = "userName_example"; // String | 
try {
    apiInstance.deleteUser(userName);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#deleteUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userName** | **String**|  |

### Return type

null (empty response body)

### Authorization

[opa_auth](../README.md#opa_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUser"></a>
# **getUser**
> User getUser(userName)

Get a user

This operation will get a user

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: opa_auth
ApiKeyAuth opa_auth = (ApiKeyAuth) defaultClient.getAuthentication("opa_auth");
opa_auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//opa_auth.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
String userName = "userName_example"; // String | 
try {
    User result = apiInstance.getUser(userName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userName** | **String**|  |

### Return type

[**User**](User.md)

### Authorization

[opa_auth](../README.md#opa_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUsers"></a>
# **getUsers**
> Users getUsers()

Get one or more users

This operation will get one or more users

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: opa_auth
ApiKeyAuth opa_auth = (ApiKeyAuth) defaultClient.getAuthentication("opa_auth");
opa_auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//opa_auth.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
try {
    Users result = apiInstance.getUsers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUsers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Users**](Users.md)

### Authorization

[opa_auth](../README.md#opa_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="insertOrReplaceUsers"></a>
# **insertOrReplaceUsers**
> insertOrReplaceUsers(body)

Insert or replace one or more users

This operation will insert or replace one or more users

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: opa_auth
ApiKeyAuth opa_auth = (ApiKeyAuth) defaultClient.getAuthentication("opa_auth");
opa_auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//opa_auth.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
Users body = new Users(); // Users | users to insert or replace
try {
    apiInstance.insertOrReplaceUsers(body);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#insertOrReplaceUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Users**](Users.md)| users to insert or replace |

### Return type

null (empty response body)

### Authorization

[opa_auth](../README.md#opa_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="insertUsers"></a>
# **insertUsers**
> insertUsers(body)

Insert one or more users

This operation will insert one or more users

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: opa_auth
ApiKeyAuth opa_auth = (ApiKeyAuth) defaultClient.getAuthentication("opa_auth");
opa_auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//opa_auth.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
Users body = new Users(); // Users | users to insert
try {
    apiInstance.insertUsers(body);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#insertUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Users**](Users.md)| users to insert |

### Return type

null (empty response body)

### Authorization

[opa_auth](../README.md#opa_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUsers"></a>
# **updateUsers**
> Users updateUsers(body)

Update one or more users

This operation will update one or more users

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: opa_auth
ApiKeyAuth opa_auth = (ApiKeyAuth) defaultClient.getAuthentication("opa_auth");
opa_auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//opa_auth.setApiKeyPrefix("Token");

UsersApi apiInstance = new UsersApi();
Users body = new Users(); // Users | users to update
try {
    Users result = apiInstance.updateUsers(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#updateUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Users**](Users.md)| users to update |

### Return type

[**Users**](Users.md)

### Authorization

[opa_auth](../README.md#opa_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

