

# JobProperties


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**account** | **String** | Charge resources used by this job to specified account. |  [optional] |
|**accountGatherFreqency** | **String** | Define the job accounting and profiling sampling intervals. |  [optional] |
|**argv** | **List&lt;String&gt;** | Arguments to the script. |  [optional] |
|**array** | **String** | Submit a job array, multiple jobs to be executed with identical parameters. The indexes specification identifies what array index values should be used. |  [optional] |
|**batchFeatures** | **String** | features required for batch script&#39;s node |  [optional] |
|**beginTime** | **String** | Submit the batch script to the Slurm controller immediately, like normal, but tell the controller to defer the allocation of the job until the specified time. |  [optional] |
|**burstBuffer** | **String** | Burst buffer specification. |  [optional] |
|**clusterConstraints** | **String** | Specifies features that a federated cluster must have to have a sibling job submitted to it. |  [optional] |
|**comment** | **String** | An arbitrary comment. |  [optional] |
|**constraints** | **String** | node features required by job. |  [optional] |
|**coreSpecification** | **Integer** | Count of specialized threads per node reserved by the job for system operations and not used by the application. |  [optional] |
|**coresPerSocket** | **Integer** | Restrict node selection to nodes with at least the specified number of cores per socket. |  [optional] |
|**cpuBinding** | **String** | Cpu binding |  [optional] |
|**cpuBindingHint** | **String** | Cpu binding hint |  [optional] |
|**cpuFrequency** | **String** | Request that job steps initiated by srun commands inside this sbatch script be run at some requested frequency if possible, on the CPUs selected for the step on the compute node(s). |  [optional] |
|**cpusPerGpu** | **String** | Number of CPUs requested per allocated GPU. |  [optional] |
|**cpusPerTask** | **Integer** | Advise the Slurm controller that ensuing job steps will require ncpus number of processors per task. |  [optional] |
|**currentWorkingDirectory** | **String** | Instruct Slurm to connect the batch script&#39;s standard output directly to the file name. |  [optional] |
|**deadline** | **String** | Remove the job if no ending is possible before this deadline (start &gt; (deadline - time[-min])). |  [optional] |
|**delayBoot** | **Integer** | Do not reboot nodes in order to satisfied this job&#39;s feature specification if the job has been eligible to run for less than this time period. |  [optional] |
|**dependency** | **String** | Defer the start of this job until the specified dependencies have been satisfied completed. |  [optional] |
|**distribution** | **String** | Specify alternate distribution methods for remote processes. |  [optional] |
|**environment** | **Object** | Dictionary of environment entries. |  [optional] |
|**exclusive** | [**JobPropertiesExclusive**](JobPropertiesExclusive.md) |  |  [optional] |
|**getUserEnvironment** | **Boolean** | Load new login environment for user on job node. |  [optional] |
|**gres** | **String** | Specifies a comma delimited list of generic consumable resources. |  [optional] |
|**gresFlags** | [**GresFlagsEnum**](#GresFlagsEnum) | Specify generic resource task binding options. |  [optional] |
|**gpuBinding** | **String** | Requested binding of tasks to GPU. |  [optional] |
|**gpuFrequency** | **String** | Requested GPU frequency. |  [optional] |
|**gpus** | **String** | GPUs per job. |  [optional] |
|**gpusPerNode** | **String** | GPUs per node. |  [optional] |
|**gpusPerSocket** | **String** | GPUs per socket. |  [optional] |
|**gpusPerTask** | **String** | GPUs per task. |  [optional] |
|**hold** | **Boolean** | Specify the job is to be submitted in a held state (priority of zero). |  [optional] |
|**killOnInvalidDependency** | **Boolean** | If a job has an invalid dependency, then Slurm is to terminate it. |  [optional] |
|**licenses** | **String** | Specification of licenses (or other resources available on all nodes of the cluster) which must be allocated to this job. |  [optional] |
|**mailType** | **String** | Notify user by email when certain event types occur. |  [optional] |
|**mailUser** | **String** | User to receive email notification of state changes as defined by mail_type. |  [optional] |
|**mcsLabel** | **String** | This parameter is a group among the groups of the user. |  [optional] |
|**memoryBinding** | **String** | Bind tasks to memory. |  [optional] |
|**memoryPerCpu** | **Integer** | Minimum real memory per cpu (MB). |  [optional] |
|**memoryPerGpu** | **Integer** | Minimum memory required per allocated GPU. |  [optional] |
|**memoryPerNode** | **Integer** | Minimum real memory per node (MB). |  [optional] |
|**minimumCpusPerNode** | **Integer** | Minimum number of CPUs per node. |  [optional] |
|**minimumNodes** | **Boolean** | If a range of node counts is given, prefer the smaller count. |  [optional] |
|**name** | **String** | Specify a name for the job allocation. |  [optional] |
|**nice** | **String** | Run the job with an adjusted scheduling priority within Slurm. |  [optional] |
|**noKill** | **Boolean** | Do not automatically terminate a job if one of the nodes it has been allocated fails. |  [optional] |
|**nodes** | [**JobPropertiesNodes**](JobPropertiesNodes.md) |  |  [optional] |
|**openMode** | [**OpenModeEnum**](#OpenModeEnum) | Open the output and error files using append or truncate mode as specified. |  [optional] |
|**partition** | **String** | Request a specific partition for the resource allocation. |  [optional] |
|**priority** | **String** | Request a specific job priority. |  [optional] |
|**qos** | **String** | Request a quality of service for the job. |  [optional] |
|**requeue** | **Boolean** | Specifies that the batch job should eligible to being requeue. |  [optional] |
|**reservation** | **String** | Allocate resources for the job from the named reservation. |  [optional] |
|**signal** | **String** | When a job is within sig_time seconds of its end time, send it the signal sig_num. |  [optional] |
|**socketsPerNode** | **Integer** | Restrict node selection to nodes with at least the specified number of sockets. |  [optional] |
|**spreadJob** | **Boolean** | Spread the job allocation over as many nodes as possible and attempt to evenly distribute tasks across the allocated nodes. |  [optional] |
|**standardError** | **String** | Instruct Slurm to connect the batch script&#39;s standard error directly to the file name. |  [optional] |
|**standardIn** | **String** | Instruct Slurm to connect the batch script&#39;s standard input directly to the file name specified. |  [optional] |
|**standardOut** | **String** | Instruct Slurm to connect the batch script&#39;s standard output directly to the file name. |  [optional] |
|**tasks** | **Integer** | Advises the Slurm controller that job steps run within the allocation will launch a maximum of number tasks and to provide for sufficient resources. |  [optional] |
|**tasksPerCore** | **Integer** | Request the maximum ntasks be invoked on each core. |  [optional] |
|**tasksPerNode** | **Integer** | Request the maximum ntasks be invoked on each node. |  [optional] |
|**tasksPerSocket** | **Integer** | Request the maximum ntasks be invoked on each socket. |  [optional] |
|**threadSpecification** | **Integer** | Count of specialized threads per node reserved by the job for system operations and not used by the application. |  [optional] |
|**threadsPerCore** | **Integer** | Restrict node selection to nodes with at least the specified number of threads per core. |  [optional] |
|**timeLimit** | **Integer** | Step time limit. |  [optional] |
|**timeMinimum** | **Integer** | Minimum run time in minutes. |  [optional] |
|**waitAllNodes** | **Boolean** | Do not begin execution until all nodes are ready for use. |  [optional] |
|**wckey** | **String** | Specify wckey to be used with job. |  [optional] |



## Enum: GresFlagsEnum

| Name | Value |
|---- | -----|
| DISABLE_BINDING | &quot;disable-binding&quot; |
| ENFORCE_BINDING | &quot;enforce-binding&quot; |



## Enum: OpenModeEnum

| Name | Value |
|---- | -----|
| APPEND | &quot;append&quot; |
| TRUNCATE | &quot;truncate&quot; |



