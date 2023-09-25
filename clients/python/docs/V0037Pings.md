# V0037Pings


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**List[V0037Error]**](V0037Error.md) | slurm errors | [optional] 
**pings** | [**List[V0037Ping]**](V0037Ping.md) | slurm controller pings | [optional] 

## Example

```python
from openapi_client.models.v0037_pings import V0037Pings

# TODO update the JSON string below
json = "{}"
# create an instance of V0037Pings from a JSON string
v0037_pings_instance = V0037Pings.from_json(json)
# print the JSON string representation of the object
print V0037Pings.to_json()

# convert the object into a dict
v0037_pings_dict = v0037_pings_instance.to_dict()
# create an instance of V0037Pings from a dict
v0037_pings_form_dict = v0037_pings.from_dict(v0037_pings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


