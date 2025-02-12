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
from openapi_client.models.dbv0037_job_step_step_het import Dbv0037JobStepStepHet

class Dbv0037JobStepStep(BaseModel):
    """
    Step details  # noqa: E501
    """
    job_id: Optional[StrictInt] = Field(None, description="Parent job id")
    het: Optional[Dbv0037JobStepStepHet] = None
    id: Optional[StrictStr] = Field(None, description="Step id")
    name: Optional[StrictStr] = Field(None, description="Step name")
    __properties = ["job_id", "het", "id", "name"]

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
    def from_json(cls, json_str: str) -> Dbv0037JobStepStep:
        """Create an instance of Dbv0037JobStepStep from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of het
        if self.het:
            _dict['het'] = self.het.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> Dbv0037JobStepStep:
        """Create an instance of Dbv0037JobStepStep from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return Dbv0037JobStepStep.parse_obj(obj)

        _obj = Dbv0037JobStepStep.parse_obj({
            "job_id": obj.get("job_id"),
            "het": Dbv0037JobStepStepHet.from_dict(obj.get("het")) if obj.get("het") is not None else None,
            "id": obj.get("id"),
            "name": obj.get("name")
        })
        return _obj


