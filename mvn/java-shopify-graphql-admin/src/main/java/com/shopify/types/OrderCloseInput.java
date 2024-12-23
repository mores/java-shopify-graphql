package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for specifying an open order to close.
 */
public class OrderCloseInput {
  /**
   * The ID of the order to close.
   */
  private String id;

  public OrderCloseInput() {
  }

  /**
   * The ID of the order to close.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "OrderCloseInput{id='" + id + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderCloseInput that = (OrderCloseInput) o;
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
    /**
     * The ID of the order to close.
     */
    private String id;

    public OrderCloseInput build() {
      OrderCloseInput result = new OrderCloseInput();
      result.id = this.id;
      return result;
    }

    /**
     * The ID of the order to close.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }
}
