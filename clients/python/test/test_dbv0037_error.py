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

from openapi_client.models.dbv0037_error import Dbv0037Error  # noqa: E501

class TestDbv0037Error(unittest.TestCase):
    """Dbv0037Error unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Dbv0037Error:
        """Test Dbv0037Error
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Dbv0037Error`
        """
        model = Dbv0037Error()  # noqa: E501
        if include_optional:
            return Dbv0037Error(
                errno = 56,
                error = ''
            )
        else:
            return Dbv0037Error(
        )
        """

    def testDbv0037Error(self):
        """Test Dbv0037Error"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
