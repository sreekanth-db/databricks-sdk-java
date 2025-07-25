// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CspEnablementAccountSetting {
  /** */
  @JsonProperty("csp_enablement_account")
  private CspEnablementAccount cspEnablementAccount;

  /**
   * etag used for versioning. The response is at least as fresh as the eTag provided. This is used
   * for optimistic concurrency control as a way to help prevent simultaneous writes of a setting
   * overwriting each other. It is strongly suggested that systems make use of the etag in the read
   * -> update pattern to perform setting updates in order to avoid race conditions. That is, get an
   * etag from a GET request, and pass it with the PATCH request to identify the setting version you
   * are updating.
   */
  @JsonProperty("etag")
  private String etag;

  /**
   * Name of the corresponding setting. This field is populated in the response, but it will not be
   * respected even if it's set in the request body. The setting name in the path parameter will be
   * respected instead. Setting name is required to be 'default' if the setting only has one
   * instance per workspace.
   */
  @JsonProperty("setting_name")
  private String settingName;

  public CspEnablementAccountSetting setCspEnablementAccount(
      CspEnablementAccount cspEnablementAccount) {
    this.cspEnablementAccount = cspEnablementAccount;
    return this;
  }

  public CspEnablementAccount getCspEnablementAccount() {
    return cspEnablementAccount;
  }

  public CspEnablementAccountSetting setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public CspEnablementAccountSetting setSettingName(String settingName) {
    this.settingName = settingName;
    return this;
  }

  public String getSettingName() {
    return settingName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CspEnablementAccountSetting that = (CspEnablementAccountSetting) o;
    return Objects.equals(cspEnablementAccount, that.cspEnablementAccount)
        && Objects.equals(etag, that.etag)
        && Objects.equals(settingName, that.settingName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cspEnablementAccount, etag, settingName);
  }

  @Override
  public String toString() {
    return new ToStringer(CspEnablementAccountSetting.class)
        .add("cspEnablementAccount", cspEnablementAccount)
        .add("etag", etag)
        .add("settingName", settingName)
        .toString();
  }
}
