// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetServingEndpointPermissionLevelsRequest {
  /** The serving endpoint for which to get or manage permissions. */
  @JsonIgnore private String servingEndpointId;

  public GetServingEndpointPermissionLevelsRequest setServingEndpointId(String servingEndpointId) {
    this.servingEndpointId = servingEndpointId;
    return this;
  }

  public String getServingEndpointId() {
    return servingEndpointId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetServingEndpointPermissionLevelsRequest that = (GetServingEndpointPermissionLevelsRequest) o;
    return Objects.equals(servingEndpointId, that.servingEndpointId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servingEndpointId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetServingEndpointPermissionLevelsRequest.class)
        .add("servingEndpointId", servingEndpointId)
        .toString();
  }
}
