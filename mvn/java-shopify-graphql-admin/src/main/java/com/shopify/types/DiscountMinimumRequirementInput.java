package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for the minimum quantity or subtotal required for a discount.
 */
public class DiscountMinimumRequirementInput {
  /**
   * The minimum required quantity.
   */
  private DiscountMinimumQuantityInput quantity;

  /**
   * The minimum required subtotal.
   */
  private DiscountMinimumSubtotalInput subtotal;

  public DiscountMinimumRequirementInput() {
  }

  /**
   * The minimum required quantity.
   */
  public DiscountMinimumQuantityInput getQuantity() {
    return quantity;
  }

  public void setQuantity(DiscountMinimumQuantityInput quantity) {
    this.quantity = quantity;
  }

  /**
   * The minimum required subtotal.
   */
  public DiscountMinimumSubtotalInput getSubtotal() {
    return subtotal;
  }

  public void setSubtotal(DiscountMinimumSubtotalInput subtotal) {
    this.subtotal = subtotal;
  }

  @Override
  public String toString() {
    return "DiscountMinimumRequirementInput{quantity='" + quantity + "', subtotal='" + subtotal + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountMinimumRequirementInput that = (DiscountMinimumRequirementInput) o;
    return Objects.equals(quantity, that.quantity) &&
        Objects.equals(subtotal, that.subtotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, subtotal);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The minimum required quantity.
     */
    private DiscountMinimumQuantityInput quantity;

    /**
     * The minimum required subtotal.
     */
    private DiscountMinimumSubtotalInput subtotal;

    public DiscountMinimumRequirementInput build() {
      DiscountMinimumRequirementInput result = new DiscountMinimumRequirementInput();
      result.quantity = this.quantity;
      result.subtotal = this.subtotal;
      return result;
    }

    /**
     * The minimum required quantity.
     */
    public Builder quantity(DiscountMinimumQuantityInput quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * The minimum required subtotal.
     */
    public Builder subtotal(DiscountMinimumSubtotalInput subtotal) {
      this.subtotal = subtotal;
      return this;
    }
  }
}
