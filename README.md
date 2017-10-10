# OPA HUB REST API Client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>ora.opa.hub</groupId>
    <artifactId>opa-hub-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "ora.opa.hub:opa-hub-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/opa-hub-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java


public class AboutApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://opa-1228-sc.qb.lan/opa_1228_sc/opa-hub/api/12.2.8*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AboutApi* | [**getAbout**](docs/AboutApi.md#getAbout) | **GET** /about | Get an about
*DeploymentsApi* | [**deleteDeployment**](docs/DeploymentsApi.md#deleteDeployment) | **DELETE** /deployments/{deployment-name} | Delete a deployment
*DeploymentsApi* | [**getDeployment**](docs/DeploymentsApi.md#getDeployment) | **GET** /deployments/{deployment-name} | Get a deployment
*DeploymentsApi* | [**getDeployments**](docs/DeploymentsApi.md#getDeployments) | **GET** /deployments | Get one or more deployments
*DeploymentsApi* | [**insertDeployments**](docs/DeploymentsApi.md#insertDeployments) | **POST** /deployments | Insert one or more deployments
*DeploymentsApi* | [**updateDeployment**](docs/DeploymentsApi.md#updateDeployment) | **PATCH** /deployments/{deployment-name} | Update a deployment
*DeploymentsDeploymentLogsApi* | [**getDeploymentLogs**](docs/DeploymentsDeploymentLogsApi.md#getDeploymentLogs) | **GET** /deployments/{deployment-name}/logs | Get one or more deployment logs
*DeploymentsDeploymentVersionsApi* | [**deleteDeploymentVersion**](docs/DeploymentsDeploymentVersionsApi.md#deleteDeploymentVersion) | **DELETE** /deployments/{deployment-name}/versions/{deployment-version-versionNo} | Delete a deployment version
*DeploymentsDeploymentVersionsApi* | [**getDeploymentVersion**](docs/DeploymentsDeploymentVersionsApi.md#getDeploymentVersion) | **GET** /deployments/{deployment-name}/versions/{deployment-version-versionNo} | Get a deployment version
*DeploymentsDeploymentVersionsApi* | [**getDeploymentVersions**](docs/DeploymentsDeploymentVersionsApi.md#getDeploymentVersions) | **GET** /deployments/{deployment-name}/versions | Get one or more deployment versions
*DeploymentsDeploymentVersionsApi* | [**getSnapshot**](docs/DeploymentsDeploymentVersionsApi.md#getSnapshot) | **GET** /deployments/{deployment-name}/versions/{deployment-version-versionNo}/snapshot | Get a snapshot
*DeploymentsDeploymentVersionsApi* | [**insertDeploymentVersions**](docs/DeploymentsDeploymentVersionsApi.md#insertDeploymentVersions) | **POST** /deployments/{deployment-name}/versions | Insert one or more deployment versions
*DeploymentsDeploymentVersionsApi* | [**updateDeploymentVersion**](docs/DeploymentsDeploymentVersionsApi.md#updateDeploymentVersion) | **PATCH** /deployments/{deployment-name}/versions/{deployment-version-versionNo} | Update a deployment version
*UsersApi* | [**deleteUser**](docs/UsersApi.md#deleteUser) | **DELETE** /users/{user-name} | Delete a user
*UsersApi* | [**getUser**](docs/UsersApi.md#getUser) | **GET** /users/{user-name} | Get a user
*UsersApi* | [**getUsers**](docs/UsersApi.md#getUsers) | **GET** /users | Get one or more users
*UsersApi* | [**insertOrReplaceUsers**](docs/UsersApi.md#insertOrReplaceUsers) | **PUT** /users | Insert or replace one or more users
*UsersApi* | [**insertUsers**](docs/UsersApi.md#insertUsers) | **POST** /users | Insert one or more users
*UsersApi* | [**updateUsers**](docs/UsersApi.md#updateUsers) | **PATCH** /users | Update one or more users


## Documentation for Models

 - [About](docs/About.md)
 - [Deployment](docs/Deployment.md)
 - [DeploymentLog](docs/DeploymentLog.md)
 - [DeploymentLogs](docs/DeploymentLogs.md)
 - [DeploymentServiceURLs](docs/DeploymentServiceURLs.md)
 - [DeploymentVersion](docs/DeploymentVersion.md)
 - [DeploymentVersionDataSource](docs/DeploymentVersionDataSource.md)
 - [DeploymentVersions](docs/DeploymentVersions.md)
 - [Deployments](docs/Deployments.md)
 - [Snapshot](docs/Snapshot.md)
 - [User](docs/User.md)
 - [UserCollection](docs/UserCollection.md)
 - [Users](docs/Users.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### opa_auth

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

Alvin Reyes


