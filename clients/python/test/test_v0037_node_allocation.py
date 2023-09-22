# coding: utf-8

"""
    Slurm Rest API

    API to access and control Slurm.

    The version of the OpenAPI document: 0.0.37
    Contact: sales@schedmd.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest
import datetime

from openapi_client.models.v0037_node_allocation import V0037NodeAllocation  # noqa: E501

class TestV0037NodeAllocation(unittest.TestCase):
    """V0037NodeAllocation unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> V0037NodeAllocation:
        """Test V0037NodeAllocation
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `V0037NodeAllocation`
        """
        model = V0037NodeAllocation()  # noqa: E501
        if include_optional:
            return V0037NodeAllocation(
                memory = 56,
                cpus = openapi_client.models.cpus.cpus(),
                sockets = openapi_client.models.sockets.sockets(),
                cores = openapi_client.models.cores.cores()
            )
        else:
            return V0037NodeAllocation(
        )
        """

    def testV0037NodeAllocation(self):
        """Test V0037NodeAllocation"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()