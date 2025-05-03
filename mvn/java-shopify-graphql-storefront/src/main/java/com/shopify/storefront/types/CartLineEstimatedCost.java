package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The estimated cost of the merchandise line that the buyer will pay at checkout.
 */
public class CartLineEstimatedCost {
  /**
   * The amount of the merchandise line.
   */
  private MoneyV2 amount;

  /**
   * The compare at amount of the merchandise line.
   */
  private MoneyV2 compareAtAmount;

  /**
   * The estimated cost of the merchandise line before discounts.
   */
  private MoneyV2 subtotalAmount;

  /**
   * The estimated total cost of the merchandise line.
   */
  private MoneyV2 totalAmount;

  public CartLineEstimatedCost() {
  }

  /**
   * The amount of the merchandise line.
   */
  public MoneyV2 getAmount() {
    return amount;
  }

  public void setAmount(MoneyV2 amount) {
    this.amount = amount;
  }

  /**
   * The compare at amount of the merchandise line.
   */
  public MoneyV2 getCompareAtAmount() {
    return compareAtAmount;
  }

  public void setCompareAtAmount(MoneyV2 compareAtAmount) {
    this.compareAtAmount = compareAtAmount;
  }

  /**
   * The estimated cost of the merchandise line before discounts.
   */
  public MoneyV2 getSubtotalAmount() {
    return subtotalAmount;
  }

  public void setSubtotalAmount(MoneyV2 subtotalAmount) {
    this.subtotalAmount = subtotalAmount;
  }

  /**
   * The estimated total cost of the merchandise line.
   */
  public MoneyV2 getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(MoneyV2 totalAmount) {
    this.totalAmount = totalAmount;
  }

  @Override
  public String toString() {
    return "CartLineEstimatedCost{amount='" + amount + "', compareAtAmount='" + compareAtAmount + "', subtotalAmount='" + subtotalAmount + "', totalAmount='" + totalAmount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartLineEstimatedCost that = (CartLineEstimatedCost) o;
    return Objects.equals(amount, that.amount) &&
        Objects.equals(compareAtAmount, that.compareAtAmount) &&
        Objects.equals(subtotalAmount, that.subtotalAmount) &&
        Objects.equals(totalAmount, that.totalAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, compareAtAmount, subtotalAmount, totalAmount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The amount of the merchandise line.
     */
    private MoneyV2 amount;

    /**
     * The compare at amount of the merchandise line.
     */
    private MoneyV2 compareAtAmount;

    /**
     * The estimated cost of the merchandise line before discounts.
     */
    private MoneyV2 subtotalAmount;

    /**
     * The estimated total cost of the merchandise line.
     */
    private MoneyV2 totalAmount;

    public CartLineEstimatedCost build() {
      CartLineEstimatedCost result = new CartLineEstimatedCost();
      result.amount = this.amount;
      result.compareAtAmount = this.compareAtAmount;
      result.subtotalAmount = this.subtotalAmount;
      result.totalAmount = this.totalAmount;
      return result;
    }

    /**
     * The amount of the merchandise line.
     */
    public Builder amount(MoneyV2 amount) {
      this.amount = amount;
      return this;
    }

    /**
     * The compare at amount of the merchandise line.
     */
    public Builder compareAtAmount(MoneyV2 compareAtAmount) {
      this.compareAtAmount = compareAtAmount;
      return this;
    }

    /**
     * The estimated cost of the merchandise line before discounts.
     */
    public Builder subtotalAmount(MoneyV2 subtotalAmount) {
      this.subtotalAmount = subtotalAmount;
      return this;
    }

    /**
     * The estimated total cost of the merchandise line.
     */
    public Builder totalAmount(MoneyV2 totalAmount) {
      this.totalAmount = totalAmount;
      return this;
    }
  }
}
