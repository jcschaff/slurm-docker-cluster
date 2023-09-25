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
from pydantic import BaseModel, Field, StrictInt, StrictStr

class Dbv0037ClusterInfoController(BaseModel):
    """
    Information about controller  # noqa: E501
    """
    host: Optional[StrictStr] = Field(None, description="Hostname")
    port: Optional[StrictInt] = Field(None, description="Port number")
    __properties = ["host", "port"]

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
    def from_json(cls, json_str: str) -> Dbv0037ClusterInfoController:
        """Create an instance of Dbv0037ClusterInfoController from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> Dbv0037ClusterInfoController:
        """Create an instance of Dbv0037ClusterInfoController from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return Dbv0037ClusterInfoController.parse_obj(obj)

        _obj = Dbv0037ClusterInfoController.parse_obj({
            "host": obj.get("host"),
            "port": obj.get("port")
        })
        return _obj


