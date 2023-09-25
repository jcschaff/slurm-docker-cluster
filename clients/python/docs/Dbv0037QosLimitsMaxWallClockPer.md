# Dbv0037QosLimitsMaxWallClockPer

Limit on wallclock per settings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**qos** | **int** | Max wallclock per QOS | [optional] 
**job** | **int** | Max wallclock per job | [optional] 

## Example

```python
from openapi_client.models.dbv0037_qos_limits_max_wall_clock_per import Dbv0037QosLimitsMaxWallClockPer

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037QosLimitsMaxWallClockPer from a JSON string
dbv0037_qos_limits_max_wall_clock_per_instance = Dbv0037QosLimitsMaxWallClockPer.from_json(json)
# print the JSON string representation of the object
print Dbv0037QosLimitsMaxWallClockPer.to_json()

# convert the object into a dict
dbv0037_qos_limits_max_wall_clock_per_dict = dbv0037_qos_limits_max_wall_clock_per_instance.to_dict()
# create an instance of Dbv0037QosLimitsMaxWallClockPer from a dict
dbv0037_qos_limits_max_wall_clock_per_form_dict = dbv0037_qos_limits_max_wall_clock_per.from_dict(dbv0037_qos_limits_max_wall_clock_per_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


