# Dbv0037WckeyInfo


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**List[Dbv0037Error]**](Dbv0037Error.md) | Slurm errors | [optional] 
**wckeys** | [**List[Dbv0037Wckey]**](Dbv0037Wckey.md) | List of wckeys | [optional] 

## Example

```python
from openapi_client.models.dbv0037_wckey_info import Dbv0037WckeyInfo

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037WckeyInfo from a JSON string
dbv0037_wckey_info_instance = Dbv0037WckeyInfo.from_json(json)
# print the JSON string representation of the object
print Dbv0037WckeyInfo.to_json()

# convert the object into a dict
dbv0037_wckey_info_dict = dbv0037_wckey_info_instance.to_dict()
# create an instance of Dbv0037WckeyInfo from a dict
dbv0037_wckey_info_form_dict = dbv0037_wckey_info.from_dict(dbv0037_wckey_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


