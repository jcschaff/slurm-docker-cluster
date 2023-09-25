# V0037Partition


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**flags** | **List[str]** | partition options | [optional] 
**preemption_mode** | **List[str]** | preemption type | [optional] 
**allowed_allocation_nodes** | **str** | list names of allowed allocating nodes | [optional] 
**allowed_accounts** | **str** | comma delimited list of accounts | [optional] 
**allowed_groups** | **str** | comma delimited list of groups | [optional] 
**allowed_qos** | **str** | comma delimited list of qos | [optional] 
**alternative** | **str** | name of alternate partition | [optional] 
**billing_weights** | **str** | TRES billing weights | [optional] 
**default_memory_per_cpu** | **int** | default MB memory per allocated CPU | [optional] 
**default_time_limit** | **int** | default time limit (minutes) | [optional] 
**denied_accounts** | **str** | comma delimited list of denied accounts | [optional] 
**denied_qos** | **str** | comma delimited list of denied qos | [optional] 
**preemption_grace_time** | **int** | preemption grace time (seconds) | [optional] 
**maximum_cpus_per_node** | **int** | maximum allocated CPUs per node | [optional] 
**maximum_memory_per_node** | **int** | maximum memory per allocated CPU (MiB) | [optional] 
**maximum_nodes_per_job** | **int** | Max nodes per job | [optional] 
**max_time_limit** | **int** | Max time limit per job | [optional] 
**min_nodes_per_job** | **int** | Min number of nodes per job | [optional] 
**name** | **str** | Partition name | [optional] 
**nodes** | **str** | list names of nodes in partition | [optional] 
**over_time_limit** | **int** | job&#39;s time limit can be exceeded by this number of minutes before cancellation | [optional] 
**priority_job_factor** | **int** | job priority weight factor | [optional] 
**priority_tier** | **int** | tier for scheduling and preemption | [optional] 
**qos** | **str** | partition QOS name | [optional] 
**state** | **str** | Partition state | [optional] 
**total_cpus** | **int** | Total cpus in partition | [optional] 
**total_nodes** | **int** | Total number of nodes in partition | [optional] 
**tres** | **str** | configured TRES in partition | [optional] 

## Example

```python
from openapi_client.models.v0037_partition import V0037Partition

# TODO update the JSON string below
json = "{}"
# create an instance of V0037Partition from a JSON string
v0037_partition_instance = V0037Partition.from_json(json)
# print the JSON string representation of the object
print V0037Partition.to_json()

# convert the object into a dict
v0037_partition_dict = v0037_partition_instance.to_dict()
# create an instance of V0037Partition from a dict
v0037_partition_form_dict = v0037_partition.from_dict(v0037_partition_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


