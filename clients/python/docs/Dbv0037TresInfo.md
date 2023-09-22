# Dbv0037TresInfo


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**List[Dbv0037Error]**](Dbv0037Error.md) | Slurm errors | [optional] 
**tres** | **List[List[Dbv0037TresListInner]]** | Array of tres | [optional] 

## Example

```python
from openapi_client.models.dbv0037_tres_info import Dbv0037TresInfo

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037TresInfo from a JSON string
dbv0037_tres_info_instance = Dbv0037TresInfo.from_json(json)
# print the JSON string representation of the object
print Dbv0037TresInfo.to_json()

# convert the object into a dict
dbv0037_tres_info_dict = dbv0037_tres_info_instance.to_dict()
# create an instance of Dbv0037TresInfo from a dict
dbv0037_tres_info_form_dict = dbv0037_tres_info.from_dict(dbv0037_tres_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


