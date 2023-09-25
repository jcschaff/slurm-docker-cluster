# SlurmApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**slurmctldCancelJob**](SlurmApi.md#slurmctldCancelJob) | **DELETE** /slurm/v0.0.37/job/{job_id} | cancel or signal job |
| [**slurmctldDiag**](SlurmApi.md#slurmctldDiag) | **GET** /slurm/v0.0.37/diag | get diagnostics |
| [**slurmctldGetJob**](SlurmApi.md#slurmctldGetJob) | **GET** /slurm/v0.0.37/job/{job_id} | get job info |
| [**slurmctldGetJobs**](SlurmApi.md#slurmctldGetJobs) | **GET** /slurm/v0.0.37/jobs | get list of jobs |
| [**slurmctldGetNode**](SlurmApi.md#slurmctldGetNode) | **GET** /slurm/v0.0.37/node/{node_name} | get node info |
| [**slurmctldGetNodes**](SlurmApi.md#slurmctldGetNodes) | **GET** /slurm/v0.0.37/nodes | get all node info |
| [**slurmctldGetPartition**](SlurmApi.md#slurmctldGetPartition) | **GET** /slurm/v0.0.37/partition/{partition_name} | get partition info |
| [**slurmctldGetPartitions**](SlurmApi.md#slurmctldGetPartitions) | **GET** /slurm/v0.0.37/partitions | get all partition info |
| [**slurmctldGetReservation**](SlurmApi.md#slurmctldGetReservation) | **GET** /slurm/v0.0.37/reservation/{reservation_name} | get reservation info |
| [**slurmctldGetReservations**](SlurmApi.md#slurmctldGetReservations) | **GET** /slurm/v0.0.37/reservations | get all reservation info |
| [**slurmctldPing**](SlurmApi.md#slurmctldPing) | **GET** /slurm/v0.0.37/ping | ping test |
| [**slurmctldSubmitJob**](SlurmApi.md#slurmctldSubmitJob) | **POST** /slurm/v0.0.37/job/submit | submit new job |
| [**slurmctldUpdateJob**](SlurmApi.md#slurmctldUpdateJob) | **POST** /slurm/v0.0.37/job/{job_id} | update job |
| [**slurmdbdAddClusters**](SlurmApi.md#slurmdbdAddClusters) | **POST** /slurmdb/v0.0.37/clusters | Add clusters |
| [**slurmdbdAddWckeys**](SlurmApi.md#slurmdbdAddWckeys) | **POST** /slurmdb/v0.0.37/wckeys | Add wckeys |
| [**slurmdbdDeleteAccount**](SlurmApi.md#slurmdbdDeleteAccount) | **DELETE** /slurmdb/v0.0.37/account/{account_name} | Delete account |
| [**slurmdbdDeleteAssociation**](SlurmApi.md#slurmdbdDeleteAssociation) | **DELETE** /slurmdb/v0.0.37/association | Delete association |
| [**slurmdbdDeleteCluster**](SlurmApi.md#slurmdbdDeleteCluster) | **DELETE** /slurmdb/v0.0.37/cluster/{cluster_name} | Delete cluster |
| [**slurmdbdDeleteQos**](SlurmApi.md#slurmdbdDeleteQos) | **DELETE** /slurmdb/v0.0.37/qos/{qos_name} | Delete QOS |
| [**slurmdbdDeleteUser**](SlurmApi.md#slurmdbdDeleteUser) | **DELETE** /slurmdb/v0.0.37/user/{user_name} | Delete user |
| [**slurmdbdDeleteWckey**](SlurmApi.md#slurmdbdDeleteWckey) | **DELETE** /slurmdb/v0.0.37/wckey/{wckey} | Delete wckey |
| [**slurmdbdDiag**](SlurmApi.md#slurmdbdDiag) | **GET** /slurmdb/v0.0.37/diag | Get slurmdb diagnostics |
| [**slurmdbdGetAccount**](SlurmApi.md#slurmdbdGetAccount) | **GET** /slurmdb/v0.0.37/account/{account_name} | Get account info |
| [**slurmdbdGetAccounts**](SlurmApi.md#slurmdbdGetAccounts) | **GET** /slurmdb/v0.0.37/accounts | Get account list |
| [**slurmdbdGetAssociation**](SlurmApi.md#slurmdbdGetAssociation) | **GET** /slurmdb/v0.0.37/association | Get association info |
| [**slurmdbdGetAssociations**](SlurmApi.md#slurmdbdGetAssociations) | **GET** /slurmdb/v0.0.37/associations | Get association list |
| [**slurmdbdGetCluster**](SlurmApi.md#slurmdbdGetCluster) | **GET** /slurmdb/v0.0.37/cluster/{cluster_name} | Get cluster info |
| [**slurmdbdGetClusters**](SlurmApi.md#slurmdbdGetClusters) | **GET** /slurmdb/v0.0.37/clusters | Get cluster list |
| [**slurmdbdGetDbConfig**](SlurmApi.md#slurmdbdGetDbConfig) | **GET** /slurmdb/v0.0.37/config | Dump all configuration information |
| [**slurmdbdGetJob**](SlurmApi.md#slurmdbdGetJob) | **GET** /slurmdb/v0.0.37/job/{job_id} | Get job info |
| [**slurmdbdGetJobs**](SlurmApi.md#slurmdbdGetJobs) | **GET** /slurmdb/v0.0.37/jobs | Get job list |
| [**slurmdbdGetQos**](SlurmApi.md#slurmdbdGetQos) | **GET** /slurmdb/v0.0.37/qos | Get QOS list |
| [**slurmdbdGetSingleQos**](SlurmApi.md#slurmdbdGetSingleQos) | **GET** /slurmdb/v0.0.37/qos/{qos_name} | Get QOS info |
| [**slurmdbdGetTres**](SlurmApi.md#slurmdbdGetTres) | **GET** /slurmdb/v0.0.37/tres | Get TRES info |
| [**slurmdbdGetUser**](SlurmApi.md#slurmdbdGetUser) | **GET** /slurmdb/v0.0.37/user/{user_name} | Get user info |
| [**slurmdbdGetUsers**](SlurmApi.md#slurmdbdGetUsers) | **GET** /slurmdb/v0.0.37/users | Get user list |
| [**slurmdbdGetWckey**](SlurmApi.md#slurmdbdGetWckey) | **GET** /slurmdb/v0.0.37/wckey/{wckey} | Get wckey info |
| [**slurmdbdGetWckeys**](SlurmApi.md#slurmdbdGetWckeys) | **GET** /slurmdb/v0.0.37/wckeys | Get wckey list |
| [**slurmdbdSetDbConfig**](SlurmApi.md#slurmdbdSetDbConfig) | **POST** /slurmdb/v0.0.37/config | Load all configuration information |
| [**slurmdbdUpdateAccount**](SlurmApi.md#slurmdbdUpdateAccount) | **POST** /slurmdb/v0.0.37/accounts | Update accounts |
| [**slurmdbdUpdateAssociations**](SlurmApi.md#slurmdbdUpdateAssociations) | **POST** /slurmdb/v0.0.37/associations | Set associations info |
| [**slurmdbdUpdateTres**](SlurmApi.md#slurmdbdUpdateTres) | **POST** /slurmdb/v0.0.37/tres | Set TRES info |
| [**slurmdbdUpdateUsers**](SlurmApi.md#slurmdbdUpdateUsers) | **POST** /slurmdb/v0.0.37/users | Update user |


<a id="slurmctldCancelJob"></a>
# **slurmctldCancelJob**
> slurmctldCancelJob(jobId, signal)

cancel or signal job

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlurmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: user
    ApiKeyAuth user = (ApiKeyAuth) defaultClient.getAuthentication("user");
    user.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //user.setApiKeyPrefix("Token");

    // Configure API key authorization: token
    ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
    token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //token.setApiKeyPrefix("Token");

    SlurmApi apiInstance = new SlurmApi(defaultClient);
    String jobId = "jobId_example"; // String | Slurm Job ID
    V0037Signal signal = V0037Signal.fromValue("HUP"); // V0037Signal | signal to send to job
    try {
      apiInstance.slurmctldCancelJob(jobId, signal);
    } catch (ApiException e) {
      System.err.println("Exception when calling SlurmApi#slurmctldCancelJob");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jobId** | **String**| Slurm Job ID | |
| **signal** | [**V0037Signal**](.md)| signal to send to job | [optional] [enum: HUP, INT, QUIT, ABRT, KILL, ALRM, TERM, USR1, USR2, URG, CONT, STOP, TSTP, TTIN, TTOU] |

### Return type

null (empty response body)

### Authorization

[user](../README.md#user), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | job cancelled or sent signal |  -  |
| **500** | job not found |  -  |

<a id="slurmctldDiag"></a>
# **slurmctldDiag**
> V0037Diag slurmctldDiag()

get diagnostics

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlurmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: user
    ApiKeyAuth user = (ApiKeyAuth) defaultClient.getAuthentication("user");
    user.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //user.setApiKeyPrefix("Token");

    // Configure API key authorization: token
    ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
    token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //token.setApiKeyPrefix("Token");

    SlurmApi apiInstance = new SlurmApi(defaultClient);
    try {
      V0037Diag result = apiInstance.slurmctldDiag();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SlurmApi#slurmctldDiag");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**V0037Diag**](V0037Diag.md)

### Authorization

[user](../README.md#user), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-yaml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | diagnostic results |  -  |
| **0** | unable to request ping test |  -  |

<a id="slurmctldGetJob"></a>
# **slurmctldGetJob**
> V0037JobsResponse slurmctldGetJob(jobId)

get job info

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlurmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: user
    ApiKeyAuth user = (ApiKeyAuth) defaultClient.getAuthentication("user");
    user.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //user.setApiKeyPrefix("Token");

    // Configure API key authorization: token
    ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
    token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //token.setApiKeyPrefix("Token");

    SlurmApi apiInstance = new SlurmApi(defaultClient);
    String jobId = "jobId_example"; // String | Slurm JobID
    try {
      V0037JobsResponse result = apiInstance.slurmctldGetJob(jobId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SlurmApi#slurmctldGetJob");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jobId** | **String**| Slurm JobID | |

### Return type

[**V0037JobsResponse**](V0037JobsResponse.md)

### Authorization

[user](../README.md#user), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-yaml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | job(s) information |  -  |
| **0** | job matching JobId not found |  -  |

<a id="slurmctldGetJobs"></a>
# **slurmctldGetJobs**
> V0037JobsResponse slurmctldGetJobs(updateTime)

get list of jobs

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlurmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: user
    ApiKeyAuth user = (ApiKeyAuth) defaultClient.getAuthentication("user");
    user.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //user.setApiKeyPrefix("Token");

    // Configure API key authorization: token
    ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
    token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //token.setApiKeyPrefix("Token");

    SlurmApi apiInstance = new SlurmApi(defaultClient);
    Long updateTime = 56L; // Long | Filter if changed since update_time. Use of this parameter can result in faster replies.
    try {
      V0037JobsResponse result = apiInstance.slurmctldGetJobs(updateTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SlurmApi#slurmctldGetJobs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **updateTime** | **Long**| Filter if changed since update_time. Use of this parameter can result in faster replies. | [optional] |

### Return type

[**V0037JobsResponse**](V0037JobsResponse.md)

### Authorization

[user](../README.md#user), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-yaml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | job(s) information |  -  |
| **0** | job not found |  -  |

<a id="slurmctldGetNode"></a>
# **slurmctldGetNode**
> V0037NodesResponse slurmctldGetNode(nodeName)

get node info

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlurmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: user
    ApiKeyAuth user = (ApiKeyAuth) defaultClient.getAuthentication("user");
    user.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //user.setApiKeyPrefix("Token");

    // Configure API key authorization: token
    ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
    token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //token.setApiKeyPrefix("Token");

    SlurmApi apiInstance = new SlurmApi(defaultClient);
    String nodeName = "nodeName_example"; // String | Slurm Node Name
    try {
      V0037NodesResponse result = apiInstance.slurmctldGetNode(nodeName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SlurmApi#slurmctldGetNode");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **nodeName** | **String**| Slurm Node Name | |

### Return type

[**V0037NodesResponse**](V0037NodesResponse.md)

### Authorization

[user](../README.md#user), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-yaml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | node information |  -  |
| **0** | node not found |  -  |

<a id="slurmctldGetNodes"></a>
# **slurmctldGetNodes**
> V0037NodesResponse slurmctldGetNodes(updateTime)

get all node info

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlurmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: user
    ApiKeyAuth user = (ApiKeyAuth) defaultClient.getAuthentication("user");
    user.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //user.setApiKeyPrefix("Token");

    // Configure API key authorization: token
    ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
    token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //token.setApiKeyPrefix("Token");

    SlurmApi apiInstance = new SlurmApi(defaultClient);
    Long updateTime = 56L; // Long | Filter if changed since update_time. Use of this parameter can result in faster replies.
    try {
      V0037NodesResponse result = apiInstance.slurmctldGetNodes(updateTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SlurmApi#slurmctldGetNodes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **updateTime** | **Long**| Filter if changed since update_time. Use of this parameter can result in faster replies. | [optional] |

### Return type

[**V0037NodesResponse**](V0037NodesResponse.md)

### Authorization

[user](../README.md#user), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-yaml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | node information |  -  |
| **0** | no nodes in cluster |  -  |

<a id="slurmctldGetPartition"></a>
# **slurmctldGetPartition**
> V0037PartitionsResponse slurmctldGetPartition(partitionName, updateTime)

get partition info

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlurmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: user
    ApiKeyAuth user = (ApiKeyAuth) defaultClient.getAuthentication("user");
    user.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //user.setApiKeyPrefix("Token");

    // Configure API key authorization: token
    ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
    token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //token.setApiKeyPrefix("Token");

    SlurmApi apiInstance = new SlurmApi(defaultClient);
    String partitionName = "partitionName_example"; // String | Slurm Partition Name
    Long updateTime = 56L; // Long | Filter if there were no partition changes (not limited to partition in URL endpoint) since update_time.
    try {
      V0037PartitionsResponse result = apiInstance.slurmctldGetPartition(partitionName, updateTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SlurmApi#slurmctldGetPartition");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **partitionName** | **String**| Slurm Partition Name | |
| **updateTime** | **Long**| Filter if there were no partition changes (not limited to partition in URL endpoint) since update_time. | [optional] |

### Return type

[**V0037PartitionsResponse**](V0037PartitionsResponse.md)

### Authorization

[user](../README.md#user), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-yaml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | partition information |  -  |
| **0** | no partitions found |  -  |

<a id="slurmctldGetPartitions"></a>
# **slurmctldGetPartitions**
> V0037PartitionsResponse slurmctldGetPartitions(updateTime)

get all partition info

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlurmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: user
    ApiKeyAuth user = (ApiKeyAuth) defaultClient.getAuthentication("user");
    user.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //user.setApiKeyPrefix("Token");

    // Configure API key authorization: token
    ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
    token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //token.setApiKeyPrefix("Token");

    SlurmApi apiInstance = new SlurmApi(defaultClient);
    Long updateTime = 56L; // Long | Filter if changed since update_time. Use of this parameter can result in faster replies.
    try {
      V0037PartitionsResponse result = apiInstance.slurmctldGetPartitions(updateTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SlurmApi#slurmctldGetPartitions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **updateTime** | **Long**| Filter if changed since update_time. Use of this parameter can result in faster replies. | [optional] |

### Return type

[**V0037PartitionsResponse**](V0037PartitionsResponse.md)

### Authorization

[user](../README.md#user), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-yaml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | partition information |  -  |
| **0** | no partitions found |  -  |

<a id="slurmctldGetReservation"></a>
# **slurmctldGetReservation**
> V0037ReservationsResponse slurmctldGetReservation(reservationName, updateTime)

get reservation info

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlurmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: user
    ApiKeyAuth user = (ApiKeyAuth) defaultClient.getAuthentication("user");
    user.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //user.setApiKeyPrefix("Token");

    // Configure API key authorization: token
    ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
    token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //token.setApiKeyPrefix("Token");

    SlurmApi apiInstance = new SlurmApi(defaultClient);
    String reservationName = "reservationName_example"; // String | Slurm Reservation Name
    Long updateTime = 56L; // Long | Filter if no reservation (not limited to reservation in URL) changed since update_time.
    try {
      V0037ReservationsResponse result = apiInstance.slurmctldGetReservation(reservationName, updateTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SlurmApi#slurmctldGetReservation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reservationName** | **String**| Slurm Reservation Name | |
| **updateTime** | **Long**| Filter if no reservation (not limited to reservation in URL) changed since update_time. | [optional] |

### Return type

[**V0037ReservationsResponse**](V0037ReservationsResponse.md)

### Authorization

[user](../README.md#user), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-yaml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | reservation information |  -  |
| **0** | no reservations found |  -  |

<a id="slurmctldGetReservations"></a>
# **slurmctldGetReservations**
> V0037ReservationsResponse slurmctldGetReservations(updateTime)

get all reservation info

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlurmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: user
    ApiKeyAuth user = (ApiKeyAuth) defaultClient.getAuthentication("user");
    user.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //user.setApiKeyPrefix("Token");

    // Configure API key authorization: token
    ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
    token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //token.setApiKeyPrefix("Token");

    SlurmApi apiInstance = new SlurmApi(defaultClient);
    Long updateTime = 56L; // Long | Filter if changed since update_time. Use of this parameter can result in faster replies.
    try {
      V0037ReservationsResponse result = apiInstance.slurmctldGetReservations(updateTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SlurmApi#slurmctldGetReservations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **updateTime** | **Long**| Filter if changed since update_time. Use of this parameter can result in faster replies. | [optional] |

### Return type

[**V0037ReservationsResponse**](V0037ReservationsResponse.md)

### Authorization

[user](../README.md#user), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-yaml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | reservation information |  -  |
| **0** | no reservations found |  -  |

<a id="slurmctldPing"></a>
# **slurmctldPing**
> V0037Pings slurmctldPing()

ping test

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlurmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: user
    ApiKeyAuth user = (ApiKeyAuth) defaultClient.getAuthentication("user");
    user.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //user.setApiKeyPrefix("Token");

    // Configure API key authorization: token
    ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
    token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //token.setApiKeyPrefix("Token");

    SlurmApi apiInstance = new SlurmApi(defaultClient);
    try {
      V0037Pings result = apiInstance.slurmctldPing();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SlurmApi#slurmctldPing");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**V0037Pings**](V0037Pings.md)

### Authorization

[user](../README.md#user), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-yaml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | results of ping test |  -  |
| **0** | unable to request ping test |  -  |

<a id="slurmctldSubmitJob"></a>
# **slurmctldSubmitJob**
> V0037JobSubmissionResponse slurmctldSubmitJob(v0037JobSubmission)

submit new job

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlurmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: user
    ApiKeyAuth user = (ApiKeyAuth) defaultClient.getAuthentication("user");
    user.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //user.setApiKeyPrefix("Token");

    // Configure API key authorization: token
    ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
    token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //token.setApiKeyPrefix("Token");

    SlurmApi apiInstance = new SlurmApi(defaultClient);
    V0037JobSubmission v0037JobSubmission = new V0037JobSubmission(); // V0037JobSubmission | submit new job
    try {
      V0037JobSubmissionResponse result = apiInstance.slurmctldSubmitJob(v0037JobSubmission);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SlurmApi#slurmctldSubmitJob");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **v0037JobSubmission** | [**V0037JobSubmission**](V0037JobSubmission.md)| submit new job | |

### Return type

[**V0037JobSubmissionResponse**](V0037JobSubmissionResponse.md)

### Authorization

[user](../README.md#user), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json, application/x-yaml
 - **Accept**: application/json, application/x-yaml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | job submitted |  -  |
| **0** | job rejected |  -  |

<a id="slurmctldUpdateJob"></a>
# **slurmctldUpdateJob**
> slurmctldUpdateJob(jobId, v0037JobProperties)

update job

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlurmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: user
    ApiKeyAuth user = (ApiKeyAuth) defaultClient.getAuthentication("user");
    user.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //user.setApiKeyPrefix("Token");

    // Configure API key authorization: token
    ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
    token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //token.setApiKeyPrefix("Token");

    SlurmApi apiInstance = new SlurmApi(defaultClient);
    String jobId = "jobId_example"; // String | Slurm Job ID
    V0037JobProperties v0037JobProperties = new V0037JobProperties(); // V0037JobProperties | update job
    try {
      apiInstance.slurmctldUpdateJob(jobId, v0037JobProperties);
    } catch (ApiException e) {
      System.err.println("Exception when calling SlurmApi#slurmctldUpdateJob");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jobId** | **String**| Slurm Job ID | |
| **v0037JobProperties** | [**V0037JobProperties**](V0037JobProperties.md)| update job | |

### Return type

null (empty response body)

### Authorization

[user](../README.md#user), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json, application/x-yaml
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | job information |  -  |
| **500** | job not found |  -  |

<a id="slurmdbdAddClusters"></a>
# **slurmdbdAddClusters**
> Dbv0037ResponseClusterAdd slurmdbdAddClusters()

Add clusters

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlurmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: user
    ApiKeyAuth user = (ApiKeyAuth) defaultClient.getAuthentication("user");
    user.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //user.setApiKeyPrefix("Token");

    // Configure API key authorization: token
    ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
    token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //token.setApiKeyPrefix("Token");

    SlurmApi apiInstance = new SlurmApi(defaultClient);
    try {
      Dbv0037ResponseClusterAdd result = apiInstance.slurmdbdAddClusters();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SlurmApi#slurmdbdAddClusters");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Dbv0037ResponseClusterAdd**](Dbv0037ResponseClusterAdd.md)

### Authorization

[user](../README.md#user), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-yaml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of clusters |  -  |
| **0** | Unable to add cluster |  -  |

<a id="slurmdbdAddWckeys"></a>
# **slurmdbdAddWckeys**
> Dbv0037ResponseWckeyAdd slurmdbdAddWckeys()

Add wckeys

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlurmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: user
    ApiKeyAuth user = (ApiKeyAuth) defaultClient.getAuthentication("user");
    user.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //user.setApiKeyPrefix("Token");

    // Configure API key authorization: token
    ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
    token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //token.setApiKeyPrefix("Token");

    SlurmApi apiInstance = new SlurmApi(defaultClient);
    try {
      Dbv0037ResponseWckeyAdd result = apiInstance.slurmdbdAddWckeys();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SlurmApi#slurmdbdAddWckeys");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Dbv0037ResponseWckeyAdd**](Dbv0037ResponseWckeyAdd.md)

### Authorization

[user](../README.md#user), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-yaml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of wckeys |  -  |
| **0** | Unable to add wckey |  -  |

<a id="slurmdbdDeleteAccount"></a>
# **slurmdbdDeleteAccount**
> Dbv0037ResponseAccountDelete slurmdbdDeleteAccount(accountName)

Delete account

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlurmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: user
    ApiKeyAuth user = (ApiKeyAuth) defaultClient.getAuthentication("user");
    user.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //user.setApiKeyPrefix("Token");

    // Configure API key authorization: token
    ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
    token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //token.setApiKeyPrefix("Token");

    SlurmApi apiInstance = new SlurmApi(defaultClient);
    String accountName = "accountName_example"; // String | Slurm Account Name
    try {
      Dbv0037ResponseAccountDelete result = apiInstance.slurmdbdDeleteAccount(accountName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SlurmApi#slurmdbdDeleteAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountName** | **String**| Slurm Account Name | |

### Return type

[**Dbv0037ResponseAccountDelete**](Dbv0037ResponseAccountDelete.md)

### Authorization

[user](../README.md#user), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-yaml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete account |  -  |
| **0** | Unable to delete account |  -  |

<a id="slurmdbdDeleteAssociation"></a>
# **slurmdbdDeleteAssociation**
> Dbv0037ResponseAssociationDelete slurmdbdDeleteAssociation(account, user, cluster, partition)

Delete association

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlurmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: user
    ApiKeyAuth user = (ApiKeyAuth) defaultClient.getAuthentication("user");
    user.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //user.setApiKeyPrefix("Token");

    // Configure API key authorization: token
    ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
    token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //token.setApiKeyPrefix("Token");

    SlurmApi apiInstance = new SlurmApi(defaultClient);
    String account = "account_example"; // String | Account name
    String user = "user_example"; // String | User name
    String cluster = "cluster_example"; // String | Cluster name
    String partition = "partition_example"; // String | Partition Name
    try {
      Dbv0037ResponseAssociationDelete result = apiInstance.slurmdbdDeleteAssociation(account, user, cluster, partition);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SlurmApi#slurmdbdDeleteAssociation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **account** | **String**| Account name | |
| **user** | **String**| User name | |
| **cluster** | **String**| Cluster name | [optional] |
| **partition** | **String**| Partition Name | [optional] |

### Return type

[**Dbv0037ResponseAssociationDelete**](Dbv0037ResponseAssociationDelete.md)

### Authorization

[user](../README.md#user), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-yaml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete associations |  -  |
| **0** | Association not found or unable to delete association |  -  |

<a id="slurmdbdDeleteCluster"></a>
# **slurmdbdDeleteCluster**
> Dbv0037ResponseClusterDelete slurmdbdDeleteCluster(clusterName)

Delete cluster

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlurmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: user
    ApiKeyAuth user = (ApiKeyAuth) defaultClient.getAuthentication("user");
    user.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //user.setApiKeyPrefix("Token");

    // Configure API key authorization: token
    ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
    token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //token.setApiKeyPrefix("Token");

    SlurmApi apiInstance = new SlurmApi(defaultClient);
    String clusterName = "clusterName_example"; // String | Slurm cluster name
    try {
      Dbv0037ResponseClusterDelete result = apiInstance.slurmdbdDeleteCluster(clusterName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SlurmApi#slurmdbdDeleteCluster");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **clusterName** | **String**| Slurm cluster name | |

### Return type

[**Dbv0037ResponseClusterDelete**](Dbv0037ResponseClusterDelete.md)

### Authorization

[user](../README.md#user), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-yaml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete cluster |  -  |
| **0** | Cluster not found or unable to delete cluster |  -  |

<a id="slurmdbdDeleteQos"></a>
# **slurmdbdDeleteQos**
> Dbv0037ResponseQosDelete slurmdbdDeleteQos(qosName)

Delete QOS

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlurmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: user
    ApiKeyAuth user = (ApiKeyAuth) defaultClient.getAuthentication("user");
    user.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //user.setApiKeyPrefix("Token");

    // Configure API key authorization: token
    ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
    token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //token.setApiKeyPrefix("Token");

    SlurmApi apiInstance = new SlurmApi(defaultClient);
    String qosName = "qosName_example"; // String | Slurm QOS Name
    try {
      Dbv0037ResponseQosDelete result = apiInstance.slurmdbdDeleteQos(qosName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SlurmApi#slurmdbdDeleteQos");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **qosName** | **String**| Slurm QOS Name | |

### Return type

[**Dbv0037ResponseQosDelete**](Dbv0037ResponseQosDelete.md)

### Authorization

[user](../README.md#user), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-yaml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete qos |  -  |
| **0** | Unable to delete QOS |  -  |

<a id="slurmdbdDeleteUser"></a>
# **slurmdbdDeleteUser**
> Dbv0037ResponseUserDelete slurmdbdDeleteUser(userName)

Delete user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlurmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: user
    ApiKeyAuth user = (ApiKeyAuth) defaultClient.getAuthentication("user");
    user.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //user.setApiKeyPrefix("Token");

    // Configure API key authorization: token
    ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
    token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //token.setApiKeyPrefix("Token");

    SlurmApi apiInstance = new SlurmApi(defaultClient);
    String userName = "userName_example"; // String | Slurm User Name
    try {
      Dbv0037ResponseUserDelete result = apiInstance.slurmdbdDeleteUser(userName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SlurmApi#slurmdbdDeleteUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userName** | **String**| Slurm User Name | |

### Return type

[**Dbv0037ResponseUserDelete**](Dbv0037ResponseUserDelete.md)

### Authorization

[user](../README.md#user), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-yaml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete user |  -  |
| **0** | User not found or unable to delete user |  -  |

<a id="slurmdbdDeleteWckey"></a>
# **slurmdbdDeleteWckey**
> Dbv0037ResponseWckeyDelete slurmdbdDeleteWckey(wckey)

Delete wckey

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlurmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: user
    ApiKeyAuth user = (ApiKeyAuth) defaultClient.getAuthentication("user");
    user.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //user.setApiKeyPrefix("Token");

    // Configure API key authorization: token
    ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
    token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //token.setApiKeyPrefix("Token");

    SlurmApi apiInstance = new SlurmApi(defaultClient);
    String wckey = "wckey_example"; // String | Slurm wckey name
    try {
      Dbv0037ResponseWckeyDelete result = apiInstance.slurmdbdDeleteWckey(wckey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SlurmApi#slurmdbdDeleteWckey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **wckey** | **String**| Slurm wckey name | |

### Return type

[**Dbv0037ResponseWckeyDelete**](Dbv0037ResponseWckeyDelete.md)

### Authorization

[user](../README.md#user), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-yaml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete wckey |  -  |
| **0** | wckey not found or unable to delete wckey |  -  |

<a id="slurmdbdDiag"></a>
# **slurmdbdDiag**
> Dbv0037Diag slurmdbdDiag()

Get slurmdb diagnostics

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlurmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: user
    ApiKeyAuth user = (ApiKeyAuth) defaultClient.getAuthentication("user");
    user.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //user.setApiKeyPrefix("Token");

    // Configure API key authorization: token
    ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
    token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //token.setApiKeyPrefix("Token");

    SlurmApi apiInstance = new SlurmApi(defaultClient);
    try {
      Dbv0037Diag result = apiInstance.slurmdbdDiag();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SlurmApi#slurmdbdDiag");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Dbv0037Diag**](Dbv0037Diag.md)

### Authorization

[user](../README.md#user), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-yaml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Dictionary of statistics |  -  |
| **0** | Unable to query diagnostics |  -  |

<a id="slurmdbdGetAccount"></a>
# **slurmdbdGetAccount**
> Dbv0037AccountInfo slurmdbdGetAccount(accountName)

Get account info

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlurmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: user
    ApiKeyAuth user = (ApiKeyAuth) defaultClient.getAuthentication("user");
    user.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //user.setApiKeyPrefix("Token");

    // Configure API key authorization: token
    ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
    token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //token.setApiKeyPrefix("Token");

    SlurmApi apiInstance = new SlurmApi(defaultClient);
    String accountName = "accountName_example"; // String | Slurm Account Name
    try {
      Dbv0037AccountInfo result = apiInstance.slurmdbdGetAccount(accountName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SlurmApi#slurmdbdGetAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountName** | **String**| Slurm Account Name | |

### Return type

[**Dbv0037AccountInfo**](Dbv0037AccountInfo.md)

### Authorization

[user](../README.md#user), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-yaml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of accounts |  -  |
| **0** | Account not found |  -  |

<a id="slurmdbdGetAccounts"></a>
# **slurmdbdGetAccounts**
> Dbv0037AccountInfo slurmdbdGetAccounts()

Get account list

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlurmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: user
    ApiKeyAuth user = (ApiKeyAuth) defaultClient.getAuthentication("user");
    user.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //user.setApiKeyPrefix("Token");

    // Configure API key authorization: token
    ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
    token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //token.setApiKeyPrefix("Token");

    SlurmApi apiInstance = new SlurmApi(defaultClient);
    try {
      Dbv0037AccountInfo result = apiInstance.slurmdbdGetAccounts();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SlurmApi#slurmdbdGetAccounts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Dbv0037AccountInfo**](Dbv0037AccountInfo.md)

### Authorization

[user](../README.md#user), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-yaml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of accounts |  -  |
| **0** | Account not found |  -  |

<a id="slurmdbdGetAssociation"></a>
# **slurmdbdGetAssociation**
> Dbv0037AssociationsInfo slurmdbdGetAssociation(cluster, account, user, partition)

Get association info

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlurmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: user
    ApiKeyAuth user = (ApiKeyAuth) defaultClient.getAuthentication("user");
    user.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //user.setApiKeyPrefix("Token");

    // Configure API key authorization: token
    ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
    token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //token.setApiKeyPrefix("Token");

    SlurmApi apiInstance = new SlurmApi(defaultClient);
    String cluster = "cluster_example"; // String | Cluster name
    String account = "account_example"; // String | Account name
    String user = "user_example"; // String | User name
    String partition = "partition_example"; // String | Partition Name
    try {
      Dbv0037AssociationsInfo result = apiInstance.slurmdbdGetAssociation(cluster, account, user, partition);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SlurmApi#slurmdbdGetAssociation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cluster** | **String**| Cluster name | [optional] |
| **account** | **String**| Account name | [optional] |
| **user** | **String**| User name | [optional] |
| **partition** | **String**| Partition Name | [optional] |

### Return type

[**Dbv0037AssociationsInfo**](Dbv0037AssociationsInfo.md)

### Authorization

[user](../README.md#user), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-yaml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of associations |  -  |
| **0** | Association not found |  -  |

<a id="slurmdbdGetAssociations"></a>
# **slurmdbdGetAssociations**
> Dbv0037AssociationsInfo slurmdbdGetAssociations()

Get association list

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlurmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: user
    ApiKeyAuth user = (ApiKeyAuth) defaultClient.getAuthentication("user");
    user.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //user.setApiKeyPrefix("Token");

    // Configure API key authorization: token
    ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
    token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //token.setApiKeyPrefix("Token");

    SlurmApi apiInstance = new SlurmApi(defaultClient);
    try {
      Dbv0037AssociationsInfo result = apiInstance.slurmdbdGetAssociations();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SlurmApi#slurmdbdGetAssociations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Dbv0037AssociationsInfo**](Dbv0037AssociationsInfo.md)

### Authorization

[user](../README.md#user), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-yaml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of associations |  -  |
| **0** | Association not found |  -  |

<a id="slurmdbdGetCluster"></a>
# **slurmdbdGetCluster**
> Dbv0037ClusterInfo slurmdbdGetCluster(clusterName)

Get cluster info

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlurmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: user
    ApiKeyAuth user = (ApiKeyAuth) defaultClient.getAuthentication("user");
    user.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //user.setApiKeyPrefix("Token");

    // Configure API key authorization: token
    ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
    token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //token.setApiKeyPrefix("Token");

    SlurmApi apiInstance = new SlurmApi(defaultClient);
    String clusterName = "clusterName_example"; // String | Slurm cluster name
    try {
      Dbv0037ClusterInfo result = apiInstance.slurmdbdGetCluster(clusterName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SlurmApi#slurmdbdGetCluster");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **clusterName** | **String**| Slurm cluster name | |

### Return type

[**Dbv0037ClusterInfo**](Dbv0037ClusterInfo.md)

### Authorization

[user](../README.md#user), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-yaml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cluster information |  -  |
| **0** | Cluster not found |  -  |

<a id="slurmdbdGetClusters"></a>
# **slurmdbdGetClusters**
> Dbv0037ClusterInfo slurmdbdGetClusters()

Get cluster list

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlurmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: user
    ApiKeyAuth user = (ApiKeyAuth) defaultClient.getAuthentication("user");
    user.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //user.setApiKeyPrefix("Token");

    // Configure API key authorization: token
    ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
    token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //token.setApiKeyPrefix("Token");

    SlurmApi apiInstance = new SlurmApi(defaultClient);
    try {
      Dbv0037ClusterInfo result = apiInstance.slurmdbdGetClusters();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SlurmApi#slurmdbdGetClusters");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Dbv0037ClusterInfo**](Dbv0037ClusterInfo.md)

### Authorization

[user](../README.md#user), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-yaml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of clusters |  -  |
| **0** | Cluster not found |  -  |

<a id="slurmdbdGetDbConfig"></a>
# **slurmdbdGetDbConfig**
> Dbv0037ConfigInfo slurmdbdGetDbConfig()

Dump all configuration information

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlurmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: user
    ApiKeyAuth user = (ApiKeyAuth) defaultClient.getAuthentication("user");
    user.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //user.setApiKeyPrefix("Token");

    // Configure API key authorization: token
    ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
    token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //token.setApiKeyPrefix("Token");

    SlurmApi apiInstance = new SlurmApi(defaultClient);
    try {
      Dbv0037ConfigInfo result = apiInstance.slurmdbdGetDbConfig();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SlurmApi#slurmdbdGetDbConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Dbv0037ConfigInfo**](Dbv0037ConfigInfo.md)

### Authorization

[user](../README.md#user), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-yaml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | slurmdbd configuration |  -  |
| **0** | Unable to dump config |  -  |

<a id="slurmdbdGetJob"></a>
# **slurmdbdGetJob**
> Dbv0037JobInfo slurmdbdGetJob(jobId)

Get job info

This endpoint may return multiple job entries since job_id is not a unique key - only the tuple (cluster, job_id, start_time) is unique. If the requested job_id is a component of a heterogeneous job all components are returned.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlurmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: user
    ApiKeyAuth user = (ApiKeyAuth) defaultClient.getAuthentication("user");
    user.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //user.setApiKeyPrefix("Token");

    // Configure API key authorization: token
    ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
    token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //token.setApiKeyPrefix("Token");

    SlurmApi apiInstance = new SlurmApi(defaultClient);
    Long jobId = 56L; // Long | Slurm Job ID
    try {
      Dbv0037JobInfo result = apiInstance.slurmdbdGetJob(jobId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SlurmApi#slurmdbdGetJob");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jobId** | **Long**| Slurm Job ID | |

### Return type

[**Dbv0037JobInfo**](Dbv0037JobInfo.md)

### Authorization

[user](../README.md#user), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-yaml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Job description |  -  |
| **0** | Unable to find job |  -  |

<a id="slurmdbdGetJobs"></a>
# **slurmdbdGetJobs**
> Dbv0037JobInfo slurmdbdGetJobs(submitTime, startTime, endTime, account, association, cluster, constraints, cpusMax, cpusMin, skipSteps, disableWaitForResult, exitCode, format, group, jobName, nodesMax, nodesMin, partition, qos, reason, reservation, state, step, node, wckey)

Get job list

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlurmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: user
    ApiKeyAuth user = (ApiKeyAuth) defaultClient.getAuthentication("user");
    user.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //user.setApiKeyPrefix("Token");

    // Configure API key authorization: token
    ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
    token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //token.setApiKeyPrefix("Token");

    SlurmApi apiInstance = new SlurmApi(defaultClient);
    String submitTime = "submitTime_example"; // String | Filter by submission time  Accepted formats:  HH:MM[:SS] [AM|PM]  MMDD[YY] or MM/DD[/YY] or MM.DD[.YY]  MM/DD[/YY]-HH:MM[:SS]  YYYY-MM-DD[THH:MM[:SS]]
    String startTime = "startTime_example"; // String | Filter by start time  Accepted formats:  HH:MM[:SS] [AM|PM]  MMDD[YY] or MM/DD[/YY] or MM.DD[.YY]  MM/DD[/YY]-HH:MM[:SS]  YYYY-MM-DD[THH:MM[:SS]]
    String endTime = "endTime_example"; // String | Filter by end time  Accepted formats:  HH:MM[:SS] [AM|PM]  MMDD[YY] or MM/DD[/YY] or MM.DD[.YY]  MM/DD[/YY]-HH:MM[:SS]  YYYY-MM-DD[THH:MM[:SS]]
    String account = "account_example"; // String | Comma delimited list of accounts to match
    String association = "association_example"; // String | Comma delimited list of associations to match
    String cluster = "cluster_example"; // String | Comma delimited list of cluster to match
    String constraints = "constraints_example"; // String | Comma delimited list of constraints to match
    String cpusMax = "cpusMax_example"; // String | Number of CPUs high range
    String cpusMin = "cpusMin_example"; // String | Number of CPUs low range
    Boolean skipSteps = true; // Boolean | Report job step information
    Boolean disableWaitForResult = true; // Boolean | Disable waiting for result from slurmdbd
    String exitCode = "exitCode_example"; // String | Exit code of job
    String format = "format_example"; // String | Comma delimited list of formats to match
    String group = "group_example"; // String | Comma delimited list of groups to match
    String jobName = "jobName_example"; // String | Comma delimited list of job names to match
    String nodesMax = "nodesMax_example"; // String | Number of nodes high range
    String nodesMin = "nodesMin_example"; // String | Number of nodes low range
    String partition = "partition_example"; // String | Comma delimited list of partitions to match
    String qos = "qos_example"; // String | Comma delimited list of QOS to match
    String reason = "reason_example"; // String | Comma delimited list of job reasons to match
    String reservation = "reservation_example"; // String | Comma delimited list of reservations to match
    String state = "state_example"; // String | Comma delimited list of states to match
    String step = "step_example"; // String | Comma delimited list of job steps to match
    String node = "node_example"; // String | Comma delimited list of used nodes to match
    String wckey = "wckey_example"; // String | Comma delimited list of wckeys to match
    try {
      Dbv0037JobInfo result = apiInstance.slurmdbdGetJobs(submitTime, startTime, endTime, account, association, cluster, constraints, cpusMax, cpusMin, skipSteps, disableWaitForResult, exitCode, format, group, jobName, nodesMax, nodesMin, partition, qos, reason, reservation, state, step, node, wckey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SlurmApi#slurmdbdGetJobs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **submitTime** | **String**| Filter by submission time  Accepted formats:  HH:MM[:SS] [AM|PM]  MMDD[YY] or MM/DD[/YY] or MM.DD[.YY]  MM/DD[/YY]-HH:MM[:SS]  YYYY-MM-DD[THH:MM[:SS]] | [optional] |
| **startTime** | **String**| Filter by start time  Accepted formats:  HH:MM[:SS] [AM|PM]  MMDD[YY] or MM/DD[/YY] or MM.DD[.YY]  MM/DD[/YY]-HH:MM[:SS]  YYYY-MM-DD[THH:MM[:SS]] | [optional] |
| **endTime** | **String**| Filter by end time  Accepted formats:  HH:MM[:SS] [AM|PM]  MMDD[YY] or MM/DD[/YY] or MM.DD[.YY]  MM/DD[/YY]-HH:MM[:SS]  YYYY-MM-DD[THH:MM[:SS]] | [optional] |
| **account** | **String**| Comma delimited list of accounts to match | [optional] |
| **association** | **String**| Comma delimited list of associations to match | [optional] |
| **cluster** | **String**| Comma delimited list of cluster to match | [optional] |
| **constraints** | **String**| Comma delimited list of constraints to match | [optional] |
| **cpusMax** | **String**| Number of CPUs high range | [optional] |
| **cpusMin** | **String**| Number of CPUs low range | [optional] |
| **skipSteps** | **Boolean**| Report job step information | [optional] |
| **disableWaitForResult** | **Boolean**| Disable waiting for result from slurmdbd | [optional] |
| **exitCode** | **String**| Exit code of job | [optional] |
| **format** | **String**| Comma delimited list of formats to match | [optional] |
| **group** | **String**| Comma delimited list of groups to match | [optional] |
| **jobName** | **String**| Comma delimited list of job names to match | [optional] |
| **nodesMax** | **String**| Number of nodes high range | [optional] |
| **nodesMin** | **String**| Number of nodes low range | [optional] |
| **partition** | **String**| Comma delimited list of partitions to match | [optional] |
| **qos** | **String**| Comma delimited list of QOS to match | [optional] |
| **reason** | **String**| Comma delimited list of job reasons to match | [optional] |
| **reservation** | **String**| Comma delimited list of reservations to match | [optional] |
| **state** | **String**| Comma delimited list of states to match | [optional] |
| **step** | **String**| Comma delimited list of job steps to match | [optional] |
| **node** | **String**| Comma delimited list of used nodes to match | [optional] |
| **wckey** | **String**| Comma delimited list of wckeys to match | [optional] |

### Return type

[**Dbv0037JobInfo**](Dbv0037JobInfo.md)

### Authorization

[user](../README.md#user), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-yaml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of jobs |  -  |
| **0** | Unable to query jobs |  -  |

<a id="slurmdbdGetQos"></a>
# **slurmdbdGetQos**
> Dbv0037QosInfo slurmdbdGetQos()

Get QOS list

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlurmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: user
    ApiKeyAuth user = (ApiKeyAuth) defaultClient.getAuthentication("user");
    user.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //user.setApiKeyPrefix("Token");

    // Configure API key authorization: token
    ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
    token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //token.setApiKeyPrefix("Token");

    SlurmApi apiInstance = new SlurmApi(defaultClient);
    try {
      Dbv0037QosInfo result = apiInstance.slurmdbdGetQos();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SlurmApi#slurmdbdGetQos");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Dbv0037QosInfo**](Dbv0037QosInfo.md)

### Authorization

[user](../README.md#user), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-yaml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of QOS&#39; |  -  |
| **0** | QOS not found |  -  |

<a id="slurmdbdGetSingleQos"></a>
# **slurmdbdGetSingleQos**
> Dbv0037QosInfo slurmdbdGetSingleQos(qosName)

Get QOS info

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlurmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: user
    ApiKeyAuth user = (ApiKeyAuth) defaultClient.getAuthentication("user");
    user.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //user.setApiKeyPrefix("Token");

    // Configure API key authorization: token
    ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
    token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //token.setApiKeyPrefix("Token");

    SlurmApi apiInstance = new SlurmApi(defaultClient);
    String qosName = "qosName_example"; // String | Slurm QOS Name
    try {
      Dbv0037QosInfo result = apiInstance.slurmdbdGetSingleQos(qosName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SlurmApi#slurmdbdGetSingleQos");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **qosName** | **String**| Slurm QOS Name | |

### Return type

[**Dbv0037QosInfo**](Dbv0037QosInfo.md)

### Authorization

[user](../README.md#user), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-yaml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | QOS information |  -  |
| **0** | QOS not found |  -  |

<a id="slurmdbdGetTres"></a>
# **slurmdbdGetTres**
> Dbv0037TresInfo slurmdbdGetTres()

Get TRES info

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlurmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: user
    ApiKeyAuth user = (ApiKeyAuth) defaultClient.getAuthentication("user");
    user.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //user.setApiKeyPrefix("Token");

    // Configure API key authorization: token
    ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
    token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //token.setApiKeyPrefix("Token");

    SlurmApi apiInstance = new SlurmApi(defaultClient);
    try {
      Dbv0037TresInfo result = apiInstance.slurmdbdGetTres();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SlurmApi#slurmdbdGetTres");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Dbv0037TresInfo**](Dbv0037TresInfo.md)

### Authorization

[user](../README.md#user), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-yaml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of TRES |  -  |
| **0** | Unable to retrieve TRES |  -  |

<a id="slurmdbdGetUser"></a>
# **slurmdbdGetUser**
> Dbv0037UserInfo slurmdbdGetUser(userName)

Get user info

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlurmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: user
    ApiKeyAuth user = (ApiKeyAuth) defaultClient.getAuthentication("user");
    user.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //user.setApiKeyPrefix("Token");

    // Configure API key authorization: token
    ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
    token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //token.setApiKeyPrefix("Token");

    SlurmApi apiInstance = new SlurmApi(defaultClient);
    String userName = "userName_example"; // String | Slurm User Name
    try {
      Dbv0037UserInfo result = apiInstance.slurmdbdGetUser(userName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SlurmApi#slurmdbdGetUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userName** | **String**| Slurm User Name | |

### Return type

[**Dbv0037UserInfo**](Dbv0037UserInfo.md)

### Authorization

[user](../README.md#user), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-yaml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of users |  -  |
| **0** | User not found |  -  |

<a id="slurmdbdGetUsers"></a>
# **slurmdbdGetUsers**
> Dbv0037UserInfo slurmdbdGetUsers()

Get user list

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlurmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: user
    ApiKeyAuth user = (ApiKeyAuth) defaultClient.getAuthentication("user");
    user.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //user.setApiKeyPrefix("Token");

    // Configure API key authorization: token
    ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
    token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //token.setApiKeyPrefix("Token");

    SlurmApi apiInstance = new SlurmApi(defaultClient);
    try {
      Dbv0037UserInfo result = apiInstance.slurmdbdGetUsers();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SlurmApi#slurmdbdGetUsers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Dbv0037UserInfo**](Dbv0037UserInfo.md)

### Authorization

[user](../README.md#user), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-yaml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of users |  -  |
| **0** | User not found |  -  |

<a id="slurmdbdGetWckey"></a>
# **slurmdbdGetWckey**
> Dbv0037WckeyInfo slurmdbdGetWckey(wckey)

Get wckey info

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlurmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: user
    ApiKeyAuth user = (ApiKeyAuth) defaultClient.getAuthentication("user");
    user.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //user.setApiKeyPrefix("Token");

    // Configure API key authorization: token
    ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
    token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //token.setApiKeyPrefix("Token");

    SlurmApi apiInstance = new SlurmApi(defaultClient);
    String wckey = "wckey_example"; // String | Slurm wckey name
    try {
      Dbv0037WckeyInfo result = apiInstance.slurmdbdGetWckey(wckey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SlurmApi#slurmdbdGetWckey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **wckey** | **String**| Slurm wckey name | |

### Return type

[**Dbv0037WckeyInfo**](Dbv0037WckeyInfo.md)

### Authorization

[user](../README.md#user), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-yaml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of wckey |  -  |
| **0** | wckey not found |  -  |

<a id="slurmdbdGetWckeys"></a>
# **slurmdbdGetWckeys**
> Dbv0037WckeyInfo slurmdbdGetWckeys()

Get wckey list

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlurmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: user
    ApiKeyAuth user = (ApiKeyAuth) defaultClient.getAuthentication("user");
    user.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //user.setApiKeyPrefix("Token");

    // Configure API key authorization: token
    ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
    token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //token.setApiKeyPrefix("Token");

    SlurmApi apiInstance = new SlurmApi(defaultClient);
    try {
      Dbv0037WckeyInfo result = apiInstance.slurmdbdGetWckeys();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SlurmApi#slurmdbdGetWckeys");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Dbv0037WckeyInfo**](Dbv0037WckeyInfo.md)

### Authorization

[user](../README.md#user), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-yaml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of wckeys |  -  |
| **0** | wckey not found |  -  |

<a id="slurmdbdSetDbConfig"></a>
# **slurmdbdSetDbConfig**
> Dbv0037ConfigResponse slurmdbdSetDbConfig()

Load all configuration information

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlurmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: user
    ApiKeyAuth user = (ApiKeyAuth) defaultClient.getAuthentication("user");
    user.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //user.setApiKeyPrefix("Token");

    // Configure API key authorization: token
    ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
    token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //token.setApiKeyPrefix("Token");

    SlurmApi apiInstance = new SlurmApi(defaultClient);
    try {
      Dbv0037ConfigResponse result = apiInstance.slurmdbdSetDbConfig();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SlurmApi#slurmdbdSetDbConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Dbv0037ConfigResponse**](Dbv0037ConfigResponse.md)

### Authorization

[user](../README.md#user), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-yaml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Load config |  -  |
| **0** | Unable to set config |  -  |

<a id="slurmdbdUpdateAccount"></a>
# **slurmdbdUpdateAccount**
> Dbv0037AccountResponse slurmdbdUpdateAccount()

Update accounts

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlurmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: user
    ApiKeyAuth user = (ApiKeyAuth) defaultClient.getAuthentication("user");
    user.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //user.setApiKeyPrefix("Token");

    // Configure API key authorization: token
    ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
    token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //token.setApiKeyPrefix("Token");

    SlurmApi apiInstance = new SlurmApi(defaultClient);
    try {
      Dbv0037AccountResponse result = apiInstance.slurmdbdUpdateAccount();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SlurmApi#slurmdbdUpdateAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Dbv0037AccountResponse**](Dbv0037AccountResponse.md)

### Authorization

[user](../README.md#user), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-yaml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Add/update list of accounts |  -  |
| **0** | Unable to add or update accounts |  -  |

<a id="slurmdbdUpdateAssociations"></a>
# **slurmdbdUpdateAssociations**
> Dbv0037ResponseAssociations slurmdbdUpdateAssociations()

Set associations info

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlurmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: user
    ApiKeyAuth user = (ApiKeyAuth) defaultClient.getAuthentication("user");
    user.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //user.setApiKeyPrefix("Token");

    // Configure API key authorization: token
    ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
    token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //token.setApiKeyPrefix("Token");

    SlurmApi apiInstance = new SlurmApi(defaultClient);
    try {
      Dbv0037ResponseAssociations result = apiInstance.slurmdbdUpdateAssociations();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SlurmApi#slurmdbdUpdateAssociations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Dbv0037ResponseAssociations**](Dbv0037ResponseAssociations.md)

### Authorization

[user](../README.md#user), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-yaml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | status of associations update |  -  |
| **0** | Unable to update associations |  -  |

<a id="slurmdbdUpdateTres"></a>
# **slurmdbdUpdateTres**
> Dbv0037ResponseTres slurmdbdUpdateTres()

Set TRES info

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlurmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: user
    ApiKeyAuth user = (ApiKeyAuth) defaultClient.getAuthentication("user");
    user.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //user.setApiKeyPrefix("Token");

    // Configure API key authorization: token
    ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
    token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //token.setApiKeyPrefix("Token");

    SlurmApi apiInstance = new SlurmApi(defaultClient);
    try {
      Dbv0037ResponseTres result = apiInstance.slurmdbdUpdateTres();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SlurmApi#slurmdbdUpdateTres");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Dbv0037ResponseTres**](Dbv0037ResponseTres.md)

### Authorization

[user](../README.md#user), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-yaml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of TRES |  -  |
| **0** | Unable to update TRES |  -  |

<a id="slurmdbdUpdateUsers"></a>
# **slurmdbdUpdateUsers**
> Dbv0037ResponseUserUpdate slurmdbdUpdateUsers()

Update user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SlurmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: user
    ApiKeyAuth user = (ApiKeyAuth) defaultClient.getAuthentication("user");
    user.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //user.setApiKeyPrefix("Token");

    // Configure API key authorization: token
    ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
    token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //token.setApiKeyPrefix("Token");

    SlurmApi apiInstance = new SlurmApi(defaultClient);
    try {
      Dbv0037ResponseUserUpdate result = apiInstance.slurmdbdUpdateUsers();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SlurmApi#slurmdbdUpdateUsers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Dbv0037ResponseUserUpdate**](Dbv0037ResponseUserUpdate.md)

### Authorization

[user](../README.md#user), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-yaml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update users |  -  |
| **0** | User not found or not able to update user |  -  |

