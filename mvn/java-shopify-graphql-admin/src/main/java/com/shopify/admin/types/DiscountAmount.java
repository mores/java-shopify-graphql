package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The fixed amount value of a discount, and whether the amount is applied to each
 * entitled item or spread evenly across the entitled items.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DiscountAmount implements DiscountCustomerGetsValue, DiscountEffect {
  /**
   * The value of the discount.
   */
  private MoneyV2 amount;

  /**
   * If true, then the discount is applied to each of the entitled items. If false,
   * then the amount is split across all of the entitled items.
   */
  private boolean appliesOnEachItem;

  public DiscountAmount() {
  }

  /**
   * The value of the discount.
   */
  public MoneyV2 getAmount() {
    return amount;
  }

  public void setAmount(MoneyV2 amount) {
    this.amount = amount;
  }

  /**
   * If true, then the discount is applied to each of the entitled items. If false,
   * then the amount is split across all of the entitled items.
   */
  public boolean getAppliesOnEachItem() {
    return appliesOnEachItem;
  }

  public void setAppliesOnEachItem(boolean appliesOnEachItem) {
    this.appliesOnEachItem = appliesOnEachItem;
  }

  @Override
  public String toString() {
    return "DiscountAmount{amount='" + amount + "', appliesOnEachItem='" + appliesOnEachItem + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountAmount that = (DiscountAmount) o;
    return Objects.equals(amount, that.amount) &&
        appliesOnEachItem == that.appliesOnEachItem;
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
    private MoneyV2 amount;

    /**
     * If true, then the discount is applied to each of the entitled items. If false,
     * then the amount is split across all of the entitled items.
     */
    private boolean appliesOnEachItem;

    public DiscountAmount build() {
      DiscountAmount result = new DiscountAmount();
      result.amount = this.amount;
      result.appliesOnEachItem = this.appliesOnEachItem;
      return result;
    }

    /**
     * The value of the discount.
     */
    public Builder amount(MoneyV2 amount) {
      this.amount = amount;
      return this;
    }

    /**
     * If true, then the discount is applied to each of the entitled items. If false,
     * then the amount is split across all of the entitled items.
     */
    public Builder appliesOnEachItem(boolean appliesOnEachItem) {
      this.appliesOnEachItem = appliesOnEachItem;
      return this;
    }
  }
}
