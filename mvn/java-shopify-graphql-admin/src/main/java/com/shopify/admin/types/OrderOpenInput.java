package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for specifying a closed order to open.
 */
public class OrderOpenInput {
  /**
   * The ID of the order to open.
   */
  private String id;

  public OrderOpenInput() {
  }

  /**
   * The ID of the order to open.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "OrderOpenInput{id='" + id + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderOpenInput that = (OrderOpenInput) o;
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
     * The ID of the order to open.
     */
    private String id;

    public OrderOpenInput build() {
      OrderOpenInput result = new OrderOpenInput();
      result.id = this.id;
      return result;
    }

    /**
     * The ID of the order to open.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }
}
