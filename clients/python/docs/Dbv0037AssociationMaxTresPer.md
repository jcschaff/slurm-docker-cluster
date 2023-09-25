# Dbv0037AssociationMaxTresPer

Max TRES per settings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**job** | [**List[Dbv0037TresListInner]**](Dbv0037TresListInner.md) | TRES list of attributes | [optional] 
**node** | [**List[Dbv0037TresListInner]**](Dbv0037TresListInner.md) | TRES list of attributes | [optional] 

## Example

```python
from openapi_client.models.dbv0037_association_max_tres_per import Dbv0037AssociationMaxTresPer

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037AssociationMaxTresPer from a JSON string
dbv0037_association_max_tres_per_instance = Dbv0037AssociationMaxTresPer.from_json(json)
# print the JSON string representation of the object
print Dbv0037AssociationMaxTresPer.to_json()

# convert the object into a dict
dbv0037_association_max_tres_per_dict = dbv0037_association_max_tres_per_instance.to_dict()
# create an instance of Dbv0037AssociationMaxTresPer from a dict
dbv0037_association_max_tres_per_form_dict = dbv0037_association_max_tres_per.from_dict(dbv0037_association_max_tres_per_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


