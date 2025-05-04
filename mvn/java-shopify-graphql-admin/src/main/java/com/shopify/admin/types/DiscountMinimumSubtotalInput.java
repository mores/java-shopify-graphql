package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for the minimum subtotal required for a discount.
 */
public class DiscountMinimumSubtotalInput {
  /**
   * The minimum subtotal that's required for the discount to be applied.
   */
  private String greaterThanOrEqualToSubtotal;

  public DiscountMinimumSubtotalInput() {
  }

  /**
   * The minimum subtotal that's required for the discount to be applied.
   */
  public String getGreaterThanOrEqualToSubtotal() {
    return greaterThanOrEqualToSubtotal;
  }

  public void setGreaterThanOrEqualToSubtotal(String greaterThanOrEqualToSubtotal) {
    this.greaterThanOrEqualToSubtotal = greaterThanOrEqualToSubtotal;
  }

  @Override
  public String toString() {
    return "DiscountMinimumSubtotalInput{greaterThanOrEqualToSubtotal='" + greaterThanOrEqualToSubtotal + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountMinimumSubtotalInput that = (DiscountMinimumSubtotalInput) o;
    return Objects.equals(greaterThanOrEqualToSubtotal, that.greaterThanOrEqualToSubtotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(greaterThanOrEqualToSubtotal);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The minimum subtotal that's required for the discount to be applied.
     */
    private String greaterThanOrEqualToSubtotal;

    public DiscountMinimumSubtotalInput build() {
      DiscountMinimumSubtotalInput result = new DiscountMinimumSubtotalInput();
      result.greaterThanOrEqualToSubtotal = this.greaterThanOrEqualToSubtotal;
      return result;
    }

    /**
     * The minimum subtotal that's required for the discount to be applied.
     */
    public Builder greaterThanOrEqualToSubtotal(String greaterThanOrEqualToSubtotal) {
      this.greaterThanOrEqualToSubtotal = greaterThanOrEqualToSubtotal;
      return this;
    }
  }
}
