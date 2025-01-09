package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for mapping a subscription line to a discount.
 */
public class SubscriptionAtomicLineInput {
  /**
   * The new subscription line.
   */
  private SubscriptionLineInput line;

  /**
   * The discount to be added to the subscription line.
   */
  private List<SubscriptionAtomicManualDiscountInput> discounts;

  public SubscriptionAtomicLineInput() {
  }

  /**
   * The new subscription line.
   */
  public SubscriptionLineInput getLine() {
    return line;
  }

  public void setLine(SubscriptionLineInput line) {
    this.line = line;
  }

  /**
   * The discount to be added to the subscription line.
   */
  public List<SubscriptionAtomicManualDiscountInput> getDiscounts() {
    return discounts;
  }

  public void setDiscounts(List<SubscriptionAtomicManualDiscountInput> discounts) {
    this.discounts = discounts;
  }

  @Override
  public String toString() {
    return "SubscriptionAtomicLineInput{line='" + line + "', discounts='" + discounts + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionAtomicLineInput that = (SubscriptionAtomicLineInput) o;
    return Objects.equals(line, that.line) &&
        Objects.equals(discounts, that.discounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(line, discounts);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The new subscription line.
     */
    private SubscriptionLineInput line;

    /**
     * The discount to be added to the subscription line.
     */
    private List<SubscriptionAtomicManualDiscountInput> discounts;

    public SubscriptionAtomicLineInput build() {
      SubscriptionAtomicLineInput result = new SubscriptionAtomicLineInput();
      result.line = this.line;
      result.discounts = this.discounts;
      return result;
    }

    /**
     * The new subscription line.
     */
    public Builder line(SubscriptionLineInput line) {
      this.line = line;
      return this;
    }

    /**
     * The discount to be added to the subscription line.
     */
    public Builder discounts(List<SubscriptionAtomicManualDiscountInput> discounts) {
      this.discounts = discounts;
      return this;
    }
  }
}
