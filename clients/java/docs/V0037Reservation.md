

# V0037Reservation


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accounts** | **String** | Allowed accounts |  [optional] |
|**burstBuffer** | **String** | Reserved burst buffer |  [optional] |
|**coreCount** | **Integer** | Number of reserved cores |  [optional] |
|**coreSpecCnt** | **Integer** | Number of reserved specialized cores |  [optional] |
|**endTime** | **Integer** | End time of the reservation |  [optional] |
|**features** | **String** | List of features |  [optional] |
|**flags** | **List&lt;String&gt;** | Reservation options |  [optional] |
|**groups** | **String** | List of groups permitted to use the reserved nodes |  [optional] |
|**licenses** | **String** | List of licenses |  [optional] |
|**maxStartDelay** | **Integer** | Maximum delay in which jobs outside of the reservation will be permitted to overlap once any jobs are queued for the reservation |  [optional] |
|**name** | **String** | Reservationn name |  [optional] |
|**nodeCount** | **Integer** | Count of nodes reserved |  [optional] |
|**nodeList** | **String** | List of reserved nodes |  [optional] |
|**partition** | **String** | Partition |  [optional] |
|**purgeCompleted** | [**V0037ReservationPurgeCompleted**](V0037ReservationPurgeCompleted.md) |  |  [optional] |
|**startTime** | **Integer** | Start time of reservation |  [optional] |
|**watts** | **Integer** | amount of power to reserve in watts |  [optional] |
|**tres** | **String** | List of TRES |  [optional] |
|**users** | **String** | List of users |  [optional] |



