# Dbv0037QosLimitsMaxTresPer

Max TRES per settings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account** | [**List[Dbv0037TresListInner]**](Dbv0037TresListInner.md) | TRES list of attributes | [optional] 
**job** | [**List[Dbv0037TresListInner]**](Dbv0037TresListInner.md) | TRES list of attributes | [optional] 
**node** | [**List[Dbv0037TresListInner]**](Dbv0037TresListInner.md) | TRES list of attributes | [optional] 
**user** | [**List[Dbv0037TresListInner]**](Dbv0037TresListInner.md) | TRES list of attributes | [optional] 

## Example

```python
from openapi_client.models.dbv0037_qos_limits_max_tres_per import Dbv0037QosLimitsMaxTresPer

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037QosLimitsMaxTresPer from a JSON string
dbv0037_qos_limits_max_tres_per_instance = Dbv0037QosLimitsMaxTresPer.from_json(json)
# print the JSON string representation of the object
print Dbv0037QosLimitsMaxTresPer.to_json()

# convert the object into a dict
dbv0037_qos_limits_max_tres_per_dict = dbv0037_qos_limits_max_tres_per_instance.to_dict()
# create an instance of Dbv0037QosLimitsMaxTresPer from a dict
dbv0037_qos_limits_max_tres_per_form_dict = dbv0037_qos_limits_max_tres_per.from_dict(dbv0037_qos_limits_max_tres_per_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


