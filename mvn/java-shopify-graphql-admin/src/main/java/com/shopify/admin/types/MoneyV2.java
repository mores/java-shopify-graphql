package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A precise monetary value and its associated currency. For example, 12.99 USD.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class MoneyV2 implements DeliveryConditionCriteria, PricingValue, SellingPlanCheckoutChargeValue, SellingPlanPricingPolicyAdjustmentValue {
  /**
   * A monetary value in decimal format, allowing for precise representation of cents or fractional
   * currency. For example, 12.99.
   */
  private String amount;

  /**
   * The three-letter currency code that represents a world currency used in a store. Currency codes
   * include standard [standard ISO 4217 codes](https://en.wikipedia.org/wiki/ISO_4217), legacy codes,
   * and non-standard codes. For example, USD.
   */
  private CurrencyCode currencyCode;

  public MoneyV2() {
  }

  /**
   * A monetary value in decimal format, allowing for precise representation of cents or fractional
   * currency. For example, 12.99.
   */
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  /**
   * The three-letter currency code that represents a world currency used in a store. Currency codes
   * include standard [standard ISO 4217 codes](https://en.wikipedia.org/wiki/ISO_4217), legacy codes,
   * and non-standard codes. For example, USD.
   */
  public CurrencyCode getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(CurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
  }

  @Override
  public String toString() {
    return "MoneyV2{amount='" + amount + "', currencyCode='" + currencyCode + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MoneyV2 that = (MoneyV2) o;
    return Objects.equals(amount, that.amount) &&
        Objects.equals(currencyCode, that.currencyCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currencyCode);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A monetary value in decimal format, allowing for precise representation of cents or fractional
     * currency. For example, 12.99.
     */
    private String amount;

    /**
     * The three-letter currency code that represents a world currency used in a store. Currency codes
     * include standard [standard ISO 4217 codes](https://en.wikipedia.org/wiki/ISO_4217), legacy codes,
     * and non-standard codes. For example, USD.
     */
    private CurrencyCode currencyCode;

    public MoneyV2 build() {
      MoneyV2 result = new MoneyV2();
      result.amount = this.amount;
      result.currencyCode = this.currencyCode;
      return result;
    }

    /**
     * A monetary value in decimal format, allowing for precise representation of cents or fractional
     * currency. For example, 12.99.
     */
    public Builder amount(String amount) {
      this.amount = amount;
      return this;
    }

    /**
     * The three-letter currency code that represents a world currency used in a store. Currency codes
     * include standard [standard ISO 4217 codes](https://en.wikipedia.org/wiki/ISO_4217), legacy codes,
     * and non-standard codes. For example, USD.
     */
    public Builder currencyCode(CurrencyCode currencyCode) {
      this.currencyCode = currencyCode;
      return this;
    }
  }
}
