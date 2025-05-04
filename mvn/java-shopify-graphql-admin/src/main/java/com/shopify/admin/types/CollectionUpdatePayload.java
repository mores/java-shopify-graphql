package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `collectionUpdate` mutation.
 */
public class CollectionUpdatePayload {
  /**
   * The updated collection.
   */
  private Collection collection;

  /**
   * The asynchronous job updating the products based on the new rule set.
   */
  private Job job;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public CollectionUpdatePayload() {
  }

  /**
   * The updated collection.
   */
  public Collection getCollection() {
    return collection;
  }

  public void setCollection(Collection collection) {
    this.collection = collection;
  }

  /**
   * The asynchronous job updating the products based on the new rule set.
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
    /**
     * The updated collection.
     */
    private Collection collection;

    /**
     * The asynchronous job updating the products based on the new rule set.
     */
    private Job job;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public CollectionUpdatePayload build() {
      CollectionUpdatePayload result = new CollectionUpdatePayload();
      result.collection = this.collection;
      result.job = this.job;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The updated collection.
     */
    public Builder collection(Collection collection) {
      this.collection = collection;
      return this;
    }

    /**
     * The asynchronous job updating the products based on the new rule set.
     */
    public Builder job(Job job) {
      this.job = job;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
