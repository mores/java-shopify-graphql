package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The pricing information about a subscription app.
 * The object contains an interval (the frequency at which the shop is billed for an app subscription) and
 * a price (the amount to be charged to the subscribing shop at each interval).
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class AppRecurringPricing implements AppPricingDetails {
  /**
   * The discount applied to the subscription for a given number of billing intervals.
   */
  private AppSubscriptionDiscount discount;

  /**
   * The frequency at which the subscribing shop is billed for an app subscription.
   */
  private AppPricingInterval interval;

  /**
   * The amount and currency to be charged to the subscribing shop every billing interval.
   */
  private MoneyV2 price;

  public AppRecurringPricing() {
  }

  /**
   * The discount applied to the subscription for a given number of billing intervals.
   */
  public AppSubscriptionDiscount getDiscount() {
    return discount;
  }

  public void setDiscount(AppSubscriptionDiscount discount) {
    this.discount = discount;
  }

  /**
   * The frequency at which the subscribing shop is billed for an app subscription.
   */
  public AppPricingInterval getInterval() {
    return interval;
  }

  public void setInterval(AppPricingInterval interval) {
    this.interval = interval;
  }

  /**
   * The amount and currency to be charged to the subscribing shop every billing interval.
   */
  public MoneyV2 getPrice() {
    return price;
  }

  public void setPrice(MoneyV2 price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "AppRecurringPricing{discount='" + discount + "', interval='" + interval + "', price='" + price + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppRecurringPricing that = (AppRecurringPricing) o;
    return Objects.equals(discount, that.discount) &&
        Objects.equals(interval, that.interval) &&
        Objects.equals(price, that.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discount, interval, price);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The discount applied to the subscription for a given number of billing intervals.
     */
    private AppSubscriptionDiscount discount;

    /**
     * The frequency at which the subscribing shop is billed for an app subscription.
     */
    private AppPricingInterval interval;

    /**
     * The amount and currency to be charged to the subscribing shop every billing interval.
     */
    private MoneyV2 price;

    public AppRecurringPricing build() {
      AppRecurringPricing result = new AppRecurringPricing();
      result.discount = this.discount;
      result.interval = this.interval;
      result.price = this.price;
      return result;
    }

    /**
     * The discount applied to the subscription for a given number of billing intervals.
     */
    public Builder discount(AppSubscriptionDiscount discount) {
      this.discount = discount;
      return this;
    }

    /**
     * The frequency at which the subscribing shop is billed for an app subscription.
     */
    public Builder interval(AppPricingInterval interval) {
      this.interval = interval;
      return this;
    }

    /**
     * The amount and currency to be charged to the subscribing shop every billing interval.
     */
    public Builder price(MoneyV2 price) {
      this.price = price;
      return this;
    }
  }
}
