package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `urlRedirectImportSubmit` mutation.
 */
public class UrlRedirectImportSubmitPayload {
  /**
   * The asynchronous job importing the redirects.
   */
  private Job job;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UrlRedirectImportUserError> userErrors;

  public UrlRedirectImportSubmitPayload() {
  }

  /**
   * The asynchronous job importing the redirects.
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
  public List<UrlRedirectImportUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UrlRedirectImportUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "UrlRedirectImportSubmitPayload{job='" + job + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UrlRedirectImportSubmitPayload that = (UrlRedirectImportSubmitPayload) o;
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
     * The asynchronous job importing the redirects.
     */
    private Job job;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UrlRedirectImportUserError> userErrors;

    public UrlRedirectImportSubmitPayload build() {
      UrlRedirectImportSubmitPayload result = new UrlRedirectImportSubmitPayload();
      result.job = this.job;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The asynchronous job importing the redirects.
     */
    public Builder job(Job job) {
      this.job = job;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<UrlRedirectImportUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
