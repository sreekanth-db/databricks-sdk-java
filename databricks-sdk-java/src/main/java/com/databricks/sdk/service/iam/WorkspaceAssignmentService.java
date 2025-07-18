// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;

/**
 * The Workspace Permission Assignment API allows you to manage workspace permissions for principals
 * in your account.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface WorkspaceAssignmentService {
  /**
   * Deletes the workspace permissions assignment in a given account and workspace for the specified
   * principal.
   */
  void delete(DeleteWorkspaceAssignmentRequest deleteWorkspaceAssignmentRequest);

  /** Get an array of workspace permissions for the specified account and workspace. */
  WorkspacePermissions get(GetWorkspaceAssignmentRequest getWorkspaceAssignmentRequest);

  /**
   * Get the permission assignments for the specified Databricks account and Databricks workspace.
   */
  PermissionAssignments list(ListWorkspaceAssignmentRequest listWorkspaceAssignmentRequest);

  /**
   * Creates or updates the workspace permissions assignment in a given account and workspace for
   * the specified principal.
   */
  PermissionAssignment update(UpdateWorkspaceAssignments updateWorkspaceAssignments);
}
