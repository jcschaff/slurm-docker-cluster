# V0037JobSubmissionResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**List[V0037Error]**](V0037Error.md) | slurm errors | [optional] 
**job_id** | **int** | new job ID | [optional] 
**step_id** | **str** | new job step ID | [optional] 
**job_submit_user_msg** | **str** | Message to user from job_submit plugin | [optional] 

## Example

```python
from openapi_client.models.v0037_job_submission_response import V0037JobSubmissionResponse

# TODO update the JSON string below
json = "{}"
# create an instance of V0037JobSubmissionResponse from a JSON string
v0037_job_submission_response_instance = V0037JobSubmissionResponse.from_json(json)
# print the JSON string representation of the object
print V0037JobSubmissionResponse.to_json()

# convert the object into a dict
v0037_job_submission_response_dict = v0037_job_submission_response_instance.to_dict()
# create an instance of V0037JobSubmissionResponse from a dict
v0037_job_submission_response_form_dict = v0037_job_submission_response.from_dict(v0037_job_submission_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


