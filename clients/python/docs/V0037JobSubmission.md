# V0037JobSubmission


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**script** | **str** | Executable script (full contents) to run in batch step | 
**job** | [**V0037JobProperties**](V0037JobProperties.md) |  | [optional] 
**jobs** | [**List[V0037JobProperties]**](V0037JobProperties.md) | Properties of an HetJob | [optional] 

## Example

```python
from openapi_client.models.v0037_job_submission import V0037JobSubmission

# TODO update the JSON string below
json = "{}"
# create an instance of V0037JobSubmission from a JSON string
v0037_job_submission_instance = V0037JobSubmission.from_json(json)
# print the JSON string representation of the object
print V0037JobSubmission.to_json()

# convert the object into a dict
v0037_job_submission_dict = v0037_job_submission_instance.to_dict()
# create an instance of V0037JobSubmission from a dict
v0037_job_submission_form_dict = v0037_job_submission.from_dict(v0037_job_submission_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


