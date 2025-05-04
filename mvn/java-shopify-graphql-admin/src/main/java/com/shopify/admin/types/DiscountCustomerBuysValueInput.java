package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for prerequisite quantity or minimum purchase amount required for the discount.
 */
public class DiscountCustomerBuysValueInput {
  /**
   * The quantity of prerequisite items.
   */
  private String quantity;

  /**
   * The prerequisite minimum purchase amount required for the discount to be applicable.
   */
  private String amount;

  public DiscountCustomerBuysValueInput() {
  }

  /**
   * The quantity of prerequisite items.
   */
  public String getQuantity() {
    return quantity;
  }

  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }

  /**
   * The prerequisite minimum purchase amount required for the discount to be applicable.
   */
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  @Override
  public String toString() {
    return "DiscountCustomerBuysValueInput{quantity='" + quantity + "', amount='" + amount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCustomerBuysValueInput that = (DiscountCustomerBuysValueInput) o;
    return Objects.equals(quantity, that.quantity) &&
        Objects.equals(amount, that.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, amount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The quantity of prerequisite items.
     */
    private String quantity;

    /**
     * The prerequisite minimum purchase amount required for the discount to be applicable.
     */
    private String amount;

    public DiscountCustomerBuysValueInput build() {
      DiscountCustomerBuysValueInput result = new DiscountCustomerBuysValueInput();
      result.quantity = this.quantity;
      result.amount = this.amount;
      return result;
    }

    /**
     * The quantity of prerequisite items.
     */
    public Builder quantity(String quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * The prerequisite minimum purchase amount required for the discount to be applicable.
     */
    public Builder amount(String amount) {
      this.amount = amount;
      return this;
    }
  }
}
