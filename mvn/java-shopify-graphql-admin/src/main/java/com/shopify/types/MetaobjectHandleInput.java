package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MetaobjectHandleInput {
  
  private String type;

  
  private String handle;

  public MetaobjectHandleInput() {
  }

  
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  @Override
  public String toString() {
    return "MetaobjectHandleInput{type='" + type + "', handle='" + handle + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectHandleInput that = (MetaobjectHandleInput) o;
    return Objects.equals(type, that.type) &&
        Objects.equals(handle, that.handle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, handle);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String type;

    
    private String handle;

    public MetaobjectHandleInput build() {
      MetaobjectHandleInput result = new MetaobjectHandleInput();
      result.type = this.type;
      result.handle = this.handle;
      return result;
    }

    
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }
  }
}
