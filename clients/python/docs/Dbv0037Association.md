# Dbv0037Association

Association description

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_default** | **int** | is default association | [optional] 
**account** | **str** | Assigned account | [optional] 
**cluster** | **str** | Assigned cluster | [optional] 
**default** | [**Dbv0037AssociationDefault**](Dbv0037AssociationDefault.md) |  | [optional] 
**flags** | **List[str]** | List of properties of association | [optional] 
**max** | [**Dbv0037AssociationMax**](Dbv0037AssociationMax.md) |  | [optional] 
**min** | [**Dbv0037AssociationMin**](Dbv0037AssociationMin.md) |  | [optional] 
**parent_account** | **str** | Parent account name | [optional] 
**partition** | **str** | Assigned partition | [optional] 
**priority** | **int** | Assigned priority | [optional] 
**qos** | **List[str]** | Assigned QOS | [optional] 
**shares_raw** | **int** | Raw fairshare shares | [optional] 
**usage** | [**Dbv0037AssociationUsage**](Dbv0037AssociationUsage.md) |  | [optional] 
**user** | **str** | Assigned user | [optional] 

## Example

```python
from openapi_client.models.dbv0037_association import Dbv0037Association

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037Association from a JSON string
dbv0037_association_instance = Dbv0037Association.from_json(json)
# print the JSON string representation of the object
print Dbv0037Association.to_json()

# convert the object into a dict
dbv0037_association_dict = dbv0037_association_instance.to_dict()
# create an instance of Dbv0037Association from a dict
dbv0037_association_form_dict = dbv0037_association.from_dict(dbv0037_association_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


