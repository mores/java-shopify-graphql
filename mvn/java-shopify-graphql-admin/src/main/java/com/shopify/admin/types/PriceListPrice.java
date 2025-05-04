package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents information about pricing for a product variant
 *         as defined on a price list, such as the price, compare at price, and
 * origin type. You can use a `PriceListPrice` to specify a fixed price for a
 * specific product variant. For examples, refer to [PriceListFixedPricesAdd](https://shopify.dev/api/admin-graphql/latest/mutations/priceListFixedPricesAdd) and [PriceList](https://shopify.dev/api/admin-graphql/latest/queries/priceList#section-examples).
 */
public class PriceListPrice {
  /**
   * The compare-at price of the product variant on this price list.
   */
  private MoneyV2 compareAtPrice;

  /**
   * The origin of a price, either fixed (defined on the price list) or relative
   * (calculated using a price list adjustment configuration).
   */
  private PriceListPriceOriginType originType;

  /**
   * The price of the product variant on this price list.
   */
  private MoneyV2 price;

  /**
   * A list of quantity breaks for the product variant.
   */
  private QuantityPriceBreakConnection quantityPriceBreaks;

  /**
   * The product variant associated with this price.
   */
  private ProductVariant variant;

  public PriceListPrice() {
  }

  /**
   * The compare-at price of the product variant on this price list.
   */
  public MoneyV2 getCompareAtPrice() {
    return compareAtPrice;
  }

  public void setCompareAtPrice(MoneyV2 compareAtPrice) {
    this.compareAtPrice = compareAtPrice;
  }

  /**
   * The origin of a price, either fixed (defined on the price list) or relative
   * (calculated using a price list adjustment configuration).
   */
  public PriceListPriceOriginType getOriginType() {
    return originType;
  }

  public void setOriginType(PriceListPriceOriginType originType) {
    this.originType = originType;
  }

  /**
   * The price of the product variant on this price list.
   */
  public MoneyV2 getPrice() {
    return price;
  }

  public void setPrice(MoneyV2 price) {
    this.price = price;
  }

  /**
   * A list of quantity breaks for the product variant.
   */
  public QuantityPriceBreakConnection getQuantityPriceBreaks() {
    return quantityPriceBreaks;
  }

  public void setQuantityPriceBreaks(QuantityPriceBreakConnection quantityPriceBreaks) {
    this.quantityPriceBreaks = quantityPriceBreaks;
  }

  /**
   * The product variant associated with this price.
   */
  public ProductVariant getVariant() {
    return variant;
  }

  public void setVariant(ProductVariant variant) {
    this.variant = variant;
  }

  @Override
  public String toString() {
    return "PriceListPrice{compareAtPrice='" + compareAtPrice + "', originType='" + originType + "', price='" + price + "', quantityPriceBreaks='" + quantityPriceBreaks + "', variant='" + variant + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceListPrice that = (PriceListPrice) o;
    return Objects.equals(compareAtPrice, that.compareAtPrice) &&
        Objects.equals(originType, that.originType) &&
        Objects.equals(price, that.price) &&
        Objects.equals(quantityPriceBreaks, that.quantityPriceBreaks) &&
        Objects.equals(variant, that.variant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compareAtPrice, originType, price, quantityPriceBreaks, variant);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The compare-at price of the product variant on this price list.
     */
    private MoneyV2 compareAtPrice;

    /**
     * The origin of a price, either fixed (defined on the price list) or relative
     * (calculated using a price list adjustment configuration).
     */
    private PriceListPriceOriginType originType;

    /**
     * The price of the product variant on this price list.
     */
    private MoneyV2 price;

    /**
     * A list of quantity breaks for the product variant.
     */
    private QuantityPriceBreakConnection quantityPriceBreaks;

    /**
     * The product variant associated with this price.
     */
    private ProductVariant variant;

    public PriceListPrice build() {
      PriceListPrice result = new PriceListPrice();
      result.compareAtPrice = this.compareAtPrice;
      result.originType = this.originType;
      result.price = this.price;
      result.quantityPriceBreaks = this.quantityPriceBreaks;
      result.variant = this.variant;
      return result;
    }

    /**
     * The compare-at price of the product variant on this price list.
     */
    public Builder compareAtPrice(MoneyV2 compareAtPrice) {
      this.compareAtPrice = compareAtPrice;
      return this;
    }

    /**
     * The origin of a price, either fixed (defined on the price list) or relative
     * (calculated using a price list adjustment configuration).
     */
    public Builder originType(PriceListPriceOriginType originType) {
      this.originType = originType;
      return this;
    }

    /**
     * The price of the product variant on this price list.
     */
    public Builder price(MoneyV2 price) {
      this.price = price;
      return this;
    }

    /**
     * A list of quantity breaks for the product variant.
     */
    public Builder quantityPriceBreaks(QuantityPriceBreakConnection quantityPriceBreaks) {
      this.quantityPriceBreaks = quantityPriceBreaks;
      return this;
    }

    /**
     * The product variant associated with this price.
     */
    public Builder variant(ProductVariant variant) {
      this.variant = variant;
      return this;
    }
  }
}
