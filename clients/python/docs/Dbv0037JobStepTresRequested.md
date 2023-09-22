# Dbv0037JobStepTresRequested

TRES requested for job

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**average** | [**List[Dbv0037TresListInner]**](Dbv0037TresListInner.md) | TRES list of attributes | [optional] 
**max** | [**List[Dbv0037TresListInner]**](Dbv0037TresListInner.md) | TRES list of attributes | [optional] 
**min** | [**List[Dbv0037TresListInner]**](Dbv0037TresListInner.md) | TRES list of attributes | [optional] 
**total** | [**List[Dbv0037TresListInner]**](Dbv0037TresListInner.md) | TRES list of attributes | [optional] 

## Example

```python
from openapi_client.models.dbv0037_job_step_tres_requested import Dbv0037JobStepTresRequested

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037JobStepTresRequested from a JSON string
dbv0037_job_step_tres_requested_instance = Dbv0037JobStepTresRequested.from_json(json)
# print the JSON string representation of the object
print Dbv0037JobStepTresRequested.to_json()

# convert the object into a dict
dbv0037_job_step_tres_requested_dict = dbv0037_job_step_tres_requested_instance.to_dict()
# create an instance of Dbv0037JobStepTresRequested from a dict
dbv0037_job_step_tres_requested_form_dict = dbv0037_job_step_tres_requested.from_dict(dbv0037_job_step_tres_requested_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


