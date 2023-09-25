# Dbv0037ResponseUserUpdate


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**List[Dbv0037Error]**](Dbv0037Error.md) | Slurm errors | [optional] 

## Example

```python
from openapi_client.models.dbv0037_response_user_update import Dbv0037ResponseUserUpdate

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037ResponseUserUpdate from a JSON string
dbv0037_response_user_update_instance = Dbv0037ResponseUserUpdate.from_json(json)
# print the JSON string representation of the object
print Dbv0037ResponseUserUpdate.to_json()

# convert the object into a dict
dbv0037_response_user_update_dict = dbv0037_response_user_update_instance.to_dict()
# create an instance of Dbv0037ResponseUserUpdate from a dict
dbv0037_response_user_update_form_dict = dbv0037_response_user_update.from_dict(dbv0037_response_user_update_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


