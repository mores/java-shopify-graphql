package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class DeliveryBrandedPromise {
  
  private String handle;

  
  private String name;

  public DeliveryBrandedPromise() {
  }

  
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "DeliveryBrandedPromise{handle='" + handle + "', name='" + name + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryBrandedPromise that = (DeliveryBrandedPromise) o;
    return Objects.equals(handle, that.handle) &&
        Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(handle, name);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String handle;

    
    private String name;

    public DeliveryBrandedPromise build() {
      DeliveryBrandedPromise result = new DeliveryBrandedPromise();
      result.handle = this.handle;
      result.name = this.name;
      return result;
    }

    
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }
}
