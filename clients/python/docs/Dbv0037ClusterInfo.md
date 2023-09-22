# Dbv0037ClusterInfo


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**controller** | [**Dbv0037ClusterInfoController**](Dbv0037ClusterInfoController.md) |  | [optional] 
**flags** | **List[str]** | List of properties of cluster | [optional] 
**name** | **str** | Cluster name | [optional] 
**nodes** | **str** | Assigned nodes | [optional] 
**select_plugin** | **str** | Configured select plugin | [optional] 
**associations** | [**Dbv0037ClusterInfoAssociations**](Dbv0037ClusterInfoAssociations.md) |  | [optional] 
**rpc_version** | **int** | Number rpc version | [optional] 
**tres** | [**List[Dbv0037ResponseTres]**](Dbv0037ResponseTres.md) | List of TRES in cluster | [optional] 

## Example

```python
from openapi_client.models.dbv0037_cluster_info import Dbv0037ClusterInfo

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037ClusterInfo from a JSON string
dbv0037_cluster_info_instance = Dbv0037ClusterInfo.from_json(json)
# print the JSON string representation of the object
print Dbv0037ClusterInfo.to_json()

# convert the object into a dict
dbv0037_cluster_info_dict = dbv0037_cluster_info_instance.to_dict()
# create an instance of Dbv0037ClusterInfo from a dict
dbv0037_cluster_info_form_dict = dbv0037_cluster_info.from_dict(dbv0037_cluster_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


