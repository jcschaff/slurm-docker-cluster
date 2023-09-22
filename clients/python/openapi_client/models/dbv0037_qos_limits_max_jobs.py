# coding: utf-8

"""
    Slurm Rest API

    API to access and control Slurm.

    The version of the OpenAPI document: 0.0.37
    Contact: sales@schedmd.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json


from typing import Optional
from pydantic import BaseModel
from openapi_client.models.dbv0037_qos_limits_max_jobs_active_jobs import Dbv0037QosLimitsMaxJobsActiveJobs

class Dbv0037QosLimitsMaxJobs(BaseModel):
    """
    Limits on jobs settings  # noqa: E501
    """
    active_jobs: Optional[Dbv0037QosLimitsMaxJobsActiveJobs] = None
    __properties = ["active_jobs"]

    class Config:
        """Pydantic configuration"""
        allow_population_by_field_name = True
        validate_assignment = True

    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.dict(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Dbv0037QosLimitsMaxJobs:
        """Create an instance of Dbv0037QosLimitsMaxJobs from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of active_jobs
        if self.active_jobs:
            _dict['active_jobs'] = self.active_jobs.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> Dbv0037QosLimitsMaxJobs:
        """Create an instance of Dbv0037QosLimitsMaxJobs from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return Dbv0037QosLimitsMaxJobs.parse_obj(obj)

        _obj = Dbv0037QosLimitsMaxJobs.parse_obj({
            "active_jobs": Dbv0037QosLimitsMaxJobsActiveJobs.from_dict(obj.get("active_jobs")) if obj.get("active_jobs") is not None else None
        })
        return _obj


