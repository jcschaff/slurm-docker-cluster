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
from pydantic import BaseModel, Field, StrictInt
from openapi_client.models.dbv0037_job_time_system import Dbv0037JobTimeSystem
from openapi_client.models.dbv0037_job_time_total import Dbv0037JobTimeTotal
from openapi_client.models.dbv0037_job_time_user import Dbv0037JobTimeUser

class Dbv0037JobTime(BaseModel):
    """
    Time properties  # noqa: E501
    """
    elapsed: Optional[StrictInt] = Field(None, description="Total time elapsed")
    eligible: Optional[StrictInt] = Field(None, description="Total time eligible to run")
    end: Optional[StrictInt] = Field(None, description="Timestamp of when job ended")
    start: Optional[StrictInt] = Field(None, description="Timestamp of when job started")
    submission: Optional[StrictInt] = Field(None, description="Timestamp of when job submitted")
    suspended: Optional[StrictInt] = Field(None, description="Timestamp of when job last suspended")
    system: Optional[Dbv0037JobTimeSystem] = None
    total: Optional[Dbv0037JobTimeTotal] = None
    user: Optional[Dbv0037JobTimeUser] = None
    limit: Optional[StrictInt] = Field(None, description="Job wall clock time limit")
    __properties = ["elapsed", "eligible", "end", "start", "submission", "suspended", "system", "total", "user", "limit"]

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
    def from_json(cls, json_str: str) -> Dbv0037JobTime:
        """Create an instance of Dbv0037JobTime from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of system
        if self.system:
            _dict['system'] = self.system.to_dict()
        # override the default output from pydantic by calling `to_dict()` of total
        if self.total:
            _dict['total'] = self.total.to_dict()
        # override the default output from pydantic by calling `to_dict()` of user
        if self.user:
            _dict['user'] = self.user.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> Dbv0037JobTime:
        """Create an instance of Dbv0037JobTime from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return Dbv0037JobTime.parse_obj(obj)

        _obj = Dbv0037JobTime.parse_obj({
            "elapsed": obj.get("elapsed"),
            "eligible": obj.get("eligible"),
            "end": obj.get("end"),
            "start": obj.get("start"),
            "submission": obj.get("submission"),
            "suspended": obj.get("suspended"),
            "system": Dbv0037JobTimeSystem.from_dict(obj.get("system")) if obj.get("system") is not None else None,
            "total": Dbv0037JobTimeTotal.from_dict(obj.get("total")) if obj.get("total") is not None else None,
            "user": Dbv0037JobTimeUser.from_dict(obj.get("user")) if obj.get("user") is not None else None,
            "limit": obj.get("limit")
        })
        return _obj


