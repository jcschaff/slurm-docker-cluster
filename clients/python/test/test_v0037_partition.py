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

from openapi_client.models.v0037_partition import V0037Partition  # noqa: E501

class TestV0037Partition(unittest.TestCase):
    """V0037Partition unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> V0037Partition:
        """Test V0037Partition
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `V0037Partition`
        """
        model = V0037Partition()  # noqa: E501
        if include_optional:
            return V0037Partition(
                flags = [
                    ''
                    ],
                preemption_mode = [
                    ''
                    ],
                allowed_allocation_nodes = '',
                allowed_accounts = '',
                allowed_groups = '',
                allowed_qos = '',
                alternative = '',
                billing_weights = '',
                default_memory_per_cpu = 56,
                default_time_limit = 56,
                denied_accounts = '',
                denied_qos = '',
                preemption_grace_time = 56,
                maximum_cpus_per_node = 56,
                maximum_memory_per_node = 56,
                maximum_nodes_per_job = 56,
                max_time_limit = 56,
                min_nodes_per_job = 56,
                name = '',
                nodes = '',
                over_time_limit = 56,
                priority_job_factor = 56,
                priority_tier = 56,
                qos = '',
                state = '',
                total_cpus = 56,
                total_nodes = 56,
                tres = ''
            )
        else:
            return V0037Partition(
        )
        """

    def testV0037Partition(self):
        """Test V0037Partition"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
