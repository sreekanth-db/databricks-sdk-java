// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

@Generated
public class Workspace {
  /** Databricks account ID. */
  @JsonProperty("account_id")
  private String accountId;

  /** The AWS region of the workspace data plane (for example, `us-west-2`). */
  @JsonProperty("aws_region")
  private String awsRegion;

  /** */
  @JsonProperty("azure_workspace_info")
  private AzureWorkspaceInfo azureWorkspaceInfo;

  /** The cloud name. This field always has the value `gcp`. */
  @JsonProperty("cloud")
  private String cloud;

  /** */
  @JsonProperty("cloud_resource_container")
  private CloudResourceContainer cloudResourceContainer;

  /** Time in epoch milliseconds when the workspace was created. */
  @JsonProperty("creation_time")
  private Long creationTime;

  /** ID of the workspace's credential configuration object. */
  @JsonProperty("credentials_id")
  private String credentialsId;

  /**
   * The custom tags key-value pairing that is attached to this workspace. The key-value pair is a
   * string of utf-8 characters. The value can be an empty string, with maximum length of 255
   * characters. The key can be of maximum length of 127 characters, and cannot be empty.
   */
  @JsonProperty("custom_tags")
  private Map<String, String> customTags;

  /**
   * The deployment name defines part of the subdomain for the workspace. The workspace URL for web
   * application and REST APIs is `<deployment-name>.cloud.databricks.com`.
   *
   * <p>This value must be unique across all non-deleted deployments across all AWS regions.
   */
  @JsonProperty("deployment_name")
  private String deploymentName;

  /**
   * If this workspace is for a external customer, then external_customer_info is populated. If this
   * workspace is not for a external customer, then external_customer_info is empty.
   */
  @JsonProperty("external_customer_info")
  private ExternalCustomerInfo externalCustomerInfo;

  /** */
  @JsonProperty("gcp_managed_network_config")
  private GcpManagedNetworkConfig gcpManagedNetworkConfig;

  /** */
  @JsonProperty("gke_config")
  private GkeConfig gkeConfig;

  /** Whether no public IP is enabled for the workspace. */
  @JsonProperty("is_no_public_ip_enabled")
  private Boolean isNoPublicIpEnabled;

  /**
   * The Google Cloud region of the workspace data plane in your Google account (for example,
   * `us-east4`).
   */
  @JsonProperty("location")
  private String location;

  /** ID of the key configuration for encrypting managed services. */
  @JsonProperty("managed_services_customer_managed_key_id")
  private String managedServicesCustomerManagedKeyId;

  /**
   * The network configuration ID that is attached to the workspace. This field is available only if
   * the network is a customer-managed network.
   */
  @JsonProperty("network_id")
  private String networkId;

  /** */
  @JsonProperty("pricing_tier")
  private PricingTier pricingTier;

  /**
   * ID of the workspace's private access settings object. Only used for PrivateLink. You must
   * specify this ID if you are using [AWS PrivateLink] for either front-end (user-to-workspace
   * connection), back-end (data plane to control plane connection), or both connection types.
   *
   * <p>Before configuring PrivateLink, read the [Databricks article about PrivateLink].",
   *
   * <p>[AWS PrivateLink]: https://aws.amazon.com/privatelink/ [Databricks article about
   * PrivateLink]:
   * https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html
   */
  @JsonProperty("private_access_settings_id")
  private String privateAccessSettingsId;

  /** ID of the workspace's storage configuration object. */
  @JsonProperty("storage_configuration_id")
  private String storageConfigurationId;

  /** ID of the key configuration for encrypting workspace storage. */
  @JsonProperty("storage_customer_managed_key_id")
  private String storageCustomerManagedKeyId;

  /** A unique integer ID for the workspace */
  @JsonProperty("workspace_id")
  private Long workspaceId;

  /** The human-readable name of the workspace. */
  @JsonProperty("workspace_name")
  private String workspaceName;

  /** */
  @JsonProperty("workspace_status")
  private WorkspaceStatus workspaceStatus;

  /** Message describing the current workspace status. */
  @JsonProperty("workspace_status_message")
  private String workspaceStatusMessage;

  public Workspace setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  public String getAccountId() {
    return accountId;
  }

  public Workspace setAwsRegion(String awsRegion) {
    this.awsRegion = awsRegion;
    return this;
  }

  public String getAwsRegion() {
    return awsRegion;
  }

  public Workspace setAzureWorkspaceInfo(AzureWorkspaceInfo azureWorkspaceInfo) {
    this.azureWorkspaceInfo = azureWorkspaceInfo;
    return this;
  }

  public AzureWorkspaceInfo getAzureWorkspaceInfo() {
    return azureWorkspaceInfo;
  }

  public Workspace setCloud(String cloud) {
    this.cloud = cloud;
    return this;
  }

  public String getCloud() {
    return cloud;
  }

  public Workspace setCloudResourceContainer(CloudResourceContainer cloudResourceContainer) {
    this.cloudResourceContainer = cloudResourceContainer;
    return this;
  }

  public CloudResourceContainer getCloudResourceContainer() {
    return cloudResourceContainer;
  }

  public Workspace setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  public Long getCreationTime() {
    return creationTime;
  }

  public Workspace setCredentialsId(String credentialsId) {
    this.credentialsId = credentialsId;
    return this;
  }

  public String getCredentialsId() {
    return credentialsId;
  }

  public Workspace setCustomTags(Map<String, String> customTags) {
    this.customTags = customTags;
    return this;
  }

  public Map<String, String> getCustomTags() {
    return customTags;
  }

  public Workspace setDeploymentName(String deploymentName) {
    this.deploymentName = deploymentName;
    return this;
  }

  public String getDeploymentName() {
    return deploymentName;
  }

  public Workspace setExternalCustomerInfo(ExternalCustomerInfo externalCustomerInfo) {
    this.externalCustomerInfo = externalCustomerInfo;
    return this;
  }

  public ExternalCustomerInfo getExternalCustomerInfo() {
    return externalCustomerInfo;
  }

  public Workspace setGcpManagedNetworkConfig(GcpManagedNetworkConfig gcpManagedNetworkConfig) {
    this.gcpManagedNetworkConfig = gcpManagedNetworkConfig;
    return this;
  }

  public GcpManagedNetworkConfig getGcpManagedNetworkConfig() {
    return gcpManagedNetworkConfig;
  }

  public Workspace setGkeConfig(GkeConfig gkeConfig) {
    this.gkeConfig = gkeConfig;
    return this;
  }

  public GkeConfig getGkeConfig() {
    return gkeConfig;
  }

  public Workspace setIsNoPublicIpEnabled(Boolean isNoPublicIpEnabled) {
    this.isNoPublicIpEnabled = isNoPublicIpEnabled;
    return this;
  }

  public Boolean getIsNoPublicIpEnabled() {
    return isNoPublicIpEnabled;
  }

  public Workspace setLocation(String location) {
    this.location = location;
    return this;
  }

  public String getLocation() {
    return location;
  }

  public Workspace setManagedServicesCustomerManagedKeyId(
      String managedServicesCustomerManagedKeyId) {
    this.managedServicesCustomerManagedKeyId = managedServicesCustomerManagedKeyId;
    return this;
  }

  public String getManagedServicesCustomerManagedKeyId() {
    return managedServicesCustomerManagedKeyId;
  }

  public Workspace setNetworkId(String networkId) {
    this.networkId = networkId;
    return this;
  }

  public String getNetworkId() {
    return networkId;
  }

  public Workspace setPricingTier(PricingTier pricingTier) {
    this.pricingTier = pricingTier;
    return this;
  }

  public PricingTier getPricingTier() {
    return pricingTier;
  }

  public Workspace setPrivateAccessSettingsId(String privateAccessSettingsId) {
    this.privateAccessSettingsId = privateAccessSettingsId;
    return this;
  }

  public String getPrivateAccessSettingsId() {
    return privateAccessSettingsId;
  }

  public Workspace setStorageConfigurationId(String storageConfigurationId) {
    this.storageConfigurationId = storageConfigurationId;
    return this;
  }

  public String getStorageConfigurationId() {
    return storageConfigurationId;
  }

  public Workspace setStorageCustomerManagedKeyId(String storageCustomerManagedKeyId) {
    this.storageCustomerManagedKeyId = storageCustomerManagedKeyId;
    return this;
  }

  public String getStorageCustomerManagedKeyId() {
    return storageCustomerManagedKeyId;
  }

  public Workspace setWorkspaceId(Long workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  public Long getWorkspaceId() {
    return workspaceId;
  }

  public Workspace setWorkspaceName(String workspaceName) {
    this.workspaceName = workspaceName;
    return this;
  }

  public String getWorkspaceName() {
    return workspaceName;
  }

  public Workspace setWorkspaceStatus(WorkspaceStatus workspaceStatus) {
    this.workspaceStatus = workspaceStatus;
    return this;
  }

  public WorkspaceStatus getWorkspaceStatus() {
    return workspaceStatus;
  }

  public Workspace setWorkspaceStatusMessage(String workspaceStatusMessage) {
    this.workspaceStatusMessage = workspaceStatusMessage;
    return this;
  }

  public String getWorkspaceStatusMessage() {
    return workspaceStatusMessage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Workspace that = (Workspace) o;
    return Objects.equals(accountId, that.accountId)
        && Objects.equals(awsRegion, that.awsRegion)
        && Objects.equals(azureWorkspaceInfo, that.azureWorkspaceInfo)
        && Objects.equals(cloud, that.cloud)
        && Objects.equals(cloudResourceContainer, that.cloudResourceContainer)
        && Objects.equals(creationTime, that.creationTime)
        && Objects.equals(credentialsId, that.credentialsId)
        && Objects.equals(customTags, that.customTags)
        && Objects.equals(deploymentName, that.deploymentName)
        && Objects.equals(externalCustomerInfo, that.externalCustomerInfo)
        && Objects.equals(gcpManagedNetworkConfig, that.gcpManagedNetworkConfig)
        && Objects.equals(gkeConfig, that.gkeConfig)
        && Objects.equals(isNoPublicIpEnabled, that.isNoPublicIpEnabled)
        && Objects.equals(location, that.location)
        && Objects.equals(
            managedServicesCustomerManagedKeyId, that.managedServicesCustomerManagedKeyId)
        && Objects.equals(networkId, that.networkId)
        && Objects.equals(pricingTier, that.pricingTier)
        && Objects.equals(privateAccessSettingsId, that.privateAccessSettingsId)
        && Objects.equals(storageConfigurationId, that.storageConfigurationId)
        && Objects.equals(storageCustomerManagedKeyId, that.storageCustomerManagedKeyId)
        && Objects.equals(workspaceId, that.workspaceId)
        && Objects.equals(workspaceName, that.workspaceName)
        && Objects.equals(workspaceStatus, that.workspaceStatus)
        && Objects.equals(workspaceStatusMessage, that.workspaceStatusMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        awsRegion,
        azureWorkspaceInfo,
        cloud,
        cloudResourceContainer,
        creationTime,
        credentialsId,
        customTags,
        deploymentName,
        externalCustomerInfo,
        gcpManagedNetworkConfig,
        gkeConfig,
        isNoPublicIpEnabled,
        location,
        managedServicesCustomerManagedKeyId,
        networkId,
        pricingTier,
        privateAccessSettingsId,
        storageConfigurationId,
        storageCustomerManagedKeyId,
        workspaceId,
        workspaceName,
        workspaceStatus,
        workspaceStatusMessage);
  }

  @Override
  public String toString() {
    return new ToStringer(Workspace.class)
        .add("accountId", accountId)
        .add("awsRegion", awsRegion)
        .add("azureWorkspaceInfo", azureWorkspaceInfo)
        .add("cloud", cloud)
        .add("cloudResourceContainer", cloudResourceContainer)
        .add("creationTime", creationTime)
        .add("credentialsId", credentialsId)
        .add("customTags", customTags)
        .add("deploymentName", deploymentName)
        .add("externalCustomerInfo", externalCustomerInfo)
        .add("gcpManagedNetworkConfig", gcpManagedNetworkConfig)
        .add("gkeConfig", gkeConfig)
        .add("isNoPublicIpEnabled", isNoPublicIpEnabled)
        .add("location", location)
        .add("managedServicesCustomerManagedKeyId", managedServicesCustomerManagedKeyId)
        .add("networkId", networkId)
        .add("pricingTier", pricingTier)
        .add("privateAccessSettingsId", privateAccessSettingsId)
        .add("storageConfigurationId", storageConfigurationId)
        .add("storageCustomerManagedKeyId", storageCustomerManagedKeyId)
        .add("workspaceId", workspaceId)
        .add("workspaceName", workspaceName)
        .add("workspaceStatus", workspaceStatus)
        .add("workspaceStatusMessage", workspaceStatusMessage)
        .toString();
  }
}
