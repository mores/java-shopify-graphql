package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for the value of the discount and how it is applied.
 */
public class DiscountAmountInput {
  /**
   * The value of the discount.
   */
  private String amount;

  /**
   * If true, then the discount is applied to each of the entitled items. If false,
   * then the amount is split across all of the entitled items.
   */
  private Boolean appliesOnEachItem;

  public DiscountAmountInput() {
  }

  /**
   * The value of the discount.
   */
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  /**
   * If true, then the discount is applied to each of the entitled items. If false,
   * then the amount is split across all of the entitled items.
   */
  public Boolean getAppliesOnEachItem() {
    return appliesOnEachItem;
  }

  public void setAppliesOnEachItem(Boolean appliesOnEachItem) {
    this.appliesOnEachItem = appliesOnEachItem;
  }

  @Override
  public String toString() {
    return "DiscountAmountInput{amount='" + amount + "', appliesOnEachItem='" + appliesOnEachItem + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountAmountInput that = (DiscountAmountInput) o;
    return Objects.equals(amount, that.amount) &&
        Objects.equals(appliesOnEachItem, that.appliesOnEachItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, appliesOnEachItem);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The value of the discount.
     */
    private String amount;

    /**
     * If true, then the discount is applied to each of the entitled items. If false,
     * then the amount is split across all of the entitled items.
     */
    private Boolean appliesOnEachItem;

    public DiscountAmountInput build() {
      DiscountAmountInput result = new DiscountAmountInput();
      result.amount = this.amount;
      result.appliesOnEachItem = this.appliesOnEachItem;
      return result;
    }

    /**
     * The value of the discount.
     */
    public Builder amount(String amount) {
      this.amount = amount;
      return this;
    }

    /**
     * If true, then the discount is applied to each of the entitled items. If false,
     * then the amount is split across all of the entitled items.
     */
    public Builder appliesOnEachItem(Boolean appliesOnEachItem) {
      this.appliesOnEachItem = appliesOnEachItem;
      return this;
    }
  }
}
