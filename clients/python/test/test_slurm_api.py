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

from openapi_client.api.slurm_api import SlurmApi  # noqa: E501


class TestSlurmApi(unittest.TestCase):
    """SlurmApi unit test stubs"""

    def setUp(self) -> None:
        self.api = SlurmApi()  # noqa: E501

    def tearDown(self) -> None:
        pass

    def test_slurmctld_cancel_job(self) -> None:
        """Test case for slurmctld_cancel_job

        cancel or signal job  # noqa: E501
        """
        pass

    def test_slurmctld_diag(self) -> None:
        """Test case for slurmctld_diag

        get diagnostics  # noqa: E501
        """
        pass

    def test_slurmctld_get_job(self) -> None:
        """Test case for slurmctld_get_job

        get job info  # noqa: E501
        """
        pass

    def test_slurmctld_get_jobs(self) -> None:
        """Test case for slurmctld_get_jobs

        get list of jobs  # noqa: E501
        """
        pass

    def test_slurmctld_get_node(self) -> None:
        """Test case for slurmctld_get_node

        get node info  # noqa: E501
        """
        pass

    def test_slurmctld_get_nodes(self) -> None:
        """Test case for slurmctld_get_nodes

        get all node info  # noqa: E501
        """
        pass

    def test_slurmctld_get_partition(self) -> None:
        """Test case for slurmctld_get_partition

        get partition info  # noqa: E501
        """
        pass

    def test_slurmctld_get_partitions(self) -> None:
        """Test case for slurmctld_get_partitions

        get all partition info  # noqa: E501
        """
        pass

    def test_slurmctld_get_reservation(self) -> None:
        """Test case for slurmctld_get_reservation

        get reservation info  # noqa: E501
        """
        pass

    def test_slurmctld_get_reservations(self) -> None:
        """Test case for slurmctld_get_reservations

        get all reservation info  # noqa: E501
        """
        pass

    def test_slurmctld_ping(self) -> None:
        """Test case for slurmctld_ping

        ping test  # noqa: E501
        """
        pass

    def test_slurmctld_submit_job(self) -> None:
        """Test case for slurmctld_submit_job

        submit new job  # noqa: E501
        """
        pass

    def test_slurmctld_update_job(self) -> None:
        """Test case for slurmctld_update_job

        update job  # noqa: E501
        """
        pass

    def test_slurmdbd_add_clusters(self) -> None:
        """Test case for slurmdbd_add_clusters

        Add clusters  # noqa: E501
        """
        pass

    def test_slurmdbd_add_wckeys(self) -> None:
        """Test case for slurmdbd_add_wckeys

        Add wckeys  # noqa: E501
        """
        pass

    def test_slurmdbd_delete_account(self) -> None:
        """Test case for slurmdbd_delete_account

        Delete account  # noqa: E501
        """
        pass

    def test_slurmdbd_delete_association(self) -> None:
        """Test case for slurmdbd_delete_association

        Delete association  # noqa: E501
        """
        pass

    def test_slurmdbd_delete_cluster(self) -> None:
        """Test case for slurmdbd_delete_cluster

        Delete cluster  # noqa: E501
        """
        pass

    def test_slurmdbd_delete_qos(self) -> None:
        """Test case for slurmdbd_delete_qos

        Delete QOS  # noqa: E501
        """
        pass

    def test_slurmdbd_delete_user(self) -> None:
        """Test case for slurmdbd_delete_user

        Delete user  # noqa: E501
        """
        pass

    def test_slurmdbd_delete_wckey(self) -> None:
        """Test case for slurmdbd_delete_wckey

        Delete wckey  # noqa: E501
        """
        pass

    def test_slurmdbd_diag(self) -> None:
        """Test case for slurmdbd_diag

        Get slurmdb diagnostics  # noqa: E501
        """
        pass

    def test_slurmdbd_get_account(self) -> None:
        """Test case for slurmdbd_get_account

        Get account info  # noqa: E501
        """
        pass

    def test_slurmdbd_get_accounts(self) -> None:
        """Test case for slurmdbd_get_accounts

        Get account list  # noqa: E501
        """
        pass

    def test_slurmdbd_get_association(self) -> None:
        """Test case for slurmdbd_get_association

        Get association info  # noqa: E501
        """
        pass

    def test_slurmdbd_get_associations(self) -> None:
        """Test case for slurmdbd_get_associations

        Get association list  # noqa: E501
        """
        pass

    def test_slurmdbd_get_cluster(self) -> None:
        """Test case for slurmdbd_get_cluster

        Get cluster info  # noqa: E501
        """
        pass

    def test_slurmdbd_get_clusters(self) -> None:
        """Test case for slurmdbd_get_clusters

        Get cluster list  # noqa: E501
        """
        pass

    def test_slurmdbd_get_db_config(self) -> None:
        """Test case for slurmdbd_get_db_config

        Dump all configuration information  # noqa: E501
        """
        pass

    def test_slurmdbd_get_job(self) -> None:
        """Test case for slurmdbd_get_job

        Get job info  # noqa: E501
        """
        pass

    def test_slurmdbd_get_jobs(self) -> None:
        """Test case for slurmdbd_get_jobs

        Get job list  # noqa: E501
        """
        pass

    def test_slurmdbd_get_qos(self) -> None:
        """Test case for slurmdbd_get_qos

        Get QOS list  # noqa: E501
        """
        pass

    def test_slurmdbd_get_single_qos(self) -> None:
        """Test case for slurmdbd_get_single_qos

        Get QOS info  # noqa: E501
        """
        pass

    def test_slurmdbd_get_tres(self) -> None:
        """Test case for slurmdbd_get_tres

        Get TRES info  # noqa: E501
        """
        pass

    def test_slurmdbd_get_user(self) -> None:
        """Test case for slurmdbd_get_user

        Get user info  # noqa: E501
        """
        pass

    def test_slurmdbd_get_users(self) -> None:
        """Test case for slurmdbd_get_users

        Get user list  # noqa: E501
        """
        pass

    def test_slurmdbd_get_wckey(self) -> None:
        """Test case for slurmdbd_get_wckey

        Get wckey info  # noqa: E501
        """
        pass

    def test_slurmdbd_get_wckeys(self) -> None:
        """Test case for slurmdbd_get_wckeys

        Get wckey list  # noqa: E501
        """
        pass

    def test_slurmdbd_set_db_config(self) -> None:
        """Test case for slurmdbd_set_db_config

        Load all configuration information  # noqa: E501
        """
        pass

    def test_slurmdbd_update_account(self) -> None:
        """Test case for slurmdbd_update_account

        Update accounts  # noqa: E501
        """
        pass

    def test_slurmdbd_update_associations(self) -> None:
        """Test case for slurmdbd_update_associations

        Set associations info  # noqa: E501
        """
        pass

    def test_slurmdbd_update_tres(self) -> None:
        """Test case for slurmdbd_update_tres

        Set TRES info  # noqa: E501
        """
        pass

    def test_slurmdbd_update_users(self) -> None:
        """Test case for slurmdbd_update_users

        Update user  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
