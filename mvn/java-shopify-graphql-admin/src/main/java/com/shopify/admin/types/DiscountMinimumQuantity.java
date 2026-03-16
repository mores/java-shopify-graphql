package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Specifies the minimum item quantity required for discount eligibility, helping
 * merchants create volume-based promotions that encourage larger purchases. This
 * threshold applies to qualifying items in the customer's cart.
 *
 * For example, a "Buy 3, Get 10% Off" promotion would set the minimum quantity to 3 items.
 *
 * Learn more about [discount requirements](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountApplication).
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DiscountMinimumQuantity implements DiscountMinimumRequirement {
  /**
   * The minimum quantity of items that's required for the discount to be applied.
   */
  private String greaterThanOrEqualToQuantity;

  public DiscountMinimumQuantity() {
  }

  /**
   * The minimum quantity of items that's required for the discount to be applied.
   */
  public String getGreaterThanOrEqualToQuantity() {
    return greaterThanOrEqualToQuantity;
  }

  public void setGreaterThanOrEqualToQuantity(String greaterThanOrEqualToQuantity) {
    this.greaterThanOrEqualToQuantity = greaterThanOrEqualToQuantity;
  }

  @Override
  public String toString() {
    return "DiscountMinimumQuantity{greaterThanOrEqualToQuantity='" + greaterThanOrEqualToQuantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountMinimumQuantity that = (DiscountMinimumQuantity) o;
    return Objects.equals(greaterThanOrEqualToQuantity, that.greaterThanOrEqualToQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(greaterThanOrEqualToQuantity);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The minimum quantity of items that's required for the discount to be applied.
     */
    private String greaterThanOrEqualToQuantity;

    public DiscountMinimumQuantity build() {
      DiscountMinimumQuantity result = new DiscountMinimumQuantity();
      result.greaterThanOrEqualToQuantity = this.greaterThanOrEqualToQuantity;
      return result;
    }

    /**
     * The minimum quantity of items that's required for the discount to be applied.
     */
    public Builder greaterThanOrEqualToQuantity(String greaterThanOrEqualToQuantity) {
      this.greaterThanOrEqualToQuantity = greaterThanOrEqualToQuantity;
      return this;
    }
  }
}
