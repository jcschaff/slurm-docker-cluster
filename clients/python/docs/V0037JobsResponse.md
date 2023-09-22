# V0037JobsResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**List[V0037Error]**](V0037Error.md) | slurm errors | [optional] 
**jobs** | [**List[V0037JobResponseProperties]**](V0037JobResponseProperties.md) | job descriptions | [optional] 

## Example

```python
from openapi_client.models.v0037_jobs_response import V0037JobsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of V0037JobsResponse from a JSON string
v0037_jobs_response_instance = V0037JobsResponse.from_json(json)
# print the JSON string representation of the object
print V0037JobsResponse.to_json()

# convert the object into a dict
v0037_jobs_response_dict = v0037_jobs_response_instance.to_dict()
# create an instance of V0037JobsResponse from a dict
v0037_jobs_response_form_dict = v0037_jobs_response.from_dict(v0037_jobs_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


