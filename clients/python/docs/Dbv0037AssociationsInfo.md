# Dbv0037AssociationsInfo


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**List[Dbv0037Error]**](Dbv0037Error.md) | Slurm errors | [optional] 
**associations** | [**List[Dbv0037Association]**](Dbv0037Association.md) | Array of associations | [optional] 

## Example

```python
from openapi_client.models.dbv0037_associations_info import Dbv0037AssociationsInfo

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037AssociationsInfo from a JSON string
dbv0037_associations_info_instance = Dbv0037AssociationsInfo.from_json(json)
# print the JSON string representation of the object
print Dbv0037AssociationsInfo.to_json()

# convert the object into a dict
dbv0037_associations_info_dict = dbv0037_associations_info_instance.to_dict()
# create an instance of Dbv0037AssociationsInfo from a dict
dbv0037_associations_info_form_dict = dbv0037_associations_info.from_dict(dbv0037_associations_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


