# V0037Ping


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hostname** | **str** | slurm controller hostname | [optional] 
**ping** | **str** | slurm controller host up | [optional] 
**mode** | **str** | slurm controller mode | [optional] 
**status** | **int** | slurm controller status | [optional] 

## Example

```python
from openapi_client.models.v0037_ping import V0037Ping

# TODO update the JSON string below
json = "{}"
# create an instance of V0037Ping from a JSON string
v0037_ping_instance = V0037Ping.from_json(json)
# print the JSON string representation of the object
print V0037Ping.to_json()

# convert the object into a dict
v0037_ping_dict = v0037_ping_instance.to_dict()
# create an instance of V0037Ping from a dict
v0037_ping_form_dict = v0037_ping.from_dict(v0037_ping_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


