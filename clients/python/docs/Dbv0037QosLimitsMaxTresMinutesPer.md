# Dbv0037QosLimitsMaxTresMinutesPer

Max TRES minutes per settings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**job** | [**List[Dbv0037TresListInner]**](Dbv0037TresListInner.md) | TRES list of attributes | [optional] 
**account** | [**List[Dbv0037TresListInner]**](Dbv0037TresListInner.md) | TRES list of attributes | [optional] 
**user** | [**List[Dbv0037TresListInner]**](Dbv0037TresListInner.md) | TRES list of attributes | [optional] 

## Example

```python
from openapi_client.models.dbv0037_qos_limits_max_tres_minutes_per import Dbv0037QosLimitsMaxTresMinutesPer

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037QosLimitsMaxTresMinutesPer from a JSON string
dbv0037_qos_limits_max_tres_minutes_per_instance = Dbv0037QosLimitsMaxTresMinutesPer.from_json(json)
# print the JSON string representation of the object
print Dbv0037QosLimitsMaxTresMinutesPer.to_json()

# convert the object into a dict
dbv0037_qos_limits_max_tres_minutes_per_dict = dbv0037_qos_limits_max_tres_minutes_per_instance.to_dict()
# create an instance of Dbv0037QosLimitsMaxTresMinutesPer from a dict
dbv0037_qos_limits_max_tres_minutes_per_form_dict = dbv0037_qos_limits_max_tres_minutes_per.from_dict(dbv0037_qos_limits_max_tres_minutes_per_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


