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

from openapi_client.models.dbv0037_association_max_jobs import Dbv0037AssociationMaxJobs  # noqa: E501

class TestDbv0037AssociationMaxJobs(unittest.TestCase):
    """Dbv0037AssociationMaxJobs unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Dbv0037AssociationMaxJobs:
        """Test Dbv0037AssociationMaxJobs
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Dbv0037AssociationMaxJobs`
        """
        model = Dbv0037AssociationMaxJobs()  # noqa: E501
        if include_optional:
            return Dbv0037AssociationMaxJobs(
                active = 56,
                accruing = 56,
                total = 56,
                per = openapi_client.models.dbv0_0_37_association_max_jobs_per.dbv0_0_37_association_max_jobs_per(
                    wall_clock = 56, )
            )
        else:
            return Dbv0037AssociationMaxJobs(
        )
        """

    def testDbv0037AssociationMaxJobs(self):
        """Test Dbv0037AssociationMaxJobs"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
