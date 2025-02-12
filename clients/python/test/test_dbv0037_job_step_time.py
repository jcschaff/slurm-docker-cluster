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

from openapi_client.models.dbv0037_job_step_time import Dbv0037JobStepTime  # noqa: E501

class TestDbv0037JobStepTime(unittest.TestCase):
    """Dbv0037JobStepTime unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Dbv0037JobStepTime:
        """Test Dbv0037JobStepTime
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Dbv0037JobStepTime`
        """
        model = Dbv0037JobStepTime()  # noqa: E501
        if include_optional:
            return Dbv0037JobStepTime(
                elapsed = 56,
                end = 56,
                start = 56,
                suspended = 56,
                system = openapi_client.models.dbv0_0_37_job_time_system.dbv0_0_37_job_time_system(
                    seconds = 56, 
                    microseconds = 56, ),
                total = openapi_client.models.dbv0_0_37_job_time_total.dbv0_0_37_job_time_total(
                    seconds = 56, 
                    microseconds = 56, ),
                user = openapi_client.models.dbv0_0_37_job_time_user.dbv0_0_37_job_time_user(
                    seconds = 56, 
                    microseconds = 56, )
            )
        else:
            return Dbv0037JobStepTime(
        )
        """

    def testDbv0037JobStepTime(self):
        """Test Dbv0037JobStepTime"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
