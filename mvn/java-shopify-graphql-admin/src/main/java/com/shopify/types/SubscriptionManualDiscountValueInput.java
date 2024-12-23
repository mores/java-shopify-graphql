package com.shopify.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for the discount value and its distribution.
 */
public class SubscriptionManualDiscountValueInput {
  /**
   * The percentage value of the discount. Value must be between 0 - 100.
   */
  private Integer percentage;

  /**
   * Fixed amount input in the currency defined by the subscription.
   */
  private SubscriptionManualDiscountFixedAmountInput fixedAmount;

  public SubscriptionManualDiscountValueInput() {
  }

  /**
   * The percentage value of the discount. Value must be between 0 - 100.
   */
  public Integer getPercentage() {
    return percentage;
  }

  public void setPercentage(Integer percentage) {
    this.percentage = percentage;
  }

  /**
   * Fixed amount input in the currency defined by the subscription.
   */
  public SubscriptionManualDiscountFixedAmountInput getFixedAmount() {
    return fixedAmount;
  }

  public void setFixedAmount(SubscriptionManualDiscountFixedAmountInput fixedAmount) {
    this.fixedAmount = fixedAmount;
  }

  @Override
  public String toString() {
    return "SubscriptionManualDiscountValueInput{percentage='" + percentage + "', fixedAmount='" + fixedAmount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionManualDiscountValueInput that = (SubscriptionManualDiscountValueInput) o;
    return Objects.equals(percentage, that.percentage) &&
        Objects.equals(fixedAmount, that.fixedAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(percentage, fixedAmount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The percentage value of the discount. Value must be between 0 - 100.
     */
    private Integer percentage;

    /**
     * Fixed amount input in the currency defined by the subscription.
     */
    private SubscriptionManualDiscountFixedAmountInput fixedAmount;

    public SubscriptionManualDiscountValueInput build() {
      SubscriptionManualDiscountValueInput result = new SubscriptionManualDiscountValueInput();
      result.percentage = this.percentage;
      result.fixedAmount = this.fixedAmount;
      return result;
    }

    /**
     * The percentage value of the discount. Value must be between 0 - 100.
     */
    public Builder percentage(Integer percentage) {
      this.percentage = percentage;
      return this;
    }

    /**
     * Fixed amount input in the currency defined by the subscription.
     */
    public Builder fixedAmount(SubscriptionManualDiscountFixedAmountInput fixedAmount) {
      this.fixedAmount = fixedAmount;
      return this;
    }
  }
}
