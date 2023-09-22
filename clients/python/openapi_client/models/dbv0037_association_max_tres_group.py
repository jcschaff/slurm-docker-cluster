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
from openapi_client.models.dbv0037_tres_list_inner import Dbv0037TresListInner

class Dbv0037AssociationMaxTresGroup(BaseModel):
    """
    Max TRES per group  # noqa: E501
    """
    minutes: Optional[conlist(Dbv0037TresListInner)] = Field(None, description="TRES list of attributes")
    active: Optional[conlist(Dbv0037TresListInner)] = Field(None, description="TRES list of attributes")
    __properties = ["minutes", "active"]

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
    def from_json(cls, json_str: str) -> Dbv0037AssociationMaxTresGroup:
        """Create an instance of Dbv0037AssociationMaxTresGroup from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of each item in minutes (list)
        _items = []
        if self.minutes:
            for _item in self.minutes:
                if _item:
                    _items.append(_item.to_dict())
            _dict['minutes'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in active (list)
        _items = []
        if self.active:
            for _item in self.active:
                if _item:
                    _items.append(_item.to_dict())
            _dict['active'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> Dbv0037AssociationMaxTresGroup:
        """Create an instance of Dbv0037AssociationMaxTresGroup from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return Dbv0037AssociationMaxTresGroup.parse_obj(obj)

        _obj = Dbv0037AssociationMaxTresGroup.parse_obj({
            "minutes": [Dbv0037TresListInner.from_dict(_item) for _item in obj.get("minutes")] if obj.get("minutes") is not None else None,
            "active": [Dbv0037TresListInner.from_dict(_item) for _item in obj.get("active")] if obj.get("active") is not None else None
        })
        return _obj

