package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a return shipping fee.
 */
public class ReturnShippingFeeInput {
  /**
   * The value of the fee as a fixed amount in the presentment currency of the order.
   */
  private MoneyInput amount;

  public ReturnShippingFeeInput() {
  }

  /**
   * The value of the fee as a fixed amount in the presentment currency of the order.
   */
  public MoneyInput getAmount() {
    return amount;
  }

  public void setAmount(MoneyInput amount) {
    this.amount = amount;
  }

  @Override
  public String toString() {
    return "ReturnShippingFeeInput{amount='" + amount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReturnShippingFeeInput that = (ReturnShippingFeeInput) o;
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
     * The value of the fee as a fixed amount in the presentment currency of the order.
     */
    private MoneyInput amount;

    public ReturnShippingFeeInput build() {
      ReturnShippingFeeInput result = new ReturnShippingFeeInput();
      result.amount = this.amount;
      return result;
    }

    /**
     * The value of the fee as a fixed amount in the presentment currency of the order.
     */
    public Builder amount(MoneyInput amount) {
      this.amount = amount;
      return this;
    }
  }
}
