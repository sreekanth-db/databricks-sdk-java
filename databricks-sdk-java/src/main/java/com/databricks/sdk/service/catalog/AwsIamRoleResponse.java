// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** The AWS IAM role configuration */
@Generated
public class AwsIamRoleResponse {
  /** The external ID used in role assumption to prevent the confused deputy problem. */
  @JsonProperty("external_id")
  private String externalId;

  /** The Amazon Resource Name (ARN) of the AWS IAM role used to vend temporary credentials. */
  @JsonProperty("role_arn")
  private String roleArn;

  /**
   * The Amazon Resource Name (ARN) of the AWS IAM user managed by Databricks. This is the identity
   * that is going to assume the AWS IAM role.
   */
  @JsonProperty("unity_catalog_iam_arn")
  private String unityCatalogIamArn;

  public AwsIamRoleResponse setExternalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  public String getExternalId() {
    return externalId;
  }

  public AwsIamRoleResponse setRoleArn(String roleArn) {
    this.roleArn = roleArn;
    return this;
  }

  public String getRoleArn() {
    return roleArn;
  }

  public AwsIamRoleResponse setUnityCatalogIamArn(String unityCatalogIamArn) {
    this.unityCatalogIamArn = unityCatalogIamArn;
    return this;
  }

  public String getUnityCatalogIamArn() {
    return unityCatalogIamArn;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AwsIamRoleResponse that = (AwsIamRoleResponse) o;
    return Objects.equals(externalId, that.externalId)
        && Objects.equals(roleArn, that.roleArn)
        && Objects.equals(unityCatalogIamArn, that.unityCatalogIamArn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalId, roleArn, unityCatalogIamArn);
  }

  @Override
  public String toString() {
    return new ToStringer(AwsIamRoleResponse.class)
        .add("externalId", externalId)
        .add("roleArn", roleArn)
        .add("unityCatalogIamArn", unityCatalogIamArn)
        .toString();
  }
}
