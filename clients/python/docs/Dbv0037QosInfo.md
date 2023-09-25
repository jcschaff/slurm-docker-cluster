# Dbv0037QosInfo


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**List[Dbv0037Error]**](Dbv0037Error.md) | Slurm errors | [optional] 
**qos** | [**List[Dbv0037Qos]**](Dbv0037Qos.md) | Array of QOS | [optional] 

## Example

```python
from openapi_client.models.dbv0037_qos_info import Dbv0037QosInfo

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037QosInfo from a JSON string
dbv0037_qos_info_instance = Dbv0037QosInfo.from_json(json)
# print the JSON string representation of the object
print Dbv0037QosInfo.to_json()

# convert the object into a dict
dbv0037_qos_info_dict = dbv0037_qos_info_instance.to_dict()
# create an instance of Dbv0037QosInfo from a dict
dbv0037_qos_info_form_dict = dbv0037_qos_info.from_dict(dbv0037_qos_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


