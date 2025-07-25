// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.billing;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * These APIs manage log delivery configurations for this account. The two supported log types for
 * this API are _billable usage logs_ and _audit logs_. This feature is in Public Preview. This
 * feature works with all account ID types.
 *
 * <p>Log delivery works with all account types. However, if your account is on the E2 version of
 * the platform or on a select custom plan that allows multiple workspaces per account, you can
 * optionally configure different storage destinations for each workspace. Log delivery status is
 * also provided to know the latest status of log delivery attempts.
 *
 * <p>The high-level flow of billable usage delivery:
 *
 * <p>1. **Create storage**: In AWS, [create a new AWS S3 bucket] with a specific bucket policy.
 * Using Databricks APIs, call the Account API to create a [storage configuration
 * object](:method:Storage/Create) that uses the bucket name.
 *
 * <p>2. **Create credentials**: In AWS, create the appropriate AWS IAM role. For full details,
 * including the required IAM role policies and trust relationship, see [Billable usage log
 * delivery]. Using Databricks APIs, call the Account API to create a [credential configuration
 * object](:method:Credentials/Create) that uses the IAM role's ARN.
 *
 * <p>3. **Create log delivery configuration**: Using Databricks APIs, call the Account API to
 * [create a log delivery configuration](:method:LogDelivery/Create) that uses the credential and
 * storage configuration objects from previous steps. You can specify if the logs should include all
 * events of that log type in your account (_Account level_ delivery) or only events for a specific
 * set of workspaces (_workspace level_ delivery). Account level log delivery applies to all current
 * and future workspaces plus account level logs, while workspace level log delivery solely delivers
 * logs related to the specified workspaces. You can create multiple types of delivery
 * configurations per account.
 *
 * <p>For billable usage delivery: * For more information about billable usage logs, see [Billable
 * usage log delivery]. For the CSV schema, see the [Usage page]. * The delivery location is
 * `<bucket-name>/<prefix>/billable-usage/csv/`, where `<prefix>` is the name of the optional
 * delivery path prefix you set up during log delivery configuration. Files are named
 * `workspaceId=<workspace-id>-usageMonth=<month>.csv`. * All billable usage logs apply to specific
 * workspaces (_workspace level_ logs). You can aggregate usage for your entire account by creating
 * an _account level_ delivery configuration that delivers logs for all current and future
 * workspaces in your account. * The files are delivered daily by overwriting the month's CSV file
 * for each workspace.
 *
 * <p>For audit log delivery: * For more information about about audit log delivery, see [Audit log
 * delivery], which includes information about the used JSON schema. * The delivery location is
 * `<bucket-name>/<delivery-path-prefix>/workspaceId=<workspaceId>/date=<yyyy-mm-dd>/auditlogs_<internal-id>.json`.
 * Files may get overwritten with the same content multiple times to achieve exactly-once delivery.
 * * If the audit log delivery configuration included specific workspace IDs, only _workspace-level_
 * audit logs for those workspaces are delivered. If the log delivery configuration applies to the
 * entire account (_account level_ delivery configuration), the audit log delivery includes
 * workspace-level audit logs for all workspaces in the account as well as account-level audit logs.
 * See [Audit log delivery] for details. * Auditable events are typically available in logs within
 * 15 minutes.
 *
 * <p>[Audit log delivery]:
 * https://docs.databricks.com/administration-guide/account-settings/audit-logs.html [Billable usage
 * log delivery]:
 * https://docs.databricks.com/administration-guide/account-settings/billable-usage-delivery.html
 * [Usage page]: https://docs.databricks.com/administration-guide/account-settings/usage.html
 * [create a new AWS S3 bucket]:
 * https://docs.databricks.com/administration-guide/account-api/aws-storage.html
 */
@Generated
public class LogDeliveryAPI {
  private static final Logger LOG = LoggerFactory.getLogger(LogDeliveryAPI.class);

  private final LogDeliveryService impl;

  /** Regular-use constructor */
  public LogDeliveryAPI(ApiClient apiClient) {
    impl = new LogDeliveryImpl(apiClient);
  }

  /** Constructor for mocks */
  public LogDeliveryAPI(LogDeliveryService mock) {
    impl = mock;
  }

  public WrappedLogDeliveryConfiguration create(
      CreateLogDeliveryConfigurationParams logDeliveryConfiguration) {
    return create(
        new WrappedCreateLogDeliveryConfiguration()
            .setLogDeliveryConfiguration(logDeliveryConfiguration));
  }

  /**
   * Creates a new Databricks log delivery configuration to enable delivery of the specified type of
   * logs to your storage location. This requires that you already created a [credential
   * object](:method:Credentials/Create) (which encapsulates a cross-account service IAM role) and a
   * [storage configuration object](:method:Storage/Create) (which encapsulates an S3 bucket).
   *
   * <p>For full details, including the required IAM role policies and bucket policies, see [Deliver
   * and access billable usage logs] or [Configure audit logging].
   *
   * <p>**Note**: There is a limit on the number of log delivery configurations available per
   * account (each limit applies separately to each log type including billable usage and audit
   * logs). You can create a maximum of two enabled account-level delivery configurations
   * (configurations without a workspace filter) per type. Additionally, you can create two enabled
   * workspace-level delivery configurations per workspace for each log type, which means that the
   * same workspace ID can occur in the workspace filter for no more than two delivery
   * configurations per log type.
   *
   * <p>You cannot delete a log delivery configuration, but you can disable it (see [Enable or
   * disable log delivery configuration](:method:LogDelivery/PatchStatus)).
   *
   * <p>[Configure audit logging]:
   * https://docs.databricks.com/administration-guide/account-settings/audit-logs.html [Deliver and
   * access billable usage logs]:
   * https://docs.databricks.com/administration-guide/account-settings/billable-usage-delivery.html
   */
  public WrappedLogDeliveryConfiguration create(WrappedCreateLogDeliveryConfiguration request) {
    return impl.create(request);
  }

  public GetLogDeliveryConfigurationResponse get(String logDeliveryConfigurationId) {
    return get(
        new GetLogDeliveryRequest().setLogDeliveryConfigurationId(logDeliveryConfigurationId));
  }

  /** Gets a Databricks log delivery configuration object for an account, both specified by ID. */
  public GetLogDeliveryConfigurationResponse get(GetLogDeliveryRequest request) {
    return impl.get(request);
  }

  /** Gets all Databricks log delivery configurations associated with an account specified by ID. */
  public Iterable<LogDeliveryConfiguration> list(ListLogDeliveryRequest request) {
    return new Paginator<>(
        request,
        impl::list,
        WrappedLogDeliveryConfigurations::getLogDeliveryConfigurations,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public void patchStatus(String logDeliveryConfigurationId, LogDeliveryConfigStatus status) {
    patchStatus(
        new UpdateLogDeliveryConfigurationStatusRequest()
            .setLogDeliveryConfigurationId(logDeliveryConfigurationId)
            .setStatus(status));
  }

  /**
   * Enables or disables a log delivery configuration. Deletion of delivery configurations is not
   * supported, so disable log delivery configurations that are no longer needed. Note that you
   * can't re-enable a delivery configuration if this would violate the delivery configuration
   * limits described under [Create log delivery](:method:LogDelivery/Create).
   */
  public void patchStatus(UpdateLogDeliveryConfigurationStatusRequest request) {
    impl.patchStatus(request);
  }

  public LogDeliveryService impl() {
    return impl;
  }
}
