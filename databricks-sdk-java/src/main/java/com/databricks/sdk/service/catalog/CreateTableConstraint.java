// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateTableConstraint {
  /** */
  @JsonProperty("constraint")
  private TableConstraint constraint;

  /** The full name of the table referenced by the constraint. */
  @JsonProperty("full_name_arg")
  private String fullNameArg;

  public CreateTableConstraint setConstraint(TableConstraint constraint) {
    this.constraint = constraint;
    return this;
  }

  public TableConstraint getConstraint() {
    return constraint;
  }

  public CreateTableConstraint setFullNameArg(String fullNameArg) {
    this.fullNameArg = fullNameArg;
    return this;
  }

  public String getFullNameArg() {
    return fullNameArg;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateTableConstraint that = (CreateTableConstraint) o;
    return Objects.equals(constraint, that.constraint)
        && Objects.equals(fullNameArg, that.fullNameArg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(constraint, fullNameArg);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateTableConstraint.class)
        .add("constraint", constraint)
        .add("fullNameArg", fullNameArg)
        .toString();
  }
}
