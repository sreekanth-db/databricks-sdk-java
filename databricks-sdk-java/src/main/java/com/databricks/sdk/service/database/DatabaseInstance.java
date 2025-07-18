// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * A DatabaseInstance represents a logical Postgres instance, comprised of both compute and storage.
 */
@Generated
public class DatabaseInstance {
  /** The sku of the instance. Valid values are "CU_1", "CU_2", "CU_4", "CU_8". */
  @JsonProperty("capacity")
  private String capacity;

  /** The refs of the child instances. This is only available if the instance is parent instance. */
  @JsonProperty("child_instance_refs")
  private Collection<DatabaseInstanceRef> childInstanceRefs;

  /** The timestamp when the instance was created. */
  @JsonProperty("creation_time")
  private String creationTime;

  /** The email of the creator of the instance. */
  @JsonProperty("creator")
  private String creator;

  /**
   * xref AIP-129. `enable_readable_secondaries` is owned by the client, while
   * `effective_enable_readable_secondaries` is owned by the server. `enable_readable_secondaries`
   * will only be set in Create/Update response messages if and only if the user provides the field
   * via the request. `effective_enable_readable_secondaries` on the other hand will always bet set
   * in all response messages (Create/Update/Get/List).
   */
  @JsonProperty("effective_enable_readable_secondaries")
  private Boolean effectiveEnableReadableSecondaries;

  /**
   * xref AIP-129. `node_count` is owned by the client, while `effective_node_count` is owned by the
   * server. `node_count` will only be set in Create/Update response messages if and only if the
   * user provides the field via the request. `effective_node_count` on the other hand will always
   * bet set in all response messages (Create/Update/Get/List).
   */
  @JsonProperty("effective_node_count")
  private Long effectiveNodeCount;

  /**
   * xref AIP-129. `retention_window_in_days` is owned by the client, while
   * `effective_retention_window_in_days` is owned by the server. `retention_window_in_days` will
   * only be set in Create/Update response messages if and only if the user provides the field via
   * the request. `effective_retention_window_in_days` on the other hand will always bet set in all
   * response messages (Create/Update/Get/List).
   */
  @JsonProperty("effective_retention_window_in_days")
  private Long effectiveRetentionWindowInDays;

  /**
   * xref AIP-129. `stopped` is owned by the client, while `effective_stopped` is owned by the
   * server. `stopped` will only be set in Create/Update response messages if and only if the user
   * provides the field via the request. `effective_stopped` on the other hand will always bet set
   * in all response messages (Create/Update/Get/List).
   */
  @JsonProperty("effective_stopped")
  private Boolean effectiveStopped;

  /** Whether to enable secondaries to serve read-only traffic. Defaults to false. */
  @JsonProperty("enable_readable_secondaries")
  private Boolean enableReadableSecondaries;

  /** The name of the instance. This is the unique identifier for the instance. */
  @JsonProperty("name")
  private String name;

  /**
   * The number of nodes in the instance, composed of 1 primary and 0 or more secondaries. Defaults
   * to 1 primary and 0 secondaries.
   */
  @JsonProperty("node_count")
  private Long nodeCount;

  /**
   * The ref of the parent instance. This is only available if the instance is child instance.
   * Input: For specifying the parent instance to create a child instance. Optional. Output: Only
   * populated if provided as input to create a child instance.
   */
  @JsonProperty("parent_instance_ref")
  private DatabaseInstanceRef parentInstanceRef;

  /** The version of Postgres running on the instance. */
  @JsonProperty("pg_version")
  private String pgVersion;

  /**
   * The DNS endpoint to connect to the instance for read only access. This is only available if
   * enable_readable_secondaries is true.
   */
  @JsonProperty("read_only_dns")
  private String readOnlyDns;

  /** The DNS endpoint to connect to the instance for read+write access. */
  @JsonProperty("read_write_dns")
  private String readWriteDns;

  /**
   * The retention window for the instance. This is the time window in days for which the historical
   * data is retained. The default value is 7 days. Valid values are 2 to 35 days.
   */
  @JsonProperty("retention_window_in_days")
  private Long retentionWindowInDays;

  /** The current state of the instance. */
  @JsonProperty("state")
  private DatabaseInstanceState state;

  /** Whether the instance is stopped. */
  @JsonProperty("stopped")
  private Boolean stopped;

  /** An immutable UUID identifier for the instance. */
  @JsonProperty("uid")
  private String uid;

  public DatabaseInstance setCapacity(String capacity) {
    this.capacity = capacity;
    return this;
  }

  public String getCapacity() {
    return capacity;
  }

  public DatabaseInstance setChildInstanceRefs(Collection<DatabaseInstanceRef> childInstanceRefs) {
    this.childInstanceRefs = childInstanceRefs;
    return this;
  }

  public Collection<DatabaseInstanceRef> getChildInstanceRefs() {
    return childInstanceRefs;
  }

  public DatabaseInstance setCreationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  public String getCreationTime() {
    return creationTime;
  }

  public DatabaseInstance setCreator(String creator) {
    this.creator = creator;
    return this;
  }

  public String getCreator() {
    return creator;
  }

  public DatabaseInstance setEffectiveEnableReadableSecondaries(
      Boolean effectiveEnableReadableSecondaries) {
    this.effectiveEnableReadableSecondaries = effectiveEnableReadableSecondaries;
    return this;
  }

  public Boolean getEffectiveEnableReadableSecondaries() {
    return effectiveEnableReadableSecondaries;
  }

  public DatabaseInstance setEffectiveNodeCount(Long effectiveNodeCount) {
    this.effectiveNodeCount = effectiveNodeCount;
    return this;
  }

  public Long getEffectiveNodeCount() {
    return effectiveNodeCount;
  }

  public DatabaseInstance setEffectiveRetentionWindowInDays(Long effectiveRetentionWindowInDays) {
    this.effectiveRetentionWindowInDays = effectiveRetentionWindowInDays;
    return this;
  }

  public Long getEffectiveRetentionWindowInDays() {
    return effectiveRetentionWindowInDays;
  }

  public DatabaseInstance setEffectiveStopped(Boolean effectiveStopped) {
    this.effectiveStopped = effectiveStopped;
    return this;
  }

  public Boolean getEffectiveStopped() {
    return effectiveStopped;
  }

  public DatabaseInstance setEnableReadableSecondaries(Boolean enableReadableSecondaries) {
    this.enableReadableSecondaries = enableReadableSecondaries;
    return this;
  }

  public Boolean getEnableReadableSecondaries() {
    return enableReadableSecondaries;
  }

  public DatabaseInstance setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DatabaseInstance setNodeCount(Long nodeCount) {
    this.nodeCount = nodeCount;
    return this;
  }

  public Long getNodeCount() {
    return nodeCount;
  }

  public DatabaseInstance setParentInstanceRef(DatabaseInstanceRef parentInstanceRef) {
    this.parentInstanceRef = parentInstanceRef;
    return this;
  }

  public DatabaseInstanceRef getParentInstanceRef() {
    return parentInstanceRef;
  }

  public DatabaseInstance setPgVersion(String pgVersion) {
    this.pgVersion = pgVersion;
    return this;
  }

  public String getPgVersion() {
    return pgVersion;
  }

  public DatabaseInstance setReadOnlyDns(String readOnlyDns) {
    this.readOnlyDns = readOnlyDns;
    return this;
  }

  public String getReadOnlyDns() {
    return readOnlyDns;
  }

  public DatabaseInstance setReadWriteDns(String readWriteDns) {
    this.readWriteDns = readWriteDns;
    return this;
  }

  public String getReadWriteDns() {
    return readWriteDns;
  }

  public DatabaseInstance setRetentionWindowInDays(Long retentionWindowInDays) {
    this.retentionWindowInDays = retentionWindowInDays;
    return this;
  }

  public Long getRetentionWindowInDays() {
    return retentionWindowInDays;
  }

  public DatabaseInstance setState(DatabaseInstanceState state) {
    this.state = state;
    return this;
  }

  public DatabaseInstanceState getState() {
    return state;
  }

  public DatabaseInstance setStopped(Boolean stopped) {
    this.stopped = stopped;
    return this;
  }

  public Boolean getStopped() {
    return stopped;
  }

  public DatabaseInstance setUid(String uid) {
    this.uid = uid;
    return this;
  }

  public String getUid() {
    return uid;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DatabaseInstance that = (DatabaseInstance) o;
    return Objects.equals(capacity, that.capacity)
        && Objects.equals(childInstanceRefs, that.childInstanceRefs)
        && Objects.equals(creationTime, that.creationTime)
        && Objects.equals(creator, that.creator)
        && Objects.equals(
            effectiveEnableReadableSecondaries, that.effectiveEnableReadableSecondaries)
        && Objects.equals(effectiveNodeCount, that.effectiveNodeCount)
        && Objects.equals(effectiveRetentionWindowInDays, that.effectiveRetentionWindowInDays)
        && Objects.equals(effectiveStopped, that.effectiveStopped)
        && Objects.equals(enableReadableSecondaries, that.enableReadableSecondaries)
        && Objects.equals(name, that.name)
        && Objects.equals(nodeCount, that.nodeCount)
        && Objects.equals(parentInstanceRef, that.parentInstanceRef)
        && Objects.equals(pgVersion, that.pgVersion)
        && Objects.equals(readOnlyDns, that.readOnlyDns)
        && Objects.equals(readWriteDns, that.readWriteDns)
        && Objects.equals(retentionWindowInDays, that.retentionWindowInDays)
        && Objects.equals(state, that.state)
        && Objects.equals(stopped, that.stopped)
        && Objects.equals(uid, that.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        capacity,
        childInstanceRefs,
        creationTime,
        creator,
        effectiveEnableReadableSecondaries,
        effectiveNodeCount,
        effectiveRetentionWindowInDays,
        effectiveStopped,
        enableReadableSecondaries,
        name,
        nodeCount,
        parentInstanceRef,
        pgVersion,
        readOnlyDns,
        readWriteDns,
        retentionWindowInDays,
        state,
        stopped,
        uid);
  }

  @Override
  public String toString() {
    return new ToStringer(DatabaseInstance.class)
        .add("capacity", capacity)
        .add("childInstanceRefs", childInstanceRefs)
        .add("creationTime", creationTime)
        .add("creator", creator)
        .add("effectiveEnableReadableSecondaries", effectiveEnableReadableSecondaries)
        .add("effectiveNodeCount", effectiveNodeCount)
        .add("effectiveRetentionWindowInDays", effectiveRetentionWindowInDays)
        .add("effectiveStopped", effectiveStopped)
        .add("enableReadableSecondaries", enableReadableSecondaries)
        .add("name", name)
        .add("nodeCount", nodeCount)
        .add("parentInstanceRef", parentInstanceRef)
        .add("pgVersion", pgVersion)
        .add("readOnlyDns", readOnlyDns)
        .add("readWriteDns", readWriteDns)
        .add("retentionWindowInDays", retentionWindowInDays)
        .add("state", state)
        .add("stopped", stopped)
        .add("uid", uid)
        .toString();
  }
}
