package com.shopify.admin.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for mapping a subscription line to a discount.
 */
public class SubscriptionAtomicManualDiscountInput {
  /**
   * The title associated with the subscription discount.
   */
  private String title;

  /**
   * Percentage or fixed amount value of the discount.
   */
  private SubscriptionManualDiscountValueInput value;

  /**
   * The maximum number of times the subscription discount will be applied on orders.
   */
  private Integer recurringCycleLimit;

  public SubscriptionAtomicManualDiscountInput() {
  }

  /**
   * The title associated with the subscription discount.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Percentage or fixed amount value of the discount.
   */
  public SubscriptionManualDiscountValueInput getValue() {
    return value;
  }

  public void setValue(SubscriptionManualDiscountValueInput value) {
    this.value = value;
  }

  /**
   * The maximum number of times the subscription discount will be applied on orders.
   */
  public Integer getRecurringCycleLimit() {
    return recurringCycleLimit;
  }

  public void setRecurringCycleLimit(Integer recurringCycleLimit) {
    this.recurringCycleLimit = recurringCycleLimit;
  }

  @Override
  public String toString() {
    return "SubscriptionAtomicManualDiscountInput{title='" + title + "', value='" + value + "', recurringCycleLimit='" + recurringCycleLimit + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionAtomicManualDiscountInput that = (SubscriptionAtomicManualDiscountInput) o;
    return Objects.equals(title, that.title) &&
        Objects.equals(value, that.value) &&
        Objects.equals(recurringCycleLimit, that.recurringCycleLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, value, recurringCycleLimit);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The title associated with the subscription discount.
     */
    private String title;

    /**
     * Percentage or fixed amount value of the discount.
     */
    private SubscriptionManualDiscountValueInput value;

    /**
     * The maximum number of times the subscription discount will be applied on orders.
     */
    private Integer recurringCycleLimit;

    public SubscriptionAtomicManualDiscountInput build() {
      SubscriptionAtomicManualDiscountInput result = new SubscriptionAtomicManualDiscountInput();
      result.title = this.title;
      result.value = this.value;
      result.recurringCycleLimit = this.recurringCycleLimit;
      return result;
    }

    /**
     * The title associated with the subscription discount.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * Percentage or fixed amount value of the discount.
     */
    public Builder value(SubscriptionManualDiscountValueInput value) {
      this.value = value;
      return this;
    }

    /**
     * The maximum number of times the subscription discount will be applied on orders.
     */
    public Builder recurringCycleLimit(Integer recurringCycleLimit) {
      this.recurringCycleLimit = recurringCycleLimit;
      return this;
    }
  }
}
