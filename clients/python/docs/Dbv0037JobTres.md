# Dbv0037JobTres

TRES settings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allocated** | [**List[Dbv0037TresListInner]**](Dbv0037TresListInner.md) | TRES list of attributes | [optional] 
**requested** | [**List[Dbv0037TresListInner]**](Dbv0037TresListInner.md) | TRES list of attributes | [optional] 

## Example

```python
from openapi_client.models.dbv0037_job_tres import Dbv0037JobTres

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037JobTres from a JSON string
dbv0037_job_tres_instance = Dbv0037JobTres.from_json(json)
# print the JSON string representation of the object
print Dbv0037JobTres.to_json()

# convert the object into a dict
dbv0037_job_tres_dict = dbv0037_job_tres_instance.to_dict()
# create an instance of Dbv0037JobTres from a dict
dbv0037_job_tres_form_dict = dbv0037_job_tres.from_dict(dbv0037_job_tres_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


