# Dbv0037DiagUsersInner

Statistics by user RPCs

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**user** | **str** | User name | [optional] 
**count** | **int** | Number of RPCs | [optional] 
**time** | [**Dbv0037DiagUsersInnerTime**](Dbv0037DiagUsersInnerTime.md) |  | [optional] 

## Example

```python
from openapi_client.models.dbv0037_diag_users_inner import Dbv0037DiagUsersInner

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037DiagUsersInner from a JSON string
dbv0037_diag_users_inner_instance = Dbv0037DiagUsersInner.from_json(json)
# print the JSON string representation of the object
print Dbv0037DiagUsersInner.to_json()

# convert the object into a dict
dbv0037_diag_users_inner_dict = dbv0037_diag_users_inner_instance.to_dict()
# create an instance of Dbv0037DiagUsersInner from a dict
dbv0037_diag_users_inner_form_dict = dbv0037_diag_users_inner.from_dict(dbv0037_diag_users_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


