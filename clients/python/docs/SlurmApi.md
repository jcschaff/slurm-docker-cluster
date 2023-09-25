# openapi_client.SlurmApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**slurmctld_cancel_job**](SlurmApi.md#slurmctld_cancel_job) | **DELETE** /slurm/v0.0.37/job/{job_id} | cancel or signal job
[**slurmctld_diag**](SlurmApi.md#slurmctld_diag) | **GET** /slurm/v0.0.37/diag | get diagnostics
[**slurmctld_get_job**](SlurmApi.md#slurmctld_get_job) | **GET** /slurm/v0.0.37/job/{job_id} | get job info
[**slurmctld_get_jobs**](SlurmApi.md#slurmctld_get_jobs) | **GET** /slurm/v0.0.37/jobs | get list of jobs
[**slurmctld_get_node**](SlurmApi.md#slurmctld_get_node) | **GET** /slurm/v0.0.37/node/{node_name} | get node info
[**slurmctld_get_nodes**](SlurmApi.md#slurmctld_get_nodes) | **GET** /slurm/v0.0.37/nodes | get all node info
[**slurmctld_get_partition**](SlurmApi.md#slurmctld_get_partition) | **GET** /slurm/v0.0.37/partition/{partition_name} | get partition info
[**slurmctld_get_partitions**](SlurmApi.md#slurmctld_get_partitions) | **GET** /slurm/v0.0.37/partitions | get all partition info
[**slurmctld_get_reservation**](SlurmApi.md#slurmctld_get_reservation) | **GET** /slurm/v0.0.37/reservation/{reservation_name} | get reservation info
[**slurmctld_get_reservations**](SlurmApi.md#slurmctld_get_reservations) | **GET** /slurm/v0.0.37/reservations | get all reservation info
[**slurmctld_ping**](SlurmApi.md#slurmctld_ping) | **GET** /slurm/v0.0.37/ping | ping test
[**slurmctld_submit_job**](SlurmApi.md#slurmctld_submit_job) | **POST** /slurm/v0.0.37/job/submit | submit new job
[**slurmctld_update_job**](SlurmApi.md#slurmctld_update_job) | **POST** /slurm/v0.0.37/job/{job_id} | update job
[**slurmdbd_add_clusters**](SlurmApi.md#slurmdbd_add_clusters) | **POST** /slurmdb/v0.0.37/clusters | Add clusters
[**slurmdbd_add_wckeys**](SlurmApi.md#slurmdbd_add_wckeys) | **POST** /slurmdb/v0.0.37/wckeys | Add wckeys
[**slurmdbd_delete_account**](SlurmApi.md#slurmdbd_delete_account) | **DELETE** /slurmdb/v0.0.37/account/{account_name} | Delete account
[**slurmdbd_delete_association**](SlurmApi.md#slurmdbd_delete_association) | **DELETE** /slurmdb/v0.0.37/association | Delete association
[**slurmdbd_delete_cluster**](SlurmApi.md#slurmdbd_delete_cluster) | **DELETE** /slurmdb/v0.0.37/cluster/{cluster_name} | Delete cluster
[**slurmdbd_delete_qos**](SlurmApi.md#slurmdbd_delete_qos) | **DELETE** /slurmdb/v0.0.37/qos/{qos_name} | Delete QOS
[**slurmdbd_delete_user**](SlurmApi.md#slurmdbd_delete_user) | **DELETE** /slurmdb/v0.0.37/user/{user_name} | Delete user
[**slurmdbd_delete_wckey**](SlurmApi.md#slurmdbd_delete_wckey) | **DELETE** /slurmdb/v0.0.37/wckey/{wckey} | Delete wckey
[**slurmdbd_diag**](SlurmApi.md#slurmdbd_diag) | **GET** /slurmdb/v0.0.37/diag | Get slurmdb diagnostics
[**slurmdbd_get_account**](SlurmApi.md#slurmdbd_get_account) | **GET** /slurmdb/v0.0.37/account/{account_name} | Get account info
[**slurmdbd_get_accounts**](SlurmApi.md#slurmdbd_get_accounts) | **GET** /slurmdb/v0.0.37/accounts | Get account list
[**slurmdbd_get_association**](SlurmApi.md#slurmdbd_get_association) | **GET** /slurmdb/v0.0.37/association | Get association info
[**slurmdbd_get_associations**](SlurmApi.md#slurmdbd_get_associations) | **GET** /slurmdb/v0.0.37/associations | Get association list
[**slurmdbd_get_cluster**](SlurmApi.md#slurmdbd_get_cluster) | **GET** /slurmdb/v0.0.37/cluster/{cluster_name} | Get cluster info
[**slurmdbd_get_clusters**](SlurmApi.md#slurmdbd_get_clusters) | **GET** /slurmdb/v0.0.37/clusters | Get cluster list
[**slurmdbd_get_db_config**](SlurmApi.md#slurmdbd_get_db_config) | **GET** /slurmdb/v0.0.37/config | Dump all configuration information
[**slurmdbd_get_job**](SlurmApi.md#slurmdbd_get_job) | **GET** /slurmdb/v0.0.37/job/{job_id} | Get job info
[**slurmdbd_get_jobs**](SlurmApi.md#slurmdbd_get_jobs) | **GET** /slurmdb/v0.0.37/jobs | Get job list
[**slurmdbd_get_qos**](SlurmApi.md#slurmdbd_get_qos) | **GET** /slurmdb/v0.0.37/qos | Get QOS list
[**slurmdbd_get_single_qos**](SlurmApi.md#slurmdbd_get_single_qos) | **GET** /slurmdb/v0.0.37/qos/{qos_name} | Get QOS info
[**slurmdbd_get_tres**](SlurmApi.md#slurmdbd_get_tres) | **GET** /slurmdb/v0.0.37/tres | Get TRES info
[**slurmdbd_get_user**](SlurmApi.md#slurmdbd_get_user) | **GET** /slurmdb/v0.0.37/user/{user_name} | Get user info
[**slurmdbd_get_users**](SlurmApi.md#slurmdbd_get_users) | **GET** /slurmdb/v0.0.37/users | Get user list
[**slurmdbd_get_wckey**](SlurmApi.md#slurmdbd_get_wckey) | **GET** /slurmdb/v0.0.37/wckey/{wckey} | Get wckey info
[**slurmdbd_get_wckeys**](SlurmApi.md#slurmdbd_get_wckeys) | **GET** /slurmdb/v0.0.37/wckeys | Get wckey list
[**slurmdbd_set_db_config**](SlurmApi.md#slurmdbd_set_db_config) | **POST** /slurmdb/v0.0.37/config | Load all configuration information
[**slurmdbd_update_account**](SlurmApi.md#slurmdbd_update_account) | **POST** /slurmdb/v0.0.37/accounts | Update accounts
[**slurmdbd_update_associations**](SlurmApi.md#slurmdbd_update_associations) | **POST** /slurmdb/v0.0.37/associations | Set associations info
[**slurmdbd_update_tres**](SlurmApi.md#slurmdbd_update_tres) | **POST** /slurmdb/v0.0.37/tres | Set TRES info
[**slurmdbd_update_users**](SlurmApi.md#slurmdbd_update_users) | **POST** /slurmdb/v0.0.37/users | Update user


# **slurmctld_cancel_job**
> slurmctld_cancel_job(job_id, signal=signal)

cancel or signal job

### Example

* Api Key Authentication (user):
* Api Key Authentication (token):
```python
import time
import os
import openapi_client
from openapi_client.models.v0037_signal import V0037Signal
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: user
configuration.api_key['user'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['user'] = 'Bearer'

# Configure API key authorization: token
configuration.api_key['token'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.SlurmApi(api_client)
    job_id = 'job_id_example' # str | Slurm Job ID
    signal = openapi_client.V0037Signal() # V0037Signal | signal to send to job (optional)

    try:
        # cancel or signal job
        api_instance.slurmctld_cancel_job(job_id, signal=signal)
    except Exception as e:
        print("Exception when calling SlurmApi->slurmctld_cancel_job: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **job_id** | **str**| Slurm Job ID | 
 **signal** | [**V0037Signal**](.md)| signal to send to job | [optional] 

### Return type

void (empty response body)

### Authorization

[user](../README.md#user), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | job cancelled or sent signal |  -  |
**500** | job not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **slurmctld_diag**
> V0037Diag slurmctld_diag()

get diagnostics

### Example

* Api Key Authentication (user):
* Api Key Authentication (token):
```python
import time
import os
import openapi_client
from openapi_client.models.v0037_diag import V0037Diag
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: user
configuration.api_key['user'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['user'] = 'Bearer'

# Configure API key authorization: token
configuration.api_key['token'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.SlurmApi(api_client)

    try:
        # get diagnostics
        api_response = api_instance.slurmctld_diag()
        print("The response of SlurmApi->slurmctld_diag:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SlurmApi->slurmctld_diag: %s\n" % e)
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
**200** | diagnostic results |  -  |
**0** | unable to request ping test |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **slurmctld_get_job**
> V0037JobsResponse slurmctld_get_job(job_id)

get job info

### Example

* Api Key Authentication (user):
* Api Key Authentication (token):
```python
import time
import os
import openapi_client
from openapi_client.models.v0037_jobs_response import V0037JobsResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: user
configuration.api_key['user'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['user'] = 'Bearer'

# Configure API key authorization: token
configuration.api_key['token'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.SlurmApi(api_client)
    job_id = 'job_id_example' # str | Slurm JobID

    try:
        # get job info
        api_response = api_instance.slurmctld_get_job(job_id)
        print("The response of SlurmApi->slurmctld_get_job:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SlurmApi->slurmctld_get_job: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **job_id** | **str**| Slurm JobID | 

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
**200** | job(s) information |  -  |
**0** | job matching JobId not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **slurmctld_get_jobs**
> V0037JobsResponse slurmctld_get_jobs(update_time=update_time)

get list of jobs

### Example

* Api Key Authentication (user):
* Api Key Authentication (token):
```python
import time
import os
import openapi_client
from openapi_client.models.v0037_jobs_response import V0037JobsResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: user
configuration.api_key['user'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['user'] = 'Bearer'

# Configure API key authorization: token
configuration.api_key['token'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.SlurmApi(api_client)
    update_time = 56 # int | Filter if changed since update_time. Use of this parameter can result in faster replies. (optional)

    try:
        # get list of jobs
        api_response = api_instance.slurmctld_get_jobs(update_time=update_time)
        print("The response of SlurmApi->slurmctld_get_jobs:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SlurmApi->slurmctld_get_jobs: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_time** | **int**| Filter if changed since update_time. Use of this parameter can result in faster replies. | [optional] 

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
**200** | job(s) information |  -  |
**0** | job not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **slurmctld_get_node**
> V0037NodesResponse slurmctld_get_node(node_name)

get node info

### Example

* Api Key Authentication (user):
* Api Key Authentication (token):
```python
import time
import os
import openapi_client
from openapi_client.models.v0037_nodes_response import V0037NodesResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: user
configuration.api_key['user'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['user'] = 'Bearer'

# Configure API key authorization: token
configuration.api_key['token'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.SlurmApi(api_client)
    node_name = 'node_name_example' # str | Slurm Node Name

    try:
        # get node info
        api_response = api_instance.slurmctld_get_node(node_name)
        print("The response of SlurmApi->slurmctld_get_node:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SlurmApi->slurmctld_get_node: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **node_name** | **str**| Slurm Node Name | 

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
**200** | node information |  -  |
**0** | node not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **slurmctld_get_nodes**
> V0037NodesResponse slurmctld_get_nodes(update_time=update_time)

get all node info

### Example

* Api Key Authentication (user):
* Api Key Authentication (token):
```python
import time
import os
import openapi_client
from openapi_client.models.v0037_nodes_response import V0037NodesResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: user
configuration.api_key['user'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['user'] = 'Bearer'

# Configure API key authorization: token
configuration.api_key['token'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.SlurmApi(api_client)
    update_time = 56 # int | Filter if changed since update_time. Use of this parameter can result in faster replies. (optional)

    try:
        # get all node info
        api_response = api_instance.slurmctld_get_nodes(update_time=update_time)
        print("The response of SlurmApi->slurmctld_get_nodes:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SlurmApi->slurmctld_get_nodes: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_time** | **int**| Filter if changed since update_time. Use of this parameter can result in faster replies. | [optional] 

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
**200** | node information |  -  |
**0** | no nodes in cluster |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **slurmctld_get_partition**
> V0037PartitionsResponse slurmctld_get_partition(partition_name, update_time=update_time)

get partition info

### Example

* Api Key Authentication (user):
* Api Key Authentication (token):
```python
import time
import os
import openapi_client
from openapi_client.models.v0037_partitions_response import V0037PartitionsResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: user
configuration.api_key['user'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['user'] = 'Bearer'

# Configure API key authorization: token
configuration.api_key['token'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.SlurmApi(api_client)
    partition_name = 'partition_name_example' # str | Slurm Partition Name
    update_time = 56 # int | Filter if there were no partition changes (not limited to partition in URL endpoint) since update_time. (optional)

    try:
        # get partition info
        api_response = api_instance.slurmctld_get_partition(partition_name, update_time=update_time)
        print("The response of SlurmApi->slurmctld_get_partition:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SlurmApi->slurmctld_get_partition: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **partition_name** | **str**| Slurm Partition Name | 
 **update_time** | **int**| Filter if there were no partition changes (not limited to partition in URL endpoint) since update_time. | [optional] 

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
**200** | partition information |  -  |
**0** | no partitions found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **slurmctld_get_partitions**
> V0037PartitionsResponse slurmctld_get_partitions(update_time=update_time)

get all partition info

### Example

* Api Key Authentication (user):
* Api Key Authentication (token):
```python
import time
import os
import openapi_client
from openapi_client.models.v0037_partitions_response import V0037PartitionsResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: user
configuration.api_key['user'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['user'] = 'Bearer'

# Configure API key authorization: token
configuration.api_key['token'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.SlurmApi(api_client)
    update_time = 56 # int | Filter if changed since update_time. Use of this parameter can result in faster replies. (optional)

    try:
        # get all partition info
        api_response = api_instance.slurmctld_get_partitions(update_time=update_time)
        print("The response of SlurmApi->slurmctld_get_partitions:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SlurmApi->slurmctld_get_partitions: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_time** | **int**| Filter if changed since update_time. Use of this parameter can result in faster replies. | [optional] 

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
**200** | partition information |  -  |
**0** | no partitions found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **slurmctld_get_reservation**
> V0037ReservationsResponse slurmctld_get_reservation(reservation_name, update_time=update_time)

get reservation info

### Example

* Api Key Authentication (user):
* Api Key Authentication (token):
```python
import time
import os
import openapi_client
from openapi_client.models.v0037_reservations_response import V0037ReservationsResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: user
configuration.api_key['user'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['user'] = 'Bearer'

# Configure API key authorization: token
configuration.api_key['token'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.SlurmApi(api_client)
    reservation_name = 'reservation_name_example' # str | Slurm Reservation Name
    update_time = 56 # int | Filter if no reservation (not limited to reservation in URL) changed since update_time. (optional)

    try:
        # get reservation info
        api_response = api_instance.slurmctld_get_reservation(reservation_name, update_time=update_time)
        print("The response of SlurmApi->slurmctld_get_reservation:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SlurmApi->slurmctld_get_reservation: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reservation_name** | **str**| Slurm Reservation Name | 
 **update_time** | **int**| Filter if no reservation (not limited to reservation in URL) changed since update_time. | [optional] 

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
**200** | reservation information |  -  |
**0** | no reservations found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **slurmctld_get_reservations**
> V0037ReservationsResponse slurmctld_get_reservations(update_time=update_time)

get all reservation info

### Example

* Api Key Authentication (user):
* Api Key Authentication (token):
```python
import time
import os
import openapi_client
from openapi_client.models.v0037_reservations_response import V0037ReservationsResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: user
configuration.api_key['user'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['user'] = 'Bearer'

# Configure API key authorization: token
configuration.api_key['token'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.SlurmApi(api_client)
    update_time = 56 # int | Filter if changed since update_time. Use of this parameter can result in faster replies. (optional)

    try:
        # get all reservation info
        api_response = api_instance.slurmctld_get_reservations(update_time=update_time)
        print("The response of SlurmApi->slurmctld_get_reservations:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SlurmApi->slurmctld_get_reservations: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_time** | **int**| Filter if changed since update_time. Use of this parameter can result in faster replies. | [optional] 

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
**200** | reservation information |  -  |
**0** | no reservations found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **slurmctld_ping**
> V0037Pings slurmctld_ping()

ping test

### Example

* Api Key Authentication (user):
* Api Key Authentication (token):
```python
import time
import os
import openapi_client
from openapi_client.models.v0037_pings import V0037Pings
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: user
configuration.api_key['user'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['user'] = 'Bearer'

# Configure API key authorization: token
configuration.api_key['token'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.SlurmApi(api_client)

    try:
        # ping test
        api_response = api_instance.slurmctld_ping()
        print("The response of SlurmApi->slurmctld_ping:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SlurmApi->slurmctld_ping: %s\n" % e)
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
**200** | results of ping test |  -  |
**0** | unable to request ping test |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **slurmctld_submit_job**
> V0037JobSubmissionResponse slurmctld_submit_job(v0037_job_submission)

submit new job

### Example

* Api Key Authentication (user):
* Api Key Authentication (token):
```python
import time
import os
import openapi_client
from openapi_client.models.v0037_job_submission import V0037JobSubmission
from openapi_client.models.v0037_job_submission_response import V0037JobSubmissionResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: user
configuration.api_key['user'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['user'] = 'Bearer'

# Configure API key authorization: token
configuration.api_key['token'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.SlurmApi(api_client)
    v0037_job_submission = openapi_client.V0037JobSubmission() # V0037JobSubmission | submit new job

    try:
        # submit new job
        api_response = api_instance.slurmctld_submit_job(v0037_job_submission)
        print("The response of SlurmApi->slurmctld_submit_job:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SlurmApi->slurmctld_submit_job: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **v0037_job_submission** | [**V0037JobSubmission**](V0037JobSubmission.md)| submit new job | 

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
**200** | job submitted |  -  |
**0** | job rejected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **slurmctld_update_job**
> slurmctld_update_job(job_id, v0037_job_properties)

update job

### Example

* Api Key Authentication (user):
* Api Key Authentication (token):
```python
import time
import os
import openapi_client
from openapi_client.models.v0037_job_properties import V0037JobProperties
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: user
configuration.api_key['user'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['user'] = 'Bearer'

# Configure API key authorization: token
configuration.api_key['token'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.SlurmApi(api_client)
    job_id = 'job_id_example' # str | Slurm Job ID
    v0037_job_properties = openapi_client.V0037JobProperties() # V0037JobProperties | update job

    try:
        # update job
        api_instance.slurmctld_update_job(job_id, v0037_job_properties)
    except Exception as e:
        print("Exception when calling SlurmApi->slurmctld_update_job: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **job_id** | **str**| Slurm Job ID | 
 **v0037_job_properties** | [**V0037JobProperties**](V0037JobProperties.md)| update job | 

### Return type

void (empty response body)

### Authorization

[user](../README.md#user), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json, application/x-yaml
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | job information |  -  |
**500** | job not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **slurmdbd_add_clusters**
> Dbv0037ResponseClusterAdd slurmdbd_add_clusters()

Add clusters

### Example

* Api Key Authentication (user):
* Api Key Authentication (token):
```python
import time
import os
import openapi_client
from openapi_client.models.dbv0037_response_cluster_add import Dbv0037ResponseClusterAdd
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: user
configuration.api_key['user'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['user'] = 'Bearer'

# Configure API key authorization: token
configuration.api_key['token'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.SlurmApi(api_client)

    try:
        # Add clusters
        api_response = api_instance.slurmdbd_add_clusters()
        print("The response of SlurmApi->slurmdbd_add_clusters:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SlurmApi->slurmdbd_add_clusters: %s\n" % e)
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
**200** | List of clusters |  -  |
**0** | Unable to add cluster |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **slurmdbd_add_wckeys**
> Dbv0037ResponseWckeyAdd slurmdbd_add_wckeys()

Add wckeys

### Example

* Api Key Authentication (user):
* Api Key Authentication (token):
```python
import time
import os
import openapi_client
from openapi_client.models.dbv0037_response_wckey_add import Dbv0037ResponseWckeyAdd
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: user
configuration.api_key['user'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['user'] = 'Bearer'

# Configure API key authorization: token
configuration.api_key['token'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.SlurmApi(api_client)

    try:
        # Add wckeys
        api_response = api_instance.slurmdbd_add_wckeys()
        print("The response of SlurmApi->slurmdbd_add_wckeys:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SlurmApi->slurmdbd_add_wckeys: %s\n" % e)
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
**200** | List of wckeys |  -  |
**0** | Unable to add wckey |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **slurmdbd_delete_account**
> Dbv0037ResponseAccountDelete slurmdbd_delete_account(account_name)

Delete account

### Example

* Api Key Authentication (user):
* Api Key Authentication (token):
```python
import time
import os
import openapi_client
from openapi_client.models.dbv0037_response_account_delete import Dbv0037ResponseAccountDelete
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: user
configuration.api_key['user'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['user'] = 'Bearer'

# Configure API key authorization: token
configuration.api_key['token'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.SlurmApi(api_client)
    account_name = 'account_name_example' # str | Slurm Account Name

    try:
        # Delete account
        api_response = api_instance.slurmdbd_delete_account(account_name)
        print("The response of SlurmApi->slurmdbd_delete_account:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SlurmApi->slurmdbd_delete_account: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_name** | **str**| Slurm Account Name | 

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
**200** | Delete account |  -  |
**0** | Unable to delete account |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **slurmdbd_delete_association**
> Dbv0037ResponseAssociationDelete slurmdbd_delete_association(account, user, cluster=cluster, partition=partition)

Delete association

### Example

* Api Key Authentication (user):
* Api Key Authentication (token):
```python
import time
import os
import openapi_client
from openapi_client.models.dbv0037_response_association_delete import Dbv0037ResponseAssociationDelete
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: user
configuration.api_key['user'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['user'] = 'Bearer'

# Configure API key authorization: token
configuration.api_key['token'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.SlurmApi(api_client)
    account = 'account_example' # str | Account name
    user = 'user_example' # str | User name
    cluster = 'cluster_example' # str | Cluster name (optional)
    partition = 'partition_example' # str | Partition Name (optional)

    try:
        # Delete association
        api_response = api_instance.slurmdbd_delete_association(account, user, cluster=cluster, partition=partition)
        print("The response of SlurmApi->slurmdbd_delete_association:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SlurmApi->slurmdbd_delete_association: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | **str**| Account name | 
 **user** | **str**| User name | 
 **cluster** | **str**| Cluster name | [optional] 
 **partition** | **str**| Partition Name | [optional] 

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
**200** | Delete associations |  -  |
**0** | Association not found or unable to delete association |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **slurmdbd_delete_cluster**
> Dbv0037ResponseClusterDelete slurmdbd_delete_cluster(cluster_name)

Delete cluster

### Example

* Api Key Authentication (user):
* Api Key Authentication (token):
```python
import time
import os
import openapi_client
from openapi_client.models.dbv0037_response_cluster_delete import Dbv0037ResponseClusterDelete
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: user
configuration.api_key['user'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['user'] = 'Bearer'

# Configure API key authorization: token
configuration.api_key['token'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.SlurmApi(api_client)
    cluster_name = 'cluster_name_example' # str | Slurm cluster name

    try:
        # Delete cluster
        api_response = api_instance.slurmdbd_delete_cluster(cluster_name)
        print("The response of SlurmApi->slurmdbd_delete_cluster:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SlurmApi->slurmdbd_delete_cluster: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cluster_name** | **str**| Slurm cluster name | 

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
**200** | Delete cluster |  -  |
**0** | Cluster not found or unable to delete cluster |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **slurmdbd_delete_qos**
> Dbv0037ResponseQosDelete slurmdbd_delete_qos(qos_name)

Delete QOS

### Example

* Api Key Authentication (user):
* Api Key Authentication (token):
```python
import time
import os
import openapi_client
from openapi_client.models.dbv0037_response_qos_delete import Dbv0037ResponseQosDelete
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: user
configuration.api_key['user'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['user'] = 'Bearer'

# Configure API key authorization: token
configuration.api_key['token'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.SlurmApi(api_client)
    qos_name = 'qos_name_example' # str | Slurm QOS Name

    try:
        # Delete QOS
        api_response = api_instance.slurmdbd_delete_qos(qos_name)
        print("The response of SlurmApi->slurmdbd_delete_qos:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SlurmApi->slurmdbd_delete_qos: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qos_name** | **str**| Slurm QOS Name | 

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
**200** | Delete qos |  -  |
**0** | Unable to delete QOS |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **slurmdbd_delete_user**
> Dbv0037ResponseUserDelete slurmdbd_delete_user(user_name)

Delete user

### Example

* Api Key Authentication (user):
* Api Key Authentication (token):
```python
import time
import os
import openapi_client
from openapi_client.models.dbv0037_response_user_delete import Dbv0037ResponseUserDelete
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: user
configuration.api_key['user'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['user'] = 'Bearer'

# Configure API key authorization: token
configuration.api_key['token'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.SlurmApi(api_client)
    user_name = 'user_name_example' # str | Slurm User Name

    try:
        # Delete user
        api_response = api_instance.slurmdbd_delete_user(user_name)
        print("The response of SlurmApi->slurmdbd_delete_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SlurmApi->slurmdbd_delete_user: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_name** | **str**| Slurm User Name | 

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
**200** | Delete user |  -  |
**0** | User not found or unable to delete user |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **slurmdbd_delete_wckey**
> Dbv0037ResponseWckeyDelete slurmdbd_delete_wckey(wckey)

Delete wckey

### Example

* Api Key Authentication (user):
* Api Key Authentication (token):
```python
import time
import os
import openapi_client
from openapi_client.models.dbv0037_response_wckey_delete import Dbv0037ResponseWckeyDelete
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: user
configuration.api_key['user'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['user'] = 'Bearer'

# Configure API key authorization: token
configuration.api_key['token'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.SlurmApi(api_client)
    wckey = 'wckey_example' # str | Slurm wckey name

    try:
        # Delete wckey
        api_response = api_instance.slurmdbd_delete_wckey(wckey)
        print("The response of SlurmApi->slurmdbd_delete_wckey:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SlurmApi->slurmdbd_delete_wckey: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wckey** | **str**| Slurm wckey name | 

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
**200** | Delete wckey |  -  |
**0** | wckey not found or unable to delete wckey |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **slurmdbd_diag**
> Dbv0037Diag slurmdbd_diag()

Get slurmdb diagnostics

### Example

* Api Key Authentication (user):
* Api Key Authentication (token):
```python
import time
import os
import openapi_client
from openapi_client.models.dbv0037_diag import Dbv0037Diag
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: user
configuration.api_key['user'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['user'] = 'Bearer'

# Configure API key authorization: token
configuration.api_key['token'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.SlurmApi(api_client)

    try:
        # Get slurmdb diagnostics
        api_response = api_instance.slurmdbd_diag()
        print("The response of SlurmApi->slurmdbd_diag:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SlurmApi->slurmdbd_diag: %s\n" % e)
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
**200** | Dictionary of statistics |  -  |
**0** | Unable to query diagnostics |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **slurmdbd_get_account**
> Dbv0037AccountInfo slurmdbd_get_account(account_name)

Get account info

### Example

* Api Key Authentication (user):
* Api Key Authentication (token):
```python
import time
import os
import openapi_client
from openapi_client.models.dbv0037_account_info import Dbv0037AccountInfo
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: user
configuration.api_key['user'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['user'] = 'Bearer'

# Configure API key authorization: token
configuration.api_key['token'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.SlurmApi(api_client)
    account_name = 'account_name_example' # str | Slurm Account Name

    try:
        # Get account info
        api_response = api_instance.slurmdbd_get_account(account_name)
        print("The response of SlurmApi->slurmdbd_get_account:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SlurmApi->slurmdbd_get_account: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_name** | **str**| Slurm Account Name | 

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
**200** | List of accounts |  -  |
**0** | Account not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **slurmdbd_get_accounts**
> Dbv0037AccountInfo slurmdbd_get_accounts()

Get account list

### Example

* Api Key Authentication (user):
* Api Key Authentication (token):
```python
import time
import os
import openapi_client
from openapi_client.models.dbv0037_account_info import Dbv0037AccountInfo
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: user
configuration.api_key['user'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['user'] = 'Bearer'

# Configure API key authorization: token
configuration.api_key['token'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.SlurmApi(api_client)

    try:
        # Get account list
        api_response = api_instance.slurmdbd_get_accounts()
        print("The response of SlurmApi->slurmdbd_get_accounts:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SlurmApi->slurmdbd_get_accounts: %s\n" % e)
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
**200** | List of accounts |  -  |
**0** | Account not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **slurmdbd_get_association**
> Dbv0037AssociationsInfo slurmdbd_get_association(cluster=cluster, account=account, user=user, partition=partition)

Get association info

### Example

* Api Key Authentication (user):
* Api Key Authentication (token):
```python
import time
import os
import openapi_client
from openapi_client.models.dbv0037_associations_info import Dbv0037AssociationsInfo
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: user
configuration.api_key['user'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['user'] = 'Bearer'

# Configure API key authorization: token
configuration.api_key['token'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.SlurmApi(api_client)
    cluster = 'cluster_example' # str | Cluster name (optional)
    account = 'account_example' # str | Account name (optional)
    user = 'user_example' # str | User name (optional)
    partition = 'partition_example' # str | Partition Name (optional)

    try:
        # Get association info
        api_response = api_instance.slurmdbd_get_association(cluster=cluster, account=account, user=user, partition=partition)
        print("The response of SlurmApi->slurmdbd_get_association:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SlurmApi->slurmdbd_get_association: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cluster** | **str**| Cluster name | [optional] 
 **account** | **str**| Account name | [optional] 
 **user** | **str**| User name | [optional] 
 **partition** | **str**| Partition Name | [optional] 

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
**200** | List of associations |  -  |
**0** | Association not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **slurmdbd_get_associations**
> Dbv0037AssociationsInfo slurmdbd_get_associations()

Get association list

### Example

* Api Key Authentication (user):
* Api Key Authentication (token):
```python
import time
import os
import openapi_client
from openapi_client.models.dbv0037_associations_info import Dbv0037AssociationsInfo
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: user
configuration.api_key['user'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['user'] = 'Bearer'

# Configure API key authorization: token
configuration.api_key['token'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.SlurmApi(api_client)

    try:
        # Get association list
        api_response = api_instance.slurmdbd_get_associations()
        print("The response of SlurmApi->slurmdbd_get_associations:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SlurmApi->slurmdbd_get_associations: %s\n" % e)
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
**200** | List of associations |  -  |
**0** | Association not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **slurmdbd_get_cluster**
> Dbv0037ClusterInfo slurmdbd_get_cluster(cluster_name)

Get cluster info

### Example

* Api Key Authentication (user):
* Api Key Authentication (token):
```python
import time
import os
import openapi_client
from openapi_client.models.dbv0037_cluster_info import Dbv0037ClusterInfo
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: user
configuration.api_key['user'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['user'] = 'Bearer'

# Configure API key authorization: token
configuration.api_key['token'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.SlurmApi(api_client)
    cluster_name = 'cluster_name_example' # str | Slurm cluster name

    try:
        # Get cluster info
        api_response = api_instance.slurmdbd_get_cluster(cluster_name)
        print("The response of SlurmApi->slurmdbd_get_cluster:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SlurmApi->slurmdbd_get_cluster: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cluster_name** | **str**| Slurm cluster name | 

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
**200** | Cluster information |  -  |
**0** | Cluster not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **slurmdbd_get_clusters**
> Dbv0037ClusterInfo slurmdbd_get_clusters()

Get cluster list

### Example

* Api Key Authentication (user):
* Api Key Authentication (token):
```python
import time
import os
import openapi_client
from openapi_client.models.dbv0037_cluster_info import Dbv0037ClusterInfo
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: user
configuration.api_key['user'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['user'] = 'Bearer'

# Configure API key authorization: token
configuration.api_key['token'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.SlurmApi(api_client)

    try:
        # Get cluster list
        api_response = api_instance.slurmdbd_get_clusters()
        print("The response of SlurmApi->slurmdbd_get_clusters:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SlurmApi->slurmdbd_get_clusters: %s\n" % e)
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
**200** | List of clusters |  -  |
**0** | Cluster not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **slurmdbd_get_db_config**
> Dbv0037ConfigInfo slurmdbd_get_db_config()

Dump all configuration information

### Example

* Api Key Authentication (user):
* Api Key Authentication (token):
```python
import time
import os
import openapi_client
from openapi_client.models.dbv0037_config_info import Dbv0037ConfigInfo
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: user
configuration.api_key['user'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['user'] = 'Bearer'

# Configure API key authorization: token
configuration.api_key['token'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.SlurmApi(api_client)

    try:
        # Dump all configuration information
        api_response = api_instance.slurmdbd_get_db_config()
        print("The response of SlurmApi->slurmdbd_get_db_config:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SlurmApi->slurmdbd_get_db_config: %s\n" % e)
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
**200** | slurmdbd configuration |  -  |
**0** | Unable to dump config |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **slurmdbd_get_job**
> Dbv0037JobInfo slurmdbd_get_job(job_id)

Get job info

This endpoint may return multiple job entries since job_id is not a unique key - only the tuple (cluster, job_id, start_time) is unique. If the requested job_id is a component of a heterogeneous job all components are returned.

### Example

* Api Key Authentication (user):
* Api Key Authentication (token):
```python
import time
import os
import openapi_client
from openapi_client.models.dbv0037_job_info import Dbv0037JobInfo
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: user
configuration.api_key['user'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['user'] = 'Bearer'

# Configure API key authorization: token
configuration.api_key['token'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.SlurmApi(api_client)
    job_id = 56 # int | Slurm Job ID

    try:
        # Get job info
        api_response = api_instance.slurmdbd_get_job(job_id)
        print("The response of SlurmApi->slurmdbd_get_job:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SlurmApi->slurmdbd_get_job: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **job_id** | **int**| Slurm Job ID | 

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
**200** | Job description |  -  |
**0** | Unable to find job |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **slurmdbd_get_jobs**
> Dbv0037JobInfo slurmdbd_get_jobs(submit_time=submit_time, start_time=start_time, end_time=end_time, account=account, association=association, cluster=cluster, constraints=constraints, cpus_max=cpus_max, cpus_min=cpus_min, skip_steps=skip_steps, disable_wait_for_result=disable_wait_for_result, exit_code=exit_code, format=format, group=group, job_name=job_name, nodes_max=nodes_max, nodes_min=nodes_min, partition=partition, qos=qos, reason=reason, reservation=reservation, state=state, step=step, node=node, wckey=wckey)

Get job list

### Example

* Api Key Authentication (user):
* Api Key Authentication (token):
```python
import time
import os
import openapi_client
from openapi_client.models.dbv0037_job_info import Dbv0037JobInfo
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: user
configuration.api_key['user'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['user'] = 'Bearer'

# Configure API key authorization: token
configuration.api_key['token'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.SlurmApi(api_client)
    submit_time = 'submit_time_example' # str | Filter by submission time  Accepted formats:  HH:MM[:SS] [AM|PM]  MMDD[YY] or MM/DD[/YY] or MM.DD[.YY]  MM/DD[/YY]-HH:MM[:SS]  YYYY-MM-DD[THH:MM[:SS]] (optional)
    start_time = 'start_time_example' # str | Filter by start time  Accepted formats:  HH:MM[:SS] [AM|PM]  MMDD[YY] or MM/DD[/YY] or MM.DD[.YY]  MM/DD[/YY]-HH:MM[:SS]  YYYY-MM-DD[THH:MM[:SS]] (optional)
    end_time = 'end_time_example' # str | Filter by end time  Accepted formats:  HH:MM[:SS] [AM|PM]  MMDD[YY] or MM/DD[/YY] or MM.DD[.YY]  MM/DD[/YY]-HH:MM[:SS]  YYYY-MM-DD[THH:MM[:SS]] (optional)
    account = 'account_example' # str | Comma delimited list of accounts to match (optional)
    association = 'association_example' # str | Comma delimited list of associations to match (optional)
    cluster = 'cluster_example' # str | Comma delimited list of cluster to match (optional)
    constraints = 'constraints_example' # str | Comma delimited list of constraints to match (optional)
    cpus_max = 'cpus_max_example' # str | Number of CPUs high range (optional)
    cpus_min = 'cpus_min_example' # str | Number of CPUs low range (optional)
    skip_steps = True # bool | Report job step information (optional)
    disable_wait_for_result = True # bool | Disable waiting for result from slurmdbd (optional)
    exit_code = 'exit_code_example' # str | Exit code of job (optional)
    format = 'format_example' # str | Comma delimited list of formats to match (optional)
    group = 'group_example' # str | Comma delimited list of groups to match (optional)
    job_name = 'job_name_example' # str | Comma delimited list of job names to match (optional)
    nodes_max = 'nodes_max_example' # str | Number of nodes high range (optional)
    nodes_min = 'nodes_min_example' # str | Number of nodes low range (optional)
    partition = 'partition_example' # str | Comma delimited list of partitions to match (optional)
    qos = 'qos_example' # str | Comma delimited list of QOS to match (optional)
    reason = 'reason_example' # str | Comma delimited list of job reasons to match (optional)
    reservation = 'reservation_example' # str | Comma delimited list of reservations to match (optional)
    state = 'state_example' # str | Comma delimited list of states to match (optional)
    step = 'step_example' # str | Comma delimited list of job steps to match (optional)
    node = 'node_example' # str | Comma delimited list of used nodes to match (optional)
    wckey = 'wckey_example' # str | Comma delimited list of wckeys to match (optional)

    try:
        # Get job list
        api_response = api_instance.slurmdbd_get_jobs(submit_time=submit_time, start_time=start_time, end_time=end_time, account=account, association=association, cluster=cluster, constraints=constraints, cpus_max=cpus_max, cpus_min=cpus_min, skip_steps=skip_steps, disable_wait_for_result=disable_wait_for_result, exit_code=exit_code, format=format, group=group, job_name=job_name, nodes_max=nodes_max, nodes_min=nodes_min, partition=partition, qos=qos, reason=reason, reservation=reservation, state=state, step=step, node=node, wckey=wckey)
        print("The response of SlurmApi->slurmdbd_get_jobs:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SlurmApi->slurmdbd_get_jobs: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **submit_time** | **str**| Filter by submission time  Accepted formats:  HH:MM[:SS] [AM|PM]  MMDD[YY] or MM/DD[/YY] or MM.DD[.YY]  MM/DD[/YY]-HH:MM[:SS]  YYYY-MM-DD[THH:MM[:SS]] | [optional] 
 **start_time** | **str**| Filter by start time  Accepted formats:  HH:MM[:SS] [AM|PM]  MMDD[YY] or MM/DD[/YY] or MM.DD[.YY]  MM/DD[/YY]-HH:MM[:SS]  YYYY-MM-DD[THH:MM[:SS]] | [optional] 
 **end_time** | **str**| Filter by end time  Accepted formats:  HH:MM[:SS] [AM|PM]  MMDD[YY] or MM/DD[/YY] or MM.DD[.YY]  MM/DD[/YY]-HH:MM[:SS]  YYYY-MM-DD[THH:MM[:SS]] | [optional] 
 **account** | **str**| Comma delimited list of accounts to match | [optional] 
 **association** | **str**| Comma delimited list of associations to match | [optional] 
 **cluster** | **str**| Comma delimited list of cluster to match | [optional] 
 **constraints** | **str**| Comma delimited list of constraints to match | [optional] 
 **cpus_max** | **str**| Number of CPUs high range | [optional] 
 **cpus_min** | **str**| Number of CPUs low range | [optional] 
 **skip_steps** | **bool**| Report job step information | [optional] 
 **disable_wait_for_result** | **bool**| Disable waiting for result from slurmdbd | [optional] 
 **exit_code** | **str**| Exit code of job | [optional] 
 **format** | **str**| Comma delimited list of formats to match | [optional] 
 **group** | **str**| Comma delimited list of groups to match | [optional] 
 **job_name** | **str**| Comma delimited list of job names to match | [optional] 
 **nodes_max** | **str**| Number of nodes high range | [optional] 
 **nodes_min** | **str**| Number of nodes low range | [optional] 
 **partition** | **str**| Comma delimited list of partitions to match | [optional] 
 **qos** | **str**| Comma delimited list of QOS to match | [optional] 
 **reason** | **str**| Comma delimited list of job reasons to match | [optional] 
 **reservation** | **str**| Comma delimited list of reservations to match | [optional] 
 **state** | **str**| Comma delimited list of states to match | [optional] 
 **step** | **str**| Comma delimited list of job steps to match | [optional] 
 **node** | **str**| Comma delimited list of used nodes to match | [optional] 
 **wckey** | **str**| Comma delimited list of wckeys to match | [optional] 

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
**200** | List of jobs |  -  |
**0** | Unable to query jobs |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **slurmdbd_get_qos**
> Dbv0037QosInfo slurmdbd_get_qos()

Get QOS list

### Example

* Api Key Authentication (user):
* Api Key Authentication (token):
```python
import time
import os
import openapi_client
from openapi_client.models.dbv0037_qos_info import Dbv0037QosInfo
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: user
configuration.api_key['user'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['user'] = 'Bearer'

# Configure API key authorization: token
configuration.api_key['token'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.SlurmApi(api_client)

    try:
        # Get QOS list
        api_response = api_instance.slurmdbd_get_qos()
        print("The response of SlurmApi->slurmdbd_get_qos:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SlurmApi->slurmdbd_get_qos: %s\n" % e)
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
**200** | List of QOS&#39; |  -  |
**0** | QOS not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **slurmdbd_get_single_qos**
> Dbv0037QosInfo slurmdbd_get_single_qos(qos_name)

Get QOS info

### Example

* Api Key Authentication (user):
* Api Key Authentication (token):
```python
import time
import os
import openapi_client
from openapi_client.models.dbv0037_qos_info import Dbv0037QosInfo
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: user
configuration.api_key['user'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['user'] = 'Bearer'

# Configure API key authorization: token
configuration.api_key['token'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.SlurmApi(api_client)
    qos_name = 'qos_name_example' # str | Slurm QOS Name

    try:
        # Get QOS info
        api_response = api_instance.slurmdbd_get_single_qos(qos_name)
        print("The response of SlurmApi->slurmdbd_get_single_qos:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SlurmApi->slurmdbd_get_single_qos: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qos_name** | **str**| Slurm QOS Name | 

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
**200** | QOS information |  -  |
**0** | QOS not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **slurmdbd_get_tres**
> Dbv0037TresInfo slurmdbd_get_tres()

Get TRES info

### Example

* Api Key Authentication (user):
* Api Key Authentication (token):
```python
import time
import os
import openapi_client
from openapi_client.models.dbv0037_tres_info import Dbv0037TresInfo
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: user
configuration.api_key['user'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['user'] = 'Bearer'

# Configure API key authorization: token
configuration.api_key['token'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.SlurmApi(api_client)

    try:
        # Get TRES info
        api_response = api_instance.slurmdbd_get_tres()
        print("The response of SlurmApi->slurmdbd_get_tres:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SlurmApi->slurmdbd_get_tres: %s\n" % e)
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
**200** | List of TRES |  -  |
**0** | Unable to retrieve TRES |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **slurmdbd_get_user**
> Dbv0037UserInfo slurmdbd_get_user(user_name)

Get user info

### Example

* Api Key Authentication (user):
* Api Key Authentication (token):
```python
import time
import os
import openapi_client
from openapi_client.models.dbv0037_user_info import Dbv0037UserInfo
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: user
configuration.api_key['user'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['user'] = 'Bearer'

# Configure API key authorization: token
configuration.api_key['token'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.SlurmApi(api_client)
    user_name = 'user_name_example' # str | Slurm User Name

    try:
        # Get user info
        api_response = api_instance.slurmdbd_get_user(user_name)
        print("The response of SlurmApi->slurmdbd_get_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SlurmApi->slurmdbd_get_user: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_name** | **str**| Slurm User Name | 

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
**200** | List of users |  -  |
**0** | User not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **slurmdbd_get_users**
> Dbv0037UserInfo slurmdbd_get_users()

Get user list

### Example

* Api Key Authentication (user):
* Api Key Authentication (token):
```python
import time
import os
import openapi_client
from openapi_client.models.dbv0037_user_info import Dbv0037UserInfo
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: user
configuration.api_key['user'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['user'] = 'Bearer'

# Configure API key authorization: token
configuration.api_key['token'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.SlurmApi(api_client)

    try:
        # Get user list
        api_response = api_instance.slurmdbd_get_users()
        print("The response of SlurmApi->slurmdbd_get_users:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SlurmApi->slurmdbd_get_users: %s\n" % e)
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
**200** | List of users |  -  |
**0** | User not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **slurmdbd_get_wckey**
> Dbv0037WckeyInfo slurmdbd_get_wckey(wckey)

Get wckey info

### Example

* Api Key Authentication (user):
* Api Key Authentication (token):
```python
import time
import os
import openapi_client
from openapi_client.models.dbv0037_wckey_info import Dbv0037WckeyInfo
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: user
configuration.api_key['user'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['user'] = 'Bearer'

# Configure API key authorization: token
configuration.api_key['token'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.SlurmApi(api_client)
    wckey = 'wckey_example' # str | Slurm wckey name

    try:
        # Get wckey info
        api_response = api_instance.slurmdbd_get_wckey(wckey)
        print("The response of SlurmApi->slurmdbd_get_wckey:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SlurmApi->slurmdbd_get_wckey: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wckey** | **str**| Slurm wckey name | 

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
**200** | List of wckey |  -  |
**0** | wckey not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **slurmdbd_get_wckeys**
> Dbv0037WckeyInfo slurmdbd_get_wckeys()

Get wckey list

### Example

* Api Key Authentication (user):
* Api Key Authentication (token):
```python
import time
import os
import openapi_client
from openapi_client.models.dbv0037_wckey_info import Dbv0037WckeyInfo
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: user
configuration.api_key['user'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['user'] = 'Bearer'

# Configure API key authorization: token
configuration.api_key['token'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.SlurmApi(api_client)

    try:
        # Get wckey list
        api_response = api_instance.slurmdbd_get_wckeys()
        print("The response of SlurmApi->slurmdbd_get_wckeys:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SlurmApi->slurmdbd_get_wckeys: %s\n" % e)
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
**200** | List of wckeys |  -  |
**0** | wckey not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **slurmdbd_set_db_config**
> Dbv0037ConfigResponse slurmdbd_set_db_config()

Load all configuration information

### Example

* Api Key Authentication (user):
* Api Key Authentication (token):
```python
import time
import os
import openapi_client
from openapi_client.models.dbv0037_config_response import Dbv0037ConfigResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: user
configuration.api_key['user'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['user'] = 'Bearer'

# Configure API key authorization: token
configuration.api_key['token'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.SlurmApi(api_client)

    try:
        # Load all configuration information
        api_response = api_instance.slurmdbd_set_db_config()
        print("The response of SlurmApi->slurmdbd_set_db_config:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SlurmApi->slurmdbd_set_db_config: %s\n" % e)
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
**200** | Load config |  -  |
**0** | Unable to set config |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **slurmdbd_update_account**
> Dbv0037AccountResponse slurmdbd_update_account()

Update accounts

### Example

* Api Key Authentication (user):
* Api Key Authentication (token):
```python
import time
import os
import openapi_client
from openapi_client.models.dbv0037_account_response import Dbv0037AccountResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: user
configuration.api_key['user'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['user'] = 'Bearer'

# Configure API key authorization: token
configuration.api_key['token'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.SlurmApi(api_client)

    try:
        # Update accounts
        api_response = api_instance.slurmdbd_update_account()
        print("The response of SlurmApi->slurmdbd_update_account:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SlurmApi->slurmdbd_update_account: %s\n" % e)
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
**200** | Add/update list of accounts |  -  |
**0** | Unable to add or update accounts |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **slurmdbd_update_associations**
> Dbv0037ResponseAssociations slurmdbd_update_associations()

Set associations info

### Example

* Api Key Authentication (user):
* Api Key Authentication (token):
```python
import time
import os
import openapi_client
from openapi_client.models.dbv0037_response_associations import Dbv0037ResponseAssociations
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: user
configuration.api_key['user'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['user'] = 'Bearer'

# Configure API key authorization: token
configuration.api_key['token'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.SlurmApi(api_client)

    try:
        # Set associations info
        api_response = api_instance.slurmdbd_update_associations()
        print("The response of SlurmApi->slurmdbd_update_associations:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SlurmApi->slurmdbd_update_associations: %s\n" % e)
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
**200** | status of associations update |  -  |
**0** | Unable to update associations |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **slurmdbd_update_tres**
> Dbv0037ResponseTres slurmdbd_update_tres()

Set TRES info

### Example

* Api Key Authentication (user):
* Api Key Authentication (token):
```python
import time
import os
import openapi_client
from openapi_client.models.dbv0037_response_tres import Dbv0037ResponseTres
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: user
configuration.api_key['user'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['user'] = 'Bearer'

# Configure API key authorization: token
configuration.api_key['token'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.SlurmApi(api_client)

    try:
        # Set TRES info
        api_response = api_instance.slurmdbd_update_tres()
        print("The response of SlurmApi->slurmdbd_update_tres:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SlurmApi->slurmdbd_update_tres: %s\n" % e)
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
**200** | List of TRES |  -  |
**0** | Unable to update TRES |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **slurmdbd_update_users**
> Dbv0037ResponseUserUpdate slurmdbd_update_users()

Update user

### Example

* Api Key Authentication (user):
* Api Key Authentication (token):
```python
import time
import os
import openapi_client
from openapi_client.models.dbv0037_response_user_update import Dbv0037ResponseUserUpdate
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: user
configuration.api_key['user'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['user'] = 'Bearer'

# Configure API key authorization: token
configuration.api_key['token'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.SlurmApi(api_client)

    try:
        # Update user
        api_response = api_instance.slurmdbd_update_users()
        print("The response of SlurmApi->slurmdbd_update_users:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SlurmApi->slurmdbd_update_users: %s\n" % e)
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
**200** | Update users |  -  |
**0** | User not found or not able to update user |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

