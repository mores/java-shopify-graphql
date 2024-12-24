package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CollectionAddProductsV2Payload {
  
  private Job job;

  
  private List<CollectionAddProductsV2UserError> userErrors;

  public CollectionAddProductsV2Payload() {
  }

  
  public Job getJob() {
    return job;
  }

  public void setJob(Job job) {
    this.job = job;
  }

  
  public List<CollectionAddProductsV2UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<CollectionAddProductsV2UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CollectionAddProductsV2Payload{job='" + job + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionAddProductsV2Payload that = (CollectionAddProductsV2Payload) o;
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

    
    private List<CollectionAddProductsV2UserError> userErrors;

    public CollectionAddProductsV2Payload build() {
      CollectionAddProductsV2Payload result = new CollectionAddProductsV2Payload();
      result.job = this.job;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder job(Job job) {
      this.job = job;
      return this;
    }

    
    public Builder userErrors(List<CollectionAddProductsV2UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
