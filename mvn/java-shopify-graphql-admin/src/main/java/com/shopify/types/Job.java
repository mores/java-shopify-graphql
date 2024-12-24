package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class Job {
  
  private boolean done;

  
  private String id;

  
  private String query;

  public Job() {
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
    
    private boolean done;

    
    private String id;

    
    private String query;

    public Job build() {
      Job result = new Job();
      result.done = this.done;
      result.id = this.id;
      result.query = this.query;
      return result;
    }

    
    public Builder done(boolean done) {
      this.done = done;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder query(String query) {
      this.query = query;
      return this;
    }
  }
}
