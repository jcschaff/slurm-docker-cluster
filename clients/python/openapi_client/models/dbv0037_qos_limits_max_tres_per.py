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

class Dbv0037QosLimitsMaxTresPer(BaseModel):
    """
    Max TRES per settings  # noqa: E501
    """
    account: Optional[conlist(Dbv0037TresListInner)] = Field(None, description="TRES list of attributes")
    job: Optional[conlist(Dbv0037TresListInner)] = Field(None, description="TRES list of attributes")
    node: Optional[conlist(Dbv0037TresListInner)] = Field(None, description="TRES list of attributes")
    user: Optional[conlist(Dbv0037TresListInner)] = Field(None, description="TRES list of attributes")
    __properties = ["account", "job", "node", "user"]

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
    def from_json(cls, json_str: str) -> Dbv0037QosLimitsMaxTresPer:
        """Create an instance of Dbv0037QosLimitsMaxTresPer from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of each item in account (list)
        _items = []
        if self.account:
            for _item in self.account:
                if _item:
                    _items.append(_item.to_dict())
            _dict['account'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in job (list)
        _items = []
        if self.job:
            for _item in self.job:
                if _item:
                    _items.append(_item.to_dict())
            _dict['job'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in node (list)
        _items = []
        if self.node:
            for _item in self.node:
                if _item:
                    _items.append(_item.to_dict())
            _dict['node'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in user (list)
        _items = []
        if self.user:
            for _item in self.user:
                if _item:
                    _items.append(_item.to_dict())
            _dict['user'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> Dbv0037QosLimitsMaxTresPer:
        """Create an instance of Dbv0037QosLimitsMaxTresPer from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return Dbv0037QosLimitsMaxTresPer.parse_obj(obj)

        _obj = Dbv0037QosLimitsMaxTresPer.parse_obj({
            "account": [Dbv0037TresListInner.from_dict(_item) for _item in obj.get("account")] if obj.get("account") is not None else None,
            "job": [Dbv0037TresListInner.from_dict(_item) for _item in obj.get("job")] if obj.get("job") is not None else None,
            "node": [Dbv0037TresListInner.from_dict(_item) for _item in obj.get("node")] if obj.get("node") is not None else None,
            "user": [Dbv0037TresListInner.from_dict(_item) for _item in obj.get("user")] if obj.get("user") is not None else None
        })
        return _obj


