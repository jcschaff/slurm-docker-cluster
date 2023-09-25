# Dbv0037DiagRPCsInner

Statistics by RPC type

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rpc** | **str** | RPC type | [optional] 
**count** | **int** | Number of RPCs | [optional] 
**time** | [**Dbv0037DiagRPCsInnerTime**](Dbv0037DiagRPCsInnerTime.md) |  | [optional] 

## Example

```python
from openapi_client.models.dbv0037_diag_rpcs_inner import Dbv0037DiagRPCsInner

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037DiagRPCsInner from a JSON string
dbv0037_diag_rpcs_inner_instance = Dbv0037DiagRPCsInner.from_json(json)
# print the JSON string representation of the object
print Dbv0037DiagRPCsInner.to_json()

# convert the object into a dict
dbv0037_diag_rpcs_inner_dict = dbv0037_diag_rpcs_inner_instance.to_dict()
# create an instance of Dbv0037DiagRPCsInner from a dict
dbv0037_diag_rpcs_inner_form_dict = dbv0037_diag_rpcs_inner.from_dict(dbv0037_diag_rpcs_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


