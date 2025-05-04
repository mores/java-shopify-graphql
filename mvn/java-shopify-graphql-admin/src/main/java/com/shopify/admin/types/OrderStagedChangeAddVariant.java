package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A change to the order representing the addition of an existing product variant.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class OrderStagedChangeAddVariant implements OrderStagedChange {
  /**
   * The quantity of the product variant that was added.
   */
  private int quantity;

  /**
   * The product variant that was added.
   */
  private ProductVariant variant;

  public OrderStagedChangeAddVariant() {
  }

  /**
   * The quantity of the product variant that was added.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  /**
   * The product variant that was added.
   */
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
    /**
     * The quantity of the product variant that was added.
     */
    private int quantity;

    /**
     * The product variant that was added.
     */
    private ProductVariant variant;

    public OrderStagedChangeAddVariant build() {
      OrderStagedChangeAddVariant result = new OrderStagedChangeAddVariant();
      result.quantity = this.quantity;
      result.variant = this.variant;
      return result;
    }

    /**
     * The quantity of the product variant that was added.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * The product variant that was added.
     */
    public Builder variant(ProductVariant variant) {
      this.variant = variant;
      return this;
    }
  }
}
