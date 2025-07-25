// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;

/**
 * The Clusters API allows you to create, start, edit, list, terminate, and delete clusters.
 *
 * <p>Databricks maps cluster node instance types to compute units known as DBUs. See the instance
 * type pricing page for a list of the supported instance types and their corresponding DBUs.
 *
 * <p>A Databricks cluster is a set of computation resources and configurations on which you run
 * data engineering, data science, and data analytics workloads, such as production ETL pipelines,
 * streaming analytics, ad-hoc analytics, and machine learning.
 *
 * <p>You run these workloads as a set of commands in a notebook or as an automated job. Databricks
 * makes a distinction between all-purpose clusters and job clusters. You use all-purpose clusters
 * to analyze data collaboratively using interactive notebooks. You use job clusters to run fast and
 * robust automated jobs.
 *
 * <p>You can create an all-purpose cluster using the UI, CLI, or REST API. You can manually
 * terminate and restart an all-purpose cluster. Multiple users can share such clusters to do
 * collaborative interactive analysis.
 *
 * <p>IMPORTANT: Databricks retains cluster configuration information for terminated clusters for 30
 * days. To keep an all-purpose cluster configuration even after it has been terminated for more
 * than 30 days, an administrator can pin a cluster to the cluster list.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface ClustersService {
  /**
   * Change the owner of the cluster. You must be an admin and the cluster must be terminated to
   * perform this operation. The service principal application ID can be supplied as an argument to
   * `owner_username`.
   */
  void changeOwner(ChangeClusterOwner changeClusterOwner);

  /**
   * Creates a new Spark cluster. This method will acquire new instances from the cloud provider if
   * necessary. This method is asynchronous; the returned ``cluster_id`` can be used to poll the
   * cluster status. When this method returns, the cluster will be in a ``PENDING`` state. The
   * cluster will be usable once it enters a ``RUNNING`` state. Note: Databricks may not be able to
   * acquire some of the requested nodes, due to cloud provider limitations (account limits, spot
   * price, etc.) or transient network issues.
   *
   * <p>If Databricks acquires at least 85% of the requested on-demand nodes, cluster creation will
   * succeed. Otherwise the cluster will terminate with an informative error message.
   *
   * <p>Rather than authoring the cluster's JSON definition from scratch, Databricks recommends
   * filling out the [create compute UI] and then copying the generated JSON definition from the UI.
   *
   * <p>[create compute UI]: https://docs.databricks.com/compute/configure.html
   */
  CreateClusterResponse create(CreateCluster createCluster);

  /**
   * Terminates the Spark cluster with the specified ID. The cluster is removed asynchronously. Once
   * the termination has completed, the cluster will be in a `TERMINATED` state. If the cluster is
   * already in a `TERMINATING` or `TERMINATED` state, nothing will happen.
   */
  void delete(DeleteCluster deleteCluster);

  /**
   * Updates the configuration of a cluster to match the provided attributes and size. A cluster can
   * be updated if it is in a `RUNNING` or `TERMINATED` state.
   *
   * <p>If a cluster is updated while in a `RUNNING` state, it will be restarted so that the new
   * attributes can take effect.
   *
   * <p>If a cluster is updated while in a `TERMINATED` state, it will remain `TERMINATED`. The next
   * time it is started using the `clusters/start` API, the new attributes will take effect. Any
   * attempt to update a cluster in any other state will be rejected with an `INVALID_STATE` error
   * code.
   *
   * <p>Clusters created by the Databricks Jobs service cannot be edited.
   */
  void edit(EditCluster editCluster);

  /**
   * Retrieves a list of events about the activity of a cluster. This API is paginated. If there are
   * more events to read, the response includes all the parameters necessary to request the next
   * page of events.
   */
  GetEventsResponse events(GetEvents getEvents);

  /**
   * Retrieves the information for a cluster given its identifier. Clusters can be described while
   * they are running, or up to 60 days after they are terminated.
   */
  ClusterDetails get(GetClusterRequest getClusterRequest);

  /** Gets the permission levels that a user can have on an object. */
  GetClusterPermissionLevelsResponse getPermissionLevels(
      GetClusterPermissionLevelsRequest getClusterPermissionLevelsRequest);

  /** Gets the permissions of a cluster. Clusters can inherit permissions from their root object. */
  ClusterPermissions getPermissions(GetClusterPermissionsRequest getClusterPermissionsRequest);

  /**
   * Return information about all pinned and active clusters, and all clusters terminated within the
   * last 30 days. Clusters terminated prior to this period are not included.
   */
  ListClustersResponse list(ListClustersRequest listClustersRequest);

  /**
   * Returns a list of supported Spark node types. These node types can be used to launch a cluster.
   */
  ListNodeTypesResponse listNodeTypes();

  /**
   * Returns a list of availability zones where clusters can be created in (For example,
   * us-west-2a). These zones can be used to launch a cluster.
   */
  ListAvailableZonesResponse listZones();

  /**
   * Permanently deletes a Spark cluster. This cluster is terminated and resources are
   * asynchronously removed.
   *
   * <p>In addition, users will no longer see permanently deleted clusters in the cluster list, and
   * API users can no longer perform any action on permanently deleted clusters.
   */
  void permanentDelete(PermanentDeleteCluster permanentDeleteCluster);

  /**
   * Pinning a cluster ensures that the cluster will always be returned by the ListClusters API.
   * Pinning a cluster that is already pinned will have no effect. This API can only be called by
   * workspace admins.
   */
  void pin(PinCluster pinCluster);

  /**
   * Resizes a cluster to have a desired number of workers. This will fail unless the cluster is in
   * a `RUNNING` state.
   */
  void resize(ResizeCluster resizeCluster);

  /**
   * Restarts a Spark cluster with the supplied ID. If the cluster is not currently in a `RUNNING`
   * state, nothing will happen.
   */
  void restart(RestartCluster restartCluster);

  /**
   * Sets permissions on an object, replacing existing permissions if they exist. Deletes all direct
   * permissions if none are specified. Objects can inherit permissions from their root object.
   */
  ClusterPermissions setPermissions(ClusterPermissionsRequest clusterPermissionsRequest);

  /**
   * Returns the list of available Spark versions. These versions can be used to launch a cluster.
   */
  GetSparkVersionsResponse sparkVersions();

  /**
   * Starts a terminated Spark cluster with the supplied ID. This works similar to `createCluster`
   * except: - The previous cluster id and attributes are preserved. - The cluster starts with the
   * last specified cluster size. - If the previous cluster was an autoscaling cluster, the current
   * cluster starts with the minimum number of nodes. - If the cluster is not currently in a
   * ``TERMINATED`` state, nothing will happen. - Clusters launched to run a job cannot be started.
   */
  void start(StartCluster startCluster);

  /**
   * Unpinning a cluster will allow the cluster to eventually be removed from the ListClusters API.
   * Unpinning a cluster that is not pinned will have no effect. This API can only be called by
   * workspace admins.
   */
  void unpin(UnpinCluster unpinCluster);

  /**
   * Updates the configuration of a cluster to match the partial set of attributes and size. Denote
   * which fields to update using the `update_mask` field in the request body. A cluster can be
   * updated if it is in a `RUNNING` or `TERMINATED` state. If a cluster is updated while in a
   * `RUNNING` state, it will be restarted so that the new attributes can take effect. If a cluster
   * is updated while in a `TERMINATED` state, it will remain `TERMINATED`. The updated attributes
   * will take effect the next time the cluster is started using the `clusters/start` API. Attempts
   * to update a cluster in any other state will be rejected with an `INVALID_STATE` error code.
   * Clusters created by the Databricks Jobs service cannot be updated.
   */
  void update(UpdateCluster updateCluster);

  /**
   * Updates the permissions on a cluster. Clusters can inherit permissions from their root object.
   */
  ClusterPermissions updatePermissions(ClusterPermissionsRequest clusterPermissionsRequest);
}
