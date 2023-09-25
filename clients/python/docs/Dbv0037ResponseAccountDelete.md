# Dbv0037ResponseAccountDelete


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**List[Dbv0037Error]**](Dbv0037Error.md) | Slurm errors | [optional] 

## Example

```python
from openapi_client.models.dbv0037_response_account_delete import Dbv0037ResponseAccountDelete

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037ResponseAccountDelete from a JSON string
dbv0037_response_account_delete_instance = Dbv0037ResponseAccountDelete.from_json(json)
# print the JSON string representation of the object
print Dbv0037ResponseAccountDelete.to_json()

# convert the object into a dict
dbv0037_response_account_delete_dict = dbv0037_response_account_delete_instance.to_dict()
# create an instance of Dbv0037ResponseAccountDelete from a dict
dbv0037_response_account_delete_form_dict = dbv0037_response_account_delete.from_dict(dbv0037_response_account_delete_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


