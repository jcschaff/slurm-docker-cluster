# Dbv0037QosPreempt

Preemption settings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**list** | **List[str]** | List of preemptable QOS | [optional] 
**mode** | **List[str]** | List of preemption modes | [optional] 
**exempt_time** | **int** | Grace period (s) before jobs can preempted | [optional] 

## Example

```python
from openapi_client.models.dbv0037_qos_preempt import Dbv0037QosPreempt

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037QosPreempt from a JSON string
dbv0037_qos_preempt_instance = Dbv0037QosPreempt.from_json(json)
# print the JSON string representation of the object
print Dbv0037QosPreempt.to_json()

# convert the object into a dict
dbv0037_qos_preempt_dict = dbv0037_qos_preempt_instance.to_dict()
# create an instance of Dbv0037QosPreempt from a dict
dbv0037_qos_preempt_form_dict = dbv0037_qos_preempt.from_dict(dbv0037_qos_preempt_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


