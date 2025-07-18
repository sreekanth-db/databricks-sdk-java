// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;

/**
 * This is an evolving API that facilitates the addition and removal of visualizations from existing
 * queries in the Databricks Workspace. Data structures can change over time.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface QueryVisualizationsService {
  /** Adds a visualization to a query. */
  Visualization create(CreateVisualizationRequest createVisualizationRequest);

  /** Removes a visualization. */
  void delete(DeleteVisualizationRequest deleteVisualizationRequest);

  /** Updates a visualization. */
  Visualization update(UpdateVisualizationRequest updateVisualizationRequest);
}
