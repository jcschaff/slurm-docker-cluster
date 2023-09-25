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

from openapi_client.models.dbv0037_job_step_tasks import Dbv0037JobStepTasks  # noqa: E501

class TestDbv0037JobStepTasks(unittest.TestCase):
    """Dbv0037JobStepTasks unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Dbv0037JobStepTasks:
        """Test Dbv0037JobStepTasks
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Dbv0037JobStepTasks`
        """
        model = Dbv0037JobStepTasks()  # noqa: E501
        if include_optional:
            return Dbv0037JobStepTasks(
                count = 56
            )
        else:
            return Dbv0037JobStepTasks(
        )
        """

    def testDbv0037JobStepTasks(self):
        """Test Dbv0037JobStepTasks"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
