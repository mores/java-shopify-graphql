package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CollectionRemoveProductsPayload {
  
  private Job job;

  
  private List<UserError> userErrors;

  public CollectionRemoveProductsPayload() {
  }

  
  public Job getJob() {
    return job;
  }

  public void setJob(Job job) {
    this.job = job;
  }

  
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CollectionRemoveProductsPayload{job='" + job + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionRemoveProductsPayload that = (CollectionRemoveProductsPayload) o;
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

    
    private List<UserError> userErrors;

    public CollectionRemoveProductsPayload build() {
      CollectionRemoveProductsPayload result = new CollectionRemoveProductsPayload();
      result.job = this.job;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder job(Job job) {
      this.job = job;
      return this;
    }

    
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
