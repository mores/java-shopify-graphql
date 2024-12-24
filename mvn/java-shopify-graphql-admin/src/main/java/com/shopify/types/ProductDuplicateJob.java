package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ProductDuplicateJob {
  
  private boolean done;

  
  private String id;

  public ProductDuplicateJob() {
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
    
    private boolean done;

    
    private String id;

    public ProductDuplicateJob build() {
      ProductDuplicateJob result = new ProductDuplicateJob();
      result.done = this.done;
      result.id = this.id;
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
  }
}
