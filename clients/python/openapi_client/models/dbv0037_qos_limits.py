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


from typing import Optional, Union
from pydantic import BaseModel, Field, StrictFloat, StrictInt
from openapi_client.models.dbv0037_qos_limits_max import Dbv0037QosLimitsMax
from openapi_client.models.dbv0037_qos_limits_min import Dbv0037QosLimitsMin

class Dbv0037QosLimits(BaseModel):
    """
    Assigned limits  # noqa: E501
    """
    factor: Optional[Union[StrictFloat, StrictInt]] = Field(None, description="factor to apply to TRES count for associations using this QOS")
    max: Optional[Dbv0037QosLimitsMax] = None
    min: Optional[Dbv0037QosLimitsMin] = None
    __properties = ["factor", "max", "min"]

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
    def from_json(cls, json_str: str) -> Dbv0037QosLimits:
        """Create an instance of Dbv0037QosLimits from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of max
        if self.max:
            _dict['max'] = self.max.to_dict()
        # override the default output from pydantic by calling `to_dict()` of min
        if self.min:
            _dict['min'] = self.min.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> Dbv0037QosLimits:
        """Create an instance of Dbv0037QosLimits from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return Dbv0037QosLimits.parse_obj(obj)

        _obj = Dbv0037QosLimits.parse_obj({
            "factor": obj.get("factor"),
            "max": Dbv0037QosLimitsMax.from_dict(obj.get("max")) if obj.get("max") is not None else None,
            "min": Dbv0037QosLimitsMin.from_dict(obj.get("min")) if obj.get("min") is not None else None
        })
        return _obj


