package com.shopify.admin.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to specify a discount to the recurring pricing portion of a
 * subscription over a number of billing intervals.
 */
public class AppSubscriptionDiscountInput {
  /**
   * The value to be discounted every billing interval.
   */
  private AppSubscriptionDiscountValueInput value;

  /**
   * The total number of billing intervals to which the discount will be applied. Must be greater than 0.
   * The discount will be applied to an indefinite number of billing intervals if this value is left blank.
   */
  private Integer durationLimitInIntervals;

  public AppSubscriptionDiscountInput() {
  }

  /**
   * The value to be discounted every billing interval.
   */
  public AppSubscriptionDiscountValueInput getValue() {
    return value;
  }

  public void setValue(AppSubscriptionDiscountValueInput value) {
    this.value = value;
  }

  /**
   * The total number of billing intervals to which the discount will be applied. Must be greater than 0.
   * The discount will be applied to an indefinite number of billing intervals if this value is left blank.
   */
  public Integer getDurationLimitInIntervals() {
    return durationLimitInIntervals;
  }

  public void setDurationLimitInIntervals(Integer durationLimitInIntervals) {
    this.durationLimitInIntervals = durationLimitInIntervals;
  }

  @Override
  public String toString() {
    return "AppSubscriptionDiscountInput{value='" + value + "', durationLimitInIntervals='" + durationLimitInIntervals + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppSubscriptionDiscountInput that = (AppSubscriptionDiscountInput) o;
    return Objects.equals(value, that.value) &&
        Objects.equals(durationLimitInIntervals, that.durationLimitInIntervals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, durationLimitInIntervals);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The value to be discounted every billing interval.
     */
    private AppSubscriptionDiscountValueInput value;

    /**
     * The total number of billing intervals to which the discount will be applied. Must be greater than 0.
     * The discount will be applied to an indefinite number of billing intervals if this value is left blank.
     */
    private Integer durationLimitInIntervals;

    public AppSubscriptionDiscountInput build() {
      AppSubscriptionDiscountInput result = new AppSubscriptionDiscountInput();
      result.value = this.value;
      result.durationLimitInIntervals = this.durationLimitInIntervals;
      return result;
    }

    /**
     * The value to be discounted every billing interval.
     */
    public Builder value(AppSubscriptionDiscountValueInput value) {
      this.value = value;
      return this;
    }

    /**
     * The total number of billing intervals to which the discount will be applied. Must be greater than 0.
     * The discount will be applied to an indefinite number of billing intervals if this value is left blank.
     */
    public Builder durationLimitInIntervals(Integer durationLimitInIntervals) {
      this.durationLimitInIntervals = durationLimitInIntervals;
      return this;
    }
  }
}
