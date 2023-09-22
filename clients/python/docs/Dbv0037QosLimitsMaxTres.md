# Dbv0037QosLimitsMaxTres

Limits on TRES

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**minutes** | [**Dbv0037QosLimitsMaxTresMinutes**](Dbv0037QosLimitsMaxTresMinutes.md) |  | [optional] 
**per** | [**Dbv0037QosLimitsMaxTresPer**](Dbv0037QosLimitsMaxTresPer.md) |  | [optional] 

## Example

```python
from openapi_client.models.dbv0037_qos_limits_max_tres import Dbv0037QosLimitsMaxTres

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037QosLimitsMaxTres from a JSON string
dbv0037_qos_limits_max_tres_instance = Dbv0037QosLimitsMaxTres.from_json(json)
# print the JSON string representation of the object
print Dbv0037QosLimitsMaxTres.to_json()

# convert the object into a dict
dbv0037_qos_limits_max_tres_dict = dbv0037_qos_limits_max_tres_instance.to_dict()
# create an instance of Dbv0037QosLimitsMaxTres from a dict
dbv0037_qos_limits_max_tres_form_dict = dbv0037_qos_limits_max_tres.from_dict(dbv0037_qos_limits_max_tres_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


