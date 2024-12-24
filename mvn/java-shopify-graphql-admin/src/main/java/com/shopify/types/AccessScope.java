package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class AccessScope {
  
  private String description;

  
  private String handle;

  public AccessScope() {
  }

  
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  @Override
  public String toString() {
    return "AccessScope{description='" + description + "', handle='" + handle + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AccessScope that = (AccessScope) o;
    return Objects.equals(description, that.description) &&
        Objects.equals(handle, that.handle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, handle);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String description;

    
    private String handle;

    public AccessScope build() {
      AccessScope result = new AccessScope();
      result.description = this.description;
      result.handle = this.handle;
      return result;
    }

    
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }
  }
}
