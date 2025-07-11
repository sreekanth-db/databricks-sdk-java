// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ModelVersionDatabricks {
  /** Creation time of the object, as a Unix timestamp in milliseconds. */
  @JsonProperty("creation_timestamp")
  private Long creationTimestamp;

  /** */
  @JsonProperty("current_stage")
  private String currentStage;

  /** User-specified description for the object. */
  @JsonProperty("description")
  private String description;

  /**
   * Email Subscription Status: This is the subscription status of the user to the model version
   * Users get subscribed by interacting with the model version.
   */
  @JsonProperty("email_subscription_status")
  private RegistryEmailSubscriptionType emailSubscriptionStatus;

  /** Feature lineage of `model_version`. */
  @JsonProperty("feature_list")
  private FeatureList featureList;

  /** Time of the object at last update, as a Unix timestamp in milliseconds. */
  @JsonProperty("last_updated_timestamp")
  private Long lastUpdatedTimestamp;

  /** Name of the model. */
  @JsonProperty("name")
  private String name;

  /**
   * Open requests for this `model_versions`. Gap in sequence number is intentional and is done in
   * order to match field sequence numbers of `ModelVersion` proto message
   */
  @JsonProperty("open_requests")
  private Collection<Activity> openRequests;

  /** */
  @JsonProperty("permission_level")
  private PermissionLevel permissionLevel;

  /** Unique identifier for the MLflow tracking run associated with the source model artifacts. */
  @JsonProperty("run_id")
  private String runId;

  /**
   * URL of the run associated with the model artifacts. This field is set at model version creation
   * time only for model versions whose source run is from a tracking server that is different from
   * the registry server.
   */
  @JsonProperty("run_link")
  private String runLink;

  /**
   * URI that indicates the location of the source model artifacts. This is used when creating the
   * model version.
   */
  @JsonProperty("source")
  private String source;

  /** */
  @JsonProperty("status")
  private Status status;

  /** Details on the current status, for example why registration failed. */
  @JsonProperty("status_message")
  private String statusMessage;

  /** Array of tags that are associated with the model version. */
  @JsonProperty("tags")
  private Collection<ModelVersionTag> tags;

  /** The username of the user that created the object. */
  @JsonProperty("user_id")
  private String userId;

  /** Version of the model. */
  @JsonProperty("version")
  private String version;

  public ModelVersionDatabricks setCreationTimestamp(Long creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  public Long getCreationTimestamp() {
    return creationTimestamp;
  }

  public ModelVersionDatabricks setCurrentStage(String currentStage) {
    this.currentStage = currentStage;
    return this;
  }

  public String getCurrentStage() {
    return currentStage;
  }

  public ModelVersionDatabricks setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public ModelVersionDatabricks setEmailSubscriptionStatus(
      RegistryEmailSubscriptionType emailSubscriptionStatus) {
    this.emailSubscriptionStatus = emailSubscriptionStatus;
    return this;
  }

  public RegistryEmailSubscriptionType getEmailSubscriptionStatus() {
    return emailSubscriptionStatus;
  }

  public ModelVersionDatabricks setFeatureList(FeatureList featureList) {
    this.featureList = featureList;
    return this;
  }

  public FeatureList getFeatureList() {
    return featureList;
  }

  public ModelVersionDatabricks setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

  public Long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  public ModelVersionDatabricks setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ModelVersionDatabricks setOpenRequests(Collection<Activity> openRequests) {
    this.openRequests = openRequests;
    return this;
  }

  public Collection<Activity> getOpenRequests() {
    return openRequests;
  }

  public ModelVersionDatabricks setPermissionLevel(PermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  public PermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  public ModelVersionDatabricks setRunId(String runId) {
    this.runId = runId;
    return this;
  }

  public String getRunId() {
    return runId;
  }

  public ModelVersionDatabricks setRunLink(String runLink) {
    this.runLink = runLink;
    return this;
  }

  public String getRunLink() {
    return runLink;
  }

  public ModelVersionDatabricks setSource(String source) {
    this.source = source;
    return this;
  }

  public String getSource() {
    return source;
  }

  public ModelVersionDatabricks setStatus(Status status) {
    this.status = status;
    return this;
  }

  public Status getStatus() {
    return status;
  }

  public ModelVersionDatabricks setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

  public String getStatusMessage() {
    return statusMessage;
  }

  public ModelVersionDatabricks setTags(Collection<ModelVersionTag> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<ModelVersionTag> getTags() {
    return tags;
  }

  public ModelVersionDatabricks setUserId(String userId) {
    this.userId = userId;
    return this;
  }

  public String getUserId() {
    return userId;
  }

  public ModelVersionDatabricks setVersion(String version) {
    this.version = version;
    return this;
  }

  public String getVersion() {
    return version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ModelVersionDatabricks that = (ModelVersionDatabricks) o;
    return Objects.equals(creationTimestamp, that.creationTimestamp)
        && Objects.equals(currentStage, that.currentStage)
        && Objects.equals(description, that.description)
        && Objects.equals(emailSubscriptionStatus, that.emailSubscriptionStatus)
        && Objects.equals(featureList, that.featureList)
        && Objects.equals(lastUpdatedTimestamp, that.lastUpdatedTimestamp)
        && Objects.equals(name, that.name)
        && Objects.equals(openRequests, that.openRequests)
        && Objects.equals(permissionLevel, that.permissionLevel)
        && Objects.equals(runId, that.runId)
        && Objects.equals(runLink, that.runLink)
        && Objects.equals(source, that.source)
        && Objects.equals(status, that.status)
        && Objects.equals(statusMessage, that.statusMessage)
        && Objects.equals(tags, that.tags)
        && Objects.equals(userId, that.userId)
        && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        creationTimestamp,
        currentStage,
        description,
        emailSubscriptionStatus,
        featureList,
        lastUpdatedTimestamp,
        name,
        openRequests,
        permissionLevel,
        runId,
        runLink,
        source,
        status,
        statusMessage,
        tags,
        userId,
        version);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelVersionDatabricks.class)
        .add("creationTimestamp", creationTimestamp)
        .add("currentStage", currentStage)
        .add("description", description)
        .add("emailSubscriptionStatus", emailSubscriptionStatus)
        .add("featureList", featureList)
        .add("lastUpdatedTimestamp", lastUpdatedTimestamp)
        .add("name", name)
        .add("openRequests", openRequests)
        .add("permissionLevel", permissionLevel)
        .add("runId", runId)
        .add("runLink", runLink)
        .add("source", source)
        .add("status", status)
        .add("statusMessage", statusMessage)
        .add("tags", tags)
        .add("userId", userId)
        .add("version", version)
        .toString();
  }
}
