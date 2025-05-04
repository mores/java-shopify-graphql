package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a rate definition.
 */
public class DeliveryRateDefinitionInput {
  /**
   * A globally-unique ID of the rate definition.
   */
  private String id;

  /**
   * The price of the rate definition.
   */
  private MoneyInput price;

  public DeliveryRateDefinitionInput() {
  }

  /**
   * A globally-unique ID of the rate definition.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The price of the rate definition.
   */
  public MoneyInput getPrice() {
    return price;
  }

  public void setPrice(MoneyInput price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "DeliveryRateDefinitionInput{id='" + id + "', price='" + price + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryRateDefinitionInput that = (DeliveryRateDefinitionInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(price, that.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, price);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A globally-unique ID of the rate definition.
     */
    private String id;

    /**
     * The price of the rate definition.
     */
    private MoneyInput price;

    public DeliveryRateDefinitionInput build() {
      DeliveryRateDefinitionInput result = new DeliveryRateDefinitionInput();
      result.id = this.id;
      result.price = this.price;
      return result;
    }

    /**
     * A globally-unique ID of the rate definition.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The price of the rate definition.
     */
    public Builder price(MoneyInput price) {
      this.price = price;
      return this;
    }
  }
}
