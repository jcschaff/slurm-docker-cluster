# Dbv0037ConfigResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**List[Dbv0037Error]**](Dbv0037Error.md) | Slurm errors | [optional] 

## Example

```python
from openapi_client.models.dbv0037_config_response import Dbv0037ConfigResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037ConfigResponse from a JSON string
dbv0037_config_response_instance = Dbv0037ConfigResponse.from_json(json)
# print the JSON string representation of the object
print Dbv0037ConfigResponse.to_json()

# convert the object into a dict
dbv0037_config_response_dict = dbv0037_config_response_instance.to_dict()
# create an instance of Dbv0037ConfigResponse from a dict
dbv0037_config_response_form_dict = dbv0037_config_response.from_dict(dbv0037_config_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


