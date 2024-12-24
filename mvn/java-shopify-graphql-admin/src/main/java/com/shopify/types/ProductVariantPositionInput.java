package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ProductVariantPositionInput {
  
  private String id;

  
  private int position;

  public ProductVariantPositionInput() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public int getPosition() {
    return position;
  }

  public void setPosition(int position) {
    this.position = position;
  }

  @Override
  public String toString() {
    return "ProductVariantPositionInput{id='" + id + "', position='" + position + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductVariantPositionInput that = (ProductVariantPositionInput) o;
    return Objects.equals(id, that.id) &&
        position == that.position;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, position);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String id;

    
    private int position;

    public ProductVariantPositionInput build() {
      ProductVariantPositionInput result = new ProductVariantPositionInput();
      result.id = this.id;
      result.position = this.position;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder position(int position) {
      this.position = position;
      return this;
    }
  }
}
