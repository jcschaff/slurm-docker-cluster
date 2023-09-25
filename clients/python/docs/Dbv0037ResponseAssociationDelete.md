# Dbv0037ResponseAssociationDelete


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**List[Dbv0037Error]**](Dbv0037Error.md) | Slurm errors | [optional] 

## Example

```python
from openapi_client.models.dbv0037_response_association_delete import Dbv0037ResponseAssociationDelete

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037ResponseAssociationDelete from a JSON string
dbv0037_response_association_delete_instance = Dbv0037ResponseAssociationDelete.from_json(json)
# print the JSON string representation of the object
print Dbv0037ResponseAssociationDelete.to_json()

# convert the object into a dict
dbv0037_response_association_delete_dict = dbv0037_response_association_delete_instance.to_dict()
# create an instance of Dbv0037ResponseAssociationDelete from a dict
dbv0037_response_association_delete_form_dict = dbv0037_response_association_delete.from_dict(dbv0037_response_association_delete_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


