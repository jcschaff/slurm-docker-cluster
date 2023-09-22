# Dbv0037AccountInfo


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**List[Dbv0037Error]**](Dbv0037Error.md) | Slurm errors | [optional] 
**accounts** | [**List[Dbv0037Account]**](Dbv0037Account.md) | List of accounts | [optional] 

## Example

```python
from openapi_client.models.dbv0037_account_info import Dbv0037AccountInfo

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037AccountInfo from a JSON string
dbv0037_account_info_instance = Dbv0037AccountInfo.from_json(json)
# print the JSON string representation of the object
print Dbv0037AccountInfo.to_json()

# convert the object into a dict
dbv0037_account_info_dict = dbv0037_account_info_instance.to_dict()
# create an instance of Dbv0037AccountInfo from a dict
dbv0037_account_info_form_dict = dbv0037_account_info.from_dict(dbv0037_account_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


