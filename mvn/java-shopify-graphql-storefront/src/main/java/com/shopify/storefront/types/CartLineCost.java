package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The cost of the merchandise line that the buyer will pay at checkout.
 */
public class CartLineCost {
  /**
   * The amount of the merchandise line.
   */
  private MoneyV2 amountPerQuantity;

  /**
   * The compare at amount of the merchandise line.
   */
  private MoneyV2 compareAtAmountPerQuantity;

  /**
   * The cost of the merchandise line before line-level discounts.
   */
  private MoneyV2 subtotalAmount;

  /**
   * The total cost of the merchandise line.
   */
  private MoneyV2 totalAmount;

  public CartLineCost() {
  }

  /**
   * The amount of the merchandise line.
   */
  public MoneyV2 getAmountPerQuantity() {
    return amountPerQuantity;
  }

  public void setAmountPerQuantity(MoneyV2 amountPerQuantity) {
    this.amountPerQuantity = amountPerQuantity;
  }

  /**
   * The compare at amount of the merchandise line.
   */
  public MoneyV2 getCompareAtAmountPerQuantity() {
    return compareAtAmountPerQuantity;
  }

  public void setCompareAtAmountPerQuantity(MoneyV2 compareAtAmountPerQuantity) {
    this.compareAtAmountPerQuantity = compareAtAmountPerQuantity;
  }

  /**
   * The cost of the merchandise line before line-level discounts.
   */
  public MoneyV2 getSubtotalAmount() {
    return subtotalAmount;
  }

  public void setSubtotalAmount(MoneyV2 subtotalAmount) {
    this.subtotalAmount = subtotalAmount;
  }

  /**
   * The total cost of the merchandise line.
   */
  public MoneyV2 getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(MoneyV2 totalAmount) {
    this.totalAmount = totalAmount;
  }

  @Override
  public String toString() {
    return "CartLineCost{amountPerQuantity='" + amountPerQuantity + "', compareAtAmountPerQuantity='" + compareAtAmountPerQuantity + "', subtotalAmount='" + subtotalAmount + "', totalAmount='" + totalAmount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartLineCost that = (CartLineCost) o;
    return Objects.equals(amountPerQuantity, that.amountPerQuantity) &&
        Objects.equals(compareAtAmountPerQuantity, that.compareAtAmountPerQuantity) &&
        Objects.equals(subtotalAmount, that.subtotalAmount) &&
        Objects.equals(totalAmount, that.totalAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountPerQuantity, compareAtAmountPerQuantity, subtotalAmount, totalAmount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The amount of the merchandise line.
     */
    private MoneyV2 amountPerQuantity;

    /**
     * The compare at amount of the merchandise line.
     */
    private MoneyV2 compareAtAmountPerQuantity;

    /**
     * The cost of the merchandise line before line-level discounts.
     */
    private MoneyV2 subtotalAmount;

    /**
     * The total cost of the merchandise line.
     */
    private MoneyV2 totalAmount;

    public CartLineCost build() {
      CartLineCost result = new CartLineCost();
      result.amountPerQuantity = this.amountPerQuantity;
      result.compareAtAmountPerQuantity = this.compareAtAmountPerQuantity;
      result.subtotalAmount = this.subtotalAmount;
      result.totalAmount = this.totalAmount;
      return result;
    }

    /**
     * The amount of the merchandise line.
     */
    public Builder amountPerQuantity(MoneyV2 amountPerQuantity) {
      this.amountPerQuantity = amountPerQuantity;
      return this;
    }

    /**
     * The compare at amount of the merchandise line.
     */
    public Builder compareAtAmountPerQuantity(MoneyV2 compareAtAmountPerQuantity) {
      this.compareAtAmountPerQuantity = compareAtAmountPerQuantity;
      return this;
    }

    /**
     * The cost of the merchandise line before line-level discounts.
     */
    public Builder subtotalAmount(MoneyV2 subtotalAmount) {
      this.subtotalAmount = subtotalAmount;
      return this;
    }

    /**
     * The total cost of the merchandise line.
     */
    public Builder totalAmount(MoneyV2 totalAmount) {
      this.totalAmount = totalAmount;
      return this;
    }
  }
}
