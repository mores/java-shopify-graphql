package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for providing the fields and values to use when creating or updating a fixed price list price.
 */
public class PriceListPriceInput {
  /**
   * The product variant ID associated with the price list price.
   */
  private String variantId;

  /**
   * The price of the product variant on this price list.
   */
  private MoneyInput price;

  /**
   * The compare-at price of the product variant on this price list.
   */
  private MoneyInput compareAtPrice;

  public PriceListPriceInput() {
  }

  /**
   * The product variant ID associated with the price list price.
   */
  public String getVariantId() {
    return variantId;
  }

  public void setVariantId(String variantId) {
    this.variantId = variantId;
  }

  /**
   * The price of the product variant on this price list.
   */
  public MoneyInput getPrice() {
    return price;
  }

  public void setPrice(MoneyInput price) {
    this.price = price;
  }

  /**
   * The compare-at price of the product variant on this price list.
   */
  public MoneyInput getCompareAtPrice() {
    return compareAtPrice;
  }

  public void setCompareAtPrice(MoneyInput compareAtPrice) {
    this.compareAtPrice = compareAtPrice;
  }

  @Override
  public String toString() {
    return "PriceListPriceInput{variantId='" + variantId + "', price='" + price + "', compareAtPrice='" + compareAtPrice + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceListPriceInput that = (PriceListPriceInput) o;
    return Objects.equals(variantId, that.variantId) &&
        Objects.equals(price, that.price) &&
        Objects.equals(compareAtPrice, that.compareAtPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variantId, price, compareAtPrice);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The product variant ID associated with the price list price.
     */
    private String variantId;

    /**
     * The price of the product variant on this price list.
     */
    private MoneyInput price;

    /**
     * The compare-at price of the product variant on this price list.
     */
    private MoneyInput compareAtPrice;

    public PriceListPriceInput build() {
      PriceListPriceInput result = new PriceListPriceInput();
      result.variantId = this.variantId;
      result.price = this.price;
      result.compareAtPrice = this.compareAtPrice;
      return result;
    }

    /**
     * The product variant ID associated with the price list price.
     */
    public Builder variantId(String variantId) {
      this.variantId = variantId;
      return this;
    }

    /**
     * The price of the product variant on this price list.
     */
    public Builder price(MoneyInput price) {
      this.price = price;
      return this;
    }

    /**
     * The compare-at price of the product variant on this price list.
     */
    public Builder compareAtPrice(MoneyInput compareAtPrice) {
      this.compareAtPrice = compareAtPrice;
      return this;
    }
  }
}
