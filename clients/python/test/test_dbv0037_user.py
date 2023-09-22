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

from openapi_client.models.dbv0037_user import Dbv0037User  # noqa: E501

class TestDbv0037User(unittest.TestCase):
    """Dbv0037User unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Dbv0037User:
        """Test Dbv0037User
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Dbv0037User`
        """
        model = Dbv0037User()  # noqa: E501
        if include_optional:
            return Dbv0037User(
                administrator_level = '',
                associations = openapi_client.models.dbv0_0_37_user_associations.dbv0_0_37_user_associations(
                    root = openapi_client.models.dbv0/0/37_association_short_info.dbv0.0.37_association_short_info(
                        account = '', 
                        cluster = '', 
                        partition = '', 
                        user = '', ), ),
                coordinators = [
                    openapi_client.models.dbv0/0/37_coordinator_info.dbv0.0.37_coordinator_info(
                        name = '', 
                        direct = 56, )
                    ],
                default = openapi_client.models.dbv0_0_37_user_default.dbv0_0_37_user_default(
                    account = '', 
                    wckey = '', ),
                name = ''
            )
        else:
            return Dbv0037User(
        )
        """

    def testDbv0037User(self):
        """Test Dbv0037User"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()