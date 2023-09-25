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


from typing import Any, Dict, Optional
from pydantic import BaseModel, Field, StrictInt

class V0037NodeAllocation(BaseModel):
    """
    V0037NodeAllocation
    """
    memory: Optional[StrictInt] = Field(None, description="amount of assigned job memory")
    cpus: Optional[Dict[str, Any]] = Field(None, description="amount of assigned job CPUs")
    sockets: Optional[Dict[str, Any]] = Field(None, description="assignment status of each socket by socket id")
    cores: Optional[Dict[str, Any]] = Field(None, description="assignment status of each core by core id")
    __properties = ["memory", "cpus", "sockets", "cores"]

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
    def from_json(cls, json_str: str) -> V0037NodeAllocation:
        """Create an instance of V0037NodeAllocation from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> V0037NodeAllocation:
        """Create an instance of V0037NodeAllocation from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return V0037NodeAllocation.parse_obj(obj)

        _obj = V0037NodeAllocation.parse_obj({
            "memory": obj.get("memory"),
            "cpus": obj.get("cpus"),
            "sockets": obj.get("sockets"),
            "cores": obj.get("cores")
        })
        return _obj


