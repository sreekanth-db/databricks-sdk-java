// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Run was retrieved successfully */
@Generated
public class Run {
  /**
   * The sequence number of this run attempt for a triggered job run. The initial attempt of a run
   * has an attempt_number of 0. If the initial run attempt fails, and the job has a retry policy
   * (`max_retries` > 0), subsequent runs are created with an `original_attempt_run_id` of the
   * original attempt’s ID and an incrementing `attempt_number`. Runs are retried only until they
   * succeed, and the maximum `attempt_number` is the same as the `max_retries` value for the job.
   */
  @JsonProperty("attempt_number")
  private Long attemptNumber;

  /**
   * The time in milliseconds it took to terminate the cluster and clean up any associated
   * artifacts. The duration of a task run is the sum of the `setup_duration`, `execution_duration`,
   * and the `cleanup_duration`. The `cleanup_duration` field is set to 0 for multitask job runs.
   * The total duration of a multitask job run is the value of the `run_duration` field.
   */
  @JsonProperty("cleanup_duration")
  private Long cleanupDuration;

  /**
   * The cluster used for this run. If the run is specified to use a new cluster, this field is set
   * once the Jobs service has requested a cluster for the run.
   */
  @JsonProperty("cluster_instance")
  private ClusterInstance clusterInstance;

  /** A snapshot of the job’s cluster specification when this run was created. */
  @JsonProperty("cluster_spec")
  private ClusterSpec clusterSpec;

  /**
   * The creator user name. This field won’t be included in the response if the user has already
   * been deleted.
   */
  @JsonProperty("creator_user_name")
  private String creatorUserName;

  /** Description of the run */
  @JsonProperty("description")
  private String description;

  /**
   * The actual performance target used by the serverless run during execution. This can differ from
   * the client-set performance target on the request depending on whether the performance mode is
   * supported by the job type.
   *
   * <p>* `STANDARD`: Enables cost-efficient execution of serverless workloads. *
   * `PERFORMANCE_OPTIMIZED`: Prioritizes fast startup and execution times through rapid scaling and
   * optimized cluster performance.
   */
  @JsonProperty("effective_performance_target")
  private PerformanceTarget effectivePerformanceTarget;

  /**
   * The time at which this run ended in epoch milliseconds (milliseconds since 1/1/1970 UTC). This
   * field is set to 0 if the job is still running.
   */
  @JsonProperty("end_time")
  private Long endTime;

  /**
   * The time in milliseconds it took to execute the commands in the JAR or notebook until they
   * completed, failed, timed out, were cancelled, or encountered an unexpected error. The duration
   * of a task run is the sum of the `setup_duration`, `execution_duration`, and the
   * `cleanup_duration`. The `execution_duration` field is set to 0 for multitask job runs. The
   * total duration of a multitask job run is the value of the `run_duration` field.
   */
  @JsonProperty("execution_duration")
  private Long executionDuration;

  /**
   * An optional specification for a remote Git repository containing the source code used by tasks.
   * Version-controlled source code is supported by notebook, dbt, Python script, and SQL File
   * tasks.
   *
   * <p>If `git_source` is set, these tasks retrieve the file from the remote repository by default.
   * However, this behavior can be overridden by setting `source` to `WORKSPACE` on the task.
   *
   * <p>Note: dbt and SQL File tasks support only version-controlled sources. If dbt or SQL File
   * tasks are used, `git_source` must be defined on the job.
   */
  @JsonProperty("git_source")
  private GitSource gitSource;

  /**
   * Indicates if the run has more array properties (`tasks`, `job_clusters`) that are not shown.
   * They can be accessed via :method:jobs/getrun endpoint. It is only relevant for API 2.2
   * :method:jobs/listruns requests with `expand_tasks=true`.
   */
  @JsonProperty("has_more")
  private Boolean hasMore;

  /** Only populated by for-each iterations. The parent for-each task is located in tasks array. */
  @JsonProperty("iterations")
  private Collection<RunTask> iterations;

  /**
   * A list of job cluster specifications that can be shared and reused by tasks of this job.
   * Libraries cannot be declared in a shared job cluster. You must declare dependent libraries in
   * task settings. If more than 100 job clusters are available, you can paginate through them using
   * :method:jobs/getrun.
   */
  @JsonProperty("job_clusters")
  private Collection<JobCluster> jobClusters;

  /** The canonical identifier of the job that contains this run. */
  @JsonProperty("job_id")
  private Long jobId;

  /** Job-level parameters used in the run */
  @JsonProperty("job_parameters")
  private Collection<JobParameter> jobParameters;

  /**
   * ID of the job run that this run belongs to. For legacy and single-task job runs the field is
   * populated with the job run ID. For task runs, the field is populated with the ID of the job run
   * that the task run belongs to.
   */
  @JsonProperty("job_run_id")
  private Long jobRunId;

  /** A token that can be used to list the next page of array properties. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** A unique identifier for this job run. This is set to the same value as `run_id`. */
  @JsonProperty("number_in_job")
  private Long numberInJob;

  /**
   * If this run is a retry of a prior run attempt, this field contains the run_id of the original
   * attempt; otherwise, it is the same as the run_id.
   */
  @JsonProperty("original_attempt_run_id")
  private Long originalAttemptRunId;

  /** The parameters used for this run. */
  @JsonProperty("overriding_parameters")
  private RunParameters overridingParameters;

  /** The time in milliseconds that the run has spent in the queue. */
  @JsonProperty("queue_duration")
  private Long queueDuration;

  /** The repair history of the run. */
  @JsonProperty("repair_history")
  private Collection<RepairHistoryItem> repairHistory;

  /** The time in milliseconds it took the job run and all of its repairs to finish. */
  @JsonProperty("run_duration")
  private Long runDuration;

  /** The canonical identifier of the run. This ID is unique across all runs of all jobs. */
  @JsonProperty("run_id")
  private Long runId;

  /** An optional name for the run. The maximum length is 4096 bytes in UTF-8 encoding. */
  @JsonProperty("run_name")
  private String runName;

  /** The URL to the detail page of the run. */
  @JsonProperty("run_page_url")
  private String runPageUrl;

  /** */
  @JsonProperty("run_type")
  private RunType runType;

  /** The cron schedule that triggered this run if it was triggered by the periodic scheduler. */
  @JsonProperty("schedule")
  private CronSchedule schedule;

  /**
   * The time in milliseconds it took to set up the cluster. For runs that run on new clusters this
   * is the cluster creation time, for runs that run on existing clusters this time should be very
   * short. The duration of a task run is the sum of the `setup_duration`, `execution_duration`, and
   * the `cleanup_duration`. The `setup_duration` field is set to 0 for multitask job runs. The
   * total duration of a multitask job run is the value of the `run_duration` field.
   */
  @JsonProperty("setup_duration")
  private Long setupDuration;

  /**
   * The time at which this run was started in epoch milliseconds (milliseconds since 1/1/1970 UTC).
   * This may not be the time when the job task starts executing, for example, if the job is
   * scheduled to run on a new cluster, this is the time the cluster creation call is issued.
   */
  @JsonProperty("start_time")
  private Long startTime;

  /** Deprecated. Please use the `status` field instead. */
  @JsonProperty("state")
  private RunState state;

  /** */
  @JsonProperty("status")
  private RunStatus status;

  /**
   * The list of tasks performed by the run. Each task has its own `run_id` which you can use to
   * call `JobsGetOutput` to retrieve the run resutls. If more than 100 tasks are available, you can
   * paginate through them using :method:jobs/getrun. Use the `next_page_token` field at the object
   * root to determine if more results are available.
   */
  @JsonProperty("tasks")
  private Collection<RunTask> tasks;

  /** */
  @JsonProperty("trigger")
  private TriggerType trigger;

  /** */
  @JsonProperty("trigger_info")
  private TriggerInfo triggerInfo;

  public Run setAttemptNumber(Long attemptNumber) {
    this.attemptNumber = attemptNumber;
    return this;
  }

  public Long getAttemptNumber() {
    return attemptNumber;
  }

  public Run setCleanupDuration(Long cleanupDuration) {
    this.cleanupDuration = cleanupDuration;
    return this;
  }

  public Long getCleanupDuration() {
    return cleanupDuration;
  }

  public Run setClusterInstance(ClusterInstance clusterInstance) {
    this.clusterInstance = clusterInstance;
    return this;
  }

  public ClusterInstance getClusterInstance() {
    return clusterInstance;
  }

  public Run setClusterSpec(ClusterSpec clusterSpec) {
    this.clusterSpec = clusterSpec;
    return this;
  }

  public ClusterSpec getClusterSpec() {
    return clusterSpec;
  }

  public Run setCreatorUserName(String creatorUserName) {
    this.creatorUserName = creatorUserName;
    return this;
  }

  public String getCreatorUserName() {
    return creatorUserName;
  }

  public Run setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public Run setEffectivePerformanceTarget(PerformanceTarget effectivePerformanceTarget) {
    this.effectivePerformanceTarget = effectivePerformanceTarget;
    return this;
  }

  public PerformanceTarget getEffectivePerformanceTarget() {
    return effectivePerformanceTarget;
  }

  public Run setEndTime(Long endTime) {
    this.endTime = endTime;
    return this;
  }

  public Long getEndTime() {
    return endTime;
  }

  public Run setExecutionDuration(Long executionDuration) {
    this.executionDuration = executionDuration;
    return this;
  }

  public Long getExecutionDuration() {
    return executionDuration;
  }

  public Run setGitSource(GitSource gitSource) {
    this.gitSource = gitSource;
    return this;
  }

  public GitSource getGitSource() {
    return gitSource;
  }

  public Run setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

  public Boolean getHasMore() {
    return hasMore;
  }

  public Run setIterations(Collection<RunTask> iterations) {
    this.iterations = iterations;
    return this;
  }

  public Collection<RunTask> getIterations() {
    return iterations;
  }

  public Run setJobClusters(Collection<JobCluster> jobClusters) {
    this.jobClusters = jobClusters;
    return this;
  }

  public Collection<JobCluster> getJobClusters() {
    return jobClusters;
  }

  public Run setJobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

  public Long getJobId() {
    return jobId;
  }

  public Run setJobParameters(Collection<JobParameter> jobParameters) {
    this.jobParameters = jobParameters;
    return this;
  }

  public Collection<JobParameter> getJobParameters() {
    return jobParameters;
  }

  public Run setJobRunId(Long jobRunId) {
    this.jobRunId = jobRunId;
    return this;
  }

  public Long getJobRunId() {
    return jobRunId;
  }

  public Run setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public Run setNumberInJob(Long numberInJob) {
    this.numberInJob = numberInJob;
    return this;
  }

  public Long getNumberInJob() {
    return numberInJob;
  }

  public Run setOriginalAttemptRunId(Long originalAttemptRunId) {
    this.originalAttemptRunId = originalAttemptRunId;
    return this;
  }

  public Long getOriginalAttemptRunId() {
    return originalAttemptRunId;
  }

  public Run setOverridingParameters(RunParameters overridingParameters) {
    this.overridingParameters = overridingParameters;
    return this;
  }

  public RunParameters getOverridingParameters() {
    return overridingParameters;
  }

  public Run setQueueDuration(Long queueDuration) {
    this.queueDuration = queueDuration;
    return this;
  }

  public Long getQueueDuration() {
    return queueDuration;
  }

  public Run setRepairHistory(Collection<RepairHistoryItem> repairHistory) {
    this.repairHistory = repairHistory;
    return this;
  }

  public Collection<RepairHistoryItem> getRepairHistory() {
    return repairHistory;
  }

  public Run setRunDuration(Long runDuration) {
    this.runDuration = runDuration;
    return this;
  }

  public Long getRunDuration() {
    return runDuration;
  }

  public Run setRunId(Long runId) {
    this.runId = runId;
    return this;
  }

  public Long getRunId() {
    return runId;
  }

  public Run setRunName(String runName) {
    this.runName = runName;
    return this;
  }

  public String getRunName() {
    return runName;
  }

  public Run setRunPageUrl(String runPageUrl) {
    this.runPageUrl = runPageUrl;
    return this;
  }

  public String getRunPageUrl() {
    return runPageUrl;
  }

  public Run setRunType(RunType runType) {
    this.runType = runType;
    return this;
  }

  public RunType getRunType() {
    return runType;
  }

  public Run setSchedule(CronSchedule schedule) {
    this.schedule = schedule;
    return this;
  }

  public CronSchedule getSchedule() {
    return schedule;
  }

  public Run setSetupDuration(Long setupDuration) {
    this.setupDuration = setupDuration;
    return this;
  }

  public Long getSetupDuration() {
    return setupDuration;
  }

  public Run setStartTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

  public Long getStartTime() {
    return startTime;
  }

  public Run setState(RunState state) {
    this.state = state;
    return this;
  }

  public RunState getState() {
    return state;
  }

  public Run setStatus(RunStatus status) {
    this.status = status;
    return this;
  }

  public RunStatus getStatus() {
    return status;
  }

  public Run setTasks(Collection<RunTask> tasks) {
    this.tasks = tasks;
    return this;
  }

  public Collection<RunTask> getTasks() {
    return tasks;
  }

  public Run setTrigger(TriggerType trigger) {
    this.trigger = trigger;
    return this;
  }

  public TriggerType getTrigger() {
    return trigger;
  }

  public Run setTriggerInfo(TriggerInfo triggerInfo) {
    this.triggerInfo = triggerInfo;
    return this;
  }

  public TriggerInfo getTriggerInfo() {
    return triggerInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Run that = (Run) o;
    return Objects.equals(attemptNumber, that.attemptNumber)
        && Objects.equals(cleanupDuration, that.cleanupDuration)
        && Objects.equals(clusterInstance, that.clusterInstance)
        && Objects.equals(clusterSpec, that.clusterSpec)
        && Objects.equals(creatorUserName, that.creatorUserName)
        && Objects.equals(description, that.description)
        && Objects.equals(effectivePerformanceTarget, that.effectivePerformanceTarget)
        && Objects.equals(endTime, that.endTime)
        && Objects.equals(executionDuration, that.executionDuration)
        && Objects.equals(gitSource, that.gitSource)
        && Objects.equals(hasMore, that.hasMore)
        && Objects.equals(iterations, that.iterations)
        && Objects.equals(jobClusters, that.jobClusters)
        && Objects.equals(jobId, that.jobId)
        && Objects.equals(jobParameters, that.jobParameters)
        && Objects.equals(jobRunId, that.jobRunId)
        && Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(numberInJob, that.numberInJob)
        && Objects.equals(originalAttemptRunId, that.originalAttemptRunId)
        && Objects.equals(overridingParameters, that.overridingParameters)
        && Objects.equals(queueDuration, that.queueDuration)
        && Objects.equals(repairHistory, that.repairHistory)
        && Objects.equals(runDuration, that.runDuration)
        && Objects.equals(runId, that.runId)
        && Objects.equals(runName, that.runName)
        && Objects.equals(runPageUrl, that.runPageUrl)
        && Objects.equals(runType, that.runType)
        && Objects.equals(schedule, that.schedule)
        && Objects.equals(setupDuration, that.setupDuration)
        && Objects.equals(startTime, that.startTime)
        && Objects.equals(state, that.state)
        && Objects.equals(status, that.status)
        && Objects.equals(tasks, that.tasks)
        && Objects.equals(trigger, that.trigger)
        && Objects.equals(triggerInfo, that.triggerInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        attemptNumber,
        cleanupDuration,
        clusterInstance,
        clusterSpec,
        creatorUserName,
        description,
        effectivePerformanceTarget,
        endTime,
        executionDuration,
        gitSource,
        hasMore,
        iterations,
        jobClusters,
        jobId,
        jobParameters,
        jobRunId,
        nextPageToken,
        numberInJob,
        originalAttemptRunId,
        overridingParameters,
        queueDuration,
        repairHistory,
        runDuration,
        runId,
        runName,
        runPageUrl,
        runType,
        schedule,
        setupDuration,
        startTime,
        state,
        status,
        tasks,
        trigger,
        triggerInfo);
  }

  @Override
  public String toString() {
    return new ToStringer(Run.class)
        .add("attemptNumber", attemptNumber)
        .add("cleanupDuration", cleanupDuration)
        .add("clusterInstance", clusterInstance)
        .add("clusterSpec", clusterSpec)
        .add("creatorUserName", creatorUserName)
        .add("description", description)
        .add("effectivePerformanceTarget", effectivePerformanceTarget)
        .add("endTime", endTime)
        .add("executionDuration", executionDuration)
        .add("gitSource", gitSource)
        .add("hasMore", hasMore)
        .add("iterations", iterations)
        .add("jobClusters", jobClusters)
        .add("jobId", jobId)
        .add("jobParameters", jobParameters)
        .add("jobRunId", jobRunId)
        .add("nextPageToken", nextPageToken)
        .add("numberInJob", numberInJob)
        .add("originalAttemptRunId", originalAttemptRunId)
        .add("overridingParameters", overridingParameters)
        .add("queueDuration", queueDuration)
        .add("repairHistory", repairHistory)
        .add("runDuration", runDuration)
        .add("runId", runId)
        .add("runName", runName)
        .add("runPageUrl", runPageUrl)
        .add("runType", runType)
        .add("schedule", schedule)
        .add("setupDuration", setupDuration)
        .add("startTime", startTime)
        .add("state", state)
        .add("status", status)
        .add("tasks", tasks)
        .add("trigger", trigger)
        .add("triggerInfo", triggerInfo)
        .toString();
  }
}
