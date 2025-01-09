package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields and values to use when creating quantity price breaks.
 */
public class QuantityPriceBreakInput {
  /**
   * The product variant ID associated with the quantity break.
   */
  private String variantId;

  /**
   * The price of the product variant when its quantity meets the break's minimum quantity.
   */
  private MoneyInput price;

  /**
   * The minimum required quantity for a variant to qualify for this price.
   */
  private int minimumQuantity;

  public QuantityPriceBreakInput() {
  }

  /**
   * The product variant ID associated with the quantity break.
   */
  public String getVariantId() {
    return variantId;
  }

  public void setVariantId(String variantId) {
    this.variantId = variantId;
  }

  /**
   * The price of the product variant when its quantity meets the break's minimum quantity.
   */
  public MoneyInput getPrice() {
    return price;
  }

  public void setPrice(MoneyInput price) {
    this.price = price;
  }

  /**
   * The minimum required quantity for a variant to qualify for this price.
   */
  public int getMinimumQuantity() {
    return minimumQuantity;
  }

  public void setMinimumQuantity(int minimumQuantity) {
    this.minimumQuantity = minimumQuantity;
  }

  @Override
  public String toString() {
    return "QuantityPriceBreakInput{variantId='" + variantId + "', price='" + price + "', minimumQuantity='" + minimumQuantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QuantityPriceBreakInput that = (QuantityPriceBreakInput) o;
    return Objects.equals(variantId, that.variantId) &&
        Objects.equals(price, that.price) &&
        minimumQuantity == that.minimumQuantity;
  }

  @Override
  public int hashCode() {
    return Objects.hash(variantId, price, minimumQuantity);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The product variant ID associated with the quantity break.
     */
    private String variantId;

    /**
     * The price of the product variant when its quantity meets the break's minimum quantity.
     */
    private MoneyInput price;

    /**
     * The minimum required quantity for a variant to qualify for this price.
     */
    private int minimumQuantity;

    public QuantityPriceBreakInput build() {
      QuantityPriceBreakInput result = new QuantityPriceBreakInput();
      result.variantId = this.variantId;
      result.price = this.price;
      result.minimumQuantity = this.minimumQuantity;
      return result;
    }

    /**
     * The product variant ID associated with the quantity break.
     */
    public Builder variantId(String variantId) {
      this.variantId = variantId;
      return this;
    }

    /**
     * The price of the product variant when its quantity meets the break's minimum quantity.
     */
    public Builder price(MoneyInput price) {
      this.price = price;
      return this;
    }

    /**
     * The minimum required quantity for a variant to qualify for this price.
     */
    public Builder minimumQuantity(int minimumQuantity) {
      this.minimumQuantity = minimumQuantity;
      return this;
    }
  }
}
