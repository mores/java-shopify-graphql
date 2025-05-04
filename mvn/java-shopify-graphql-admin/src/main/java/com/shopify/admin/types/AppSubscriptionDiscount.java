package com.shopify.admin.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Discount applied to the recurring pricing portion of a subscription.
 */
public class AppSubscriptionDiscount {
  /**
   * The total number of billing intervals to which the discount will be applied.
   * The discount will be applied to an indefinite number of billing intervals if this value is blank.
   */
  private Integer durationLimitInIntervals;

  /**
   * The price of the subscription after the discount is applied.
   */
  private MoneyV2 priceAfterDiscount;

  /**
   * The remaining number of billing intervals to which the discount will be applied.
   */
  private Integer remainingDurationInIntervals;

  /**
   * The value of the discount applied every billing interval.
   */
  private AppSubscriptionDiscountValue value;

  public AppSubscriptionDiscount() {
  }

  /**
   * The total number of billing intervals to which the discount will be applied.
   * The discount will be applied to an indefinite number of billing intervals if this value is blank.
   */
  public Integer getDurationLimitInIntervals() {
    return durationLimitInIntervals;
  }

  public void setDurationLimitInIntervals(Integer durationLimitInIntervals) {
    this.durationLimitInIntervals = durationLimitInIntervals;
  }

  /**
   * The price of the subscription after the discount is applied.
   */
  public MoneyV2 getPriceAfterDiscount() {
    return priceAfterDiscount;
  }

  public void setPriceAfterDiscount(MoneyV2 priceAfterDiscount) {
    this.priceAfterDiscount = priceAfterDiscount;
  }

  /**
   * The remaining number of billing intervals to which the discount will be applied.
   */
  public Integer getRemainingDurationInIntervals() {
    return remainingDurationInIntervals;
  }

  public void setRemainingDurationInIntervals(Integer remainingDurationInIntervals) {
    this.remainingDurationInIntervals = remainingDurationInIntervals;
  }

  /**
   * The value of the discount applied every billing interval.
   */
  public AppSubscriptionDiscountValue getValue() {
    return value;
  }

  public void setValue(AppSubscriptionDiscountValue value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "AppSubscriptionDiscount{durationLimitInIntervals='" + durationLimitInIntervals + "', priceAfterDiscount='" + priceAfterDiscount + "', remainingDurationInIntervals='" + remainingDurationInIntervals + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppSubscriptionDiscount that = (AppSubscriptionDiscount) o;
    return Objects.equals(durationLimitInIntervals, that.durationLimitInIntervals) &&
        Objects.equals(priceAfterDiscount, that.priceAfterDiscount) &&
        Objects.equals(remainingDurationInIntervals, that.remainingDurationInIntervals) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(durationLimitInIntervals, priceAfterDiscount, remainingDurationInIntervals, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The total number of billing intervals to which the discount will be applied.
     * The discount will be applied to an indefinite number of billing intervals if this value is blank.
     */
    private Integer durationLimitInIntervals;

    /**
     * The price of the subscription after the discount is applied.
     */
    private MoneyV2 priceAfterDiscount;

    /**
     * The remaining number of billing intervals to which the discount will be applied.
     */
    private Integer remainingDurationInIntervals;

    /**
     * The value of the discount applied every billing interval.
     */
    private AppSubscriptionDiscountValue value;

    public AppSubscriptionDiscount build() {
      AppSubscriptionDiscount result = new AppSubscriptionDiscount();
      result.durationLimitInIntervals = this.durationLimitInIntervals;
      result.priceAfterDiscount = this.priceAfterDiscount;
      result.remainingDurationInIntervals = this.remainingDurationInIntervals;
      result.value = this.value;
      return result;
    }

    /**
     * The total number of billing intervals to which the discount will be applied.
     * The discount will be applied to an indefinite number of billing intervals if this value is blank.
     */
    public Builder durationLimitInIntervals(Integer durationLimitInIntervals) {
      this.durationLimitInIntervals = durationLimitInIntervals;
      return this;
    }

    /**
     * The price of the subscription after the discount is applied.
     */
    public Builder priceAfterDiscount(MoneyV2 priceAfterDiscount) {
      this.priceAfterDiscount = priceAfterDiscount;
      return this;
    }

    /**
     * The remaining number of billing intervals to which the discount will be applied.
     */
    public Builder remainingDurationInIntervals(Integer remainingDurationInIntervals) {
      this.remainingDurationInIntervals = remainingDurationInIntervals;
      return this;
    }

    /**
     * The value of the discount applied every billing interval.
     */
    public Builder value(AppSubscriptionDiscountValue value) {
      this.value = value;
      return this;
    }
  }
}
