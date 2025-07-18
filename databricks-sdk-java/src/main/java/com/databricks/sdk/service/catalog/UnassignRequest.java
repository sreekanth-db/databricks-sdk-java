// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class UnassignRequest {
  /** Query for the ID of the metastore to delete. */
  @JsonIgnore
  @QueryParam("metastore_id")
  private String metastoreId;

  /** A workspace ID. */
  @JsonIgnore private Long workspaceId;

  public UnassignRequest setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public UnassignRequest setWorkspaceId(Long workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  public Long getWorkspaceId() {
    return workspaceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UnassignRequest that = (UnassignRequest) o;
    return Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metastoreId, workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(UnassignRequest.class)
        .add("metastoreId", metastoreId)
        .add("workspaceId", workspaceId)
        .toString();
  }
}
