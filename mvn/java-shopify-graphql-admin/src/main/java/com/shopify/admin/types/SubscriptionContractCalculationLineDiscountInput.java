package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a line-scoped discount in the calculate API. Applies to the line it is provided on.
 */
public class SubscriptionContractCalculationLineDiscountInput {
  /**
   * The ID of an existing discount to update. Omit for new discounts.
   */
  private String id;

  /**
   * The title of the line discount.
   */
  private String title;

  /**
   * The value of the discount (percentage or fixed amount).
   */
  private SubscriptionContractCalculationDiscountValueInput value;

  /**
   * The number of billing cycles this discount applies to. Use 0 for no limit.
   */
  private int recurringCycleLimit;

  public SubscriptionContractCalculationLineDiscountInput() {
  }

  /**
   * The ID of an existing discount to update. Omit for new discounts.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The title of the line discount.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The value of the discount (percentage or fixed amount).
   */
  public SubscriptionContractCalculationDiscountValueInput getValue() {
    return value;
  }

  public void setValue(SubscriptionContractCalculationDiscountValueInput value) {
    this.value = value;
  }

  /**
   * The number of billing cycles this discount applies to. Use 0 for no limit.
   */
  public int getRecurringCycleLimit() {
    return recurringCycleLimit;
  }

  public void setRecurringCycleLimit(int recurringCycleLimit) {
    this.recurringCycleLimit = recurringCycleLimit;
  }

  @Override
  public String toString() {
    return "SubscriptionContractCalculationLineDiscountInput{id='" + id + "', title='" + title + "', value='" + value + "', recurringCycleLimit='" + recurringCycleLimit + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractCalculationLineDiscountInput that = (SubscriptionContractCalculationLineDiscountInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(title, that.title) &&
        Objects.equals(value, that.value) &&
        recurringCycleLimit == that.recurringCycleLimit;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, value, recurringCycleLimit);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of an existing discount to update. Omit for new discounts.
     */
    private String id;

    /**
     * The title of the line discount.
     */
    private String title;

    /**
     * The value of the discount (percentage or fixed amount).
     */
    private SubscriptionContractCalculationDiscountValueInput value;

    /**
     * The number of billing cycles this discount applies to. Use 0 for no limit.
     */
    private int recurringCycleLimit;

    public SubscriptionContractCalculationLineDiscountInput build() {
      SubscriptionContractCalculationLineDiscountInput result = new SubscriptionContractCalculationLineDiscountInput();
      result.id = this.id;
      result.title = this.title;
      result.value = this.value;
      result.recurringCycleLimit = this.recurringCycleLimit;
      return result;
    }

    /**
     * The ID of an existing discount to update. Omit for new discounts.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The title of the line discount.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The value of the discount (percentage or fixed amount).
     */
    public Builder value(SubscriptionContractCalculationDiscountValueInput value) {
      this.value = value;
      return this;
    }

    /**
     * The number of billing cycles this discount applies to. Use 0 for no limit.
     */
    public Builder recurringCycleLimit(int recurringCycleLimit) {
      this.recurringCycleLimit = recurringCycleLimit;
      return this;
    }
  }
}
