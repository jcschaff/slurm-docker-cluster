# Dbv0037CoordinatorInfo


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | Name of user | [optional] 
**direct** | **int** | If user is coordinator of this account directly or coordinator status was inheirted from a higher account in the tree | [optional] 

## Example

```python
from openapi_client.models.dbv0037_coordinator_info import Dbv0037CoordinatorInfo

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037CoordinatorInfo from a JSON string
dbv0037_coordinator_info_instance = Dbv0037CoordinatorInfo.from_json(json)
# print the JSON string representation of the object
print Dbv0037CoordinatorInfo.to_json()

# convert the object into a dict
dbv0037_coordinator_info_dict = dbv0037_coordinator_info_instance.to_dict()
# create an instance of Dbv0037CoordinatorInfo from a dict
dbv0037_coordinator_info_form_dict = dbv0037_coordinator_info.from_dict(dbv0037_coordinator_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


