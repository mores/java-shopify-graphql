package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The quantity of items discounted, the discount value, and how the discount will be applied.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DiscountOnQuantity implements DiscountCustomerGetsValue {
  /**
   * The discount's effect on qualifying items.
   */
  private DiscountEffect effect;

  /**
   * The number of items being discounted. The customer must have at least this
   * many items of specified products or product variants in their order to be
   * eligible for the discount.
   */
  private DiscountQuantity quantity;

  public DiscountOnQuantity() {
  }

  /**
   * The discount's effect on qualifying items.
   */
  public DiscountEffect getEffect() {
    return effect;
  }

  public void setEffect(DiscountEffect effect) {
    this.effect = effect;
  }

  /**
   * The number of items being discounted. The customer must have at least this
   * many items of specified products or product variants in their order to be
   * eligible for the discount.
   */
  public DiscountQuantity getQuantity() {
    return quantity;
  }

  public void setQuantity(DiscountQuantity quantity) {
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return "DiscountOnQuantity{effect='" + effect + "', quantity='" + quantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountOnQuantity that = (DiscountOnQuantity) o;
    return Objects.equals(effect, that.effect) &&
        Objects.equals(quantity, that.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effect, quantity);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The discount's effect on qualifying items.
     */
    private DiscountEffect effect;

    /**
     * The number of items being discounted. The customer must have at least this
     * many items of specified products or product variants in their order to be
     * eligible for the discount.
     */
    private DiscountQuantity quantity;

    public DiscountOnQuantity build() {
      DiscountOnQuantity result = new DiscountOnQuantity();
      result.effect = this.effect;
      result.quantity = this.quantity;
      return result;
    }

    /**
     * The discount's effect on qualifying items.
     */
    public Builder effect(DiscountEffect effect) {
      this.effect = effect;
      return this;
    }

    /**
     * The number of items being discounted. The customer must have at least this
     * many items of specified products or product variants in their order to be
     * eligible for the discount.
     */
    public Builder quantity(DiscountQuantity quantity) {
      this.quantity = quantity;
      return this;
    }
  }
}
