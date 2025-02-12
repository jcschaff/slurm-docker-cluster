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
from pydantic import BaseModel
from openapi_client.models.dbv0037_association_max_jobs import Dbv0037AssociationMaxJobs
from openapi_client.models.dbv0037_association_max_per import Dbv0037AssociationMaxPer
from openapi_client.models.dbv0037_association_max_tres import Dbv0037AssociationMaxTres

class Dbv0037AssociationMax(BaseModel):
    """
    Max settings  # noqa: E501
    """
    jobs: Optional[Dbv0037AssociationMaxJobs] = None
    per: Optional[Dbv0037AssociationMaxPer] = None
    tres: Optional[Dbv0037AssociationMaxTres] = None
    __properties = ["jobs", "per", "tres"]

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
    def from_json(cls, json_str: str) -> Dbv0037AssociationMax:
        """Create an instance of Dbv0037AssociationMax from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of jobs
        if self.jobs:
            _dict['jobs'] = self.jobs.to_dict()
        # override the default output from pydantic by calling `to_dict()` of per
        if self.per:
            _dict['per'] = self.per.to_dict()
        # override the default output from pydantic by calling `to_dict()` of tres
        if self.tres:
            _dict['tres'] = self.tres.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> Dbv0037AssociationMax:
        """Create an instance of Dbv0037AssociationMax from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return Dbv0037AssociationMax.parse_obj(obj)

        _obj = Dbv0037AssociationMax.parse_obj({
            "jobs": Dbv0037AssociationMaxJobs.from_dict(obj.get("jobs")) if obj.get("jobs") is not None else None,
            "per": Dbv0037AssociationMaxPer.from_dict(obj.get("per")) if obj.get("per") is not None else None,
            "tres": Dbv0037AssociationMaxTres.from_dict(obj.get("tres")) if obj.get("tres") is not None else None
        })
        return _obj


