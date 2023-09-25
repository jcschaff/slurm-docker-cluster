# Dbv0037JobStepTres

TRES usage

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requested** | [**Dbv0037JobStepTresRequested**](Dbv0037JobStepTresRequested.md) |  | [optional] 
**consumed** | [**Dbv0037JobStepTresRequested**](Dbv0037JobStepTresRequested.md) |  | [optional] 
**allocated** | [**List[Dbv0037TresListInner]**](Dbv0037TresListInner.md) | TRES list of attributes | [optional] 

## Example

```python
from openapi_client.models.dbv0037_job_step_tres import Dbv0037JobStepTres

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037JobStepTres from a JSON string
dbv0037_job_step_tres_instance = Dbv0037JobStepTres.from_json(json)
# print the JSON string representation of the object
print Dbv0037JobStepTres.to_json()

# convert the object into a dict
dbv0037_job_step_tres_dict = dbv0037_job_step_tres_instance.to_dict()
# create an instance of Dbv0037JobStepTres from a dict
dbv0037_job_step_tres_form_dict = dbv0037_job_step_tres.from_dict(dbv0037_job_step_tres_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


