# Dbv0037QosLimitsMaxJobsActiveJobsPer

Limits on active jobs per settings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account** | **int** | Max jobs per account | [optional] 
**user** | **int** | Max jobs per user | [optional] 

## Example

```python
from openapi_client.models.dbv0037_qos_limits_max_jobs_active_jobs_per import Dbv0037QosLimitsMaxJobsActiveJobsPer

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037QosLimitsMaxJobsActiveJobsPer from a JSON string
dbv0037_qos_limits_max_jobs_active_jobs_per_instance = Dbv0037QosLimitsMaxJobsActiveJobsPer.from_json(json)
# print the JSON string representation of the object
print Dbv0037QosLimitsMaxJobsActiveJobsPer.to_json()

# convert the object into a dict
dbv0037_qos_limits_max_jobs_active_jobs_per_dict = dbv0037_qos_limits_max_jobs_active_jobs_per_instance.to_dict()
# create an instance of Dbv0037QosLimitsMaxJobsActiveJobsPer from a dict
dbv0037_qos_limits_max_jobs_active_jobs_per_form_dict = dbv0037_qos_limits_max_jobs_active_jobs_per.from_dict(dbv0037_qos_limits_max_jobs_active_jobs_per_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


