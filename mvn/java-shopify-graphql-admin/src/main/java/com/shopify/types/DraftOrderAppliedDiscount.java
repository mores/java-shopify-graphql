package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The order-level discount applied to a draft order.
 */
public class DraftOrderAppliedDiscount {
  /**
   * Amount of the order-level discount that's applied to the draft order in shop currency.
   */
  private String amount;

  /**
   * The amount of money discounted, with values shown in both shop currency and presentment currency.
   */
  private MoneyBag amountSet;

  /**
   * Amount of money discounted.
   */
  private MoneyV2 amountV2;

  /**
   * Description of the order-level discount.
   */
  private String description;

  /**
   * Name of the order-level discount.
   */
  private String title;

  /**
   * The order level discount amount. If `valueType` is `"percentage"`,
   * then `value` is the percentage discount.
   */
  private double value;

  /**
   * Type of the order-level discount.
   */
  private DraftOrderAppliedDiscountType valueType;

  public DraftOrderAppliedDiscount() {
  }

  /**
   * Amount of the order-level discount that's applied to the draft order in shop currency.
   */
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  /**
   * The amount of money discounted, with values shown in both shop currency and presentment currency.
   */
  public MoneyBag getAmountSet() {
    return amountSet;
  }

  public void setAmountSet(MoneyBag amountSet) {
    this.amountSet = amountSet;
  }

  /**
   * Amount of money discounted.
   */
  public MoneyV2 getAmountV2() {
    return amountV2;
  }

  public void setAmountV2(MoneyV2 amountV2) {
    this.amountV2 = amountV2;
  }

  /**
   * Description of the order-level discount.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Name of the order-level discount.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The order level discount amount. If `valueType` is `"percentage"`,
   * then `value` is the percentage discount.
   */
  public double getValue() {
    return value;
  }

  public void setValue(double value) {
    this.value = value;
  }

  /**
   * Type of the order-level discount.
   */
  public DraftOrderAppliedDiscountType getValueType() {
    return valueType;
  }

  public void setValueType(DraftOrderAppliedDiscountType valueType) {
    this.valueType = valueType;
  }

  @Override
  public String toString() {
    return "DraftOrderAppliedDiscount{amount='" + amount + "', amountSet='" + amountSet + "', amountV2='" + amountV2 + "', description='" + description + "', title='" + title + "', value='" + value + "', valueType='" + valueType + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DraftOrderAppliedDiscount that = (DraftOrderAppliedDiscount) o;
    return Objects.equals(amount, that.amount) &&
        Objects.equals(amountSet, that.amountSet) &&
        Objects.equals(amountV2, that.amountV2) &&
        Objects.equals(description, that.description) &&
        Objects.equals(title, that.title) &&
        value == that.value &&
        Objects.equals(valueType, that.valueType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, amountSet, amountV2, description, title, value, valueType);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Amount of the order-level discount that's applied to the draft order in shop currency.
     */
    private String amount;

    /**
     * The amount of money discounted, with values shown in both shop currency and presentment currency.
     */
    private MoneyBag amountSet;

    /**
     * Amount of money discounted.
     */
    private MoneyV2 amountV2;

    /**
     * Description of the order-level discount.
     */
    private String description;

    /**
     * Name of the order-level discount.
     */
    private String title;

    /**
     * The order level discount amount. If `valueType` is `"percentage"`,
     * then `value` is the percentage discount.
     */
    private double value;

    /**
     * Type of the order-level discount.
     */
    private DraftOrderAppliedDiscountType valueType;

    public DraftOrderAppliedDiscount build() {
      DraftOrderAppliedDiscount result = new DraftOrderAppliedDiscount();
      result.amount = this.amount;
      result.amountSet = this.amountSet;
      result.amountV2 = this.amountV2;
      result.description = this.description;
      result.title = this.title;
      result.value = this.value;
      result.valueType = this.valueType;
      return result;
    }

    /**
     * Amount of the order-level discount that's applied to the draft order in shop currency.
     */
    public Builder amount(String amount) {
      this.amount = amount;
      return this;
    }

    /**
     * The amount of money discounted, with values shown in both shop currency and presentment currency.
     */
    public Builder amountSet(MoneyBag amountSet) {
      this.amountSet = amountSet;
      return this;
    }

    /**
     * Amount of money discounted.
     */
    public Builder amountV2(MoneyV2 amountV2) {
      this.amountV2 = amountV2;
      return this;
    }

    /**
     * Description of the order-level discount.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Name of the order-level discount.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The order level discount amount. If `valueType` is `"percentage"`,
     * then `value` is the percentage discount.
     */
    public Builder value(double value) {
      this.value = value;
      return this;
    }

    /**
     * Type of the order-level discount.
     */
    public Builder valueType(DraftOrderAppliedDiscountType valueType) {
      this.valueType = valueType;
      return this;
    }
  }
}
