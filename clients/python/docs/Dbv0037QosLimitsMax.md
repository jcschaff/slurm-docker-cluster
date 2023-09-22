# Dbv0037QosLimitsMax

Limits on max settings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**wall_clock** | [**Dbv0037QosLimitsMaxWallClock**](Dbv0037QosLimitsMaxWallClock.md) |  | [optional] 
**jobs** | [**Dbv0037QosLimitsMaxJobs**](Dbv0037QosLimitsMaxJobs.md) |  | [optional] 
**accruing** | [**Dbv0037QosLimitsMaxAccruing**](Dbv0037QosLimitsMaxAccruing.md) |  | [optional] 
**tres** | [**Dbv0037QosLimitsMaxTres**](Dbv0037QosLimitsMaxTres.md) |  | [optional] 

## Example

```python
from openapi_client.models.dbv0037_qos_limits_max import Dbv0037QosLimitsMax

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037QosLimitsMax from a JSON string
dbv0037_qos_limits_max_instance = Dbv0037QosLimitsMax.from_json(json)
# print the JSON string representation of the object
print Dbv0037QosLimitsMax.to_json()

# convert the object into a dict
dbv0037_qos_limits_max_dict = dbv0037_qos_limits_max_instance.to_dict()
# create an instance of Dbv0037QosLimitsMax from a dict
dbv0037_qos_limits_max_form_dict = dbv0037_qos_limits_max.from_dict(dbv0037_qos_limits_max_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


