package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The minimum subtotal required for the discount to apply.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DiscountMinimumSubtotal implements DiscountMinimumRequirement {
  /**
   * The minimum subtotal that's required for the discount to be applied.
   */
  private MoneyV2 greaterThanOrEqualToSubtotal;

  public DiscountMinimumSubtotal() {
  }

  /**
   * The minimum subtotal that's required for the discount to be applied.
   */
  public MoneyV2 getGreaterThanOrEqualToSubtotal() {
    return greaterThanOrEqualToSubtotal;
  }

  public void setGreaterThanOrEqualToSubtotal(MoneyV2 greaterThanOrEqualToSubtotal) {
    this.greaterThanOrEqualToSubtotal = greaterThanOrEqualToSubtotal;
  }

  @Override
  public String toString() {
    return "DiscountMinimumSubtotal{greaterThanOrEqualToSubtotal='" + greaterThanOrEqualToSubtotal + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountMinimumSubtotal that = (DiscountMinimumSubtotal) o;
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
    private MoneyV2 greaterThanOrEqualToSubtotal;

    public DiscountMinimumSubtotal build() {
      DiscountMinimumSubtotal result = new DiscountMinimumSubtotal();
      result.greaterThanOrEqualToSubtotal = this.greaterThanOrEqualToSubtotal;
      return result;
    }

    /**
     * The minimum subtotal that's required for the discount to be applied.
     */
    public Builder greaterThanOrEqualToSubtotal(MoneyV2 greaterThanOrEqualToSubtotal) {
      this.greaterThanOrEqualToSubtotal = greaterThanOrEqualToSubtotal;
      return this;
    }
  }
}
