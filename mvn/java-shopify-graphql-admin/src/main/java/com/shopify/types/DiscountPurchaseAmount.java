package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A purchase amount in the context of a discount. This object can be used to
 * define the minimum purchase amount required for a discount to be applicable.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DiscountPurchaseAmount implements DiscountCustomerBuysValue {
  /**
   * The purchase amount in decimal format.
   */
  private String amount;

  public DiscountPurchaseAmount() {
  }

  /**
   * The purchase amount in decimal format.
   */
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  @Override
  public String toString() {
    return "DiscountPurchaseAmount{amount='" + amount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountPurchaseAmount that = (DiscountPurchaseAmount) o;
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
     * The purchase amount in decimal format.
     */
    private String amount;

    public DiscountPurchaseAmount build() {
      DiscountPurchaseAmount result = new DiscountPurchaseAmount();
      result.amount = this.amount;
      return result;
    }

    /**
     * The purchase amount in decimal format.
     */
    public Builder amount(String amount) {
      this.amount = amount;
      return this;
    }
  }
}
