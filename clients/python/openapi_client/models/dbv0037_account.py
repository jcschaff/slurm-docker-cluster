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
from pydantic import BaseModel, Field, StrictStr, conlist
from openapi_client.models.dbv0037_association_short_info import Dbv0037AssociationShortInfo
from openapi_client.models.dbv0037_coordinator_info import Dbv0037CoordinatorInfo

class Dbv0037Account(BaseModel):
    """
    Account description  # noqa: E501
    """
    associations: Optional[conlist(Dbv0037AssociationShortInfo)] = Field(None, description="List of assigned associations")
    coordinators: Optional[conlist(Dbv0037CoordinatorInfo)] = Field(None, description="List of assigned coordinators")
    description: Optional[StrictStr] = Field(None, description="Description of account")
    name: Optional[StrictStr] = Field(None, description="Name of account")
    organization: Optional[StrictStr] = Field(None, description="Assigned organization of account")
    flags: Optional[conlist(StrictStr)] = Field(None, description="List of properties of account")
    __properties = ["associations", "coordinators", "description", "name", "organization", "flags"]

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
    def from_json(cls, json_str: str) -> Dbv0037Account:
        """Create an instance of Dbv0037Account from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of each item in associations (list)
        _items = []
        if self.associations:
            for _item in self.associations:
                if _item:
                    _items.append(_item.to_dict())
            _dict['associations'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in coordinators (list)
        _items = []
        if self.coordinators:
            for _item in self.coordinators:
                if _item:
                    _items.append(_item.to_dict())
            _dict['coordinators'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> Dbv0037Account:
        """Create an instance of Dbv0037Account from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return Dbv0037Account.parse_obj(obj)

        _obj = Dbv0037Account.parse_obj({
            "associations": [Dbv0037AssociationShortInfo.from_dict(_item) for _item in obj.get("associations")] if obj.get("associations") is not None else None,
            "coordinators": [Dbv0037CoordinatorInfo.from_dict(_item) for _item in obj.get("coordinators")] if obj.get("coordinators") is not None else None,
            "description": obj.get("description"),
            "name": obj.get("name"),
            "organization": obj.get("organization"),
            "flags": obj.get("flags")
        })
        return _obj


