# V0037PartitionsResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**List[V0037Error]**](V0037Error.md) | slurm errors | [optional] 
**partitions** | [**List[V0037Partition]**](V0037Partition.md) | partition info | [optional] 

## Example

```python
from openapi_client.models.v0037_partitions_response import V0037PartitionsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of V0037PartitionsResponse from a JSON string
v0037_partitions_response_instance = V0037PartitionsResponse.from_json(json)
# print the JSON string representation of the object
print V0037PartitionsResponse.to_json()

# convert the object into a dict
v0037_partitions_response_dict = v0037_partitions_response_instance.to_dict()
# create an instance of V0037PartitionsResponse from a dict
v0037_partitions_response_form_dict = v0037_partitions_response.from_dict(v0037_partitions_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


