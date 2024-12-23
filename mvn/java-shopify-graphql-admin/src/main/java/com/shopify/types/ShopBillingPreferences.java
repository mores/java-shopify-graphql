package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Billing preferences for the shop.
 */
public class ShopBillingPreferences {
  /**
   * The currency the shop uses to pay for apps and services.
   */
  private CurrencyCode currency;

  public ShopBillingPreferences() {
  }

  /**
   * The currency the shop uses to pay for apps and services.
   */
  public CurrencyCode getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyCode currency) {
    this.currency = currency;
  }

  @Override
  public String toString() {
    return "ShopBillingPreferences{currency='" + currency + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopBillingPreferences that = (ShopBillingPreferences) o;
    return Objects.equals(currency, that.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The currency the shop uses to pay for apps and services.
     */
    private CurrencyCode currency;

    public ShopBillingPreferences build() {
      ShopBillingPreferences result = new ShopBillingPreferences();
      result.currency = this.currency;
      return result;
    }

    /**
     * The currency the shop uses to pay for apps and services.
     */
    public Builder currency(CurrencyCode currency) {
      this.currency = currency;
      return this;
    }
  }
}
