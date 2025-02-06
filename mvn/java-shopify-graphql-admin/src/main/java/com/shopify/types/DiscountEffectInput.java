package com.shopify.types;

import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for how the discount will be applied. Currently, only percentage off is supported.
 */
public class DiscountEffectInput {
  /**
   * The percentage value of the discount. Value must be between 0.00 - 1.00.
   */
  private Double percentage;

  /**
   * The value of the discount.
   */
  private String amount;

  public DiscountEffectInput() {
  }

  /**
   * The percentage value of the discount. Value must be between 0.00 - 1.00.
   */
  public Double getPercentage() {
    return percentage;
  }

  public void setPercentage(Double percentage) {
    this.percentage = percentage;
  }

  /**
   * The value of the discount.
   */
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  @Override
  public String toString() {
    return "DiscountEffectInput{percentage='" + percentage + "', amount='" + amount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountEffectInput that = (DiscountEffectInput) o;
    return Objects.equals(percentage, that.percentage) &&
        Objects.equals(amount, that.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(percentage, amount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The percentage value of the discount. Value must be between 0.00 - 1.00.
     */
    private Double percentage;

    /**
     * The value of the discount.
     */
    private String amount;

    public DiscountEffectInput build() {
      DiscountEffectInput result = new DiscountEffectInput();
      result.percentage = this.percentage;
      result.amount = this.amount;
      return result;
    }

    /**
     * The percentage value of the discount. Value must be between 0.00 - 1.00.
     */
    public Builder percentage(Double percentage) {
      this.percentage = percentage;
      return this;
    }

    /**
     * The value of the discount.
     */
    public Builder amount(String amount) {
      this.amount = amount;
      return this;
    }
  }
}
