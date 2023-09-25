# coding: utf-8

"""
    Slurm Rest API

    API to access and control Slurm.

    The version of the OpenAPI document: 0.0.37
    Contact: sales@schedmd.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import json
import pprint
import re  # noqa: F401
from aenum import Enum, no_arg





class V0037Signal(str, Enum):
    """
    POSIX signal name
    """

    """
    allowed enum values
    """
    HUP = 'HUP'
    INT = 'INT'
    QUIT = 'QUIT'
    ABRT = 'ABRT'
    KILL = 'KILL'
    ALRM = 'ALRM'
    TERM = 'TERM'
    USR1 = 'USR1'
    USR2 = 'USR2'
    URG = 'URG'
    CONT = 'CONT'
    STOP = 'STOP'
    TSTP = 'TSTP'
    TTIN = 'TTIN'
    TTOU = 'TTOU'

    @classmethod
    def from_json(cls, json_str: str) -> V0037Signal:
        """Create an instance of V0037Signal from a JSON string"""
        return V0037Signal(json.loads(json_str))


