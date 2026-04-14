package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `collectionDuplicate` mutation.
 */
public class CollectionDuplicatePayload {
  /**
   * The newly created duplicate collection. Will contain all data if duplication completed synchronously.
   * If async processing is required, the collection will be created but products will be added in the background
   * and can be tracked via the job field or the collection's active_operations field.
   */
  private Collection collection;

  /**
   * The background job copying manually included products onto the target
   * collection. Only returned if async processing is required, otherwise products
   * will be copied synchronously when the collection is created.
   */
  private Job job;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<CollectionDuplicateUserError> userErrors;

  public CollectionDuplicatePayload() {
  }

  /**
   * The newly created duplicate collection. Will contain all data if duplication completed synchronously.
   * If async processing is required, the collection will be created but products will be added in the background
   * and can be tracked via the job field or the collection's active_operations field.
   */
  public Collection getCollection() {
    return collection;
  }

  public void setCollection(Collection collection) {
    this.collection = collection;
  }

  /**
   * The background job copying manually included products onto the target
   * collection. Only returned if async processing is required, otherwise products
   * will be copied synchronously when the collection is created.
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
  public List<CollectionDuplicateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<CollectionDuplicateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CollectionDuplicatePayload{collection='" + collection + "', job='" + job + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionDuplicatePayload that = (CollectionDuplicatePayload) o;
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
     * The newly created duplicate collection. Will contain all data if duplication completed synchronously.
     * If async processing is required, the collection will be created but products will be added in the background
     * and can be tracked via the job field or the collection's active_operations field.
     */
    private Collection collection;

    /**
     * The background job copying manually included products onto the target
     * collection. Only returned if async processing is required, otherwise products
     * will be copied synchronously when the collection is created.
     */
    private Job job;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<CollectionDuplicateUserError> userErrors;

    public CollectionDuplicatePayload build() {
      CollectionDuplicatePayload result = new CollectionDuplicatePayload();
      result.collection = this.collection;
      result.job = this.job;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The newly created duplicate collection. Will contain all data if duplication completed synchronously.
     * If async processing is required, the collection will be created but products will be added in the background
     * and can be tracked via the job field or the collection's active_operations field.
     */
    public Builder collection(Collection collection) {
      this.collection = collection;
      return this;
    }

    /**
     * The background job copying manually included products onto the target
     * collection. Only returned if async processing is required, otherwise products
     * will be copied synchronously when the collection is created.
     */
    public Builder job(Job job) {
      this.job = job;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<CollectionDuplicateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
