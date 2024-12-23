package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A job corresponds to some long running task that the client should poll for status.
 */
public class Job {
  /**
   * This indicates if the job is still queued or has been run.
   */
  private boolean done;

  /**
   * A globally-unique ID that's returned when running an asynchronous mutation.
   */
  private String id;

  /**
   * This field will only resolve once the job is done. Can be used to ask for object(s) that have been changed by the job.
   */
  private String query;

  public Job() {
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

  /**
   * This field will only resolve once the job is done. Can be used to ask for object(s) that have been changed by the job.
   */
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  @Override
  public String toString() {
    return "Job{done='" + done + "', id='" + id + "', query='" + query + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Job that = (Job) o;
    return done == that.done &&
        Objects.equals(id, that.id) &&
        Objects.equals(query, that.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(done, id, query);
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

    /**
     * This field will only resolve once the job is done. Can be used to ask for object(s) that have been changed by the job.
     */
    private String query;

    public Job build() {
      Job result = new Job();
      result.done = this.done;
      result.id = this.id;
      result.query = this.query;
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

    /**
     * This field will only resolve once the job is done. Can be used to ask for object(s) that have been changed by the job.
     */
    public Builder query(String query) {
      this.query = query;
      return this;
    }
  }
}
