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
from pydantic import BaseModel, Field, StrictInt, StrictStr, conlist

class V0037Partition(BaseModel):
    """
    V0037Partition
    """
    flags: Optional[conlist(StrictStr)] = Field(None, description="partition options")
    preemption_mode: Optional[conlist(StrictStr)] = Field(None, description="preemption type")
    allowed_allocation_nodes: Optional[StrictStr] = Field(None, description="list names of allowed allocating nodes")
    allowed_accounts: Optional[StrictStr] = Field(None, description="comma delimited list of accounts")
    allowed_groups: Optional[StrictStr] = Field(None, description="comma delimited list of groups")
    allowed_qos: Optional[StrictStr] = Field(None, description="comma delimited list of qos")
    alternative: Optional[StrictStr] = Field(None, description="name of alternate partition")
    billing_weights: Optional[StrictStr] = Field(None, description="TRES billing weights")
    default_memory_per_cpu: Optional[StrictInt] = Field(None, description="default MB memory per allocated CPU")
    default_time_limit: Optional[StrictInt] = Field(None, description="default time limit (minutes)")
    denied_accounts: Optional[StrictStr] = Field(None, description="comma delimited list of denied accounts")
    denied_qos: Optional[StrictStr] = Field(None, description="comma delimited list of denied qos")
    preemption_grace_time: Optional[StrictInt] = Field(None, description="preemption grace time (seconds)")
    maximum_cpus_per_node: Optional[StrictInt] = Field(None, description="maximum allocated CPUs per node")
    maximum_memory_per_node: Optional[StrictInt] = Field(None, description="maximum memory per allocated CPU (MiB)")
    maximum_nodes_per_job: Optional[StrictInt] = Field(None, description="Max nodes per job")
    max_time_limit: Optional[StrictInt] = Field(None, description="Max time limit per job")
    min_nodes_per_job: Optional[StrictInt] = Field(None, description="Min number of nodes per job")
    name: Optional[StrictStr] = Field(None, description="Partition name")
    nodes: Optional[StrictStr] = Field(None, description="list names of nodes in partition")
    over_time_limit: Optional[StrictInt] = Field(None, description="job's time limit can be exceeded by this number of minutes before cancellation")
    priority_job_factor: Optional[StrictInt] = Field(None, description="job priority weight factor")
    priority_tier: Optional[StrictInt] = Field(None, description="tier for scheduling and preemption")
    qos: Optional[StrictStr] = Field(None, description="partition QOS name")
    state: Optional[StrictStr] = Field(None, description="Partition state")
    total_cpus: Optional[StrictInt] = Field(None, description="Total cpus in partition")
    total_nodes: Optional[StrictInt] = Field(None, description="Total number of nodes in partition")
    tres: Optional[StrictStr] = Field(None, description="configured TRES in partition")
    __properties = ["flags", "preemption_mode", "allowed_allocation_nodes", "allowed_accounts", "allowed_groups", "allowed_qos", "alternative", "billing_weights", "default_memory_per_cpu", "default_time_limit", "denied_accounts", "denied_qos", "preemption_grace_time", "maximum_cpus_per_node", "maximum_memory_per_node", "maximum_nodes_per_job", "max_time_limit", "min_nodes_per_job", "name", "nodes", "over_time_limit", "priority_job_factor", "priority_tier", "qos", "state", "total_cpus", "total_nodes", "tres"]

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
    def from_json(cls, json_str: str) -> V0037Partition:
        """Create an instance of V0037Partition from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> V0037Partition:
        """Create an instance of V0037Partition from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return V0037Partition.parse_obj(obj)

        _obj = V0037Partition.parse_obj({
            "flags": obj.get("flags"),
            "preemption_mode": obj.get("preemption_mode"),
            "allowed_allocation_nodes": obj.get("allowed_allocation_nodes"),
            "allowed_accounts": obj.get("allowed_accounts"),
            "allowed_groups": obj.get("allowed_groups"),
            "allowed_qos": obj.get("allowed_qos"),
            "alternative": obj.get("alternative"),
            "billing_weights": obj.get("billing_weights"),
            "default_memory_per_cpu": obj.get("default_memory_per_cpu"),
            "default_time_limit": obj.get("default_time_limit"),
            "denied_accounts": obj.get("denied_accounts"),
            "denied_qos": obj.get("denied_qos"),
            "preemption_grace_time": obj.get("preemption_grace_time"),
            "maximum_cpus_per_node": obj.get("maximum_cpus_per_node"),
            "maximum_memory_per_node": obj.get("maximum_memory_per_node"),
            "maximum_nodes_per_job": obj.get("maximum_nodes_per_job"),
            "max_time_limit": obj.get("max_time_limit"),
            "min_nodes_per_job": obj.get("min_nodes_per_job"),
            "name": obj.get("name"),
            "nodes": obj.get("nodes"),
            "over_time_limit": obj.get("over_time_limit"),
            "priority_job_factor": obj.get("priority_job_factor"),
            "priority_tier": obj.get("priority_tier"),
            "qos": obj.get("qos"),
            "state": obj.get("state"),
            "total_cpus": obj.get("total_cpus"),
            "total_nodes": obj.get("total_nodes"),
            "tres": obj.get("tres")
        })
        return _obj

