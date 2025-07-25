// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

@Generated
public class CreateInstancePool {
  /**
   * Attributes related to instance pools running on Amazon Web Services. If not specified at pool
   * creation, a set of default values will be used.
   */
  @JsonProperty("aws_attributes")
  private InstancePoolAwsAttributes awsAttributes;

  /**
   * Attributes related to instance pools running on Azure. If not specified at pool creation, a set
   * of default values will be used.
   */
  @JsonProperty("azure_attributes")
  private InstancePoolAzureAttributes azureAttributes;

  /**
   * Additional tags for pool resources. Databricks will tag all pool resources (e.g., AWS instances
   * and EBS volumes) with these tags in addition to `default_tags`. Notes:
   *
   * <p>- Currently, Databricks allows at most 45 custom tags
   */
  @JsonProperty("custom_tags")
  private Map<String, String> customTags;

  /** Defines the specification of the disks that will be attached to all spark containers. */
  @JsonProperty("disk_spec")
  private DiskSpec diskSpec;

  /**
   * Autoscaling Local Storage: when enabled, this instances in this pool will dynamically acquire
   * additional disk space when its Spark workers are running low on disk space. In AWS, this
   * feature requires specific AWS permissions to function correctly - refer to the User Guide for
   * more details.
   */
  @JsonProperty("enable_elastic_disk")
  private Boolean enableElasticDisk;

  /**
   * Attributes related to instance pools running on Google Cloud Platform. If not specified at pool
   * creation, a set of default values will be used.
   */
  @JsonProperty("gcp_attributes")
  private InstancePoolGcpAttributes gcpAttributes;

  /**
   * Automatically terminates the extra instances in the pool cache after they are inactive for this
   * time in minutes if min_idle_instances requirement is already met. If not set, the extra pool
   * instances will be automatically terminated after a default timeout. If specified, the threshold
   * must be between 0 and 10000 minutes. Users can also set this value to 0 to instantly remove
   * idle instances from the cache if min cache size could still hold.
   */
  @JsonProperty("idle_instance_autotermination_minutes")
  private Long idleInstanceAutoterminationMinutes;

  /**
   * Pool name requested by the user. Pool name must be unique. Length must be between 1 and 100
   * characters.
   */
  @JsonProperty("instance_pool_name")
  private String instancePoolName;

  /**
   * Maximum number of outstanding instances to keep in the pool, including both instances used by
   * clusters and idle instances. Clusters that require further instance provisioning will fail
   * during upsize requests.
   */
  @JsonProperty("max_capacity")
  private Long maxCapacity;

  /** Minimum number of idle instances to keep in the instance pool */
  @JsonProperty("min_idle_instances")
  private Long minIdleInstances;

  /**
   * This field encodes, through a single value, the resources available to each of the Spark nodes
   * in this cluster. For example, the Spark nodes can be provisioned and optimized for memory or
   * compute intensive workloads. A list of available node types can be retrieved by using the
   * :method:clusters/listNodeTypes API call.
   */
  @JsonProperty("node_type_id")
  private String nodeTypeId;

  /** Custom Docker Image BYOC */
  @JsonProperty("preloaded_docker_images")
  private Collection<DockerImage> preloadedDockerImages;

  /**
   * A list containing at most one preloaded Spark image version for the pool. Pool-backed clusters
   * started with the preloaded Spark version will start faster. A list of available Spark versions
   * can be retrieved by using the :method:clusters/sparkVersions API call.
   */
  @JsonProperty("preloaded_spark_versions")
  private Collection<String> preloadedSparkVersions;

  /**
   * If set, what the configurable throughput (in Mb/s) for the remote disk is. Currently only
   * supported for GCP HYPERDISK_BALANCED types.
   */
  @JsonProperty("remote_disk_throughput")
  private Long remoteDiskThroughput;

  /**
   * If set, what the total initial volume size (in GB) of the remote disks should be. Currently
   * only supported for GCP HYPERDISK_BALANCED types.
   */
  @JsonProperty("total_initial_remote_disk_size")
  private Long totalInitialRemoteDiskSize;

  public CreateInstancePool setAwsAttributes(InstancePoolAwsAttributes awsAttributes) {
    this.awsAttributes = awsAttributes;
    return this;
  }

  public InstancePoolAwsAttributes getAwsAttributes() {
    return awsAttributes;
  }

  public CreateInstancePool setAzureAttributes(InstancePoolAzureAttributes azureAttributes) {
    this.azureAttributes = azureAttributes;
    return this;
  }

  public InstancePoolAzureAttributes getAzureAttributes() {
    return azureAttributes;
  }

  public CreateInstancePool setCustomTags(Map<String, String> customTags) {
    this.customTags = customTags;
    return this;
  }

  public Map<String, String> getCustomTags() {
    return customTags;
  }

  public CreateInstancePool setDiskSpec(DiskSpec diskSpec) {
    this.diskSpec = diskSpec;
    return this;
  }

  public DiskSpec getDiskSpec() {
    return diskSpec;
  }

  public CreateInstancePool setEnableElasticDisk(Boolean enableElasticDisk) {
    this.enableElasticDisk = enableElasticDisk;
    return this;
  }

  public Boolean getEnableElasticDisk() {
    return enableElasticDisk;
  }

  public CreateInstancePool setGcpAttributes(InstancePoolGcpAttributes gcpAttributes) {
    this.gcpAttributes = gcpAttributes;
    return this;
  }

  public InstancePoolGcpAttributes getGcpAttributes() {
    return gcpAttributes;
  }

  public CreateInstancePool setIdleInstanceAutoterminationMinutes(
      Long idleInstanceAutoterminationMinutes) {
    this.idleInstanceAutoterminationMinutes = idleInstanceAutoterminationMinutes;
    return this;
  }

  public Long getIdleInstanceAutoterminationMinutes() {
    return idleInstanceAutoterminationMinutes;
  }

  public CreateInstancePool setInstancePoolName(String instancePoolName) {
    this.instancePoolName = instancePoolName;
    return this;
  }

  public String getInstancePoolName() {
    return instancePoolName;
  }

  public CreateInstancePool setMaxCapacity(Long maxCapacity) {
    this.maxCapacity = maxCapacity;
    return this;
  }

  public Long getMaxCapacity() {
    return maxCapacity;
  }

  public CreateInstancePool setMinIdleInstances(Long minIdleInstances) {
    this.minIdleInstances = minIdleInstances;
    return this;
  }

  public Long getMinIdleInstances() {
    return minIdleInstances;
  }

  public CreateInstancePool setNodeTypeId(String nodeTypeId) {
    this.nodeTypeId = nodeTypeId;
    return this;
  }

  public String getNodeTypeId() {
    return nodeTypeId;
  }

  public CreateInstancePool setPreloadedDockerImages(
      Collection<DockerImage> preloadedDockerImages) {
    this.preloadedDockerImages = preloadedDockerImages;
    return this;
  }

  public Collection<DockerImage> getPreloadedDockerImages() {
    return preloadedDockerImages;
  }

  public CreateInstancePool setPreloadedSparkVersions(Collection<String> preloadedSparkVersions) {
    this.preloadedSparkVersions = preloadedSparkVersions;
    return this;
  }

  public Collection<String> getPreloadedSparkVersions() {
    return preloadedSparkVersions;
  }

  public CreateInstancePool setRemoteDiskThroughput(Long remoteDiskThroughput) {
    this.remoteDiskThroughput = remoteDiskThroughput;
    return this;
  }

  public Long getRemoteDiskThroughput() {
    return remoteDiskThroughput;
  }

  public CreateInstancePool setTotalInitialRemoteDiskSize(Long totalInitialRemoteDiskSize) {
    this.totalInitialRemoteDiskSize = totalInitialRemoteDiskSize;
    return this;
  }

  public Long getTotalInitialRemoteDiskSize() {
    return totalInitialRemoteDiskSize;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateInstancePool that = (CreateInstancePool) o;
    return Objects.equals(awsAttributes, that.awsAttributes)
        && Objects.equals(azureAttributes, that.azureAttributes)
        && Objects.equals(customTags, that.customTags)
        && Objects.equals(diskSpec, that.diskSpec)
        && Objects.equals(enableElasticDisk, that.enableElasticDisk)
        && Objects.equals(gcpAttributes, that.gcpAttributes)
        && Objects.equals(
            idleInstanceAutoterminationMinutes, that.idleInstanceAutoterminationMinutes)
        && Objects.equals(instancePoolName, that.instancePoolName)
        && Objects.equals(maxCapacity, that.maxCapacity)
        && Objects.equals(minIdleInstances, that.minIdleInstances)
        && Objects.equals(nodeTypeId, that.nodeTypeId)
        && Objects.equals(preloadedDockerImages, that.preloadedDockerImages)
        && Objects.equals(preloadedSparkVersions, that.preloadedSparkVersions)
        && Objects.equals(remoteDiskThroughput, that.remoteDiskThroughput)
        && Objects.equals(totalInitialRemoteDiskSize, that.totalInitialRemoteDiskSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        awsAttributes,
        azureAttributes,
        customTags,
        diskSpec,
        enableElasticDisk,
        gcpAttributes,
        idleInstanceAutoterminationMinutes,
        instancePoolName,
        maxCapacity,
        minIdleInstances,
        nodeTypeId,
        preloadedDockerImages,
        preloadedSparkVersions,
        remoteDiskThroughput,
        totalInitialRemoteDiskSize);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateInstancePool.class)
        .add("awsAttributes", awsAttributes)
        .add("azureAttributes", azureAttributes)
        .add("customTags", customTags)
        .add("diskSpec", diskSpec)
        .add("enableElasticDisk", enableElasticDisk)
        .add("gcpAttributes", gcpAttributes)
        .add("idleInstanceAutoterminationMinutes", idleInstanceAutoterminationMinutes)
        .add("instancePoolName", instancePoolName)
        .add("maxCapacity", maxCapacity)
        .add("minIdleInstances", minIdleInstances)
        .add("nodeTypeId", nodeTypeId)
        .add("preloadedDockerImages", preloadedDockerImages)
        .add("preloadedSparkVersions", preloadedSparkVersions)
        .add("remoteDiskThroughput", remoteDiskThroughput)
        .add("totalInitialRemoteDiskSize", totalInitialRemoteDiskSize)
        .toString();
  }
}
