# Dbv0037JobStepCPU

CPU properties

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requested_frequency** | [**Dbv0037JobStepCPURequestedFrequency**](Dbv0037JobStepCPURequestedFrequency.md) |  | [optional] 
**governor** | **List[str]** | CPU governor | [optional] 

## Example

```python
from openapi_client.models.dbv0037_job_step_cpu import Dbv0037JobStepCPU

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037JobStepCPU from a JSON string
dbv0037_job_step_cpu_instance = Dbv0037JobStepCPU.from_json(json)
# print the JSON string representation of the object
print Dbv0037JobStepCPU.to_json()

# convert the object into a dict
dbv0037_job_step_cpu_dict = dbv0037_job_step_cpu_instance.to_dict()
# create an instance of Dbv0037JobStepCPU from a dict
dbv0037_job_step_cpu_form_dict = dbv0037_job_step_cpu.from_dict(dbv0037_job_step_cpu_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


