package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class OrderStagedChangeAddVariant implements OrderStagedChange {
  
  private int quantity;

  
  private ProductVariant variant;

  public OrderStagedChangeAddVariant() {
  }

  
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  
  public ProductVariant getVariant() {
    return variant;
  }

  public void setVariant(ProductVariant variant) {
    this.variant = variant;
  }

  @Override
  public String toString() {
    return "OrderStagedChangeAddVariant{quantity='" + quantity + "', variant='" + variant + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderStagedChangeAddVariant that = (OrderStagedChangeAddVariant) o;
    return quantity == that.quantity &&
        Objects.equals(variant, that.variant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, variant);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private int quantity;

    
    private ProductVariant variant;

    public OrderStagedChangeAddVariant build() {
      OrderStagedChangeAddVariant result = new OrderStagedChangeAddVariant();
      result.quantity = this.quantity;
      result.variant = this.variant;
      return result;
    }

    
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    
    public Builder variant(ProductVariant variant) {
      this.variant = variant;
      return this;
    }
  }
}
