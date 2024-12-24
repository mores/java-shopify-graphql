package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ShopifyPaymentsDisputeFileUploadUpdateInput {
  
  private String id;

  
  private Boolean destroy = false;

  public ShopifyPaymentsDisputeFileUploadUpdateInput() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public Boolean getDestroy() {
    return destroy;
  }

  public void setDestroy(Boolean destroy) {
    this.destroy = destroy;
  }

  @Override
  public String toString() {
    return "ShopifyPaymentsDisputeFileUploadUpdateInput{id='" + id + "', destroy='" + destroy + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyPaymentsDisputeFileUploadUpdateInput that = (ShopifyPaymentsDisputeFileUploadUpdateInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(destroy, that.destroy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, destroy);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String id;

    
    private Boolean destroy = false;

    public ShopifyPaymentsDisputeFileUploadUpdateInput build() {
      ShopifyPaymentsDisputeFileUploadUpdateInput result = new ShopifyPaymentsDisputeFileUploadUpdateInput();
      result.id = this.id;
      result.destroy = this.destroy;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder destroy(Boolean destroy) {
      this.destroy = destroy;
      return this;
    }
  }
}
