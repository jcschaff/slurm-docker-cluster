# V0037JobResponseProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account** | **str** | Charge resources used by this job to specified account | [optional] 
**accrue_time** | **int** | time job is eligible for running | [optional] 
**admin_comment** | **str** | administrator&#39;s arbitrary comment | [optional] 
**array_job_id** | **str** | job_id of a job array or 0 if N/A | [optional] 
**array_task_id** | **str** | task_id of a job array | [optional] 
**array_max_tasks** | **str** | Maximum number of running array tasks | [optional] 
**array_task_string** | **str** | string expression of task IDs in this record | [optional] 
**association_id** | **str** | association id for job | [optional] 
**batch_features** | **str** | features required for batch script&#39;s node | [optional] 
**batch_flag** | **bool** | if batch: queued job with script | [optional] 
**batch_host** | **str** | name of host running batch script | [optional] 
**flags** | **List[str]** | Job flags | [optional] 
**burst_buffer** | **str** | burst buffer specifications | [optional] 
**burst_buffer_state** | **str** | burst buffer state info | [optional] 
**cluster** | **str** | name of cluster that the job is on | [optional] 
**cluster_features** | **str** | comma separated list of required cluster features | [optional] 
**command** | **str** | command to be executed | [optional] 
**comment** | **str** | arbitrary comment | [optional] 
**contiguous** | **bool** | job requires contiguous nodes | [optional] 
**core_spec** | **str** | specialized core count | [optional] 
**thread_spec** | **str** | specialized thread count | [optional] 
**cores_per_socket** | **str** | cores per socket required by job | [optional] 
**billable_tres** | **str** | billable TRES | [optional] 
**cpus_per_task** | **str** | number of processors required for each task | [optional] 
**cpu_frequency_minimum** | **str** | Minimum cpu frequency | [optional] 
**cpu_frequency_maximum** | **str** | Maximum cpu frequency | [optional] 
**cpu_frequency_governor** | **str** | cpu frequency governor | [optional] 
**cpus_per_tres** | **str** | semicolon delimited list of TRES&#x3D;# values | [optional] 
**deadline** | **str** | job start deadline  | [optional] 
**delay_boot** | **str** | command to be executed | [optional] 
**dependency** | **str** | synchronize job execution with other jobs | [optional] 
**derived_exit_code** | **str** | highest exit code of all job steps | [optional] 
**eligible_time** | **int** | time job is eligible for running | [optional] 
**end_time** | **int** | time of termination, actual or expected | [optional] 
**excluded_nodes** | **str** | comma separated list of excluded nodes | [optional] 
**exit_code** | **int** | exit code for job | [optional] 
**features** | **str** | comma separated list of required features | [optional] 
**federation_origin** | **str** | Origin cluster&#39;s name | [optional] 
**federation_siblings_active** | **str** | string of active sibling names | [optional] 
**federation_siblings_viable** | **str** | string of viable sibling names | [optional] 
**gres_detail** | **List[str]** | Job flags | [optional] 
**group_id** | **str** | group job submitted as | [optional] 
**job_id** | **str** | job ID | [optional] 
**job_resources** | [**V0037JobResources**](V0037JobResources.md) |  | [optional] 
**job_state** | **str** | state of the job | [optional] 
**last_sched_evaluation** | **str** | last time job was evaluated for scheduling | [optional] 
**licenses** | **str** | licenses required by the job | [optional] 
**max_cpus** | **str** | maximum number of cpus usable by job | [optional] 
**max_nodes** | **str** | maximum number of nodes usable by job | [optional] 
**mcs_label** | **str** | mcs_label if mcs plugin in use | [optional] 
**memory_per_tres** | **str** | semicolon delimited list of TRES&#x3D;# values | [optional] 
**name** | **str** | name of the job | [optional] 
**nodes** | **str** | list of nodes allocated to job | [optional] 
**nice** | **str** | requested priority change | [optional] 
**tasks_per_core** | **str** | number of tasks to invoke on each core | [optional] 
**tasks_per_socket** | **str** | number of tasks to invoke on each socket | [optional] 
**tasks_per_board** | **str** | number of tasks to invoke on each board | [optional] 
**cpus** | **str** | minimum number of cpus required by job | [optional] 
**node_count** | **str** | minimum number of nodes required by job | [optional] 
**tasks** | **str** | requested task count | [optional] 
**het_job_id** | **str** | job ID of hetjob leader | [optional] 
**het_job_id_set** | **str** | job IDs for all components | [optional] 
**het_job_offset** | **str** | HetJob component offset from leader | [optional] 
**partition** | **str** | name of assigned partition | [optional] 
**memory_per_node** | **str** | minimum real memory per node | [optional] 
**memory_per_cpu** | **str** | minimum real memory per cpu | [optional] 
**minimum_cpus_per_node** | **str** | minimum # CPUs per node | [optional] 
**minimum_tmp_disk_per_node** | **str** | minimum tmp disk per node | [optional] 
**preempt_time** | **int** | preemption signal time | [optional] 
**pre_sus_time** | **int** | time job ran prior to last suspend | [optional] 
**priority** | **str** | relative priority of the job | [optional] 
**profile** | **List[str]** | Job profiling requested | [optional] 
**qos** | **str** | Quality of Service | [optional] 
**reboot** | **bool** | node reboot requested before start | [optional] 
**required_nodes** | **str** | comma separated list of required nodes | [optional] 
**requeue** | **bool** | enable or disable job requeue option | [optional] 
**resize_time** | **int** | time of latest size change | [optional] 
**restart_cnt** | **str** | count of job restarts | [optional] 
**resv_name** | **str** | reservation name | [optional] 
**shared** | **str** | type and if job can share nodes with other jobs | [optional] 
**show_flags** | **List[str]** | details requested | [optional] 
**sockets_per_board** | **str** | sockets per board required by job | [optional] 
**sockets_per_node** | **str** | sockets per node required by job | [optional] 
**start_time** | **int** | time execution begins, actual or expected | [optional] 
**state_description** | **str** | optional details for state_reason | [optional] 
**state_reason** | **str** | reason job still pending or failed | [optional] 
**standard_error** | **str** | pathname of job&#39;s stderr file | [optional] 
**standard_input** | **str** | pathname of job&#39;s stdin file | [optional] 
**standard_output** | **str** | pathname of job&#39;s stdout file | [optional] 
**submit_time** | **int** | time of job submission | [optional] 
**suspend_time** | **int** | time job last suspended or resumed | [optional] 
**system_comment** | **str** | slurmctld&#39;s arbitrary comment | [optional] 
**time_limit** | **str** | maximum run time in minutes | [optional] 
**time_minimum** | **str** | minimum run time in minutes | [optional] 
**threads_per_core** | **str** | threads per core required by job | [optional] 
**tres_bind** | **str** | Task to TRES binding directives | [optional] 
**tres_freq** | **str** | TRES frequency directives | [optional] 
**tres_per_job** | **str** | semicolon delimited list of TRES&#x3D;# values | [optional] 
**tres_per_node** | **str** | semicolon delimited list of TRES&#x3D;# values | [optional] 
**tres_per_socket** | **str** | semicolon delimited list of TRES&#x3D;# values | [optional] 
**tres_per_task** | **str** | semicolon delimited list of TRES&#x3D;# values | [optional] 
**tres_req_str** | **str** | tres reqeusted in the job | [optional] 
**tres_alloc_str** | **str** | tres used in the job | [optional] 
**user_id** | **str** | user id the job runs as | [optional] 
**user_name** | **str** | user the job runs as | [optional] 
**wckey** | **str** | wckey for job | [optional] 
**current_working_directory** | **str** | pathname of working directory | [optional] 

## Example

```python
from openapi_client.models.v0037_job_response_properties import V0037JobResponseProperties

# TODO update the JSON string below
json = "{}"
# create an instance of V0037JobResponseProperties from a JSON string
v0037_job_response_properties_instance = V0037JobResponseProperties.from_json(json)
# print the JSON string representation of the object
print V0037JobResponseProperties.to_json()

# convert the object into a dict
v0037_job_response_properties_dict = v0037_job_response_properties_instance.to_dict()
# create an instance of V0037JobResponseProperties from a dict
v0037_job_response_properties_form_dict = v0037_job_response_properties.from_dict(v0037_job_response_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


