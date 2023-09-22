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


from typing import List, Optional
from pydantic import BaseModel, Field, conlist
from openapi_client.models.dbv0037_error import Dbv0037Error
from openapi_client.models.dbv0037_job import Dbv0037Job

class Dbv0037JobInfo(BaseModel):
    """
    Dbv0037JobInfo
    """
    errors: Optional[conlist(Dbv0037Error)] = Field(None, description="Slurm errors")
    jobs: Optional[conlist(Dbv0037Job)] = Field(None, description="Array of jobs")
    __properties = ["errors", "jobs"]

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
    def from_json(cls, json_str: str) -> Dbv0037JobInfo:
        """Create an instance of Dbv0037JobInfo from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of each item in errors (list)
        _items = []
        if self.errors:
            for _item in self.errors:
                if _item:
                    _items.append(_item.to_dict())
            _dict['errors'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in jobs (list)
        _items = []
        if self.jobs:
            for _item in self.jobs:
                if _item:
                    _items.append(_item.to_dict())
            _dict['jobs'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> Dbv0037JobInfo:
        """Create an instance of Dbv0037JobInfo from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return Dbv0037JobInfo.parse_obj(obj)

        _obj = Dbv0037JobInfo.parse_obj({
            "errors": [Dbv0037Error.from_dict(_item) for _item in obj.get("errors")] if obj.get("errors") is not None else None,
            "jobs": [Dbv0037Job.from_dict(_item) for _item in obj.get("jobs")] if obj.get("jobs") is not None else None
        })
        return _obj

