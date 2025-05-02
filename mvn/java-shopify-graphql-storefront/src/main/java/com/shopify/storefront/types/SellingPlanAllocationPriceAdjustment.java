package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The resulting prices for variants when they're purchased with a specific selling plan.
 */
public class SellingPlanAllocationPriceAdjustment {
  /**
   * The price of the variant when it's purchased without a selling plan for the
   * same number of deliveries. For example, if a customer purchases 6 deliveries
   * of $10.00 granola separately, then the price is 6 x $10.00 = $60.00.
   */
  private MoneyV2 compareAtPrice;

  /**
   * The effective price for a single delivery. For example, for a prepaid
   * subscription plan that includes 6 deliveries at the price of $48.00, the per
   * delivery price is $8.00.
   */
  private MoneyV2 perDeliveryPrice;

  /**
   * The price of the variant when it's purchased with a selling plan For example,
   * for a prepaid subscription plan that includes 6 deliveries of $10.00 granola,
   * where the customer gets 20% off, the price is 6 x $10.00 x 0.80 = $48.00.
   */
  private MoneyV2 price;

  /**
   * The resulting price per unit for the variant associated with the selling plan.
   * If the variant isn't sold by quantity or measurement, then this field returns `null`.
   */
  private MoneyV2 unitPrice;

  public SellingPlanAllocationPriceAdjustment() {
  }

  /**
   * The price of the variant when it's purchased without a selling plan for the
   * same number of deliveries. For example, if a customer purchases 6 deliveries
   * of $10.00 granola separately, then the price is 6 x $10.00 = $60.00.
   */
  public MoneyV2 getCompareAtPrice() {
    return compareAtPrice;
  }

  public void setCompareAtPrice(MoneyV2 compareAtPrice) {
    this.compareAtPrice = compareAtPrice;
  }

  /**
   * The effective price for a single delivery. For example, for a prepaid
   * subscription plan that includes 6 deliveries at the price of $48.00, the per
   * delivery price is $8.00.
   */
  public MoneyV2 getPerDeliveryPrice() {
    return perDeliveryPrice;
  }

  public void setPerDeliveryPrice(MoneyV2 perDeliveryPrice) {
    this.perDeliveryPrice = perDeliveryPrice;
  }

  /**
   * The price of the variant when it's purchased with a selling plan For example,
   * for a prepaid subscription plan that includes 6 deliveries of $10.00 granola,
   * where the customer gets 20% off, the price is 6 x $10.00 x 0.80 = $48.00.
   */
  public MoneyV2 getPrice() {
    return price;
  }

  public void setPrice(MoneyV2 price) {
    this.price = price;
  }

  /**
   * The resulting price per unit for the variant associated with the selling plan.
   * If the variant isn't sold by quantity or measurement, then this field returns `null`.
   */
  public MoneyV2 getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(MoneyV2 unitPrice) {
    this.unitPrice = unitPrice;
  }

  @Override
  public String toString() {
    return "SellingPlanAllocationPriceAdjustment{compareAtPrice='" + compareAtPrice + "', perDeliveryPrice='" + perDeliveryPrice + "', price='" + price + "', unitPrice='" + unitPrice + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanAllocationPriceAdjustment that = (SellingPlanAllocationPriceAdjustment) o;
    return Objects.equals(compareAtPrice, that.compareAtPrice) &&
        Objects.equals(perDeliveryPrice, that.perDeliveryPrice) &&
        Objects.equals(price, that.price) &&
        Objects.equals(unitPrice, that.unitPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compareAtPrice, perDeliveryPrice, price, unitPrice);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The price of the variant when it's purchased without a selling plan for the
     * same number of deliveries. For example, if a customer purchases 6 deliveries
     * of $10.00 granola separately, then the price is 6 x $10.00 = $60.00.
     */
    private MoneyV2 compareAtPrice;

    /**
     * The effective price for a single delivery. For example, for a prepaid
     * subscription plan that includes 6 deliveries at the price of $48.00, the per
     * delivery price is $8.00.
     */
    private MoneyV2 perDeliveryPrice;

    /**
     * The price of the variant when it's purchased with a selling plan For example,
     * for a prepaid subscription plan that includes 6 deliveries of $10.00 granola,
     * where the customer gets 20% off, the price is 6 x $10.00 x 0.80 = $48.00.
     */
    private MoneyV2 price;

    /**
     * The resulting price per unit for the variant associated with the selling plan.
     * If the variant isn't sold by quantity or measurement, then this field returns `null`.
     */
    private MoneyV2 unitPrice;

    public SellingPlanAllocationPriceAdjustment build() {
      SellingPlanAllocationPriceAdjustment result = new SellingPlanAllocationPriceAdjustment();
      result.compareAtPrice = this.compareAtPrice;
      result.perDeliveryPrice = this.perDeliveryPrice;
      result.price = this.price;
      result.unitPrice = this.unitPrice;
      return result;
    }

    /**
     * The price of the variant when it's purchased without a selling plan for the
     * same number of deliveries. For example, if a customer purchases 6 deliveries
     * of $10.00 granola separately, then the price is 6 x $10.00 = $60.00.
     */
    public Builder compareAtPrice(MoneyV2 compareAtPrice) {
      this.compareAtPrice = compareAtPrice;
      return this;
    }

    /**
     * The effective price for a single delivery. For example, for a prepaid
     * subscription plan that includes 6 deliveries at the price of $48.00, the per
     * delivery price is $8.00.
     */
    public Builder perDeliveryPrice(MoneyV2 perDeliveryPrice) {
      this.perDeliveryPrice = perDeliveryPrice;
      return this;
    }

    /**
     * The price of the variant when it's purchased with a selling plan For example,
     * for a prepaid subscription plan that includes 6 deliveries of $10.00 granola,
     * where the customer gets 20% off, the price is 6 x $10.00 x 0.80 = $48.00.
     */
    public Builder price(MoneyV2 price) {
      this.price = price;
      return this;
    }

    /**
     * The resulting price per unit for the variant associated with the selling plan.
     * If the variant isn't sold by quantity or measurement, then this field returns `null`.
     */
    public Builder unitPrice(MoneyV2 unitPrice) {
      this.unitPrice = unitPrice;
      return this;
    }
  }
}
