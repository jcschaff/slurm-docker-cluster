# Dbv0037JobInfo


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**List[Dbv0037Error]**](Dbv0037Error.md) | Slurm errors | [optional] 
**jobs** | [**List[Dbv0037Job]**](Dbv0037Job.md) | Array of jobs | [optional] 

## Example

```python
from openapi_client.models.dbv0037_job_info import Dbv0037JobInfo

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037JobInfo from a JSON string
dbv0037_job_info_instance = Dbv0037JobInfo.from_json(json)
# print the JSON string representation of the object
print Dbv0037JobInfo.to_json()

# convert the object into a dict
dbv0037_job_info_dict = dbv0037_job_info_instance.to_dict()
# create an instance of Dbv0037JobInfo from a dict
dbv0037_job_info_form_dict = dbv0037_job_info.from_dict(dbv0037_job_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


