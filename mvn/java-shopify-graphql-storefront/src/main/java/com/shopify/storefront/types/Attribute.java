package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents a generic custom attribute, such as whether an order is a customer's first.
 */
public class Attribute {
  /**
   * The key or name of the attribute. For example, `"customersFirstOrder"`.
   */
  private String key;

  /**
   * The value of the attribute. For example, `"true"`.
   */
  private String value;

  public Attribute() {
  }

  /**
   * The key or name of the attribute. For example, `"customersFirstOrder"`.
   */
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  /**
   * The value of the attribute. For example, `"true"`.
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "Attribute{key='" + key + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Attribute that = (Attribute) o;
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
     * The key or name of the attribute. For example, `"customersFirstOrder"`.
     */
    private String key;

    /**
     * The value of the attribute. For example, `"true"`.
     */
    private String value;

    public Attribute build() {
      Attribute result = new Attribute();
      result.key = this.key;
      result.value = this.value;
      return result;
    }

    /**
     * The key or name of the attribute. For example, `"customersFirstOrder"`.
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * The value of the attribute. For example, `"true"`.
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }
}
