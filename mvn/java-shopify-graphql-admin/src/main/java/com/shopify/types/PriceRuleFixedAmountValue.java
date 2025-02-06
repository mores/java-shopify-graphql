package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The value of a fixed amount price rule.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class PriceRuleFixedAmountValue implements PriceRuleValue {
  /**
   * The monetary value of the price rule.
   */
  private String amount;

  public PriceRuleFixedAmountValue() {
  }

  /**
   * The monetary value of the price rule.
   */
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  @Override
  public String toString() {
    return "PriceRuleFixedAmountValue{amount='" + amount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceRuleFixedAmountValue that = (PriceRuleFixedAmountValue) o;
    return Objects.equals(amount, that.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The monetary value of the price rule.
     */
    private String amount;

    public PriceRuleFixedAmountValue build() {
      PriceRuleFixedAmountValue result = new PriceRuleFixedAmountValue();
      result.amount = this.amount;
      return result;
    }

    /**
     * The monetary value of the price rule.
     */
    public Builder amount(String amount) {
      this.amount = amount;
      return this;
    }
  }
}
