# V0037Reservation


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accounts** | **str** | Allowed accounts | [optional] 
**burst_buffer** | **str** | Reserved burst buffer | [optional] 
**core_count** | **int** | Number of reserved cores | [optional] 
**core_spec_cnt** | **int** | Number of reserved specialized cores | [optional] 
**end_time** | **int** | End time of the reservation | [optional] 
**features** | **str** | List of features | [optional] 
**flags** | **List[str]** | Reservation options | [optional] 
**groups** | **str** | List of groups permitted to use the reserved nodes | [optional] 
**licenses** | **str** | List of licenses | [optional] 
**max_start_delay** | **int** | Maximum delay in which jobs outside of the reservation will be permitted to overlap once any jobs are queued for the reservation | [optional] 
**name** | **str** | Reservationn name | [optional] 
**node_count** | **int** | Count of nodes reserved | [optional] 
**node_list** | **str** | List of reserved nodes | [optional] 
**partition** | **str** | Partition | [optional] 
**purge_completed** | [**V0037ReservationPurgeCompleted**](V0037ReservationPurgeCompleted.md) |  | [optional] 
**start_time** | **int** | Start time of reservation | [optional] 
**watts** | **int** | amount of power to reserve in watts | [optional] 
**tres** | **str** | List of TRES | [optional] 
**users** | **str** | List of users | [optional] 

## Example

```python
from openapi_client.models.v0037_reservation import V0037Reservation

# TODO update the JSON string below
json = "{}"
# create an instance of V0037Reservation from a JSON string
v0037_reservation_instance = V0037Reservation.from_json(json)
# print the JSON string representation of the object
print V0037Reservation.to_json()

# convert the object into a dict
v0037_reservation_dict = v0037_reservation_instance.to_dict()
# create an instance of V0037Reservation from a dict
v0037_reservation_form_dict = v0037_reservation.from_dict(v0037_reservation_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


