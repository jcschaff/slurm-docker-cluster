

# V0037Node


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**architecture** | **String** | computer architecture |  [optional] |
|**burstbufferNetworkAddress** | **String** | BcastAddr |  [optional] |
|**boards** | **Integer** | total number of boards per node |  [optional] |
|**bootTime** | **Long** | timestamp of node boot |  [optional] |
|**cores** | **Integer** | number of cores per socket |  [optional] |
|**cpuBinding** | **Integer** | Default task binding |  [optional] |
|**cpuLoad** | **Long** | CPU load * 100 |  [optional] |
|**freeMemory** | **Integer** | free memory in MiB |  [optional] |
|**cpus** | **Integer** | configured count of cpus running on the node |  [optional] |
|**features** | **String** |  |  [optional] |
|**activeFeatures** | **String** | list of a node&#39;s available features |  [optional] |
|**gres** | **String** | list of a node&#39;s generic resources |  [optional] |
|**gresDrained** | **String** | list of drained GRES |  [optional] |
|**gresUsed** | **String** | list of GRES in current use |  [optional] |
|**mcsLabel** | **String** | mcs label if mcs plugin in use |  [optional] |
|**name** | **String** | node name to slurm |  [optional] |
|**nextStateAfterReboot** | **String** | state after reboot |  [optional] |
|**nextStateAfterRebootFlags** | **List&lt;String&gt;** | node state flags |  [optional] |
|**address** | **String** | state after reboot |  [optional] |
|**hostname** | **String** | node&#39;s hostname |  [optional] |
|**state** | **String** | current node state |  [optional] |
|**stateFlags** | **List&lt;String&gt;** | node state flags |  [optional] |
|**operatingSystem** | **String** | operating system |  [optional] |
|**owner** | **String** | User allowed to use this node |  [optional] |
|**partitions** | **List&lt;String&gt;** | assigned partitions |  [optional] |
|**port** | **Integer** | TCP port number of the slurmd |  [optional] |
|**realMemory** | **Integer** | configured MB of real memory on the node |  [optional] |
|**reason** | **String** | reason for node being DOWN or DRAINING |  [optional] |
|**reasonChangedAt** | **Integer** | Time stamp when reason was set |  [optional] |
|**reasonSetByUser** | **String** | User that set the reason |  [optional] |
|**slurmdStartTime** | **Long** | timestamp of slurmd startup |  [optional] |
|**sockets** | **Integer** | total number of sockets per node |  [optional] |
|**threads** | **Integer** | number of threads per core |  [optional] |
|**temporaryDisk** | **Integer** | configured MB of total disk in TMP_FS |  [optional] |
|**weight** | **Integer** | arbitrary priority of node for scheduling |  [optional] |
|**tres** | **String** | TRES on node |  [optional] |
|**tresUsed** | **String** | TRES used on node |  [optional] |
|**tresWeighted** | **Double** | TRES weight used on node |  [optional] |
|**slurmdVersion** | **String** | Slurmd version |  [optional] |
|**allocCpus** | **Long** | Allocated CPUs |  [optional] |
|**idleCpus** | **Long** | Idle CPUs |  [optional] |
|**allocMemory** | **Long** | Allocated memory (MB) |  [optional] |



