package com.shopify.admin.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a subscription discount on a contract.
 */
public class SubscriptionManualDiscountInput {
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

  /**
   * Entitled line items used to apply the subscription discount on.
   */
  private SubscriptionManualDiscountEntitledLinesInput entitledLines;

  public SubscriptionManualDiscountInput() {
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

  /**
   * Entitled line items used to apply the subscription discount on.
   */
  public SubscriptionManualDiscountEntitledLinesInput getEntitledLines() {
    return entitledLines;
  }

  public void setEntitledLines(SubscriptionManualDiscountEntitledLinesInput entitledLines) {
    this.entitledLines = entitledLines;
  }

  @Override
  public String toString() {
    return "SubscriptionManualDiscountInput{title='" + title + "', value='" + value + "', recurringCycleLimit='" + recurringCycleLimit + "', entitledLines='" + entitledLines + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionManualDiscountInput that = (SubscriptionManualDiscountInput) o;
    return Objects.equals(title, that.title) &&
        Objects.equals(value, that.value) &&
        Objects.equals(recurringCycleLimit, that.recurringCycleLimit) &&
        Objects.equals(entitledLines, that.entitledLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, value, recurringCycleLimit, entitledLines);
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

    /**
     * Entitled line items used to apply the subscription discount on.
     */
    private SubscriptionManualDiscountEntitledLinesInput entitledLines;

    public SubscriptionManualDiscountInput build() {
      SubscriptionManualDiscountInput result = new SubscriptionManualDiscountInput();
      result.title = this.title;
      result.value = this.value;
      result.recurringCycleLimit = this.recurringCycleLimit;
      result.entitledLines = this.entitledLines;
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

    /**
     * Entitled line items used to apply the subscription discount on.
     */
    public Builder entitledLines(SubscriptionManualDiscountEntitledLinesInput entitledLines) {
      this.entitledLines = entitledLines;
      return this;
    }
  }
}
