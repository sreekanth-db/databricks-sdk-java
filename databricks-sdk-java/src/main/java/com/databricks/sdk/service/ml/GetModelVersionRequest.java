// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetModelVersionRequest {
  /** Name of the registered model */
  @JsonIgnore
  @QueryParam("name")
  private String name;

  /** Model version number */
  @JsonIgnore
  @QueryParam("version")
  private String version;

  public GetModelVersionRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public GetModelVersionRequest setVersion(String version) {
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
    GetModelVersionRequest that = (GetModelVersionRequest) o;
    return Objects.equals(name, that.name) && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, version);
  }

  @Override
  public String toString() {
    return new ToStringer(GetModelVersionRequest.class)
        .add("name", name)
        .add("version", version)
        .toString();
  }
}
