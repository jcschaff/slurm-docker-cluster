# Dbv0037AssociationMaxTresGroup

Max TRES per group

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**minutes** | [**List[Dbv0037TresListInner]**](Dbv0037TresListInner.md) | TRES list of attributes | [optional] 
**active** | [**List[Dbv0037TresListInner]**](Dbv0037TresListInner.md) | TRES list of attributes | [optional] 

## Example

```python
from openapi_client.models.dbv0037_association_max_tres_group import Dbv0037AssociationMaxTresGroup

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037AssociationMaxTresGroup from a JSON string
dbv0037_association_max_tres_group_instance = Dbv0037AssociationMaxTresGroup.from_json(json)
# print the JSON string representation of the object
print Dbv0037AssociationMaxTresGroup.to_json()

# convert the object into a dict
dbv0037_association_max_tres_group_dict = dbv0037_association_max_tres_group_instance.to_dict()
# create an instance of Dbv0037AssociationMaxTresGroup from a dict
dbv0037_association_max_tres_group_form_dict = dbv0037_association_max_tres_group.from_dict(dbv0037_association_max_tres_group_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


