// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetVpcEndpointRequest {
  /** Databricks VPC endpoint ID. */
  @JsonIgnore private String vpcEndpointId;

  public GetVpcEndpointRequest setVpcEndpointId(String vpcEndpointId) {
    this.vpcEndpointId = vpcEndpointId;
    return this;
  }

  public String getVpcEndpointId() {
    return vpcEndpointId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetVpcEndpointRequest that = (GetVpcEndpointRequest) o;
    return Objects.equals(vpcEndpointId, that.vpcEndpointId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vpcEndpointId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetVpcEndpointRequest.class)
        .add("vpcEndpointId", vpcEndpointId)
        .toString();
  }
}
