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

from openapi_client.models.job_properties_nodes import JobPropertiesNodes  # noqa: E501

class TestJobPropertiesNodes(unittest.TestCase):
    """JobPropertiesNodes unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> JobPropertiesNodes:
        """Test JobPropertiesNodes
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `JobPropertiesNodes`
        """
        model = JobPropertiesNodes()  # noqa: E501
        if include_optional:
            return JobPropertiesNodes(
            )
        else:
            return JobPropertiesNodes(
        )
        """

    def testJobPropertiesNodes(self):
        """Test JobPropertiesNodes"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()