package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A job to determine a list of members, such as customers, that are associated with an individual segment.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CustomerSegmentMembersQuery implements com.shopify.types.JobResult, com.shopify.types.Node {
  /**
   * The current total number of members in a given segment.
   */
  private int currentCount;

  /**
   * This indicates if the job is still queued or has been run.
   */
  private boolean done;

  /**
   * A globally-unique ID that's returned when running an asynchronous mutation.
   */
  private String id;

  public CustomerSegmentMembersQuery() {
  }

  /**
   * The current total number of members in a given segment.
   */
  public int getCurrentCount() {
    return currentCount;
  }

  public void setCurrentCount(int currentCount) {
    this.currentCount = currentCount;
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
    return "CustomerSegmentMembersQuery{currentCount='" + currentCount + "', done='" + done + "', id='" + id + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerSegmentMembersQuery that = (CustomerSegmentMembersQuery) o;
    return currentCount == that.currentCount &&
        done == that.done &&
        Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentCount, done, id);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The current total number of members in a given segment.
     */
    private int currentCount;

    /**
     * This indicates if the job is still queued or has been run.
     */
    private boolean done;

    /**
     * A globally-unique ID that's returned when running an asynchronous mutation.
     */
    private String id;

    public CustomerSegmentMembersQuery build() {
      CustomerSegmentMembersQuery result = new CustomerSegmentMembersQuery();
      result.currentCount = this.currentCount;
      result.done = this.done;
      result.id = this.id;
      return result;
    }

    /**
     * The current total number of members in a given segment.
     */
    public Builder currentCount(int currentCount) {
      this.currentCount = currentCount;
      return this;
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
