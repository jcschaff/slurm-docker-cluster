# Dbv0037Job

Single job description

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account** | **str** | Account charged by job | [optional] 
**comment** | [**Dbv0037JobComment**](Dbv0037JobComment.md) |  | [optional] 
**allocation_nodes** | **str** | Nodes allocated to job | [optional] 
**array** | [**Dbv0037JobArray**](Dbv0037JobArray.md) |  | [optional] 
**time** | [**Dbv0037JobTime**](Dbv0037JobTime.md) |  | [optional] 
**association** | [**Dbv0037AssociationShortInfo**](Dbv0037AssociationShortInfo.md) |  | [optional] 
**cluster** | **str** | Assigned cluster | [optional] 
**constraints** | **str** | Constraints on job | [optional] 
**derived_exit_code** | [**Dbv0037JobExitCode**](Dbv0037JobExitCode.md) |  | [optional] 
**exit_code** | [**Dbv0037JobExitCode**](Dbv0037JobExitCode.md) |  | [optional] 
**flags** | **List[str]** | List of properties of job | [optional] 
**group** | **str** | User&#39;s group to run job | [optional] 
**het** | [**Dbv0037JobHet**](Dbv0037JobHet.md) |  | [optional] 
**job_id** | **int** | Job id | [optional] 
**name** | **str** | Assigned job name | [optional] 
**mcs** | [**Dbv0037JobMcs**](Dbv0037JobMcs.md) |  | [optional] 
**nodes** | **str** | List of nodes allocated for job | [optional] 
**partition** | **str** | Assigned job&#39;s partition | [optional] 
**priority** | **int** | Priority | [optional] 
**qos** | **str** | Assigned qos name | [optional] 
**required** | [**Dbv0037JobRequired**](Dbv0037JobRequired.md) |  | [optional] 
**kill_request_user** | **str** | User who requested job killed | [optional] 
**reservation** | [**Dbv0037JobReservation**](Dbv0037JobReservation.md) |  | [optional] 
**state** | [**Dbv0037JobState**](Dbv0037JobState.md) |  | [optional] 
**steps** | [**List[Dbv0037JobStep]**](Dbv0037JobStep.md) | Job step description | [optional] 
**tres** | [**Dbv0037JobTres**](Dbv0037JobTres.md) |  | [optional] 
**user** | **str** | Job user | [optional] 
**wckey** | [**Dbv0037JobWckey**](Dbv0037JobWckey.md) |  | [optional] 
**working_directory** | **str** | Directory where job was initially started | [optional] 

## Example

```python
from openapi_client.models.dbv0037_job import Dbv0037Job

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037Job from a JSON string
dbv0037_job_instance = Dbv0037Job.from_json(json)
# print the JSON string representation of the object
print Dbv0037Job.to_json()

# convert the object into a dict
dbv0037_job_dict = dbv0037_job_instance.to_dict()
# create an instance of Dbv0037Job from a dict
dbv0037_job_form_dict = dbv0037_job.from_dict(dbv0037_job_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


