// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetWorkspaceNetworkOptionRequest {
  /** The workspace ID. */
  @JsonIgnore private Long workspaceId;

  public GetWorkspaceNetworkOptionRequest setWorkspaceId(Long workspaceId) {
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
    GetWorkspaceNetworkOptionRequest that = (GetWorkspaceNetworkOptionRequest) o;
    return Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetWorkspaceNetworkOptionRequest.class)
        .add("workspaceId", workspaceId)
        .toString();
  }
}
