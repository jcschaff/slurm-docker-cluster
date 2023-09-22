# V0037Diag


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**List[V0037Error]**](V0037Error.md) | slurm errors | [optional] 
**statistics** | [**V0037DiagStatistics**](V0037DiagStatistics.md) |  | [optional] 

## Example

```python
from openapi_client.models.v0037_diag import V0037Diag

# TODO update the JSON string below
json = "{}"
# create an instance of V0037Diag from a JSON string
v0037_diag_instance = V0037Diag.from_json(json)
# print the JSON string representation of the object
print V0037Diag.to_json()

# convert the object into a dict
v0037_diag_dict = v0037_diag_instance.to_dict()
# create an instance of V0037Diag from a dict
v0037_diag_form_dict = v0037_diag.from_dict(v0037_diag_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


