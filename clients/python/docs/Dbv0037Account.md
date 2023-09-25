# Dbv0037Account

Account description

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**associations** | [**List[Dbv0037AssociationShortInfo]**](Dbv0037AssociationShortInfo.md) | List of assigned associations | [optional] 
**coordinators** | [**List[Dbv0037CoordinatorInfo]**](Dbv0037CoordinatorInfo.md) | List of assigned coordinators | [optional] 
**description** | **str** | Description of account | [optional] 
**name** | **str** | Name of account | [optional] 
**organization** | **str** | Assigned organization of account | [optional] 
**flags** | **List[str]** | List of properties of account | [optional] 

## Example

```python
from openapi_client.models.dbv0037_account import Dbv0037Account

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037Account from a JSON string
dbv0037_account_instance = Dbv0037Account.from_json(json)
# print the JSON string representation of the object
print Dbv0037Account.to_json()

# convert the object into a dict
dbv0037_account_dict = dbv0037_account_instance.to_dict()
# create an instance of Dbv0037Account from a dict
dbv0037_account_form_dict = dbv0037_account.from_dict(dbv0037_account_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


