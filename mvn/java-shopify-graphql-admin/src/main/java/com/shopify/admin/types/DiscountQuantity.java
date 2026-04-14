package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Defines a quantity threshold for discount eligibility or application. This
 * simple object specifies the number of items required to trigger or calculate
 * discount benefits.
 *
 * For example, a "Buy 3, Get 1 Free" promotion would use DiscountQuantity to
 * define the minimum purchase quantity of 3 items, or a bulk discount might
 * specify quantity tiers like 10+ items for wholesale pricing.
 *
 * The quantity value determines how discounts interact with cart contents, whether
 * setting minimum purchase requirements or defining quantity-based discount calculations.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DiscountQuantity implements DiscountCustomerBuysValue {
  /**
   * The quantity of items.
   */
  private String quantity;

  public DiscountQuantity() {
  }

  /**
   * The quantity of items.
   */
  public String getQuantity() {
    return quantity;
  }

  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return "DiscountQuantity{quantity='" + quantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountQuantity that = (DiscountQuantity) o;
    return Objects.equals(quantity, that.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The quantity of items.
     */
    private String quantity;

    public DiscountQuantity build() {
      DiscountQuantity result = new DiscountQuantity();
      result.quantity = this.quantity;
      return result;
    }

    /**
     * The quantity of items.
     */
    public Builder quantity(String quantity) {
      this.quantity = quantity;
      return this;
    }
  }
}
