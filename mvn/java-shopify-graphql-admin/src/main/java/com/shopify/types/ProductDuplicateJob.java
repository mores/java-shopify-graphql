package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents a product duplication job.
 */
public class ProductDuplicateJob {
  /**
   * This indicates if the job is still queued or has been run.
   */
  private boolean done;

  /**
   * A globally-unique ID that's returned when running an asynchronous mutation.
   */
  private String id;

  public ProductDuplicateJob() {
  }

  /**
   * This indicates if the job is still queued or has been run.
   */
  public boolean getDone() {
    return done;
  }

  public void setDone(boolean done) {
    this.done = done;
  }

  /**
   * A globally-unique ID that's returned when running an asynchronous mutation.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "ProductDuplicateJob{done='" + done + "', id='" + id + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductDuplicateJob that = (ProductDuplicateJob) o;
    return done == that.done &&
        Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(done, id);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * This indicates if the job is still queued or has been run.
     */
    private boolean done;

    /**
     * A globally-unique ID that's returned when running an asynchronous mutation.
     */
    private String id;

    public ProductDuplicateJob build() {
      ProductDuplicateJob result = new ProductDuplicateJob();
      result.done = this.done;
      result.id = this.id;
      return result;
    }

    /**
     * This indicates if the job is still queued or has been run.
     */
    public Builder done(boolean done) {
      this.done = done;
      return this;
    }

    /**
     * A globally-unique ID that's returned when running an asynchronous mutation.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }
}
