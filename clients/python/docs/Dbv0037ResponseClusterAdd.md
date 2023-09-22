# Dbv0037ResponseClusterAdd


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**List[Dbv0037Error]**](Dbv0037Error.md) | Slurm errors | [optional] 

## Example

```python
from openapi_client.models.dbv0037_response_cluster_add import Dbv0037ResponseClusterAdd

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037ResponseClusterAdd from a JSON string
dbv0037_response_cluster_add_instance = Dbv0037ResponseClusterAdd.from_json(json)
# print the JSON string representation of the object
print Dbv0037ResponseClusterAdd.to_json()

# convert the object into a dict
dbv0037_response_cluster_add_dict = dbv0037_response_cluster_add_instance.to_dict()
# create an instance of Dbv0037ResponseClusterAdd from a dict
dbv0037_response_cluster_add_form_dict = dbv0037_response_cluster_add.from_dict(dbv0037_response_cluster_add_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


