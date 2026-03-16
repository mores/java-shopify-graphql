package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents an in-progress collection duplication operation. Collection
 * duplication is a synchronous operation for simple collections, and an
 * asynchronous operation for collections containing too many products to process synchronously.
 */
public class CollectionDuplicateOperation {
  /**
   * Whether the collection is the source that products are being duplicated from,
   * or the target collection that products are being duplicated onto.
   */
  private CollectionDuplicateOperationRole collectionRole;

  /**
   * The background job performing the duplication.
   */
  private Job job;

  public CollectionDuplicateOperation() {
  }

  /**
   * Whether the collection is the source that products are being duplicated from,
   * or the target collection that products are being duplicated onto.
   */
  public CollectionDuplicateOperationRole getCollectionRole() {
    return collectionRole;
  }

  public void setCollectionRole(CollectionDuplicateOperationRole collectionRole) {
    this.collectionRole = collectionRole;
  }

  /**
   * The background job performing the duplication.
   */
  public Job getJob() {
    return job;
  }

  public void setJob(Job job) {
    this.job = job;
  }

  @Override
  public String toString() {
    return "CollectionDuplicateOperation{collectionRole='" + collectionRole + "', job='" + job + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionDuplicateOperation that = (CollectionDuplicateOperation) o;
    return Objects.equals(collectionRole, that.collectionRole) &&
        Objects.equals(job, that.job);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collectionRole, job);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether the collection is the source that products are being duplicated from,
     * or the target collection that products are being duplicated onto.
     */
    private CollectionDuplicateOperationRole collectionRole;

    /**
     * The background job performing the duplication.
     */
    private Job job;

    public CollectionDuplicateOperation build() {
      CollectionDuplicateOperation result = new CollectionDuplicateOperation();
      result.collectionRole = this.collectionRole;
      result.job = this.job;
      return result;
    }

    /**
     * Whether the collection is the source that products are being duplicated from,
     * or the target collection that products are being duplicated onto.
     */
    public Builder collectionRole(CollectionDuplicateOperationRole collectionRole) {
      this.collectionRole = collectionRole;
      return this;
    }

    /**
     * The background job performing the duplication.
     */
    public Builder job(Job job) {
      this.job = job;
      return this;
    }
  }
}
