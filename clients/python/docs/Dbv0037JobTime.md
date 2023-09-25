# Dbv0037JobTime

Time properties

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**elapsed** | **int** | Total time elapsed | [optional] 
**eligible** | **int** | Total time eligible to run | [optional] 
**end** | **int** | Timestamp of when job ended | [optional] 
**start** | **int** | Timestamp of when job started | [optional] 
**submission** | **int** | Timestamp of when job submitted | [optional] 
**suspended** | **int** | Timestamp of when job last suspended | [optional] 
**system** | [**Dbv0037JobTimeSystem**](Dbv0037JobTimeSystem.md) |  | [optional] 
**total** | [**Dbv0037JobTimeTotal**](Dbv0037JobTimeTotal.md) |  | [optional] 
**user** | [**Dbv0037JobTimeUser**](Dbv0037JobTimeUser.md) |  | [optional] 
**limit** | **int** | Job wall clock time limit | [optional] 

## Example

```python
from openapi_client.models.dbv0037_job_time import Dbv0037JobTime

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037JobTime from a JSON string
dbv0037_job_time_instance = Dbv0037JobTime.from_json(json)
# print the JSON string representation of the object
print Dbv0037JobTime.to_json()

# convert the object into a dict
dbv0037_job_time_dict = dbv0037_job_time_instance.to_dict()
# create an instance of Dbv0037JobTime from a dict
dbv0037_job_time_form_dict = dbv0037_job_time.from_dict(dbv0037_job_time_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


