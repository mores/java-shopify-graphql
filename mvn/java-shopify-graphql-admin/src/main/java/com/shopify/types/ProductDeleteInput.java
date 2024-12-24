package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ProductDeleteInput {
  
  private String id;

  public ProductDeleteInput() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "ProductDeleteInput{id='" + id + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductDeleteInput that = (ProductDeleteInput) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String id;

    public ProductDeleteInput build() {
      ProductDeleteInput result = new ProductDeleteInput();
      result.id = this.id;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }
}
