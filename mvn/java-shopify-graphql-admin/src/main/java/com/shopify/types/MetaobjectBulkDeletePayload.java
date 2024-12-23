package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `metaobjectBulkDelete` mutation.
 */
public class MetaobjectBulkDeletePayload {
  /**
   * The asynchronous job that deletes the metaobjects.
   */
  private Job job;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<MetaobjectUserError> userErrors;

  public MetaobjectBulkDeletePayload() {
  }

  /**
   * The asynchronous job that deletes the metaobjects.
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
  public List<MetaobjectUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<MetaobjectUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "MetaobjectBulkDeletePayload{job='" + job + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectBulkDeletePayload that = (MetaobjectBulkDeletePayload) o;
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
     * The asynchronous job that deletes the metaobjects.
     */
    private Job job;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<MetaobjectUserError> userErrors;

    public MetaobjectBulkDeletePayload build() {
      MetaobjectBulkDeletePayload result = new MetaobjectBulkDeletePayload();
      result.job = this.job;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The asynchronous job that deletes the metaobjects.
     */
    public Builder job(Job job) {
      this.job = job;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<MetaobjectUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
