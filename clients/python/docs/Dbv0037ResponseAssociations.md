# Dbv0037ResponseAssociations


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**List[Dbv0037Error]**](Dbv0037Error.md) | Slurm errors | [optional] 

## Example

```python
from openapi_client.models.dbv0037_response_associations import Dbv0037ResponseAssociations

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037ResponseAssociations from a JSON string
dbv0037_response_associations_instance = Dbv0037ResponseAssociations.from_json(json)
# print the JSON string representation of the object
print Dbv0037ResponseAssociations.to_json()

# convert the object into a dict
dbv0037_response_associations_dict = dbv0037_response_associations_instance.to_dict()
# create an instance of Dbv0037ResponseAssociations from a dict
dbv0037_response_associations_form_dict = dbv0037_response_associations.from_dict(dbv0037_response_associations_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


