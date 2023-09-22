/*
 * Slurm Rest API
 * API to access and control Slurm.
 *
 * The version of the OpenAPI document: 0.0.37
 * Contact: sales@schedmd.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.Dbv0037AccountInfo;
import org.openapitools.client.model.Dbv0037AccountResponse;
import org.openapitools.client.model.Dbv0037AssociationsInfo;
import org.openapitools.client.model.Dbv0037ClusterInfo;
import org.openapitools.client.model.Dbv0037ConfigInfo;
import org.openapitools.client.model.Dbv0037ConfigResponse;
import org.openapitools.client.model.Dbv0037Diag;
import org.openapitools.client.model.Dbv0037JobInfo;
import org.openapitools.client.model.Dbv0037QosInfo;
import org.openapitools.client.model.Dbv0037ResponseAccountDelete;
import org.openapitools.client.model.Dbv0037ResponseAssociationDelete;
import org.openapitools.client.model.Dbv0037ResponseAssociations;
import org.openapitools.client.model.Dbv0037ResponseClusterAdd;
import org.openapitools.client.model.Dbv0037ResponseClusterDelete;
import org.openapitools.client.model.Dbv0037ResponseQosDelete;
import org.openapitools.client.model.Dbv0037ResponseTres;
import org.openapitools.client.model.Dbv0037ResponseUserDelete;
import org.openapitools.client.model.Dbv0037ResponseUserUpdate;
import org.openapitools.client.model.Dbv0037ResponseWckeyAdd;
import org.openapitools.client.model.Dbv0037ResponseWckeyDelete;
import org.openapitools.client.model.Dbv0037TresInfo;
import org.openapitools.client.model.Dbv0037UserInfo;
import org.openapitools.client.model.Dbv0037WckeyInfo;
import org.openapitools.client.model.V0037Diag;
import org.openapitools.client.model.V0037JobProperties;
import org.openapitools.client.model.V0037JobSubmission;
import org.openapitools.client.model.V0037JobSubmissionResponse;
import org.openapitools.client.model.V0037JobsResponse;
import org.openapitools.client.model.V0037NodesResponse;
import org.openapitools.client.model.V0037PartitionsResponse;
import org.openapitools.client.model.V0037Pings;
import org.openapitools.client.model.V0037ReservationsResponse;
import org.openapitools.client.model.V0037Signal;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SlurmApi
 */
@Disabled
public class SlurmApiTest {

    private final SlurmApi api = new SlurmApi();

    /**
     * cancel or signal job
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void slurmctldCancelJobTest() throws ApiException {
        String jobId = null;
        V0037Signal signal = null;
        api.slurmctldCancelJob(jobId, signal);
        // TODO: test validations
    }

    /**
     * get diagnostics
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void slurmctldDiagTest() throws ApiException {
        V0037Diag response = api.slurmctldDiag();
        // TODO: test validations
    }

    /**
     * get job info
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void slurmctldGetJobTest() throws ApiException {
        String jobId = null;
        V0037JobsResponse response = api.slurmctldGetJob(jobId);
        // TODO: test validations
    }

    /**
     * get list of jobs
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void slurmctldGetJobsTest() throws ApiException {
        Long updateTime = null;
        V0037JobsResponse response = api.slurmctldGetJobs(updateTime);
        // TODO: test validations
    }

    /**
     * get node info
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void slurmctldGetNodeTest() throws ApiException {
        String nodeName = null;
        V0037NodesResponse response = api.slurmctldGetNode(nodeName);
        // TODO: test validations
    }

    /**
     * get all node info
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void slurmctldGetNodesTest() throws ApiException {
        Long updateTime = null;
        V0037NodesResponse response = api.slurmctldGetNodes(updateTime);
        // TODO: test validations
    }

    /**
     * get partition info
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void slurmctldGetPartitionTest() throws ApiException {
        String partitionName = null;
        Long updateTime = null;
        V0037PartitionsResponse response = api.slurmctldGetPartition(partitionName, updateTime);
        // TODO: test validations
    }

    /**
     * get all partition info
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void slurmctldGetPartitionsTest() throws ApiException {
        Long updateTime = null;
        V0037PartitionsResponse response = api.slurmctldGetPartitions(updateTime);
        // TODO: test validations
    }

    /**
     * get reservation info
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void slurmctldGetReservationTest() throws ApiException {
        String reservationName = null;
        Long updateTime = null;
        V0037ReservationsResponse response = api.slurmctldGetReservation(reservationName, updateTime);
        // TODO: test validations
    }

    /**
     * get all reservation info
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void slurmctldGetReservationsTest() throws ApiException {
        Long updateTime = null;
        V0037ReservationsResponse response = api.slurmctldGetReservations(updateTime);
        // TODO: test validations
    }

    /**
     * ping test
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void slurmctldPingTest() throws ApiException {
        V0037Pings response = api.slurmctldPing();
        // TODO: test validations
    }

    /**
     * submit new job
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void slurmctldSubmitJobTest() throws ApiException {
        V0037JobSubmission v0037JobSubmission = null;
        V0037JobSubmissionResponse response = api.slurmctldSubmitJob(v0037JobSubmission);
        // TODO: test validations
    }

    /**
     * update job
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void slurmctldUpdateJobTest() throws ApiException {
        String jobId = null;
        V0037JobProperties v0037JobProperties = null;
        api.slurmctldUpdateJob(jobId, v0037JobProperties);
        // TODO: test validations
    }

    /**
     * Add clusters
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void slurmdbdAddClustersTest() throws ApiException {
        Dbv0037ResponseClusterAdd response = api.slurmdbdAddClusters();
        // TODO: test validations
    }

    /**
     * Add wckeys
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void slurmdbdAddWckeysTest() throws ApiException {
        Dbv0037ResponseWckeyAdd response = api.slurmdbdAddWckeys();
        // TODO: test validations
    }

    /**
     * Delete account
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void slurmdbdDeleteAccountTest() throws ApiException {
        String accountName = null;
        Dbv0037ResponseAccountDelete response = api.slurmdbdDeleteAccount(accountName);
        // TODO: test validations
    }

    /**
     * Delete association
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void slurmdbdDeleteAssociationTest() throws ApiException {
        String account = null;
        String user = null;
        String cluster = null;
        String partition = null;
        Dbv0037ResponseAssociationDelete response = api.slurmdbdDeleteAssociation(account, user, cluster, partition);
        // TODO: test validations
    }

    /**
     * Delete cluster
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void slurmdbdDeleteClusterTest() throws ApiException {
        String clusterName = null;
        Dbv0037ResponseClusterDelete response = api.slurmdbdDeleteCluster(clusterName);
        // TODO: test validations
    }

    /**
     * Delete QOS
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void slurmdbdDeleteQosTest() throws ApiException {
        String qosName = null;
        Dbv0037ResponseQosDelete response = api.slurmdbdDeleteQos(qosName);
        // TODO: test validations
    }

    /**
     * Delete user
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void slurmdbdDeleteUserTest() throws ApiException {
        String userName = null;
        Dbv0037ResponseUserDelete response = api.slurmdbdDeleteUser(userName);
        // TODO: test validations
    }

    /**
     * Delete wckey
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void slurmdbdDeleteWckeyTest() throws ApiException {
        String wckey = null;
        Dbv0037ResponseWckeyDelete response = api.slurmdbdDeleteWckey(wckey);
        // TODO: test validations
    }

    /**
     * Get slurmdb diagnostics
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void slurmdbdDiagTest() throws ApiException {
        Dbv0037Diag response = api.slurmdbdDiag();
        // TODO: test validations
    }

    /**
     * Get account info
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void slurmdbdGetAccountTest() throws ApiException {
        String accountName = null;
        Dbv0037AccountInfo response = api.slurmdbdGetAccount(accountName);
        // TODO: test validations
    }

    /**
     * Get account list
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void slurmdbdGetAccountsTest() throws ApiException {
        Dbv0037AccountInfo response = api.slurmdbdGetAccounts();
        // TODO: test validations
    }

    /**
     * Get association info
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void slurmdbdGetAssociationTest() throws ApiException {
        String cluster = null;
        String account = null;
        String user = null;
        String partition = null;
        Dbv0037AssociationsInfo response = api.slurmdbdGetAssociation(cluster, account, user, partition);
        // TODO: test validations
    }

    /**
     * Get association list
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void slurmdbdGetAssociationsTest() throws ApiException {
        Dbv0037AssociationsInfo response = api.slurmdbdGetAssociations();
        // TODO: test validations
    }

    /**
     * Get cluster info
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void slurmdbdGetClusterTest() throws ApiException {
        String clusterName = null;
        Dbv0037ClusterInfo response = api.slurmdbdGetCluster(clusterName);
        // TODO: test validations
    }

    /**
     * Get cluster list
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void slurmdbdGetClustersTest() throws ApiException {
        Dbv0037ClusterInfo response = api.slurmdbdGetClusters();
        // TODO: test validations
    }

    /**
     * Dump all configuration information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void slurmdbdGetDbConfigTest() throws ApiException {
        Dbv0037ConfigInfo response = api.slurmdbdGetDbConfig();
        // TODO: test validations
    }

    /**
     * Get job info
     *
     * This endpoint may return multiple job entries since job_id is not a unique key - only the tuple (cluster, job_id, start_time) is unique. If the requested job_id is a component of a heterogeneous job all components are returned.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void slurmdbdGetJobTest() throws ApiException {
        Long jobId = null;
        Dbv0037JobInfo response = api.slurmdbdGetJob(jobId);
        // TODO: test validations
    }

    /**
     * Get job list
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void slurmdbdGetJobsTest() throws ApiException {
        String submitTime = null;
        String startTime = null;
        String endTime = null;
        String account = null;
        String association = null;
        String cluster = null;
        String constraints = null;
        String cpusMax = null;
        String cpusMin = null;
        Boolean skipSteps = null;
        Boolean disableWaitForResult = null;
        String exitCode = null;
        String format = null;
        String group = null;
        String jobName = null;
        String nodesMax = null;
        String nodesMin = null;
        String partition = null;
        String qos = null;
        String reason = null;
        String reservation = null;
        String state = null;
        String step = null;
        String node = null;
        String wckey = null;
        Dbv0037JobInfo response = api.slurmdbdGetJobs(submitTime, startTime, endTime, account, association, cluster, constraints, cpusMax, cpusMin, skipSteps, disableWaitForResult, exitCode, format, group, jobName, nodesMax, nodesMin, partition, qos, reason, reservation, state, step, node, wckey);
        // TODO: test validations
    }

    /**
     * Get QOS list
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void slurmdbdGetQosTest() throws ApiException {
        Dbv0037QosInfo response = api.slurmdbdGetQos();
        // TODO: test validations
    }

    /**
     * Get QOS info
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void slurmdbdGetSingleQosTest() throws ApiException {
        String qosName = null;
        Dbv0037QosInfo response = api.slurmdbdGetSingleQos(qosName);
        // TODO: test validations
    }

    /**
     * Get TRES info
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void slurmdbdGetTresTest() throws ApiException {
        Dbv0037TresInfo response = api.slurmdbdGetTres();
        // TODO: test validations
    }

    /**
     * Get user info
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void slurmdbdGetUserTest() throws ApiException {
        String userName = null;
        Dbv0037UserInfo response = api.slurmdbdGetUser(userName);
        // TODO: test validations
    }

    /**
     * Get user list
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void slurmdbdGetUsersTest() throws ApiException {
        Dbv0037UserInfo response = api.slurmdbdGetUsers();
        // TODO: test validations
    }

    /**
     * Get wckey info
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void slurmdbdGetWckeyTest() throws ApiException {
        String wckey = null;
        Dbv0037WckeyInfo response = api.slurmdbdGetWckey(wckey);
        // TODO: test validations
    }

    /**
     * Get wckey list
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void slurmdbdGetWckeysTest() throws ApiException {
        Dbv0037WckeyInfo response = api.slurmdbdGetWckeys();
        // TODO: test validations
    }

    /**
     * Load all configuration information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void slurmdbdSetDbConfigTest() throws ApiException {
        Dbv0037ConfigResponse response = api.slurmdbdSetDbConfig();
        // TODO: test validations
    }

    /**
     * Update accounts
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void slurmdbdUpdateAccountTest() throws ApiException {
        Dbv0037AccountResponse response = api.slurmdbdUpdateAccount();
        // TODO: test validations
    }

    /**
     * Set associations info
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void slurmdbdUpdateAssociationsTest() throws ApiException {
        Dbv0037ResponseAssociations response = api.slurmdbdUpdateAssociations();
        // TODO: test validations
    }

    /**
     * Set TRES info
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void slurmdbdUpdateTresTest() throws ApiException {
        Dbv0037ResponseTres response = api.slurmdbdUpdateTres();
        // TODO: test validations
    }

    /**
     * Update user
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void slurmdbdUpdateUsersTest() throws ApiException {
        Dbv0037ResponseUserUpdate response = api.slurmdbdUpdateUsers();
        // TODO: test validations
    }

}