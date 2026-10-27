package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The gift card configuration settings for a
 * [`Product`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product),
 * including the
 * [`issuanceCurrency`](https://shopify.dev/docs/api/admin-graphql/latest/objects/GiftCardProductSettings#field-GiftCardProductSettings.fields.issuanceCurrency)
 * and whether the gift card can be redeemed across currencies via
 * [`crossCurrencyRedeemable`](https://shopify.dev/docs/api/admin-graphql/latest/objects/GiftCardProductSettings#field-GiftCardProductSettings.fields.crossCurrencyRedeemable).
 * Configure these settings when creating a gift card product with the
 * [`giftCardProductSet`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/giftCardProductSet)
 * mutation.
 */
public class GiftCardProductSettings {
  /**
   * Whether the gift card can be redeemed in currencies other than the issuance currency.
   */
  private boolean crossCurrencyRedeemable;

  /**
   * The currency in which the gift card fulfilled by this product is issued.
   * When this field isn't set the gift card will be issued in the shop's currency,
   * the return value of this field will be `null`.
   * When this field is set the gift card product can only be purchased in the
   * issuance currency. A checkout violation will prevent purchases if the checkout
   * currency doesn't match the issuance currency.
   * Extra care should be taken to only publish a gift card product with an
   * issuance currency in markets where that currency can be guaranteed.
   */
  private CurrencyCode issuanceCurrency;

  public GiftCardProductSettings() {
  }

  /**
   * Whether the gift card can be redeemed in currencies other than the issuance currency.
   */
  public boolean getCrossCurrencyRedeemable() {
    return crossCurrencyRedeemable;
  }

  public void setCrossCurrencyRedeemable(boolean crossCurrencyRedeemable) {
    this.crossCurrencyRedeemable = crossCurrencyRedeemable;
  }

  /**
   * The currency in which the gift card fulfilled by this product is issued.
   * When this field isn't set the gift card will be issued in the shop's currency,
   * the return value of this field will be `null`.
   * When this field is set the gift card product can only be purchased in the
   * issuance currency. A checkout violation will prevent purchases if the checkout
   * currency doesn't match the issuance currency.
   * Extra care should be taken to only publish a gift card product with an
   * issuance currency in markets where that currency can be guaranteed.
   */
  public CurrencyCode getIssuanceCurrency() {
    return issuanceCurrency;
  }

  public void setIssuanceCurrency(CurrencyCode issuanceCurrency) {
    this.issuanceCurrency = issuanceCurrency;
  }

  @Override
  public String toString() {
    return "GiftCardProductSettings{crossCurrencyRedeemable='" + crossCurrencyRedeemable + "', issuanceCurrency='" + issuanceCurrency + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GiftCardProductSettings that = (GiftCardProductSettings) o;
    return crossCurrencyRedeemable == that.crossCurrencyRedeemable &&
        Objects.equals(issuanceCurrency, that.issuanceCurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(crossCurrencyRedeemable, issuanceCurrency);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether the gift card can be redeemed in currencies other than the issuance currency.
     */
    private boolean crossCurrencyRedeemable;

    /**
     * The currency in which the gift card fulfilled by this product is issued.
     * When this field isn't set the gift card will be issued in the shop's currency,
     * the return value of this field will be `null`.
     * When this field is set the gift card product can only be purchased in the
     * issuance currency. A checkout violation will prevent purchases if the checkout
     * currency doesn't match the issuance currency.
     * Extra care should be taken to only publish a gift card product with an
     * issuance currency in markets where that currency can be guaranteed.
     */
    private CurrencyCode issuanceCurrency;

    public GiftCardProductSettings build() {
      GiftCardProductSettings result = new GiftCardProductSettings();
      result.crossCurrencyRedeemable = this.crossCurrencyRedeemable;
      result.issuanceCurrency = this.issuanceCurrency;
      return result;
    }

    /**
     * Whether the gift card can be redeemed in currencies other than the issuance currency.
     */
    public Builder crossCurrencyRedeemable(boolean crossCurrencyRedeemable) {
      this.crossCurrencyRedeemable = crossCurrencyRedeemable;
      return this;
    }

    /**
     * The currency in which the gift card fulfilled by this product is issued.
     * When this field isn't set the gift card will be issued in the shop's currency,
     * the return value of this field will be `null`.
     * When this field is set the gift card product can only be purchased in the
     * issuance currency. A checkout violation will prevent purchases if the checkout
     * currency doesn't match the issuance currency.
     * Extra care should be taken to only publish a gift card product with an
     * issuance currency in markets where that currency can be guaranteed.
     */
    public Builder issuanceCurrency(CurrencyCode issuanceCurrency) {
      this.issuanceCurrency = issuanceCurrency;
      return this;
    }
  }
}
