# Dbv0037User

User description

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**administrator_level** | **str** | Description of administrator level | [optional] 
**associations** | [**Dbv0037UserAssociations**](Dbv0037UserAssociations.md) |  | [optional] 
**coordinators** | [**List[Dbv0037CoordinatorInfo]**](Dbv0037CoordinatorInfo.md) | List of assigned coordinators | [optional] 
**default** | [**Dbv0037UserDefault**](Dbv0037UserDefault.md) |  | [optional] 
**name** | **str** | User name | [optional] 

## Example

```python
from openapi_client.models.dbv0037_user import Dbv0037User

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037User from a JSON string
dbv0037_user_instance = Dbv0037User.from_json(json)
# print the JSON string representation of the object
print Dbv0037User.to_json()

# convert the object into a dict
dbv0037_user_dict = dbv0037_user_instance.to_dict()
# create an instance of Dbv0037User from a dict
dbv0037_user_form_dict = dbv0037_user.from_dict(dbv0037_user_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


