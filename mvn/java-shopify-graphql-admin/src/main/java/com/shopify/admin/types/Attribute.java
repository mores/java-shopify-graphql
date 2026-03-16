package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A custom property. Attributes are used to store additional information about a Shopify resource, such as
 * products, customers, or orders. Attributes are stored as key-value pairs.
 *
 * For example, a list of attributes might include whether a customer is a first-time buyer (`"customer_first_order": "true"`),
 * whether an order is gift-wrapped (`"gift_wrapped": "true"`), a preferred delivery date
 * (`"preferred_delivery_date": "2025-10-01"`), the discount applied (`"loyalty_discount_applied": "10%"`), and any
 * notes provided by the customer (`"customer_notes": "Please leave at the front door"`).
 */
public class Attribute {
  /**
   * The key or name of the attribute. For example, `"customer_first_order"`.
   */
  private String key;

  /**
   * The value of the attribute. For example, `"true"`.
   */
  private String value;

  public Attribute() {
  }

  /**
   * The key or name of the attribute. For example, `"customer_first_order"`.
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
     * The key or name of the attribute. For example, `"customer_first_order"`.
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
     * The key or name of the attribute. For example, `"customer_first_order"`.
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
