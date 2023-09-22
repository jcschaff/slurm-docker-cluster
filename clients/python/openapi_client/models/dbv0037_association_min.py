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

class Dbv0037AssociationMin(BaseModel):
    """
    Min settings  # noqa: E501
    """
    priority_threshold: Optional[StrictInt] = Field(None, description="Min priority threshold")
    __properties = ["priority_threshold"]

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
    def from_json(cls, json_str: str) -> Dbv0037AssociationMin:
        """Create an instance of Dbv0037AssociationMin from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> Dbv0037AssociationMin:
        """Create an instance of Dbv0037AssociationMin from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return Dbv0037AssociationMin.parse_obj(obj)

        _obj = Dbv0037AssociationMin.parse_obj({
            "priority_threshold": obj.get("priority_threshold")
        })
        return _obj

