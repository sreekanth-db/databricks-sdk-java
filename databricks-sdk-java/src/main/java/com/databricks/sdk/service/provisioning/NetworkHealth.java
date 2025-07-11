// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class NetworkHealth {
  /** Details of the error. */
  @JsonProperty("error_message")
  private String errorMessage;

  /** */
  @JsonProperty("error_type")
  private ErrorType errorType;

  public NetworkHealth setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public NetworkHealth setErrorType(ErrorType errorType) {
    this.errorType = errorType;
    return this;
  }

  public ErrorType getErrorType() {
    return errorType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NetworkHealth that = (NetworkHealth) o;
    return Objects.equals(errorMessage, that.errorMessage)
        && Objects.equals(errorType, that.errorType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorMessage, errorType);
  }

  @Override
  public String toString() {
    return new ToStringer(NetworkHealth.class)
        .add("errorMessage", errorMessage)
        .add("errorType", errorType)
        .toString();
  }
}
