package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to delete a customer.
 */
public class CustomerDeleteInput {
  /**
   * The ID of the customer to delete.
   */
  private String id;

  public CustomerDeleteInput() {
  }

  /**
   * The ID of the customer to delete.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "CustomerDeleteInput{id='" + id + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerDeleteInput that = (CustomerDeleteInput) o;
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
     * The ID of the customer to delete.
     */
    private String id;

    public CustomerDeleteInput build() {
      CustomerDeleteInput result = new CustomerDeleteInput();
      result.id = this.id;
      return result;
    }

    /**
     * The ID of the customer to delete.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }
}
