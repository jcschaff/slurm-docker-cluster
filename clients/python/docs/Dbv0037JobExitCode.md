# Dbv0037JobExitCode


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **str** | Job exit status | [optional] 
**return_code** | **int** | Return code from parent process | [optional] 
**signal** | [**Dbv0037JobExitCodeSignal**](Dbv0037JobExitCodeSignal.md) |  | [optional] 

## Example

```python
from openapi_client.models.dbv0037_job_exit_code import Dbv0037JobExitCode

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037JobExitCode from a JSON string
dbv0037_job_exit_code_instance = Dbv0037JobExitCode.from_json(json)
# print the JSON string representation of the object
print Dbv0037JobExitCode.to_json()

# convert the object into a dict
dbv0037_job_exit_code_dict = dbv0037_job_exit_code_instance.to_dict()
# create an instance of Dbv0037JobExitCode from a dict
dbv0037_job_exit_code_form_dict = dbv0037_job_exit_code.from_dict(dbv0037_job_exit_code_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


