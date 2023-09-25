# Dbv0037Qos

QOS description

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** | QOS description | [optional] 
**flags** | **List[str]** | List of properties of QOS | [optional] 
**id** | **str** | Database id | [optional] 
**limits** | [**Dbv0037QosLimits**](Dbv0037QosLimits.md) |  | [optional] 
**preempt** | [**Dbv0037QosPreempt**](Dbv0037QosPreempt.md) |  | [optional] 
**priority** | **int** | QOS priority | [optional] 
**usage_factor** | **float** | Usage factor | [optional] 
**usage_threshold** | **float** | Usage threshold | [optional] 

## Example

```python
from openapi_client.models.dbv0037_qos import Dbv0037Qos

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037Qos from a JSON string
dbv0037_qos_instance = Dbv0037Qos.from_json(json)
# print the JSON string representation of the object
print Dbv0037Qos.to_json()

# convert the object into a dict
dbv0037_qos_dict = dbv0037_qos_instance.to_dict()
# create an instance of Dbv0037Qos from a dict
dbv0037_qos_form_dict = dbv0037_qos.from_dict(dbv0037_qos_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


