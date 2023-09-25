# Dbv0037AssociationMaxTresMinutes

Max TRES minutes settings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**per** | [**Dbv0037AssociationMaxTresMinutesPer**](Dbv0037AssociationMaxTresMinutesPer.md) |  | [optional] 
**total** | [**List[Dbv0037TresListInner]**](Dbv0037TresListInner.md) | TRES list of attributes | [optional] 

## Example

```python
from openapi_client.models.dbv0037_association_max_tres_minutes import Dbv0037AssociationMaxTresMinutes

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037AssociationMaxTresMinutes from a JSON string
dbv0037_association_max_tres_minutes_instance = Dbv0037AssociationMaxTresMinutes.from_json(json)
# print the JSON string representation of the object
print Dbv0037AssociationMaxTresMinutes.to_json()

# convert the object into a dict
dbv0037_association_max_tres_minutes_dict = dbv0037_association_max_tres_minutes_instance.to_dict()
# create an instance of Dbv0037AssociationMaxTresMinutes from a dict
dbv0037_association_max_tres_minutes_form_dict = dbv0037_association_max_tres_minutes.from_dict(dbv0037_association_max_tres_minutes_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


