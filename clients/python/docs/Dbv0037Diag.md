# Dbv0037Diag


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**List[Dbv0037Error]**](Dbv0037Error.md) | Slurm errors | [optional] 
**time_start** | **int** | Unix timestamp of start time | [optional] 
**rollups** | [**List[Dbv0037DiagRollupsInner]**](Dbv0037DiagRollupsInner.md) |  | [optional] 
**rpcs** | [**List[Dbv0037DiagRPCsInner]**](Dbv0037DiagRPCsInner.md) |  | [optional] 
**users** | [**List[Dbv0037DiagUsersInner]**](Dbv0037DiagUsersInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.dbv0037_diag import Dbv0037Diag

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037Diag from a JSON string
dbv0037_diag_instance = Dbv0037Diag.from_json(json)
# print the JSON string representation of the object
print Dbv0037Diag.to_json()

# convert the object into a dict
dbv0037_diag_dict = dbv0037_diag_instance.to_dict()
# create an instance of Dbv0037Diag from a dict
dbv0037_diag_form_dict = dbv0037_diag.from_dict(dbv0037_diag_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


