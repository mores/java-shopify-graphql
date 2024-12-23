package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for applying an order-level discount to a draft order.
 */
public class DraftOrderAppliedDiscountInput {
  /**
   * The applied amount of the discount in the specified currency.
   */
  private MoneyInput amountWithCurrency;

  /**
   * Reason for the discount.
   */
  private String description;

  /**
   * Title of the discount.
   */
  private String title;

  /**
   * The value of the discount.
   * If the type of the discount is fixed amount, then this is a fixed amount in your shop currency.
   * If the type is percentage, then this is the percentage.
   */
  private double value;

  /**
   * The type of discount.
   */
  private DraftOrderAppliedDiscountType valueType;

  public DraftOrderAppliedDiscountInput() {
  }

  /**
   * The applied amount of the discount in the specified currency.
   */
  public MoneyInput getAmountWithCurrency() {
    return amountWithCurrency;
  }

  public void setAmountWithCurrency(MoneyInput amountWithCurrency) {
    this.amountWithCurrency = amountWithCurrency;
  }

  /**
   * Reason for the discount.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Title of the discount.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The value of the discount.
   * If the type of the discount is fixed amount, then this is a fixed amount in your shop currency.
   * If the type is percentage, then this is the percentage.
   */
  public double getValue() {
    return value;
  }

  public void setValue(double value) {
    this.value = value;
  }

  /**
   * The type of discount.
   */
  public DraftOrderAppliedDiscountType getValueType() {
    return valueType;
  }

  public void setValueType(DraftOrderAppliedDiscountType valueType) {
    this.valueType = valueType;
  }

  @Override
  public String toString() {
    return "DraftOrderAppliedDiscountInput{amountWithCurrency='" + amountWithCurrency + "', description='" + description + "', title='" + title + "', value='" + value + "', valueType='" + valueType + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DraftOrderAppliedDiscountInput that = (DraftOrderAppliedDiscountInput) o;
    return Objects.equals(amountWithCurrency, that.amountWithCurrency) &&
        Objects.equals(description, that.description) &&
        Objects.equals(title, that.title) &&
        value == that.value &&
        Objects.equals(valueType, that.valueType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountWithCurrency, description, title, value, valueType);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The applied amount of the discount in the specified currency.
     */
    private MoneyInput amountWithCurrency;

    /**
     * Reason for the discount.
     */
    private String description;

    /**
     * Title of the discount.
     */
    private String title;

    /**
     * The value of the discount.
     * If the type of the discount is fixed amount, then this is a fixed amount in your shop currency.
     * If the type is percentage, then this is the percentage.
     */
    private double value;

    /**
     * The type of discount.
     */
    private DraftOrderAppliedDiscountType valueType;

    public DraftOrderAppliedDiscountInput build() {
      DraftOrderAppliedDiscountInput result = new DraftOrderAppliedDiscountInput();
      result.amountWithCurrency = this.amountWithCurrency;
      result.description = this.description;
      result.title = this.title;
      result.value = this.value;
      result.valueType = this.valueType;
      return result;
    }

    /**
     * The applied amount of the discount in the specified currency.
     */
    public Builder amountWithCurrency(MoneyInput amountWithCurrency) {
      this.amountWithCurrency = amountWithCurrency;
      return this;
    }

    /**
     * Reason for the discount.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Title of the discount.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The value of the discount.
     * If the type of the discount is fixed amount, then this is a fixed amount in your shop currency.
     * If the type is percentage, then this is the percentage.
     */
    public Builder value(double value) {
      this.value = value;
      return this;
    }

    /**
     * The type of discount.
     */
    public Builder valueType(DraftOrderAppliedDiscountType valueType) {
      this.valueType = valueType;
      return this;
    }
  }
}
