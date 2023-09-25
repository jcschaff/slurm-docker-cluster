# Dbv0037ResponseClusterDelete


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**List[Dbv0037Error]**](Dbv0037Error.md) | Slurm errors | [optional] 

## Example

```python
from openapi_client.models.dbv0037_response_cluster_delete import Dbv0037ResponseClusterDelete

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037ResponseClusterDelete from a JSON string
dbv0037_response_cluster_delete_instance = Dbv0037ResponseClusterDelete.from_json(json)
# print the JSON string representation of the object
print Dbv0037ResponseClusterDelete.to_json()

# convert the object into a dict
dbv0037_response_cluster_delete_dict = dbv0037_response_cluster_delete_instance.to_dict()
# create an instance of Dbv0037ResponseClusterDelete from a dict
dbv0037_response_cluster_delete_form_dict = dbv0037_response_cluster_delete.from_dict(dbv0037_response_cluster_delete_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


