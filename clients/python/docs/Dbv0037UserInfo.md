# Dbv0037UserInfo


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**List[Dbv0037Error]**](Dbv0037Error.md) | Slurm errors | [optional] 
**users** | [**List[Dbv0037User]**](Dbv0037User.md) | Array of users | [optional] 

## Example

```python
from openapi_client.models.dbv0037_user_info import Dbv0037UserInfo

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037UserInfo from a JSON string
dbv0037_user_info_instance = Dbv0037UserInfo.from_json(json)
# print the JSON string representation of the object
print Dbv0037UserInfo.to_json()

# convert the object into a dict
dbv0037_user_info_dict = dbv0037_user_info_instance.to_dict()
# create an instance of Dbv0037UserInfo from a dict
dbv0037_user_info_form_dict = dbv0037_user_info.from_dict(dbv0037_user_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


