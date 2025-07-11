// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;

/**
 * Instance Pools API are used to create, edit, delete and list instance pools by using ready-to-use
 * cloud instances which reduces a cluster start and auto-scaling times.
 *
 * <p>Databricks pools reduce cluster start and auto-scaling times by maintaining a set of idle,
 * ready-to-use instances. When a cluster is attached to a pool, cluster nodes are created using the
 * pool’s idle instances. If the pool has no idle instances, the pool expands by allocating a new
 * instance from the instance provider in order to accommodate the cluster’s request. When a cluster
 * releases an instance, it returns to the pool and is free for another cluster to use. Only
 * clusters attached to a pool can use that pool’s idle instances.
 *
 * <p>You can specify a different pool for the driver node and worker nodes, or use the same pool
 * for both.
 *
 * <p>Databricks does not charge DBUs while instances are idle in the pool. Instance provider
 * billing does apply. See pricing.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface InstancePoolsService {
  /** Creates a new instance pool using idle and ready-to-use cloud instances. */
  CreateInstancePoolResponse create(CreateInstancePool createInstancePool);

  /**
   * Deletes the instance pool permanently. The idle instances in the pool are terminated
   * asynchronously.
   */
  void delete(DeleteInstancePool deleteInstancePool);

  /** Modifies the configuration of an existing instance pool. */
  void edit(EditInstancePool editInstancePool);

  /** Retrieve the information for an instance pool based on its identifier. */
  GetInstancePool get(GetInstancePoolRequest getInstancePoolRequest);

  /** Gets the permission levels that a user can have on an object. */
  GetInstancePoolPermissionLevelsResponse getPermissionLevels(
      GetInstancePoolPermissionLevelsRequest getInstancePoolPermissionLevelsRequest);

  /**
   * Gets the permissions of an instance pool. Instance pools can inherit permissions from their
   * root object.
   */
  InstancePoolPermissions getPermissions(
      GetInstancePoolPermissionsRequest getInstancePoolPermissionsRequest);

  /** Gets a list of instance pools with their statistics. */
  ListInstancePools list();

  /**
   * Sets permissions on an object, replacing existing permissions if they exist. Deletes all direct
   * permissions if none are specified. Objects can inherit permissions from their root object.
   */
  InstancePoolPermissions setPermissions(
      InstancePoolPermissionsRequest instancePoolPermissionsRequest);

  /**
   * Updates the permissions on an instance pool. Instance pools can inherit permissions from their
   * root object.
   */
  InstancePoolPermissions updatePermissions(
      InstancePoolPermissionsRequest instancePoolPermissionsRequest);
}
