# Dbv0037ConfigInfo


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**List[Dbv0037Error]**](Dbv0037Error.md) | Slurm errors | [optional] 
**tres** | **List[List[Dbv0037TresListInner]]** | Array of TRES | [optional] 
**accounts** | [**List[Dbv0037Account]**](Dbv0037Account.md) | Array of accounts | [optional] 
**associations** | [**List[Dbv0037Association]**](Dbv0037Association.md) | Array of associations | [optional] 
**users** | [**List[Dbv0037User]**](Dbv0037User.md) | Array of users | [optional] 
**qos** | [**List[Dbv0037Qos]**](Dbv0037Qos.md) | Array of qos | [optional] 
**wckeys** | [**List[Dbv0037Wckey]**](Dbv0037Wckey.md) | Array of wckeys | [optional] 

## Example

```python
from openapi_client.models.dbv0037_config_info import Dbv0037ConfigInfo

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037ConfigInfo from a JSON string
dbv0037_config_info_instance = Dbv0037ConfigInfo.from_json(json)
# print the JSON string representation of the object
print Dbv0037ConfigInfo.to_json()

# convert the object into a dict
dbv0037_config_info_dict = dbv0037_config_info_instance.to_dict()
# create an instance of Dbv0037ConfigInfo from a dict
dbv0037_config_info_form_dict = dbv0037_config_info.from_dict(dbv0037_config_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


