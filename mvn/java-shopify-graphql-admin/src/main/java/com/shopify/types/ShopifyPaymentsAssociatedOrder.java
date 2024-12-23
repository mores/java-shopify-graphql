package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The order associated to the balance transaction.
 */
public class ShopifyPaymentsAssociatedOrder {
  /**
   * The ID of the associated order.
   */
  private String id;

  /**
   * The name of the associated order.
   */
  private String name;

  public ShopifyPaymentsAssociatedOrder() {
  }

  /**
   * The ID of the associated order.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The name of the associated order.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "ShopifyPaymentsAssociatedOrder{id='" + id + "', name='" + name + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyPaymentsAssociatedOrder that = (ShopifyPaymentsAssociatedOrder) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the associated order.
     */
    private String id;

    /**
     * The name of the associated order.
     */
    private String name;

    public ShopifyPaymentsAssociatedOrder build() {
      ShopifyPaymentsAssociatedOrder result = new ShopifyPaymentsAssociatedOrder();
      result.id = this.id;
      result.name = this.name;
      return result;
    }

    /**
     * The ID of the associated order.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The name of the associated order.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }
}
