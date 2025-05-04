package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a customer to associate with an order. Allows creation of a new customer or specifying an existing one.
 */
public class OrderCreateCustomerInput {
  /**
   * An existing customer to associate with the order, specified by ID.
   */
  private OrderCreateAssociateCustomerAttributesInput toAssociate;

  /**
   * A new customer to create or update and associate with the order.
   */
  private OrderCreateUpsertCustomerAttributesInput toUpsert;

  public OrderCreateCustomerInput() {
  }

  /**
   * An existing customer to associate with the order, specified by ID.
   */
  public OrderCreateAssociateCustomerAttributesInput getToAssociate() {
    return toAssociate;
  }

  public void setToAssociate(OrderCreateAssociateCustomerAttributesInput toAssociate) {
    this.toAssociate = toAssociate;
  }

  /**
   * A new customer to create or update and associate with the order.
   */
  public OrderCreateUpsertCustomerAttributesInput getToUpsert() {
    return toUpsert;
  }

  public void setToUpsert(OrderCreateUpsertCustomerAttributesInput toUpsert) {
    this.toUpsert = toUpsert;
  }

  @Override
  public String toString() {
    return "OrderCreateCustomerInput{toAssociate='" + toAssociate + "', toUpsert='" + toUpsert + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderCreateCustomerInput that = (OrderCreateCustomerInput) o;
    return Objects.equals(toAssociate, that.toAssociate) &&
        Objects.equals(toUpsert, that.toUpsert);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toAssociate, toUpsert);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * An existing customer to associate with the order, specified by ID.
     */
    private OrderCreateAssociateCustomerAttributesInput toAssociate;

    /**
     * A new customer to create or update and associate with the order.
     */
    private OrderCreateUpsertCustomerAttributesInput toUpsert;

    public OrderCreateCustomerInput build() {
      OrderCreateCustomerInput result = new OrderCreateCustomerInput();
      result.toAssociate = this.toAssociate;
      result.toUpsert = this.toUpsert;
      return result;
    }

    /**
     * An existing customer to associate with the order, specified by ID.
     */
    public Builder toAssociate(OrderCreateAssociateCustomerAttributesInput toAssociate) {
      this.toAssociate = toAssociate;
      return this;
    }

    /**
     * A new customer to create or update and associate with the order.
     */
    public Builder toUpsert(OrderCreateUpsertCustomerAttributesInput toUpsert) {
      this.toUpsert = toUpsert;
      return this;
    }
  }
}
