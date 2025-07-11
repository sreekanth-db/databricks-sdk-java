// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class VectorIndex {
  /** The user who created the index. */
  @JsonProperty("creator")
  private String creator;

  /** */
  @JsonProperty("delta_sync_index_spec")
  private DeltaSyncVectorIndexSpecResponse deltaSyncIndexSpec;

  /** */
  @JsonProperty("direct_access_index_spec")
  private DirectAccessVectorIndexSpec directAccessIndexSpec;

  /** Name of the endpoint associated with the index */
  @JsonProperty("endpoint_name")
  private String endpointName;

  /** */
  @JsonProperty("index_type")
  private VectorIndexType indexType;

  /** Name of the index */
  @JsonProperty("name")
  private String name;

  /** Primary key of the index */
  @JsonProperty("primary_key")
  private String primaryKey;

  /** */
  @JsonProperty("status")
  private VectorIndexStatus status;

  public VectorIndex setCreator(String creator) {
    this.creator = creator;
    return this;
  }

  public String getCreator() {
    return creator;
  }

  public VectorIndex setDeltaSyncIndexSpec(DeltaSyncVectorIndexSpecResponse deltaSyncIndexSpec) {
    this.deltaSyncIndexSpec = deltaSyncIndexSpec;
    return this;
  }

  public DeltaSyncVectorIndexSpecResponse getDeltaSyncIndexSpec() {
    return deltaSyncIndexSpec;
  }

  public VectorIndex setDirectAccessIndexSpec(DirectAccessVectorIndexSpec directAccessIndexSpec) {
    this.directAccessIndexSpec = directAccessIndexSpec;
    return this;
  }

  public DirectAccessVectorIndexSpec getDirectAccessIndexSpec() {
    return directAccessIndexSpec;
  }

  public VectorIndex setEndpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

  public String getEndpointName() {
    return endpointName;
  }

  public VectorIndex setIndexType(VectorIndexType indexType) {
    this.indexType = indexType;
    return this;
  }

  public VectorIndexType getIndexType() {
    return indexType;
  }

  public VectorIndex setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public VectorIndex setPrimaryKey(String primaryKey) {
    this.primaryKey = primaryKey;
    return this;
  }

  public String getPrimaryKey() {
    return primaryKey;
  }

  public VectorIndex setStatus(VectorIndexStatus status) {
    this.status = status;
    return this;
  }

  public VectorIndexStatus getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    VectorIndex that = (VectorIndex) o;
    return Objects.equals(creator, that.creator)
        && Objects.equals(deltaSyncIndexSpec, that.deltaSyncIndexSpec)
        && Objects.equals(directAccessIndexSpec, that.directAccessIndexSpec)
        && Objects.equals(endpointName, that.endpointName)
        && Objects.equals(indexType, that.indexType)
        && Objects.equals(name, that.name)
        && Objects.equals(primaryKey, that.primaryKey)
        && Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        creator,
        deltaSyncIndexSpec,
        directAccessIndexSpec,
        endpointName,
        indexType,
        name,
        primaryKey,
        status);
  }

  @Override
  public String toString() {
    return new ToStringer(VectorIndex.class)
        .add("creator", creator)
        .add("deltaSyncIndexSpec", deltaSyncIndexSpec)
        .add("directAccessIndexSpec", directAccessIndexSpec)
        .add("endpointName", endpointName)
        .add("indexType", indexType)
        .add("name", name)
        .add("primaryKey", primaryKey)
        .add("status", status)
        .toString();
  }
}
