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

from openapi_client.models.dbv0037_association_max_tres_minutes import Dbv0037AssociationMaxTresMinutes  # noqa: E501

class TestDbv0037AssociationMaxTresMinutes(unittest.TestCase):
    """Dbv0037AssociationMaxTresMinutes unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Dbv0037AssociationMaxTresMinutes:
        """Test Dbv0037AssociationMaxTresMinutes
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Dbv0037AssociationMaxTresMinutes`
        """
        model = Dbv0037AssociationMaxTresMinutes()  # noqa: E501
        if include_optional:
            return Dbv0037AssociationMaxTresMinutes(
                per = openapi_client.models.dbv0_0_37_association_max_tres_minutes_per.dbv0_0_37_association_max_tres_minutes_per(
                    job = [
                        openapi_client.models.dbv0_0_37_tres_list_inner.dbv0_0_37_tres_list_inner(
                            type = '', 
                            name = '', 
                            id = 56, 
                            count = 56, )
                        ], ),
                total = [
                    openapi_client.models.dbv0_0_37_tres_list_inner.dbv0_0_37_tres_list_inner(
                        type = '', 
                        name = '', 
                        id = 56, 
                        count = 56, )
                    ]
            )
        else:
            return Dbv0037AssociationMaxTresMinutes(
        )
        """

    def testDbv0037AssociationMaxTresMinutes(self):
        """Test Dbv0037AssociationMaxTresMinutes"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
