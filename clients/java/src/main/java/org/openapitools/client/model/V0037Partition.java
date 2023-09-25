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


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * V0037Partition
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class V0037Partition {
  public static final String SERIALIZED_NAME_FLAGS = "flags";
  @SerializedName(SERIALIZED_NAME_FLAGS)
  private List<String> flags;

  public static final String SERIALIZED_NAME_PREEMPTION_MODE = "preemption_mode";
  @SerializedName(SERIALIZED_NAME_PREEMPTION_MODE)
  private List<String> preemptionMode;

  public static final String SERIALIZED_NAME_ALLOWED_ALLOCATION_NODES = "allowed_allocation_nodes";
  @SerializedName(SERIALIZED_NAME_ALLOWED_ALLOCATION_NODES)
  private String allowedAllocationNodes;

  public static final String SERIALIZED_NAME_ALLOWED_ACCOUNTS = "allowed_accounts";
  @SerializedName(SERIALIZED_NAME_ALLOWED_ACCOUNTS)
  private String allowedAccounts;

  public static final String SERIALIZED_NAME_ALLOWED_GROUPS = "allowed_groups";
  @SerializedName(SERIALIZED_NAME_ALLOWED_GROUPS)
  private String allowedGroups;

  public static final String SERIALIZED_NAME_ALLOWED_QOS = "allowed_qos";
  @SerializedName(SERIALIZED_NAME_ALLOWED_QOS)
  private String allowedQos;

  public static final String SERIALIZED_NAME_ALTERNATIVE = "alternative";
  @SerializedName(SERIALIZED_NAME_ALTERNATIVE)
  private String alternative;

  public static final String SERIALIZED_NAME_BILLING_WEIGHTS = "billing_weights";
  @SerializedName(SERIALIZED_NAME_BILLING_WEIGHTS)
  private String billingWeights;

  public static final String SERIALIZED_NAME_DEFAULT_MEMORY_PER_CPU = "default_memory_per_cpu";
  @SerializedName(SERIALIZED_NAME_DEFAULT_MEMORY_PER_CPU)
  private Long defaultMemoryPerCpu;

  public static final String SERIALIZED_NAME_DEFAULT_TIME_LIMIT = "default_time_limit";
  @SerializedName(SERIALIZED_NAME_DEFAULT_TIME_LIMIT)
  private Long defaultTimeLimit;

  public static final String SERIALIZED_NAME_DENIED_ACCOUNTS = "denied_accounts";
  @SerializedName(SERIALIZED_NAME_DENIED_ACCOUNTS)
  private String deniedAccounts;

  public static final String SERIALIZED_NAME_DENIED_QOS = "denied_qos";
  @SerializedName(SERIALIZED_NAME_DENIED_QOS)
  private String deniedQos;

  public static final String SERIALIZED_NAME_PREEMPTION_GRACE_TIME = "preemption_grace_time";
  @SerializedName(SERIALIZED_NAME_PREEMPTION_GRACE_TIME)
  private Long preemptionGraceTime;

  public static final String SERIALIZED_NAME_MAXIMUM_CPUS_PER_NODE = "maximum_cpus_per_node";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_CPUS_PER_NODE)
  private Integer maximumCpusPerNode;

  public static final String SERIALIZED_NAME_MAXIMUM_MEMORY_PER_NODE = "maximum_memory_per_node";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_MEMORY_PER_NODE)
  private Long maximumMemoryPerNode;

  public static final String SERIALIZED_NAME_MAXIMUM_NODES_PER_JOB = "maximum_nodes_per_job";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_NODES_PER_JOB)
  private Integer maximumNodesPerJob;

  public static final String SERIALIZED_NAME_MAX_TIME_LIMIT = "max_time_limit";
  @SerializedName(SERIALIZED_NAME_MAX_TIME_LIMIT)
  private Long maxTimeLimit;

  public static final String SERIALIZED_NAME_MIN_NODES_PER_JOB = "min_nodes_per_job";
  @SerializedName(SERIALIZED_NAME_MIN_NODES_PER_JOB)
  private Integer minNodesPerJob;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NODES = "nodes";
  @SerializedName(SERIALIZED_NAME_NODES)
  private String nodes;

  public static final String SERIALIZED_NAME_OVER_TIME_LIMIT = "over_time_limit";
  @SerializedName(SERIALIZED_NAME_OVER_TIME_LIMIT)
  private Integer overTimeLimit;

  public static final String SERIALIZED_NAME_PRIORITY_JOB_FACTOR = "priority_job_factor";
  @SerializedName(SERIALIZED_NAME_PRIORITY_JOB_FACTOR)
  private Integer priorityJobFactor;

  public static final String SERIALIZED_NAME_PRIORITY_TIER = "priority_tier";
  @SerializedName(SERIALIZED_NAME_PRIORITY_TIER)
  private Integer priorityTier;

  public static final String SERIALIZED_NAME_QOS = "qos";
  @SerializedName(SERIALIZED_NAME_QOS)
  private String qos;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_TOTAL_CPUS = "total_cpus";
  @SerializedName(SERIALIZED_NAME_TOTAL_CPUS)
  private Integer totalCpus;

  public static final String SERIALIZED_NAME_TOTAL_NODES = "total_nodes";
  @SerializedName(SERIALIZED_NAME_TOTAL_NODES)
  private Integer totalNodes;

  public static final String SERIALIZED_NAME_TRES = "tres";
  @SerializedName(SERIALIZED_NAME_TRES)
  private String tres;

  public V0037Partition() {
  }

  public V0037Partition flags(List<String> flags) {
    
    this.flags = flags;
    return this;
  }

  public V0037Partition addFlagsItem(String flagsItem) {
    if (this.flags == null) {
      this.flags = new ArrayList<>();
    }
    this.flags.add(flagsItem);
    return this;
  }

   /**
   * partition options
   * @return flags
  **/
  @javax.annotation.Nullable
  public List<String> getFlags() {
    return flags;
  }


  public void setFlags(List<String> flags) {
    this.flags = flags;
  }


  public V0037Partition preemptionMode(List<String> preemptionMode) {
    
    this.preemptionMode = preemptionMode;
    return this;
  }

  public V0037Partition addPreemptionModeItem(String preemptionModeItem) {
    if (this.preemptionMode == null) {
      this.preemptionMode = new ArrayList<>();
    }
    this.preemptionMode.add(preemptionModeItem);
    return this;
  }

   /**
   * preemption type
   * @return preemptionMode
  **/
  @javax.annotation.Nullable
  public List<String> getPreemptionMode() {
    return preemptionMode;
  }


  public void setPreemptionMode(List<String> preemptionMode) {
    this.preemptionMode = preemptionMode;
  }


  public V0037Partition allowedAllocationNodes(String allowedAllocationNodes) {
    
    this.allowedAllocationNodes = allowedAllocationNodes;
    return this;
  }

   /**
   * list names of allowed allocating nodes
   * @return allowedAllocationNodes
  **/
  @javax.annotation.Nullable
  public String getAllowedAllocationNodes() {
    return allowedAllocationNodes;
  }


  public void setAllowedAllocationNodes(String allowedAllocationNodes) {
    this.allowedAllocationNodes = allowedAllocationNodes;
  }


  public V0037Partition allowedAccounts(String allowedAccounts) {
    
    this.allowedAccounts = allowedAccounts;
    return this;
  }

   /**
   * comma delimited list of accounts
   * @return allowedAccounts
  **/
  @javax.annotation.Nullable
  public String getAllowedAccounts() {
    return allowedAccounts;
  }


  public void setAllowedAccounts(String allowedAccounts) {
    this.allowedAccounts = allowedAccounts;
  }


  public V0037Partition allowedGroups(String allowedGroups) {
    
    this.allowedGroups = allowedGroups;
    return this;
  }

   /**
   * comma delimited list of groups
   * @return allowedGroups
  **/
  @javax.annotation.Nullable
  public String getAllowedGroups() {
    return allowedGroups;
  }


  public void setAllowedGroups(String allowedGroups) {
    this.allowedGroups = allowedGroups;
  }


  public V0037Partition allowedQos(String allowedQos) {
    
    this.allowedQos = allowedQos;
    return this;
  }

   /**
   * comma delimited list of qos
   * @return allowedQos
  **/
  @javax.annotation.Nullable
  public String getAllowedQos() {
    return allowedQos;
  }


  public void setAllowedQos(String allowedQos) {
    this.allowedQos = allowedQos;
  }


  public V0037Partition alternative(String alternative) {
    
    this.alternative = alternative;
    return this;
  }

   /**
   * name of alternate partition
   * @return alternative
  **/
  @javax.annotation.Nullable
  public String getAlternative() {
    return alternative;
  }


  public void setAlternative(String alternative) {
    this.alternative = alternative;
  }


  public V0037Partition billingWeights(String billingWeights) {
    
    this.billingWeights = billingWeights;
    return this;
  }

   /**
   * TRES billing weights
   * @return billingWeights
  **/
  @javax.annotation.Nullable
  public String getBillingWeights() {
    return billingWeights;
  }


  public void setBillingWeights(String billingWeights) {
    this.billingWeights = billingWeights;
  }


  public V0037Partition defaultMemoryPerCpu(Long defaultMemoryPerCpu) {
    
    this.defaultMemoryPerCpu = defaultMemoryPerCpu;
    return this;
  }

   /**
   * default MB memory per allocated CPU
   * @return defaultMemoryPerCpu
  **/
  @javax.annotation.Nullable
  public Long getDefaultMemoryPerCpu() {
    return defaultMemoryPerCpu;
  }


  public void setDefaultMemoryPerCpu(Long defaultMemoryPerCpu) {
    this.defaultMemoryPerCpu = defaultMemoryPerCpu;
  }


  public V0037Partition defaultTimeLimit(Long defaultTimeLimit) {
    
    this.defaultTimeLimit = defaultTimeLimit;
    return this;
  }

   /**
   * default time limit (minutes)
   * @return defaultTimeLimit
  **/
  @javax.annotation.Nullable
  public Long getDefaultTimeLimit() {
    return defaultTimeLimit;
  }


  public void setDefaultTimeLimit(Long defaultTimeLimit) {
    this.defaultTimeLimit = defaultTimeLimit;
  }


  public V0037Partition deniedAccounts(String deniedAccounts) {
    
    this.deniedAccounts = deniedAccounts;
    return this;
  }

   /**
   * comma delimited list of denied accounts
   * @return deniedAccounts
  **/
  @javax.annotation.Nullable
  public String getDeniedAccounts() {
    return deniedAccounts;
  }


  public void setDeniedAccounts(String deniedAccounts) {
    this.deniedAccounts = deniedAccounts;
  }


  public V0037Partition deniedQos(String deniedQos) {
    
    this.deniedQos = deniedQos;
    return this;
  }

   /**
   * comma delimited list of denied qos
   * @return deniedQos
  **/
  @javax.annotation.Nullable
  public String getDeniedQos() {
    return deniedQos;
  }


  public void setDeniedQos(String deniedQos) {
    this.deniedQos = deniedQos;
  }


  public V0037Partition preemptionGraceTime(Long preemptionGraceTime) {
    
    this.preemptionGraceTime = preemptionGraceTime;
    return this;
  }

   /**
   * preemption grace time (seconds)
   * @return preemptionGraceTime
  **/
  @javax.annotation.Nullable
  public Long getPreemptionGraceTime() {
    return preemptionGraceTime;
  }


  public void setPreemptionGraceTime(Long preemptionGraceTime) {
    this.preemptionGraceTime = preemptionGraceTime;
  }


  public V0037Partition maximumCpusPerNode(Integer maximumCpusPerNode) {
    
    this.maximumCpusPerNode = maximumCpusPerNode;
    return this;
  }

   /**
   * maximum allocated CPUs per node
   * @return maximumCpusPerNode
  **/
  @javax.annotation.Nullable
  public Integer getMaximumCpusPerNode() {
    return maximumCpusPerNode;
  }


  public void setMaximumCpusPerNode(Integer maximumCpusPerNode) {
    this.maximumCpusPerNode = maximumCpusPerNode;
  }


  public V0037Partition maximumMemoryPerNode(Long maximumMemoryPerNode) {
    
    this.maximumMemoryPerNode = maximumMemoryPerNode;
    return this;
  }

   /**
   * maximum memory per allocated CPU (MiB)
   * @return maximumMemoryPerNode
  **/
  @javax.annotation.Nullable
  public Long getMaximumMemoryPerNode() {
    return maximumMemoryPerNode;
  }


  public void setMaximumMemoryPerNode(Long maximumMemoryPerNode) {
    this.maximumMemoryPerNode = maximumMemoryPerNode;
  }


  public V0037Partition maximumNodesPerJob(Integer maximumNodesPerJob) {
    
    this.maximumNodesPerJob = maximumNodesPerJob;
    return this;
  }

   /**
   * Max nodes per job
   * @return maximumNodesPerJob
  **/
  @javax.annotation.Nullable
  public Integer getMaximumNodesPerJob() {
    return maximumNodesPerJob;
  }


  public void setMaximumNodesPerJob(Integer maximumNodesPerJob) {
    this.maximumNodesPerJob = maximumNodesPerJob;
  }


  public V0037Partition maxTimeLimit(Long maxTimeLimit) {
    
    this.maxTimeLimit = maxTimeLimit;
    return this;
  }

   /**
   * Max time limit per job
   * @return maxTimeLimit
  **/
  @javax.annotation.Nullable
  public Long getMaxTimeLimit() {
    return maxTimeLimit;
  }


  public void setMaxTimeLimit(Long maxTimeLimit) {
    this.maxTimeLimit = maxTimeLimit;
  }


  public V0037Partition minNodesPerJob(Integer minNodesPerJob) {
    
    this.minNodesPerJob = minNodesPerJob;
    return this;
  }

   /**
   * Min number of nodes per job
   * @return minNodesPerJob
  **/
  @javax.annotation.Nullable
  public Integer getMinNodesPerJob() {
    return minNodesPerJob;
  }


  public void setMinNodesPerJob(Integer minNodesPerJob) {
    this.minNodesPerJob = minNodesPerJob;
  }


  public V0037Partition name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Partition name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V0037Partition nodes(String nodes) {
    
    this.nodes = nodes;
    return this;
  }

   /**
   * list names of nodes in partition
   * @return nodes
  **/
  @javax.annotation.Nullable
  public String getNodes() {
    return nodes;
  }


  public void setNodes(String nodes) {
    this.nodes = nodes;
  }


  public V0037Partition overTimeLimit(Integer overTimeLimit) {
    
    this.overTimeLimit = overTimeLimit;
    return this;
  }

   /**
   * job&#39;s time limit can be exceeded by this number of minutes before cancellation
   * @return overTimeLimit
  **/
  @javax.annotation.Nullable
  public Integer getOverTimeLimit() {
    return overTimeLimit;
  }


  public void setOverTimeLimit(Integer overTimeLimit) {
    this.overTimeLimit = overTimeLimit;
  }


  public V0037Partition priorityJobFactor(Integer priorityJobFactor) {
    
    this.priorityJobFactor = priorityJobFactor;
    return this;
  }

   /**
   * job priority weight factor
   * @return priorityJobFactor
  **/
  @javax.annotation.Nullable
  public Integer getPriorityJobFactor() {
    return priorityJobFactor;
  }


  public void setPriorityJobFactor(Integer priorityJobFactor) {
    this.priorityJobFactor = priorityJobFactor;
  }


  public V0037Partition priorityTier(Integer priorityTier) {
    
    this.priorityTier = priorityTier;
    return this;
  }

   /**
   * tier for scheduling and preemption
   * @return priorityTier
  **/
  @javax.annotation.Nullable
  public Integer getPriorityTier() {
    return priorityTier;
  }


  public void setPriorityTier(Integer priorityTier) {
    this.priorityTier = priorityTier;
  }


  public V0037Partition qos(String qos) {
    
    this.qos = qos;
    return this;
  }

   /**
   * partition QOS name
   * @return qos
  **/
  @javax.annotation.Nullable
  public String getQos() {
    return qos;
  }


  public void setQos(String qos) {
    this.qos = qos;
  }


  public V0037Partition state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * Partition state
   * @return state
  **/
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public V0037Partition totalCpus(Integer totalCpus) {
    
    this.totalCpus = totalCpus;
    return this;
  }

   /**
   * Total cpus in partition
   * @return totalCpus
  **/
  @javax.annotation.Nullable
  public Integer getTotalCpus() {
    return totalCpus;
  }


  public void setTotalCpus(Integer totalCpus) {
    this.totalCpus = totalCpus;
  }


  public V0037Partition totalNodes(Integer totalNodes) {
    
    this.totalNodes = totalNodes;
    return this;
  }

   /**
   * Total number of nodes in partition
   * @return totalNodes
  **/
  @javax.annotation.Nullable
  public Integer getTotalNodes() {
    return totalNodes;
  }


  public void setTotalNodes(Integer totalNodes) {
    this.totalNodes = totalNodes;
  }


  public V0037Partition tres(String tres) {
    
    this.tres = tres;
    return this;
  }

   /**
   * configured TRES in partition
   * @return tres
  **/
  @javax.annotation.Nullable
  public String getTres() {
    return tres;
  }


  public void setTres(String tres) {
    this.tres = tres;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V0037Partition v0037Partition = (V0037Partition) o;
    return Objects.equals(this.flags, v0037Partition.flags) &&
        Objects.equals(this.preemptionMode, v0037Partition.preemptionMode) &&
        Objects.equals(this.allowedAllocationNodes, v0037Partition.allowedAllocationNodes) &&
        Objects.equals(this.allowedAccounts, v0037Partition.allowedAccounts) &&
        Objects.equals(this.allowedGroups, v0037Partition.allowedGroups) &&
        Objects.equals(this.allowedQos, v0037Partition.allowedQos) &&
        Objects.equals(this.alternative, v0037Partition.alternative) &&
        Objects.equals(this.billingWeights, v0037Partition.billingWeights) &&
        Objects.equals(this.defaultMemoryPerCpu, v0037Partition.defaultMemoryPerCpu) &&
        Objects.equals(this.defaultTimeLimit, v0037Partition.defaultTimeLimit) &&
        Objects.equals(this.deniedAccounts, v0037Partition.deniedAccounts) &&
        Objects.equals(this.deniedQos, v0037Partition.deniedQos) &&
        Objects.equals(this.preemptionGraceTime, v0037Partition.preemptionGraceTime) &&
        Objects.equals(this.maximumCpusPerNode, v0037Partition.maximumCpusPerNode) &&
        Objects.equals(this.maximumMemoryPerNode, v0037Partition.maximumMemoryPerNode) &&
        Objects.equals(this.maximumNodesPerJob, v0037Partition.maximumNodesPerJob) &&
        Objects.equals(this.maxTimeLimit, v0037Partition.maxTimeLimit) &&
        Objects.equals(this.minNodesPerJob, v0037Partition.minNodesPerJob) &&
        Objects.equals(this.name, v0037Partition.name) &&
        Objects.equals(this.nodes, v0037Partition.nodes) &&
        Objects.equals(this.overTimeLimit, v0037Partition.overTimeLimit) &&
        Objects.equals(this.priorityJobFactor, v0037Partition.priorityJobFactor) &&
        Objects.equals(this.priorityTier, v0037Partition.priorityTier) &&
        Objects.equals(this.qos, v0037Partition.qos) &&
        Objects.equals(this.state, v0037Partition.state) &&
        Objects.equals(this.totalCpus, v0037Partition.totalCpus) &&
        Objects.equals(this.totalNodes, v0037Partition.totalNodes) &&
        Objects.equals(this.tres, v0037Partition.tres);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flags, preemptionMode, allowedAllocationNodes, allowedAccounts, allowedGroups, allowedQos, alternative, billingWeights, defaultMemoryPerCpu, defaultTimeLimit, deniedAccounts, deniedQos, preemptionGraceTime, maximumCpusPerNode, maximumMemoryPerNode, maximumNodesPerJob, maxTimeLimit, minNodesPerJob, name, nodes, overTimeLimit, priorityJobFactor, priorityTier, qos, state, totalCpus, totalNodes, tres);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V0037Partition {\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
    sb.append("    preemptionMode: ").append(toIndentedString(preemptionMode)).append("\n");
    sb.append("    allowedAllocationNodes: ").append(toIndentedString(allowedAllocationNodes)).append("\n");
    sb.append("    allowedAccounts: ").append(toIndentedString(allowedAccounts)).append("\n");
    sb.append("    allowedGroups: ").append(toIndentedString(allowedGroups)).append("\n");
    sb.append("    allowedQos: ").append(toIndentedString(allowedQos)).append("\n");
    sb.append("    alternative: ").append(toIndentedString(alternative)).append("\n");
    sb.append("    billingWeights: ").append(toIndentedString(billingWeights)).append("\n");
    sb.append("    defaultMemoryPerCpu: ").append(toIndentedString(defaultMemoryPerCpu)).append("\n");
    sb.append("    defaultTimeLimit: ").append(toIndentedString(defaultTimeLimit)).append("\n");
    sb.append("    deniedAccounts: ").append(toIndentedString(deniedAccounts)).append("\n");
    sb.append("    deniedQos: ").append(toIndentedString(deniedQos)).append("\n");
    sb.append("    preemptionGraceTime: ").append(toIndentedString(preemptionGraceTime)).append("\n");
    sb.append("    maximumCpusPerNode: ").append(toIndentedString(maximumCpusPerNode)).append("\n");
    sb.append("    maximumMemoryPerNode: ").append(toIndentedString(maximumMemoryPerNode)).append("\n");
    sb.append("    maximumNodesPerJob: ").append(toIndentedString(maximumNodesPerJob)).append("\n");
    sb.append("    maxTimeLimit: ").append(toIndentedString(maxTimeLimit)).append("\n");
    sb.append("    minNodesPerJob: ").append(toIndentedString(minNodesPerJob)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
    sb.append("    overTimeLimit: ").append(toIndentedString(overTimeLimit)).append("\n");
    sb.append("    priorityJobFactor: ").append(toIndentedString(priorityJobFactor)).append("\n");
    sb.append("    priorityTier: ").append(toIndentedString(priorityTier)).append("\n");
    sb.append("    qos: ").append(toIndentedString(qos)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    totalCpus: ").append(toIndentedString(totalCpus)).append("\n");
    sb.append("    totalNodes: ").append(toIndentedString(totalNodes)).append("\n");
    sb.append("    tres: ").append(toIndentedString(tres)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("flags");
    openapiFields.add("preemption_mode");
    openapiFields.add("allowed_allocation_nodes");
    openapiFields.add("allowed_accounts");
    openapiFields.add("allowed_groups");
    openapiFields.add("allowed_qos");
    openapiFields.add("alternative");
    openapiFields.add("billing_weights");
    openapiFields.add("default_memory_per_cpu");
    openapiFields.add("default_time_limit");
    openapiFields.add("denied_accounts");
    openapiFields.add("denied_qos");
    openapiFields.add("preemption_grace_time");
    openapiFields.add("maximum_cpus_per_node");
    openapiFields.add("maximum_memory_per_node");
    openapiFields.add("maximum_nodes_per_job");
    openapiFields.add("max_time_limit");
    openapiFields.add("min_nodes_per_job");
    openapiFields.add("name");
    openapiFields.add("nodes");
    openapiFields.add("over_time_limit");
    openapiFields.add("priority_job_factor");
    openapiFields.add("priority_tier");
    openapiFields.add("qos");
    openapiFields.add("state");
    openapiFields.add("total_cpus");
    openapiFields.add("total_nodes");
    openapiFields.add("tres");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V0037Partition
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V0037Partition.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V0037Partition is not found in the empty JSON string", V0037Partition.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V0037Partition.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V0037Partition` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("flags") != null && !jsonObj.get("flags").isJsonNull() && !jsonObj.get("flags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `flags` to be an array in the JSON string but got `%s`", jsonObj.get("flags").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("preemption_mode") != null && !jsonObj.get("preemption_mode").isJsonNull() && !jsonObj.get("preemption_mode").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `preemption_mode` to be an array in the JSON string but got `%s`", jsonObj.get("preemption_mode").toString()));
      }
      if ((jsonObj.get("allowed_allocation_nodes") != null && !jsonObj.get("allowed_allocation_nodes").isJsonNull()) && !jsonObj.get("allowed_allocation_nodes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowed_allocation_nodes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("allowed_allocation_nodes").toString()));
      }
      if ((jsonObj.get("allowed_accounts") != null && !jsonObj.get("allowed_accounts").isJsonNull()) && !jsonObj.get("allowed_accounts").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowed_accounts` to be a primitive type in the JSON string but got `%s`", jsonObj.get("allowed_accounts").toString()));
      }
      if ((jsonObj.get("allowed_groups") != null && !jsonObj.get("allowed_groups").isJsonNull()) && !jsonObj.get("allowed_groups").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowed_groups` to be a primitive type in the JSON string but got `%s`", jsonObj.get("allowed_groups").toString()));
      }
      if ((jsonObj.get("allowed_qos") != null && !jsonObj.get("allowed_qos").isJsonNull()) && !jsonObj.get("allowed_qos").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowed_qos` to be a primitive type in the JSON string but got `%s`", jsonObj.get("allowed_qos").toString()));
      }
      if ((jsonObj.get("alternative") != null && !jsonObj.get("alternative").isJsonNull()) && !jsonObj.get("alternative").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alternative` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alternative").toString()));
      }
      if ((jsonObj.get("billing_weights") != null && !jsonObj.get("billing_weights").isJsonNull()) && !jsonObj.get("billing_weights").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `billing_weights` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billing_weights").toString()));
      }
      if ((jsonObj.get("denied_accounts") != null && !jsonObj.get("denied_accounts").isJsonNull()) && !jsonObj.get("denied_accounts").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `denied_accounts` to be a primitive type in the JSON string but got `%s`", jsonObj.get("denied_accounts").toString()));
      }
      if ((jsonObj.get("denied_qos") != null && !jsonObj.get("denied_qos").isJsonNull()) && !jsonObj.get("denied_qos").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `denied_qos` to be a primitive type in the JSON string but got `%s`", jsonObj.get("denied_qos").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("nodes") != null && !jsonObj.get("nodes").isJsonNull()) && !jsonObj.get("nodes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nodes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nodes").toString()));
      }
      if ((jsonObj.get("qos") != null && !jsonObj.get("qos").isJsonNull()) && !jsonObj.get("qos").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `qos` to be a primitive type in the JSON string but got `%s`", jsonObj.get("qos").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("tres") != null && !jsonObj.get("tres").isJsonNull()) && !jsonObj.get("tres").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tres` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tres").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V0037Partition.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V0037Partition' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V0037Partition> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V0037Partition.class));

       return (TypeAdapter<T>) new TypeAdapter<V0037Partition>() {
           @Override
           public void write(JsonWriter out, V0037Partition value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V0037Partition read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V0037Partition given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V0037Partition
  * @throws IOException if the JSON string is invalid with respect to V0037Partition
  */
  public static V0037Partition fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V0037Partition.class);
  }

 /**
  * Convert an instance of V0037Partition to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

