# Dbv0037JobStepStep

Step details

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**job_id** | **int** | Parent job id | [optional] 
**het** | [**Dbv0037JobStepStepHet**](Dbv0037JobStepStepHet.md) |  | [optional] 
**id** | **str** | Step id | [optional] 
**name** | **str** | Step name | [optional] 

## Example

```python
from openapi_client.models.dbv0037_job_step_step import Dbv0037JobStepStep

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037JobStepStep from a JSON string
dbv0037_job_step_step_instance = Dbv0037JobStepStep.from_json(json)
# print the JSON string representation of the object
print Dbv0037JobStepStep.to_json()

# convert the object into a dict
dbv0037_job_step_step_dict = dbv0037_job_step_step_instance.to_dict()
# create an instance of Dbv0037JobStepStep from a dict
dbv0037_job_step_step_form_dict = dbv0037_job_step_step.from_dict(dbv0037_job_step_step_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


