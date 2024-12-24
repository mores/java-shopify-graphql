package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CollectionUpdatePayload {
  
  private Collection collection;

  
  private Job job;

  
  private List<UserError> userErrors;

  public CollectionUpdatePayload() {
  }

  
  public Collection getCollection() {
    return collection;
  }

  public void setCollection(Collection collection) {
    this.collection = collection;
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
    return "CollectionUpdatePayload{collection='" + collection + "', job='" + job + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionUpdatePayload that = (CollectionUpdatePayload) o;
    return Objects.equals(collection, that.collection) &&
        Objects.equals(job, that.job) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collection, job, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Collection collection;

    
    private Job job;

    
    private List<UserError> userErrors;

    public CollectionUpdatePayload build() {
      CollectionUpdatePayload result = new CollectionUpdatePayload();
      result.collection = this.collection;
      result.job = this.job;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder collection(Collection collection) {
      this.collection = collection;
      return this;
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
