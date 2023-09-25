# Dbv0037JobStepStatistics

Statistics of job step

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cpu** | [**Dbv0037JobStepStatisticsCPU**](Dbv0037JobStepStatisticsCPU.md) |  | [optional] 
**energy** | [**Dbv0037JobStepStatisticsEnergy**](Dbv0037JobStepStatisticsEnergy.md) |  | [optional] 

## Example

```python
from openapi_client.models.dbv0037_job_step_statistics import Dbv0037JobStepStatistics

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037JobStepStatistics from a JSON string
dbv0037_job_step_statistics_instance = Dbv0037JobStepStatistics.from_json(json)
# print the JSON string representation of the object
print Dbv0037JobStepStatistics.to_json()

# convert the object into a dict
dbv0037_job_step_statistics_dict = dbv0037_job_step_statistics_instance.to_dict()
# create an instance of Dbv0037JobStepStatistics from a dict
dbv0037_job_step_statistics_form_dict = dbv0037_job_step_statistics.from_dict(dbv0037_job_step_statistics_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


