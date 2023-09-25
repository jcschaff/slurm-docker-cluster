# Dbv0037JobTimeUser

User land time values

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**seconds** | **int** | Total number of CPU-seconds used by the job in user land, in seconds | [optional] 
**microseconds** | **int** | Total number of CPU-seconds used by the job in user land, in microseconds | [optional] 

## Example

```python
from openapi_client.models.dbv0037_job_time_user import Dbv0037JobTimeUser

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037JobTimeUser from a JSON string
dbv0037_job_time_user_instance = Dbv0037JobTimeUser.from_json(json)
# print the JSON string representation of the object
print Dbv0037JobTimeUser.to_json()

# convert the object into a dict
dbv0037_job_time_user_dict = dbv0037_job_time_user_instance.to_dict()
# create an instance of Dbv0037JobTimeUser from a dict
dbv0037_job_time_user_form_dict = dbv0037_job_time_user.from_dict(dbv0037_job_time_user_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


