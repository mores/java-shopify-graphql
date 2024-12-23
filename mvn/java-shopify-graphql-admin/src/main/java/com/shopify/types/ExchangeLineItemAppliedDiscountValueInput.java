package com.shopify.types;

import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input value for an applied discount on a calculated exchange line item.
 * Can either specify the value as a fixed amount or a percentage.
 */
public class ExchangeLineItemAppliedDiscountValueInput {
  /**
   * The value of the discount as a fixed amount.
   */
  private MoneyInput amount;

  /**
   * The value of the discount as a percentage.
   */
  private Double percentage;

  public ExchangeLineItemAppliedDiscountValueInput() {
  }

  /**
   * The value of the discount as a fixed amount.
   */
  public MoneyInput getAmount() {
    return amount;
  }

  public void setAmount(MoneyInput amount) {
    this.amount = amount;
  }

  /**
   * The value of the discount as a percentage.
   */
  public Double getPercentage() {
    return percentage;
  }

  public void setPercentage(Double percentage) {
    this.percentage = percentage;
  }

  @Override
  public String toString() {
    return "ExchangeLineItemAppliedDiscountValueInput{amount='" + amount + "', percentage='" + percentage + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExchangeLineItemAppliedDiscountValueInput that = (ExchangeLineItemAppliedDiscountValueInput) o;
    return Objects.equals(amount, that.amount) &&
        Objects.equals(percentage, that.percentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, percentage);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The value of the discount as a fixed amount.
     */
    private MoneyInput amount;

    /**
     * The value of the discount as a percentage.
     */
    private Double percentage;

    public ExchangeLineItemAppliedDiscountValueInput build() {
      ExchangeLineItemAppliedDiscountValueInput result = new ExchangeLineItemAppliedDiscountValueInput();
      result.amount = this.amount;
      result.percentage = this.percentage;
      return result;
    }

    /**
     * The value of the discount as a fixed amount.
     */
    public Builder amount(MoneyInput amount) {
      this.amount = amount;
      return this;
    }

    /**
     * The value of the discount as a percentage.
     */
    public Builder percentage(Double percentage) {
      this.percentage = percentage;
      return this;
    }
  }
}
