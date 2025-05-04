package com.shopify.admin.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a subscription free shipping discount on a contract.
 */
public class SubscriptionFreeShippingDiscountInput {
  /**
   * The title associated with the subscription free shipping discount.
   */
  private String title;

  /**
   * The maximum number of times the subscription free shipping discount will be applied on orders.
   */
  private Integer recurringCycleLimit;

  public SubscriptionFreeShippingDiscountInput() {
  }

  /**
   * The title associated with the subscription free shipping discount.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The maximum number of times the subscription free shipping discount will be applied on orders.
   */
  public Integer getRecurringCycleLimit() {
    return recurringCycleLimit;
  }

  public void setRecurringCycleLimit(Integer recurringCycleLimit) {
    this.recurringCycleLimit = recurringCycleLimit;
  }

  @Override
  public String toString() {
    return "SubscriptionFreeShippingDiscountInput{title='" + title + "', recurringCycleLimit='" + recurringCycleLimit + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionFreeShippingDiscountInput that = (SubscriptionFreeShippingDiscountInput) o;
    return Objects.equals(title, that.title) &&
        Objects.equals(recurringCycleLimit, that.recurringCycleLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, recurringCycleLimit);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The title associated with the subscription free shipping discount.
     */
    private String title;

    /**
     * The maximum number of times the subscription free shipping discount will be applied on orders.
     */
    private Integer recurringCycleLimit;

    public SubscriptionFreeShippingDiscountInput build() {
      SubscriptionFreeShippingDiscountInput result = new SubscriptionFreeShippingDiscountInput();
      result.title = this.title;
      result.recurringCycleLimit = this.recurringCycleLimit;
      return result;
    }

    /**
     * The title associated with the subscription free shipping discount.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The maximum number of times the subscription free shipping discount will be applied on orders.
     */
    public Builder recurringCycleLimit(Integer recurringCycleLimit) {
      this.recurringCycleLimit = recurringCycleLimit;
      return this;
    }
  }
}
