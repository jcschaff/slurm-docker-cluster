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
from openapi_client.models.dbv0037_account import Dbv0037Account
from openapi_client.models.dbv0037_association import Dbv0037Association
from openapi_client.models.dbv0037_error import Dbv0037Error
from openapi_client.models.dbv0037_qos import Dbv0037Qos
from openapi_client.models.dbv0037_tres_list_inner import Dbv0037TresListInner
from openapi_client.models.dbv0037_user import Dbv0037User
from openapi_client.models.dbv0037_wckey import Dbv0037Wckey

class Dbv0037ConfigInfo(BaseModel):
    """
    Dbv0037ConfigInfo
    """
    errors: Optional[conlist(Dbv0037Error)] = Field(None, description="Slurm errors")
    tres: Optional[conlist(conlist(Dbv0037TresListInner))] = Field(None, description="Array of TRES")
    accounts: Optional[conlist(Dbv0037Account)] = Field(None, description="Array of accounts")
    associations: Optional[conlist(Dbv0037Association)] = Field(None, description="Array of associations")
    users: Optional[conlist(Dbv0037User)] = Field(None, description="Array of users")
    qos: Optional[conlist(Dbv0037Qos)] = Field(None, description="Array of qos")
    wckeys: Optional[conlist(Dbv0037Wckey)] = Field(None, description="Array of wckeys")
    __properties = ["errors", "tres", "accounts", "associations", "users", "qos", "wckeys"]

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
    def from_json(cls, json_str: str) -> Dbv0037ConfigInfo:
        """Create an instance of Dbv0037ConfigInfo from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in tres (list of list)
        _items = []
        if self.tres:
            for _item in self.tres:
                if _item:
                    _items.append(
                         [_inner_item.to_dict() for _inner_item in _item if _inner_item is not None]
                    )
            _dict['tres'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in accounts (list)
        _items = []
        if self.accounts:
            for _item in self.accounts:
                if _item:
                    _items.append(_item.to_dict())
            _dict['accounts'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in associations (list)
        _items = []
        if self.associations:
            for _item in self.associations:
                if _item:
                    _items.append(_item.to_dict())
            _dict['associations'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in users (list)
        _items = []
        if self.users:
            for _item in self.users:
                if _item:
                    _items.append(_item.to_dict())
            _dict['users'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in qos (list)
        _items = []
        if self.qos:
            for _item in self.qos:
                if _item:
                    _items.append(_item.to_dict())
            _dict['qos'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in wckeys (list)
        _items = []
        if self.wckeys:
            for _item in self.wckeys:
                if _item:
                    _items.append(_item.to_dict())
            _dict['wckeys'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> Dbv0037ConfigInfo:
        """Create an instance of Dbv0037ConfigInfo from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return Dbv0037ConfigInfo.parse_obj(obj)

        _obj = Dbv0037ConfigInfo.parse_obj({
            "errors": [Dbv0037Error.from_dict(_item) for _item in obj.get("errors")] if obj.get("errors") is not None else None,
            "tres": [
                    [Dbv0037TresListInner.from_dict(_inner_item) for _inner_item in _item]
                    for _item in obj.get("tres")
                ] if obj.get("tres") is not None else None,
            "accounts": [Dbv0037Account.from_dict(_item) for _item in obj.get("accounts")] if obj.get("accounts") is not None else None,
            "associations": [Dbv0037Association.from_dict(_item) for _item in obj.get("associations")] if obj.get("associations") is not None else None,
            "users": [Dbv0037User.from_dict(_item) for _item in obj.get("users")] if obj.get("users") is not None else None,
            "qos": [Dbv0037Qos.from_dict(_item) for _item in obj.get("qos")] if obj.get("qos") is not None else None,
            "wckeys": [Dbv0037Wckey.from_dict(_item) for _item in obj.get("wckeys")] if obj.get("wckeys") is not None else None
        })
        return _obj


