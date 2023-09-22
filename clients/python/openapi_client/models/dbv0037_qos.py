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


from typing import List, Optional, Union
from pydantic import BaseModel, Field, StrictFloat, StrictInt, StrictStr, conlist
from openapi_client.models.dbv0037_qos_limits import Dbv0037QosLimits
from openapi_client.models.dbv0037_qos_preempt import Dbv0037QosPreempt

class Dbv0037Qos(BaseModel):
    """
    QOS description  # noqa: E501
    """
    description: Optional[StrictStr] = Field(None, description="QOS description")
    flags: Optional[conlist(StrictStr)] = Field(None, description="List of properties of QOS")
    id: Optional[StrictStr] = Field(None, description="Database id")
    limits: Optional[Dbv0037QosLimits] = None
    preempt: Optional[Dbv0037QosPreempt] = None
    priority: Optional[StrictInt] = Field(None, description="QOS priority")
    usage_factor: Optional[Union[StrictFloat, StrictInt]] = Field(None, description="Usage factor")
    usage_threshold: Optional[Union[StrictFloat, StrictInt]] = Field(None, description="Usage threshold")
    __properties = ["description", "flags", "id", "limits", "preempt", "priority", "usage_factor", "usage_threshold"]

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
    def from_json(cls, json_str: str) -> Dbv0037Qos:
        """Create an instance of Dbv0037Qos from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of limits
        if self.limits:
            _dict['limits'] = self.limits.to_dict()
        # override the default output from pydantic by calling `to_dict()` of preempt
        if self.preempt:
            _dict['preempt'] = self.preempt.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> Dbv0037Qos:
        """Create an instance of Dbv0037Qos from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return Dbv0037Qos.parse_obj(obj)

        _obj = Dbv0037Qos.parse_obj({
            "description": obj.get("description"),
            "flags": obj.get("flags"),
            "id": obj.get("id"),
            "limits": Dbv0037QosLimits.from_dict(obj.get("limits")) if obj.get("limits") is not None else None,
            "preempt": Dbv0037QosPreempt.from_dict(obj.get("preempt")) if obj.get("preempt") is not None else None,
            "priority": obj.get("priority"),
            "usage_factor": obj.get("usage_factor"),
            "usage_threshold": obj.get("usage_threshold")
        })
        return _obj

