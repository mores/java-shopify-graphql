package com.shopify.admin.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for discount value used for contract calculation.
 * This is a oneOf input: one, and only one, field can be provided.
 */
public class SubscriptionContractCalculationDiscountValueInput {
  /**
   * Percentage discount value (0-100).
   */
  private Integer percentage;

  /**
   * Fixed amount discount value.
   */
  private SubscriptionContractCalculationDiscountFixedAmountInput fixedAmount;

  public SubscriptionContractCalculationDiscountValueInput() {
  }

  /**
   * Percentage discount value (0-100).
   */
  public Integer getPercentage() {
    return percentage;
  }

  public void setPercentage(Integer percentage) {
    this.percentage = percentage;
  }

  /**
   * Fixed amount discount value.
   */
  public SubscriptionContractCalculationDiscountFixedAmountInput getFixedAmount() {
    return fixedAmount;
  }

  public void setFixedAmount(SubscriptionContractCalculationDiscountFixedAmountInput fixedAmount) {
    this.fixedAmount = fixedAmount;
  }

  @Override
  public String toString() {
    return "SubscriptionContractCalculationDiscountValueInput{percentage='" + percentage + "', fixedAmount='" + fixedAmount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractCalculationDiscountValueInput that = (SubscriptionContractCalculationDiscountValueInput) o;
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
     * Percentage discount value (0-100).
     */
    private Integer percentage;

    /**
     * Fixed amount discount value.
     */
    private SubscriptionContractCalculationDiscountFixedAmountInput fixedAmount;

    public SubscriptionContractCalculationDiscountValueInput build() {
      SubscriptionContractCalculationDiscountValueInput result = new SubscriptionContractCalculationDiscountValueInput();
      result.percentage = this.percentage;
      result.fixedAmount = this.fixedAmount;
      return result;
    }

    /**
     * Percentage discount value (0-100).
     */
    public Builder percentage(Integer percentage) {
      this.percentage = percentage;
      return this;
    }

    /**
     * Fixed amount discount value.
     */
    public Builder fixedAmount(
        SubscriptionContractCalculationDiscountFixedAmountInput fixedAmount) {
      this.fixedAmount = fixedAmount;
      return this;
    }
  }
}
