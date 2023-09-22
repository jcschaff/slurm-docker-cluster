# Dbv0037JobRequired

Job run requirements

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cpus** | **int** | Required number of CPUs | [optional] 
**memory** | **int** | Required amount of memory (MiB) | [optional] 

## Example

```python
from openapi_client.models.dbv0037_job_required import Dbv0037JobRequired

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037JobRequired from a JSON string
dbv0037_job_required_instance = Dbv0037JobRequired.from_json(json)
# print the JSON string representation of the object
print Dbv0037JobRequired.to_json()

# convert the object into a dict
dbv0037_job_required_dict = dbv0037_job_required_instance.to_dict()
# create an instance of Dbv0037JobRequired from a dict
dbv0037_job_required_form_dict = dbv0037_job_required.from_dict(dbv0037_job_required_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


