package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class UrlRedirectBulkDeleteBySavedSearchPayload {
  
  private Job job;

  
  private List<UrlRedirectBulkDeleteBySavedSearchUserError> userErrors;

  public UrlRedirectBulkDeleteBySavedSearchPayload() {
  }

  
  public Job getJob() {
    return job;
  }

  public void setJob(Job job) {
    this.job = job;
  }

  
  public List<UrlRedirectBulkDeleteBySavedSearchUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UrlRedirectBulkDeleteBySavedSearchUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "UrlRedirectBulkDeleteBySavedSearchPayload{job='" + job + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UrlRedirectBulkDeleteBySavedSearchPayload that = (UrlRedirectBulkDeleteBySavedSearchPayload) o;
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
    
    private Job job;

    
    private List<UrlRedirectBulkDeleteBySavedSearchUserError> userErrors;

    public UrlRedirectBulkDeleteBySavedSearchPayload build() {
      UrlRedirectBulkDeleteBySavedSearchPayload result = new UrlRedirectBulkDeleteBySavedSearchPayload();
      result.job = this.job;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder job(Job job) {
      this.job = job;
      return this;
    }

    
    public Builder userErrors(List<UrlRedirectBulkDeleteBySavedSearchUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
