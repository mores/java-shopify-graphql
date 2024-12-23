package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Instructs the app subscription to generate a fixed charge on a recurring basis.
 * The frequency is specified by the billing interval.
 */
public class AppRecurringPricingInput {
  /**
   * How often the app subscription generates a charge.
   */
  private AppPricingInterval interval = AppPricingInterval.EVERY_30_DAYS;

  /**
   * The amount to be charged to the store every billing interval.
   */
  private MoneyInput price;

  /**
   * The discount applied to the subscription for a given number of billing intervals.
   */
  private AppSubscriptionDiscountInput discount;

  public AppRecurringPricingInput() {
  }

  /**
   * How often the app subscription generates a charge.
   */
  public AppPricingInterval getInterval() {
    return interval;
  }

  public void setInterval(AppPricingInterval interval) {
    this.interval = interval;
  }

  /**
   * The amount to be charged to the store every billing interval.
   */
  public MoneyInput getPrice() {
    return price;
  }

  public void setPrice(MoneyInput price) {
    this.price = price;
  }

  /**
   * The discount applied to the subscription for a given number of billing intervals.
   */
  public AppSubscriptionDiscountInput getDiscount() {
    return discount;
  }

  public void setDiscount(AppSubscriptionDiscountInput discount) {
    this.discount = discount;
  }

  @Override
  public String toString() {
    return "AppRecurringPricingInput{interval='" + interval + "', price='" + price + "', discount='" + discount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppRecurringPricingInput that = (AppRecurringPricingInput) o;
    return Objects.equals(interval, that.interval) &&
        Objects.equals(price, that.price) &&
        Objects.equals(discount, that.discount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, price, discount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * How often the app subscription generates a charge.
     */
    private AppPricingInterval interval = AppPricingInterval.EVERY_30_DAYS;

    /**
     * The amount to be charged to the store every billing interval.
     */
    private MoneyInput price;

    /**
     * The discount applied to the subscription for a given number of billing intervals.
     */
    private AppSubscriptionDiscountInput discount;

    public AppRecurringPricingInput build() {
      AppRecurringPricingInput result = new AppRecurringPricingInput();
      result.interval = this.interval;
      result.price = this.price;
      result.discount = this.discount;
      return result;
    }

    /**
     * How often the app subscription generates a charge.
     */
    public Builder interval(AppPricingInterval interval) {
      this.interval = interval;
      return this;
    }

    /**
     * The amount to be charged to the store every billing interval.
     */
    public Builder price(MoneyInput price) {
      this.price = price;
      return this;
    }

    /**
     * The discount applied to the subscription for a given number of billing intervals.
     */
    public Builder discount(AppSubscriptionDiscountInput discount) {
      this.discount = discount;
      return this;
    }
  }
}
