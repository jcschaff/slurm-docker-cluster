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

from openapi_client.models.v0037_job_submission_response import V0037JobSubmissionResponse  # noqa: E501

class TestV0037JobSubmissionResponse(unittest.TestCase):
    """V0037JobSubmissionResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> V0037JobSubmissionResponse:
        """Test V0037JobSubmissionResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `V0037JobSubmissionResponse`
        """
        model = V0037JobSubmissionResponse()  # noqa: E501
        if include_optional:
            return V0037JobSubmissionResponse(
                errors = [
                    openapi_client.models.v0/0/37_error.v0.0.37_error(
                        error = '', 
                        errno = 56, )
                    ],
                job_id = 56,
                step_id = '',
                job_submit_user_msg = ''
            )
        else:
            return V0037JobSubmissionResponse(
        )
        """

    def testV0037JobSubmissionResponse(self):
        """Test V0037JobSubmissionResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
