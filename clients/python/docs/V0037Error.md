# V0037Error


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error** | **str** | error message | [optional] 
**errno** | **int** | error number | [optional] 

## Example

```python
from openapi_client.models.v0037_error import V0037Error

# TODO update the JSON string below
json = "{}"
# create an instance of V0037Error from a JSON string
v0037_error_instance = V0037Error.from_json(json)
# print the JSON string representation of the object
print V0037Error.to_json()

# convert the object into a dict
v0037_error_dict = v0037_error_instance.to_dict()
# create an instance of V0037Error from a dict
v0037_error_form_dict = v0037_error.from_dict(v0037_error_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


