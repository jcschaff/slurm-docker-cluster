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


from typing import List, Optional, Union
from pydantic import BaseModel, Field, StrictFloat, StrictInt, StrictStr, conlist

class V0037Node(BaseModel):
    """
    V0037Node
    """
    architecture: Optional[StrictStr] = Field(None, description="computer architecture")
    burstbuffer_network_address: Optional[StrictStr] = Field(None, description="BcastAddr")
    boards: Optional[StrictInt] = Field(None, description="total number of boards per node")
    boot_time: Optional[StrictInt] = Field(None, description="timestamp of node boot")
    cores: Optional[StrictInt] = Field(None, description="number of cores per socket")
    cpu_binding: Optional[StrictInt] = Field(None, description="Default task binding")
    cpu_load: Optional[StrictInt] = Field(None, description="CPU load * 100")
    free_memory: Optional[StrictInt] = Field(None, description="free memory in MiB")
    cpus: Optional[StrictInt] = Field(None, description="configured count of cpus running on the node")
    features: Optional[StrictStr] = None
    active_features: Optional[StrictStr] = Field(None, description="list of a node's available features")
    gres: Optional[StrictStr] = Field(None, description="list of a node's generic resources")
    gres_drained: Optional[StrictStr] = Field(None, description="list of drained GRES")
    gres_used: Optional[StrictStr] = Field(None, description="list of GRES in current use")
    mcs_label: Optional[StrictStr] = Field(None, description="mcs label if mcs plugin in use")
    name: Optional[StrictStr] = Field(None, description="node name to slurm")
    next_state_after_reboot: Optional[StrictStr] = Field(None, description="state after reboot")
    next_state_after_reboot_flags: Optional[conlist(StrictStr)] = Field(None, description="node state flags")
    address: Optional[StrictStr] = Field(None, description="state after reboot")
    hostname: Optional[StrictStr] = Field(None, description="node's hostname")
    state: Optional[StrictStr] = Field(None, description="current node state")
    state_flags: Optional[conlist(StrictStr)] = Field(None, description="node state flags")
    operating_system: Optional[StrictStr] = Field(None, description="operating system")
    owner: Optional[StrictStr] = Field(None, description="User allowed to use this node")
    partitions: Optional[conlist(StrictStr)] = Field(None, description="assigned partitions")
    port: Optional[StrictInt] = Field(None, description="TCP port number of the slurmd")
    real_memory: Optional[StrictInt] = Field(None, description="configured MB of real memory on the node")
    reason: Optional[StrictStr] = Field(None, description="reason for node being DOWN or DRAINING")
    reason_changed_at: Optional[StrictInt] = Field(None, description="Time stamp when reason was set")
    reason_set_by_user: Optional[StrictStr] = Field(None, description="User that set the reason")
    slurmd_start_time: Optional[StrictInt] = Field(None, description="timestamp of slurmd startup")
    sockets: Optional[StrictInt] = Field(None, description="total number of sockets per node")
    threads: Optional[StrictInt] = Field(None, description="number of threads per core")
    temporary_disk: Optional[StrictInt] = Field(None, description="configured MB of total disk in TMP_FS")
    weight: Optional[StrictInt] = Field(None, description="arbitrary priority of node for scheduling")
    tres: Optional[StrictStr] = Field(None, description="TRES on node")
    tres_used: Optional[StrictStr] = Field(None, description="TRES used on node")
    tres_weighted: Optional[Union[StrictFloat, StrictInt]] = Field(None, description="TRES weight used on node")
    slurmd_version: Optional[StrictStr] = Field(None, description="Slurmd version")
    alloc_cpus: Optional[StrictInt] = Field(None, description="Allocated CPUs")
    idle_cpus: Optional[StrictInt] = Field(None, description="Idle CPUs")
    alloc_memory: Optional[StrictInt] = Field(None, description="Allocated memory (MB)")
    __properties = ["architecture", "burstbuffer_network_address", "boards", "boot_time", "cores", "cpu_binding", "cpu_load", "free_memory", "cpus", "features", "active_features", "gres", "gres_drained", "gres_used", "mcs_label", "name", "next_state_after_reboot", "next_state_after_reboot_flags", "address", "hostname", "state", "state_flags", "operating_system", "owner", "partitions", "port", "real_memory", "reason", "reason_changed_at", "reason_set_by_user", "slurmd_start_time", "sockets", "threads", "temporary_disk", "weight", "tres", "tres_used", "tres_weighted", "slurmd_version", "alloc_cpus", "idle_cpus", "alloc_memory"]

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
    def from_json(cls, json_str: str) -> V0037Node:
        """Create an instance of V0037Node from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> V0037Node:
        """Create an instance of V0037Node from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return V0037Node.parse_obj(obj)

        _obj = V0037Node.parse_obj({
            "architecture": obj.get("architecture"),
            "burstbuffer_network_address": obj.get("burstbuffer_network_address"),
            "boards": obj.get("boards"),
            "boot_time": obj.get("boot_time"),
            "cores": obj.get("cores"),
            "cpu_binding": obj.get("cpu_binding"),
            "cpu_load": obj.get("cpu_load"),
            "free_memory": obj.get("free_memory"),
            "cpus": obj.get("cpus"),
            "features": obj.get("features"),
            "active_features": obj.get("active_features"),
            "gres": obj.get("gres"),
            "gres_drained": obj.get("gres_drained"),
            "gres_used": obj.get("gres_used"),
            "mcs_label": obj.get("mcs_label"),
            "name": obj.get("name"),
            "next_state_after_reboot": obj.get("next_state_after_reboot"),
            "next_state_after_reboot_flags": obj.get("next_state_after_reboot_flags"),
            "address": obj.get("address"),
            "hostname": obj.get("hostname"),
            "state": obj.get("state"),
            "state_flags": obj.get("state_flags"),
            "operating_system": obj.get("operating_system"),
            "owner": obj.get("owner"),
            "partitions": obj.get("partitions"),
            "port": obj.get("port"),
            "real_memory": obj.get("real_memory"),
            "reason": obj.get("reason"),
            "reason_changed_at": obj.get("reason_changed_at"),
            "reason_set_by_user": obj.get("reason_set_by_user"),
            "slurmd_start_time": obj.get("slurmd_start_time"),
            "sockets": obj.get("sockets"),
            "threads": obj.get("threads"),
            "temporary_disk": obj.get("temporary_disk"),
            "weight": obj.get("weight"),
            "tres": obj.get("tres"),
            "tres_used": obj.get("tres_used"),
            "tres_weighted": obj.get("tres_weighted"),
            "slurmd_version": obj.get("slurmd_version"),
            "alloc_cpus": obj.get("alloc_cpus"),
            "idle_cpus": obj.get("idle_cpus"),
            "alloc_memory": obj.get("alloc_memory")
        })
        return _obj


