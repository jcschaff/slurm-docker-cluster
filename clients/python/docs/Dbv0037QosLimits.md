# Dbv0037QosLimits

Assigned limits

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**factor** | **float** | factor to apply to TRES count for associations using this QOS | [optional] 
**max** | [**Dbv0037QosLimitsMax**](Dbv0037QosLimitsMax.md) |  | [optional] 
**min** | [**Dbv0037QosLimitsMin**](Dbv0037QosLimitsMin.md) |  | [optional] 

## Example

```python
from openapi_client.models.dbv0037_qos_limits import Dbv0037QosLimits

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037QosLimits from a JSON string
dbv0037_qos_limits_instance = Dbv0037QosLimits.from_json(json)
# print the JSON string representation of the object
print Dbv0037QosLimits.to_json()

# convert the object into a dict
dbv0037_qos_limits_dict = dbv0037_qos_limits_instance.to_dict()
# create an instance of Dbv0037QosLimits from a dict
dbv0037_qos_limits_form_dict = dbv0037_qos_limits.from_dict(dbv0037_qos_limits_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


