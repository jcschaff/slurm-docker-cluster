# Dbv0037JobStep


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**time** | [**Dbv0037JobStepTime**](Dbv0037JobStepTime.md) |  | [optional] 
**exit_code** | [**Dbv0037JobExitCode**](Dbv0037JobExitCode.md) |  | [optional] 
**nodes** | [**Dbv0037JobStepNodes**](Dbv0037JobStepNodes.md) |  | [optional] 
**tasks** | [**Dbv0037JobStepTasks**](Dbv0037JobStepTasks.md) |  | [optional] 
**pid** | **str** | First process PID | [optional] 
**cpu** | [**Dbv0037JobStepCPU**](Dbv0037JobStepCPU.md) |  | [optional] 
**kill_request_user** | **str** | User who requested job killed | [optional] 
**state** | **str** | State of job step | [optional] 
**statistics** | [**Dbv0037JobStepStatistics**](Dbv0037JobStepStatistics.md) |  | [optional] 
**step** | [**Dbv0037JobStepStep**](Dbv0037JobStepStep.md) |  | [optional] 
**task** | [**Dbv0037JobStepTask**](Dbv0037JobStepTask.md) |  | [optional] 
**tres** | [**Dbv0037JobStepTres**](Dbv0037JobStepTres.md) |  | [optional] 

## Example

```python
from openapi_client.models.dbv0037_job_step import Dbv0037JobStep

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037JobStep from a JSON string
dbv0037_job_step_instance = Dbv0037JobStep.from_json(json)
# print the JSON string representation of the object
print Dbv0037JobStep.to_json()

# convert the object into a dict
dbv0037_job_step_dict = dbv0037_job_step_instance.to_dict()
# create an instance of Dbv0037JobStep from a dict
dbv0037_job_step_form_dict = dbv0037_job_step.from_dict(dbv0037_job_step_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


