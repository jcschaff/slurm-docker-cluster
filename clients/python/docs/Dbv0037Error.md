# Dbv0037Error


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errno** | **int** | Error number | [optional] 
**error** | **str** | Error message | [optional] 

## Example

```python
from openapi_client.models.dbv0037_error import Dbv0037Error

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037Error from a JSON string
dbv0037_error_instance = Dbv0037Error.from_json(json)
# print the JSON string representation of the object
print Dbv0037Error.to_json()

# convert the object into a dict
dbv0037_error_dict = dbv0037_error_instance.to_dict()
# create an instance of Dbv0037Error from a dict
dbv0037_error_form_dict = dbv0037_error.from_dict(dbv0037_error_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


