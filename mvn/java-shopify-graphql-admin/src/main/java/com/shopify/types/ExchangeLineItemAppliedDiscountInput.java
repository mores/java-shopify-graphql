package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for an applied discount on a calculated exchange line item.
 */
public class ExchangeLineItemAppliedDiscountInput {
  /**
   * The description of the discount.
   */
  private String description;

  /**
   * The value of the discount as a fixed amount or a percentage.
   */
  private ExchangeLineItemAppliedDiscountValueInput value;

  public ExchangeLineItemAppliedDiscountInput() {
  }

  /**
   * The description of the discount.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The value of the discount as a fixed amount or a percentage.
   */
  public ExchangeLineItemAppliedDiscountValueInput getValue() {
    return value;
  }

  public void setValue(ExchangeLineItemAppliedDiscountValueInput value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "ExchangeLineItemAppliedDiscountInput{description='" + description + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExchangeLineItemAppliedDiscountInput that = (ExchangeLineItemAppliedDiscountInput) o;
    return Objects.equals(description, that.description) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The description of the discount.
     */
    private String description;

    /**
     * The value of the discount as a fixed amount or a percentage.
     */
    private ExchangeLineItemAppliedDiscountValueInput value;

    public ExchangeLineItemAppliedDiscountInput build() {
      ExchangeLineItemAppliedDiscountInput result = new ExchangeLineItemAppliedDiscountInput();
      result.description = this.description;
      result.value = this.value;
      return result;
    }

    /**
     * The description of the discount.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * The value of the discount as a fixed amount or a percentage.
     */
    public Builder value(ExchangeLineItemAppliedDiscountValueInput value) {
      this.value = value;
      return this;
    }
  }
}
