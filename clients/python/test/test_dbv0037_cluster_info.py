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

from openapi_client.models.dbv0037_cluster_info import Dbv0037ClusterInfo  # noqa: E501

class TestDbv0037ClusterInfo(unittest.TestCase):
    """Dbv0037ClusterInfo unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Dbv0037ClusterInfo:
        """Test Dbv0037ClusterInfo
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Dbv0037ClusterInfo`
        """
        model = Dbv0037ClusterInfo()  # noqa: E501
        if include_optional:
            return Dbv0037ClusterInfo(
                controller = openapi_client.models.dbv0_0_37_cluster_info_controller.dbv0_0_37_cluster_info_controller(
                    host = '', 
                    port = 56, ),
                flags = [
                    ''
                    ],
                name = '',
                nodes = '',
                select_plugin = '',
                associations = openapi_client.models.dbv0_0_37_cluster_info_associations.dbv0_0_37_cluster_info_associations(
                    root = openapi_client.models.dbv0/0/37_association_short_info.dbv0.0.37_association_short_info(
                        account = '', 
                        cluster = '', 
                        partition = '', 
                        user = '', ), ),
                rpc_version = 56,
                tres = [
                    openapi_client.models.dbv0/0/37_response_tres.dbv0.0.37_response_tres(
                        errors = [
                            openapi_client.models.dbv0/0/37_error.dbv0.0.37_error(
                                errno = 56, 
                                error = '', )
                            ], )
                    ]
            )
        else:
            return Dbv0037ClusterInfo(
        )
        """

    def testDbv0037ClusterInfo(self):
        """Test Dbv0037ClusterInfo"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
