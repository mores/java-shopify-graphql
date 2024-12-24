package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CustomerSegmentMembersQuery implements com.shopify.types.JobResult, com.shopify.types.Node {
  
  private int currentCount;

  
  private boolean done;

  
  private String id;

  public CustomerSegmentMembersQuery() {
  }

  
  public int getCurrentCount() {
    return currentCount;
  }

  public void setCurrentCount(int currentCount) {
    this.currentCount = currentCount;
  }

  
  public boolean getDone() {
    return done;
  }

  public void setDone(boolean done) {
    this.done = done;
  }

  
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
    
    private int currentCount;

    
    private boolean done;

    
    private String id;

    public CustomerSegmentMembersQuery build() {
      CustomerSegmentMembersQuery result = new CustomerSegmentMembersQuery();
      result.currentCount = this.currentCount;
      result.done = this.done;
      result.id = this.id;
      return result;
    }

    
    public Builder currentCount(int currentCount) {
      this.currentCount = currentCount;
      return this;
    }

    
    public Builder done(boolean done) {
      this.done = done;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }
}
