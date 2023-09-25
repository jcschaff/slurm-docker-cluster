# Dbv0037JobHet

Heterogeneous Job details (optional)

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**job_id** | **object** | Parent HetJob id | [optional] 
**job_offset** | **object** | Offset of this job to parent | [optional] 

## Example

```python
from openapi_client.models.dbv0037_job_het import Dbv0037JobHet

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037JobHet from a JSON string
dbv0037_job_het_instance = Dbv0037JobHet.from_json(json)
# print the JSON string representation of the object
print Dbv0037JobHet.to_json()

# convert the object into a dict
dbv0037_job_het_dict = dbv0037_job_het_instance.to_dict()
# create an instance of Dbv0037JobHet from a dict
dbv0037_job_het_form_dict = dbv0037_job_het.from_dict(dbv0037_job_het_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


