package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a monetary value with currency.
 */
public class MoneyInput {
  /**
   * Decimal money amount.
   */
  private String amount;

  /**
   * Currency of the money.
   */
  private CurrencyCode currencyCode;

  public MoneyInput() {
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
    return "MoneyInput{amount='" + amount + "', currencyCode='" + currencyCode + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MoneyInput that = (MoneyInput) o;
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

    public MoneyInput build() {
      MoneyInput result = new MoneyInput();
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
