# Dbv0037AssociationMaxJobs

Max jobs settings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **int** | Max TRES for active total jobs | [optional] 
**accruing** | **int** | Max TRES for job accruing priority | [optional] 
**total** | **int** | Max TRES for job total submitted | [optional] 
**per** | [**Dbv0037AssociationMaxJobsPer**](Dbv0037AssociationMaxJobsPer.md) |  | [optional] 

## Example

```python
from openapi_client.models.dbv0037_association_max_jobs import Dbv0037AssociationMaxJobs

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037AssociationMaxJobs from a JSON string
dbv0037_association_max_jobs_instance = Dbv0037AssociationMaxJobs.from_json(json)
# print the JSON string representation of the object
print Dbv0037AssociationMaxJobs.to_json()

# convert the object into a dict
dbv0037_association_max_jobs_dict = dbv0037_association_max_jobs_instance.to_dict()
# create an instance of Dbv0037AssociationMaxJobs from a dict
dbv0037_association_max_jobs_form_dict = dbv0037_association_max_jobs.from_dict(dbv0037_association_max_jobs_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


