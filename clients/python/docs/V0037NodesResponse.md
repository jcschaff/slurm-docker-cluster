# V0037NodesResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**List[V0037Error]**](V0037Error.md) | slurm errors | [optional] 
**nodes** | [**List[V0037Node]**](V0037Node.md) | nodes info | [optional] 

## Example

```python
from openapi_client.models.v0037_nodes_response import V0037NodesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of V0037NodesResponse from a JSON string
v0037_nodes_response_instance = V0037NodesResponse.from_json(json)
# print the JSON string representation of the object
print V0037NodesResponse.to_json()

# convert the object into a dict
v0037_nodes_response_dict = v0037_nodes_response_instance.to_dict()
# create an instance of V0037NodesResponse from a dict
v0037_nodes_response_form_dict = v0037_nodes_response.from_dict(v0037_nodes_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


