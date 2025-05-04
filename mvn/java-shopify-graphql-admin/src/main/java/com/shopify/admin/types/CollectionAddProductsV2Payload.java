package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `collectionAddProductsV2` mutation.
 */
public class CollectionAddProductsV2Payload {
  /**
   * The asynchronous job adding the products.
   */
  private Job job;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<CollectionAddProductsV2UserError> userErrors;

  public CollectionAddProductsV2Payload() {
  }

  /**
   * The asynchronous job adding the products.
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
    /**
     * The asynchronous job adding the products.
     */
    private Job job;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<CollectionAddProductsV2UserError> userErrors;

    public CollectionAddProductsV2Payload build() {
      CollectionAddProductsV2Payload result = new CollectionAddProductsV2Payload();
      result.job = this.job;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The asynchronous job adding the products.
     */
    public Builder job(Job job) {
      this.job = job;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<CollectionAddProductsV2UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
