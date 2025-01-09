package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A quantity of items in the context of a discount. This object can be used to
 * define the minimum quantity of items required to apply a discount.
 * Alternatively, it can be used to define the quantity of items that can be discounted.
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
