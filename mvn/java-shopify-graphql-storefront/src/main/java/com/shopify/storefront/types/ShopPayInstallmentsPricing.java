package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The result for a Shop Pay Installments pricing request.
 */
public class ShopPayInstallmentsPricing {
  /**
   * The financing plans available for the given price range.
   */
  private List<ShopPayInstallmentsFinancingPlan> financingPlans;

  /**
   * The maximum price to qualify for financing.
   */
  private MoneyV2 maxPrice;

  /**
   * The minimum price to qualify for financing.
   */
  private MoneyV2 minPrice;

  public ShopPayInstallmentsPricing() {
  }

  /**
   * The financing plans available for the given price range.
   */
  public List<ShopPayInstallmentsFinancingPlan> getFinancingPlans() {
    return financingPlans;
  }

  public void setFinancingPlans(List<ShopPayInstallmentsFinancingPlan> financingPlans) {
    this.financingPlans = financingPlans;
  }

  /**
   * The maximum price to qualify for financing.
   */
  public MoneyV2 getMaxPrice() {
    return maxPrice;
  }

  public void setMaxPrice(MoneyV2 maxPrice) {
    this.maxPrice = maxPrice;
  }

  /**
   * The minimum price to qualify for financing.
   */
  public MoneyV2 getMinPrice() {
    return minPrice;
  }

  public void setMinPrice(MoneyV2 minPrice) {
    this.minPrice = minPrice;
  }

  @Override
  public String toString() {
    return "ShopPayInstallmentsPricing{financingPlans='" + financingPlans + "', maxPrice='" + maxPrice + "', minPrice='" + minPrice + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopPayInstallmentsPricing that = (ShopPayInstallmentsPricing) o;
    return Objects.equals(financingPlans, that.financingPlans) &&
        Objects.equals(maxPrice, that.maxPrice) &&
        Objects.equals(minPrice, that.minPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(financingPlans, maxPrice, minPrice);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The financing plans available for the given price range.
     */
    private List<ShopPayInstallmentsFinancingPlan> financingPlans;

    /**
     * The maximum price to qualify for financing.
     */
    private MoneyV2 maxPrice;

    /**
     * The minimum price to qualify for financing.
     */
    private MoneyV2 minPrice;

    public ShopPayInstallmentsPricing build() {
      ShopPayInstallmentsPricing result = new ShopPayInstallmentsPricing();
      result.financingPlans = this.financingPlans;
      result.maxPrice = this.maxPrice;
      result.minPrice = this.minPrice;
      return result;
    }

    /**
     * The financing plans available for the given price range.
     */
    public Builder financingPlans(List<ShopPayInstallmentsFinancingPlan> financingPlans) {
      this.financingPlans = financingPlans;
      return this;
    }

    /**
     * The maximum price to qualify for financing.
     */
    public Builder maxPrice(MoneyV2 maxPrice) {
      this.maxPrice = maxPrice;
      return this;
    }

    /**
     * The minimum price to qualify for financing.
     */
    public Builder minPrice(MoneyV2 minPrice) {
      this.minPrice = minPrice;
      return this;
    }
  }
}
