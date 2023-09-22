# Dbv0037QosLimitsMin

Min limit settings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**priority_threshold** | **int** | Min priority threshold | [optional] 
**tres** | [**Dbv0037QosLimitsMinTres**](Dbv0037QosLimitsMinTres.md) |  | [optional] 

## Example

```python
from openapi_client.models.dbv0037_qos_limits_min import Dbv0037QosLimitsMin

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037QosLimitsMin from a JSON string
dbv0037_qos_limits_min_instance = Dbv0037QosLimitsMin.from_json(json)
# print the JSON string representation of the object
print Dbv0037QosLimitsMin.to_json()

# convert the object into a dict
dbv0037_qos_limits_min_dict = dbv0037_qos_limits_min_instance.to_dict()
# create an instance of Dbv0037QosLimitsMin from a dict
dbv0037_qos_limits_min_form_dict = dbv0037_qos_limits_min.from_dict(dbv0037_qos_limits_min_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


