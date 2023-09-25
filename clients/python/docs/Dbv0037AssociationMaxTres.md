# Dbv0037AssociationMaxTres

Max TRES settings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**group** | [**Dbv0037AssociationMaxTresGroup**](Dbv0037AssociationMaxTresGroup.md) |  | [optional] 
**per** | [**Dbv0037AssociationMaxTresPer**](Dbv0037AssociationMaxTresPer.md) |  | [optional] 
**total** | [**List[Dbv0037TresListInner]**](Dbv0037TresListInner.md) | TRES list of attributes | [optional] 
**minutes** | [**Dbv0037AssociationMaxTresMinutes**](Dbv0037AssociationMaxTresMinutes.md) |  | [optional] 

## Example

```python
from openapi_client.models.dbv0037_association_max_tres import Dbv0037AssociationMaxTres

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037AssociationMaxTres from a JSON string
dbv0037_association_max_tres_instance = Dbv0037AssociationMaxTres.from_json(json)
# print the JSON string representation of the object
print Dbv0037AssociationMaxTres.to_json()

# convert the object into a dict
dbv0037_association_max_tres_dict = dbv0037_association_max_tres_instance.to_dict()
# create an instance of Dbv0037AssociationMaxTres from a dict
dbv0037_association_max_tres_form_dict = dbv0037_association_max_tres.from_dict(dbv0037_association_max_tres_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


