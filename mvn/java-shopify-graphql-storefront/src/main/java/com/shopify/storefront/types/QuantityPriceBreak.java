package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Quantity price breaks lets you offer different rates that are based on the
 * amount of a specific variant being ordered.
 */
public class QuantityPriceBreak {
  /**
   * Minimum quantity required to reach new quantity break price.
   */
  private int minimumQuantity;

  /**
   * The price of variant after reaching the minimum quanity.
   */
  private MoneyV2 price;

  public QuantityPriceBreak() {
  }

  /**
   * Minimum quantity required to reach new quantity break price.
   */
  public int getMinimumQuantity() {
    return minimumQuantity;
  }

  public void setMinimumQuantity(int minimumQuantity) {
    this.minimumQuantity = minimumQuantity;
  }

  /**
   * The price of variant after reaching the minimum quanity.
   */
  public MoneyV2 getPrice() {
    return price;
  }

  public void setPrice(MoneyV2 price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "QuantityPriceBreak{minimumQuantity='" + minimumQuantity + "', price='" + price + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QuantityPriceBreak that = (QuantityPriceBreak) o;
    return minimumQuantity == that.minimumQuantity &&
        Objects.equals(price, that.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minimumQuantity, price);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Minimum quantity required to reach new quantity break price.
     */
    private int minimumQuantity;

    /**
     * The price of variant after reaching the minimum quanity.
     */
    private MoneyV2 price;

    public QuantityPriceBreak build() {
      QuantityPriceBreak result = new QuantityPriceBreak();
      result.minimumQuantity = this.minimumQuantity;
      result.price = this.price;
      return result;
    }

    /**
     * Minimum quantity required to reach new quantity break price.
     */
    public Builder minimumQuantity(int minimumQuantity) {
      this.minimumQuantity = minimumQuantity;
      return this;
    }

    /**
     * The price of variant after reaching the minimum quanity.
     */
    public Builder price(MoneyV2 price) {
      this.price = price;
      return this;
    }
  }
}
