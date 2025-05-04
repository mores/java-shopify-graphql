package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A monetary value with currency.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class MoneyV2 implements DeliveryConditionCriteria, PricingValue, SellingPlanCheckoutChargeValue, SellingPlanPricingPolicyAdjustmentValue {
  /**
   * Decimal money amount.
   */
  private String amount;

  /**
   * Currency of the money.
   */
  private CurrencyCode currencyCode;

  public MoneyV2() {
  }

  /**
   * Decimal money amount.
   */
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  /**
   * Currency of the money.
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
     * Decimal money amount.
     */
    private String amount;

    /**
     * Currency of the money.
     */
    private CurrencyCode currencyCode;

    public MoneyV2 build() {
      MoneyV2 result = new MoneyV2();
      result.amount = this.amount;
      result.currencyCode = this.currencyCode;
      return result;
    }

    /**
     * Decimal money amount.
     */
    public Builder amount(String amount) {
      this.amount = amount;
      return this;
    }

    /**
     * Currency of the money.
     */
    public Builder currencyCode(CurrencyCode currencyCode) {
      this.currencyCode = currencyCode;
      return this;
    }
  }
}
