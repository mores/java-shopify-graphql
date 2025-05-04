package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a note attribute for an order.
 */
public class OrderCreateCustomAttributeInput {
  /**
   * The key or name of the custom attribute.
   */
  private String key;

  /**
   * The value of the custom attribute.
   */
  private String value;

  public OrderCreateCustomAttributeInput() {
  }

  /**
   * The key or name of the custom attribute.
   */
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  /**
   * The value of the custom attribute.
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "OrderCreateCustomAttributeInput{key='" + key + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderCreateCustomAttributeInput that = (OrderCreateCustomAttributeInput) o;
    return Objects.equals(key, that.key) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The key or name of the custom attribute.
     */
    private String key;

    /**
     * The value of the custom attribute.
     */
    private String value;

    public OrderCreateCustomAttributeInput build() {
      OrderCreateCustomAttributeInput result = new OrderCreateCustomAttributeInput();
      result.key = this.key;
      result.value = this.value;
      return result;
    }

    /**
     * The key or name of the custom attribute.
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * The value of the custom attribute.
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }
}
