# V0037NodeAllocation


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**memory** | **int** | amount of assigned job memory | [optional] 
**cpus** | **object** | amount of assigned job CPUs | [optional] 
**sockets** | **object** | assignment status of each socket by socket id | [optional] 
**cores** | **object** | assignment status of each core by core id | [optional] 

## Example

```python
from openapi_client.models.v0037_node_allocation import V0037NodeAllocation

# TODO update the JSON string below
json = "{}"
# create an instance of V0037NodeAllocation from a JSON string
v0037_node_allocation_instance = V0037NodeAllocation.from_json(json)
# print the JSON string representation of the object
print V0037NodeAllocation.to_json()

# convert the object into a dict
v0037_node_allocation_dict = v0037_node_allocation_instance.to_dict()
# create an instance of V0037NodeAllocation from a dict
v0037_node_allocation_form_dict = v0037_node_allocation.from_dict(v0037_node_allocation_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


