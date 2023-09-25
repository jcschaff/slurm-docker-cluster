

# V0037JobResponseProperties


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**account** | **String** | Charge resources used by this job to specified account |  [optional] |
|**accrueTime** | **Long** | time job is eligible for running |  [optional] |
|**adminComment** | **String** | administrator&#39;s arbitrary comment |  [optional] |
|**arrayJobId** | **String** | job_id of a job array or 0 if N/A |  [optional] |
|**arrayTaskId** | **String** | task_id of a job array |  [optional] |
|**arrayMaxTasks** | **String** | Maximum number of running array tasks |  [optional] |
|**arrayTaskString** | **String** | string expression of task IDs in this record |  [optional] |
|**associationId** | **String** | association id for job |  [optional] |
|**batchFeatures** | **String** | features required for batch script&#39;s node |  [optional] |
|**batchFlag** | **Boolean** | if batch: queued job with script |  [optional] |
|**batchHost** | **String** | name of host running batch script |  [optional] |
|**flags** | **List&lt;String&gt;** | Job flags |  [optional] |
|**burstBuffer** | **String** | burst buffer specifications |  [optional] |
|**burstBufferState** | **String** | burst buffer state info |  [optional] |
|**cluster** | **String** | name of cluster that the job is on |  [optional] |
|**clusterFeatures** | **String** | comma separated list of required cluster features |  [optional] |
|**command** | **String** | command to be executed |  [optional] |
|**comment** | **String** | arbitrary comment |  [optional] |
|**contiguous** | **Boolean** | job requires contiguous nodes |  [optional] |
|**coreSpec** | **String** | specialized core count |  [optional] |
|**threadSpec** | **String** | specialized thread count |  [optional] |
|**coresPerSocket** | **String** | cores per socket required by job |  [optional] |
|**billableTres** | **String** | billable TRES |  [optional] |
|**cpusPerTask** | **String** | number of processors required for each task |  [optional] |
|**cpuFrequencyMinimum** | **String** | Minimum cpu frequency |  [optional] |
|**cpuFrequencyMaximum** | **String** | Maximum cpu frequency |  [optional] |
|**cpuFrequencyGovernor** | **String** | cpu frequency governor |  [optional] |
|**cpusPerTres** | **String** | semicolon delimited list of TRES&#x3D;# values |  [optional] |
|**deadline** | **String** | job start deadline  |  [optional] |
|**delayBoot** | **String** | command to be executed |  [optional] |
|**dependency** | **String** | synchronize job execution with other jobs |  [optional] |
|**derivedExitCode** | **String** | highest exit code of all job steps |  [optional] |
|**eligibleTime** | **Long** | time job is eligible for running |  [optional] |
|**endTime** | **Long** | time of termination, actual or expected |  [optional] |
|**excludedNodes** | **String** | comma separated list of excluded nodes |  [optional] |
|**exitCode** | **Integer** | exit code for job |  [optional] |
|**features** | **String** | comma separated list of required features |  [optional] |
|**federationOrigin** | **String** | Origin cluster&#39;s name |  [optional] |
|**federationSiblingsActive** | **String** | string of active sibling names |  [optional] |
|**federationSiblingsViable** | **String** | string of viable sibling names |  [optional] |
|**gresDetail** | **List&lt;String&gt;** | Job flags |  [optional] |
|**groupId** | **String** | group job submitted as |  [optional] |
|**jobId** | **String** | job ID |  [optional] |
|**jobResources** | [**V0037JobResources**](V0037JobResources.md) |  |  [optional] |
|**jobState** | **String** | state of the job |  [optional] |
|**lastSchedEvaluation** | **String** | last time job was evaluated for scheduling |  [optional] |
|**licenses** | **String** | licenses required by the job |  [optional] |
|**maxCpus** | **String** | maximum number of cpus usable by job |  [optional] |
|**maxNodes** | **String** | maximum number of nodes usable by job |  [optional] |
|**mcsLabel** | **String** | mcs_label if mcs plugin in use |  [optional] |
|**memoryPerTres** | **String** | semicolon delimited list of TRES&#x3D;# values |  [optional] |
|**name** | **String** | name of the job |  [optional] |
|**nodes** | **String** | list of nodes allocated to job |  [optional] |
|**nice** | **String** | requested priority change |  [optional] |
|**tasksPerCore** | **String** | number of tasks to invoke on each core |  [optional] |
|**tasksPerSocket** | **String** | number of tasks to invoke on each socket |  [optional] |
|**tasksPerBoard** | **String** | number of tasks to invoke on each board |  [optional] |
|**cpus** | **String** | minimum number of cpus required by job |  [optional] |
|**nodeCount** | **String** | minimum number of nodes required by job |  [optional] |
|**tasks** | **String** | requested task count |  [optional] |
|**hetJobId** | **String** | job ID of hetjob leader |  [optional] |
|**hetJobIdSet** | **String** | job IDs for all components |  [optional] |
|**hetJobOffset** | **String** | HetJob component offset from leader |  [optional] |
|**partition** | **String** | name of assigned partition |  [optional] |
|**memoryPerNode** | **String** | minimum real memory per node |  [optional] |
|**memoryPerCpu** | **String** | minimum real memory per cpu |  [optional] |
|**minimumCpusPerNode** | **String** | minimum # CPUs per node |  [optional] |
|**minimumTmpDiskPerNode** | **String** | minimum tmp disk per node |  [optional] |
|**preemptTime** | **Long** | preemption signal time |  [optional] |
|**preSusTime** | **Long** | time job ran prior to last suspend |  [optional] |
|**priority** | **String** | relative priority of the job |  [optional] |
|**profile** | **List&lt;String&gt;** | Job profiling requested |  [optional] |
|**qos** | **String** | Quality of Service |  [optional] |
|**reboot** | **Boolean** | node reboot requested before start |  [optional] |
|**requiredNodes** | **String** | comma separated list of required nodes |  [optional] |
|**requeue** | **Boolean** | enable or disable job requeue option |  [optional] |
|**resizeTime** | **Long** | time of latest size change |  [optional] |
|**restartCnt** | **String** | count of job restarts |  [optional] |
|**resvName** | **String** | reservation name |  [optional] |
|**shared** | **String** | type and if job can share nodes with other jobs |  [optional] |
|**showFlags** | **List&lt;String&gt;** | details requested |  [optional] |
|**socketsPerBoard** | **String** | sockets per board required by job |  [optional] |
|**socketsPerNode** | **String** | sockets per node required by job |  [optional] |
|**startTime** | **Long** | time execution begins, actual or expected |  [optional] |
|**stateDescription** | **String** | optional details for state_reason |  [optional] |
|**stateReason** | **String** | reason job still pending or failed |  [optional] |
|**standardError** | **String** | pathname of job&#39;s stderr file |  [optional] |
|**standardInput** | **String** | pathname of job&#39;s stdin file |  [optional] |
|**standardOutput** | **String** | pathname of job&#39;s stdout file |  [optional] |
|**submitTime** | **Long** | time of job submission |  [optional] |
|**suspendTime** | **Long** | time job last suspended or resumed |  [optional] |
|**systemComment** | **String** | slurmctld&#39;s arbitrary comment |  [optional] |
|**timeLimit** | **String** | maximum run time in minutes |  [optional] |
|**timeMinimum** | **String** | minimum run time in minutes |  [optional] |
|**threadsPerCore** | **String** | threads per core required by job |  [optional] |
|**tresBind** | **String** | Task to TRES binding directives |  [optional] |
|**tresFreq** | **String** | TRES frequency directives |  [optional] |
|**tresPerJob** | **String** | semicolon delimited list of TRES&#x3D;# values |  [optional] |
|**tresPerNode** | **String** | semicolon delimited list of TRES&#x3D;# values |  [optional] |
|**tresPerSocket** | **String** | semicolon delimited list of TRES&#x3D;# values |  [optional] |
|**tresPerTask** | **String** | semicolon delimited list of TRES&#x3D;# values |  [optional] |
|**tresReqStr** | **String** | tres reqeusted in the job |  [optional] |
|**tresAllocStr** | **String** | tres used in the job |  [optional] |
|**userId** | **String** | user id the job runs as |  [optional] |
|**userName** | **String** | user the job runs as |  [optional] |
|**wckey** | **String** | wckey for job |  [optional] |
|**currentWorkingDirectory** | **String** | pathname of working directory |  [optional] |



