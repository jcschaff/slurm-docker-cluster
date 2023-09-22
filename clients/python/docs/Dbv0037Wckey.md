# Dbv0037Wckey


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accounts** | **List[str]** | List of assigned accounts | [optional] 
**cluster** | **str** | Cluster name | [optional] 
**id** | **int** | wckey database unique id | [optional] 
**name** | **str** | wckey name | [optional] 
**user** | **str** | wckey user | [optional] 
**flags** | **List[str]** | List of properties of wckey | [optional] 

## Example

```python
from openapi_client.models.dbv0037_wckey import Dbv0037Wckey

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037Wckey from a JSON string
dbv0037_wckey_instance = Dbv0037Wckey.from_json(json)
# print the JSON string representation of the object
print Dbv0037Wckey.to_json()

# convert the object into a dict
dbv0037_wckey_dict = dbv0037_wckey_instance.to_dict()
# create an instance of Dbv0037Wckey from a dict
dbv0037_wckey_form_dict = dbv0037_wckey.from_dict(dbv0037_wckey_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


