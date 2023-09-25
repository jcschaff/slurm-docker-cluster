

# V0037Partition


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**flags** | **List&lt;String&gt;** | partition options |  [optional] |
|**preemptionMode** | **List&lt;String&gt;** | preemption type |  [optional] |
|**allowedAllocationNodes** | **String** | list names of allowed allocating nodes |  [optional] |
|**allowedAccounts** | **String** | comma delimited list of accounts |  [optional] |
|**allowedGroups** | **String** | comma delimited list of groups |  [optional] |
|**allowedQos** | **String** | comma delimited list of qos |  [optional] |
|**alternative** | **String** | name of alternate partition |  [optional] |
|**billingWeights** | **String** | TRES billing weights |  [optional] |
|**defaultMemoryPerCpu** | **Long** | default MB memory per allocated CPU |  [optional] |
|**defaultTimeLimit** | **Long** | default time limit (minutes) |  [optional] |
|**deniedAccounts** | **String** | comma delimited list of denied accounts |  [optional] |
|**deniedQos** | **String** | comma delimited list of denied qos |  [optional] |
|**preemptionGraceTime** | **Long** | preemption grace time (seconds) |  [optional] |
|**maximumCpusPerNode** | **Integer** | maximum allocated CPUs per node |  [optional] |
|**maximumMemoryPerNode** | **Long** | maximum memory per allocated CPU (MiB) |  [optional] |
|**maximumNodesPerJob** | **Integer** | Max nodes per job |  [optional] |
|**maxTimeLimit** | **Long** | Max time limit per job |  [optional] |
|**minNodesPerJob** | **Integer** | Min number of nodes per job |  [optional] |
|**name** | **String** | Partition name |  [optional] |
|**nodes** | **String** | list names of nodes in partition |  [optional] |
|**overTimeLimit** | **Integer** | job&#39;s time limit can be exceeded by this number of minutes before cancellation |  [optional] |
|**priorityJobFactor** | **Integer** | job priority weight factor |  [optional] |
|**priorityTier** | **Integer** | tier for scheduling and preemption |  [optional] |
|**qos** | **String** | partition QOS name |  [optional] |
|**state** | **String** | Partition state |  [optional] |
|**totalCpus** | **Integer** | Total cpus in partition |  [optional] |
|**totalNodes** | **Integer** | Total number of nodes in partition |  [optional] |
|**tres** | **String** | configured TRES in partition |  [optional] |



