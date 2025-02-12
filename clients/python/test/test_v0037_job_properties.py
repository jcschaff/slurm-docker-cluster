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

from openapi_client.models.v0037_job_properties import V0037JobProperties  # noqa: E501

class TestV0037JobProperties(unittest.TestCase):
    """V0037JobProperties unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> V0037JobProperties:
        """Test V0037JobProperties
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `V0037JobProperties`
        """
        model = V0037JobProperties()  # noqa: E501
        if include_optional:
            return V0037JobProperties(
                account = '',
                account_gather_freqency = '',
                argv = [
                    ''
                    ],
                array = '',
                batch_features = '',
                begin_time = 56,
                burst_buffer = '',
                cluster_constraints = '',
                comment = '',
                constraints = '',
                core_specification = 56,
                cores_per_socket = 56,
                cpu_binding = '',
                cpu_binding_hint = '',
                cpu_frequency = '',
                cpus_per_gpu = '',
                cpus_per_task = 56,
                current_working_directory = '',
                deadline = '',
                delay_boot = 56,
                dependency = '',
                distribution = '',
                environment = openapi_client.models.environment.environment(),
                exclusive = 'user',
                get_user_environment = True,
                gres = '',
                gres_flags = 'disable-binding',
                gpu_binding = '',
                gpu_frequency = '',
                gpus = '',
                gpus_per_node = '',
                gpus_per_socket = '',
                gpus_per_task = '',
                hold = True,
                kill_on_invalid_dependency = True,
                licenses = '',
                mail_type = '',
                mail_user = '',
                mcs_label = '',
                memory_binding = '',
                memory_per_cpu = 56,
                memory_per_gpu = 56,
                memory_per_node = 56,
                minimum_cpus_per_node = 56,
                minimum_nodes = True,
                name = '',
                nice = '',
                no_kill = True,
                nodes = [
                    56
                    ],
                open_mode = 'append',
                partition = '',
                priority = '',
                qos = '',
                requeue = True,
                reservation = '',
                signal = 'sig_num',
                sockets_per_node = 56,
                spread_job = True,
                standard_error = '',
                standard_input = '',
                standard_output = '',
                tasks = 56,
                tasks_per_core = 56,
                tasks_per_node = 56,
                tasks_per_socket = 56,
                thread_specification = 56,
                threads_per_core = 56,
                time_limit = 56,
                time_minimum = 56,
                wait_all_nodes = True,
                wckey = ''
            )
        else:
            return V0037JobProperties(
                environment = openapi_client.models.environment.environment(),
        )
        """

    def testV0037JobProperties(self):
        """Test V0037JobProperties"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
