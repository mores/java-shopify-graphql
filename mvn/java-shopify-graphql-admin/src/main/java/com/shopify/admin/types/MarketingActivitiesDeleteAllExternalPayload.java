package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `marketingActivitiesDeleteAllExternal` mutation.
 */
public class MarketingActivitiesDeleteAllExternalPayload {
  /**
   * The asynchronous job that performs the deletion. The status of the job may be
   * used to determine when it's safe again to create new activities.
   */
  private Job job;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<MarketingActivityUserError> userErrors;

  public MarketingActivitiesDeleteAllExternalPayload() {
  }

  /**
   * The asynchronous job that performs the deletion. The status of the job may be
   * used to determine when it's safe again to create new activities.
   */
  public Job getJob() {
    return job;
  }

  public void setJob(Job job) {
    this.job = job;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<MarketingActivityUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<MarketingActivityUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "MarketingActivitiesDeleteAllExternalPayload{job='" + job + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketingActivitiesDeleteAllExternalPayload that = (MarketingActivitiesDeleteAllExternalPayload) o;
    return Objects.equals(job, that.job) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(job, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The asynchronous job that performs the deletion. The status of the job may be
     * used to determine when it's safe again to create new activities.
     */
    private Job job;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<MarketingActivityUserError> userErrors;

    public MarketingActivitiesDeleteAllExternalPayload build() {
      MarketingActivitiesDeleteAllExternalPayload result = new MarketingActivitiesDeleteAllExternalPayload();
      result.job = this.job;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The asynchronous job that performs the deletion. The status of the job may be
     * used to determine when it's safe again to create new activities.
     */
    public Builder job(Job job) {
      this.job = job;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<MarketingActivityUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
