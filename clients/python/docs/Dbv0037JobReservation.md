# Dbv0037JobReservation

Reservation usage details

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Database id of reservation | [optional] 
**name** | **int** | Name of reservation | [optional] 

## Example

```python
from openapi_client.models.dbv0037_job_reservation import Dbv0037JobReservation

# TODO update the JSON string below
json = "{}"
# create an instance of Dbv0037JobReservation from a JSON string
dbv0037_job_reservation_instance = Dbv0037JobReservation.from_json(json)
# print the JSON string representation of the object
print Dbv0037JobReservation.to_json()

# convert the object into a dict
dbv0037_job_reservation_dict = dbv0037_job_reservation_instance.to_dict()
# create an instance of Dbv0037JobReservation from a dict
dbv0037_job_reservation_form_dict = dbv0037_job_reservation.from_dict(dbv0037_job_reservation_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


