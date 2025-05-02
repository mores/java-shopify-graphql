package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Settings related to payments.
 */
public class PaymentSettings {
  /**
   * List of the card brands which the business entity accepts.
   */
  private List<CardBrand> acceptedCardBrands;

  /**
   * The url pointing to the endpoint to vault credit cards.
   */
  private String cardVaultUrl;

  /**
   * The country where the shop is located. When multiple business entities operate
   * within the shop, then this will represent the country of the business entity
   * that's serving the specified buyer context.
   */
  private CountryCode countryCode;

  /**
   * The three-letter code for the shop's primary currency.
   */
  private CurrencyCode currencyCode;

  /**
   * A list of enabled currencies (ISO 4217 format) that the shop accepts.
   * Merchants can enable currencies from their Shopify Payments settings in the Shopify admin.
   */
  private List<CurrencyCode> enabledPresentmentCurrencies;

  /**
   * The shop’s Shopify Payments account ID.
   */
  private String shopifyPaymentsAccountId;

  /**
   * List of the digital wallets which the business entity supports.
   */
  private List<DigitalWallet> supportedDigitalWallets;

  public PaymentSettings() {
  }

  /**
   * List of the card brands which the business entity accepts.
   */
  public List<CardBrand> getAcceptedCardBrands() {
    return acceptedCardBrands;
  }

  public void setAcceptedCardBrands(List<CardBrand> acceptedCardBrands) {
    this.acceptedCardBrands = acceptedCardBrands;
  }

  /**
   * The url pointing to the endpoint to vault credit cards.
   */
  public String getCardVaultUrl() {
    return cardVaultUrl;
  }

  public void setCardVaultUrl(String cardVaultUrl) {
    this.cardVaultUrl = cardVaultUrl;
  }

  /**
   * The country where the shop is located. When multiple business entities operate
   * within the shop, then this will represent the country of the business entity
   * that's serving the specified buyer context.
   */
  public CountryCode getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(CountryCode countryCode) {
    this.countryCode = countryCode;
  }

  /**
   * The three-letter code for the shop's primary currency.
   */
  public CurrencyCode getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(CurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
  }

  /**
   * A list of enabled currencies (ISO 4217 format) that the shop accepts.
   * Merchants can enable currencies from their Shopify Payments settings in the Shopify admin.
   */
  public List<CurrencyCode> getEnabledPresentmentCurrencies() {
    return enabledPresentmentCurrencies;
  }

  public void setEnabledPresentmentCurrencies(List<CurrencyCode> enabledPresentmentCurrencies) {
    this.enabledPresentmentCurrencies = enabledPresentmentCurrencies;
  }

  /**
   * The shop’s Shopify Payments account ID.
   */
  public String getShopifyPaymentsAccountId() {
    return shopifyPaymentsAccountId;
  }

  public void setShopifyPaymentsAccountId(String shopifyPaymentsAccountId) {
    this.shopifyPaymentsAccountId = shopifyPaymentsAccountId;
  }

  /**
   * List of the digital wallets which the business entity supports.
   */
  public List<DigitalWallet> getSupportedDigitalWallets() {
    return supportedDigitalWallets;
  }

  public void setSupportedDigitalWallets(List<DigitalWallet> supportedDigitalWallets) {
    this.supportedDigitalWallets = supportedDigitalWallets;
  }

  @Override
  public String toString() {
    return "PaymentSettings{acceptedCardBrands='" + acceptedCardBrands + "', cardVaultUrl='" + cardVaultUrl + "', countryCode='" + countryCode + "', currencyCode='" + currencyCode + "', enabledPresentmentCurrencies='" + enabledPresentmentCurrencies + "', shopifyPaymentsAccountId='" + shopifyPaymentsAccountId + "', supportedDigitalWallets='" + supportedDigitalWallets + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PaymentSettings that = (PaymentSettings) o;
    return Objects.equals(acceptedCardBrands, that.acceptedCardBrands) &&
        Objects.equals(cardVaultUrl, that.cardVaultUrl) &&
        Objects.equals(countryCode, that.countryCode) &&
        Objects.equals(currencyCode, that.currencyCode) &&
        Objects.equals(enabledPresentmentCurrencies, that.enabledPresentmentCurrencies) &&
        Objects.equals(shopifyPaymentsAccountId, that.shopifyPaymentsAccountId) &&
        Objects.equals(supportedDigitalWallets, that.supportedDigitalWallets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptedCardBrands, cardVaultUrl, countryCode, currencyCode, enabledPresentmentCurrencies, shopifyPaymentsAccountId, supportedDigitalWallets);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * List of the card brands which the business entity accepts.
     */
    private List<CardBrand> acceptedCardBrands;

    /**
     * The url pointing to the endpoint to vault credit cards.
     */
    private String cardVaultUrl;

    /**
     * The country where the shop is located. When multiple business entities operate
     * within the shop, then this will represent the country of the business entity
     * that's serving the specified buyer context.
     */
    private CountryCode countryCode;

    /**
     * The three-letter code for the shop's primary currency.
     */
    private CurrencyCode currencyCode;

    /**
     * A list of enabled currencies (ISO 4217 format) that the shop accepts.
     * Merchants can enable currencies from their Shopify Payments settings in the Shopify admin.
     */
    private List<CurrencyCode> enabledPresentmentCurrencies;

    /**
     * The shop’s Shopify Payments account ID.
     */
    private String shopifyPaymentsAccountId;

    /**
     * List of the digital wallets which the business entity supports.
     */
    private List<DigitalWallet> supportedDigitalWallets;

    public PaymentSettings build() {
      PaymentSettings result = new PaymentSettings();
      result.acceptedCardBrands = this.acceptedCardBrands;
      result.cardVaultUrl = this.cardVaultUrl;
      result.countryCode = this.countryCode;
      result.currencyCode = this.currencyCode;
      result.enabledPresentmentCurrencies = this.enabledPresentmentCurrencies;
      result.shopifyPaymentsAccountId = this.shopifyPaymentsAccountId;
      result.supportedDigitalWallets = this.supportedDigitalWallets;
      return result;
    }

    /**
     * List of the card brands which the business entity accepts.
     */
    public Builder acceptedCardBrands(List<CardBrand> acceptedCardBrands) {
      this.acceptedCardBrands = acceptedCardBrands;
      return this;
    }

    /**
     * The url pointing to the endpoint to vault credit cards.
     */
    public Builder cardVaultUrl(String cardVaultUrl) {
      this.cardVaultUrl = cardVaultUrl;
      return this;
    }

    /**
     * The country where the shop is located. When multiple business entities operate
     * within the shop, then this will represent the country of the business entity
     * that's serving the specified buyer context.
     */
    public Builder countryCode(CountryCode countryCode) {
      this.countryCode = countryCode;
      return this;
    }

    /**
     * The three-letter code for the shop's primary currency.
     */
    public Builder currencyCode(CurrencyCode currencyCode) {
      this.currencyCode = currencyCode;
      return this;
    }

    /**
     * A list of enabled currencies (ISO 4217 format) that the shop accepts.
     * Merchants can enable currencies from their Shopify Payments settings in the Shopify admin.
     */
    public Builder enabledPresentmentCurrencies(List<CurrencyCode> enabledPresentmentCurrencies) {
      this.enabledPresentmentCurrencies = enabledPresentmentCurrencies;
      return this;
    }

    /**
     * The shop’s Shopify Payments account ID.
     */
    public Builder shopifyPaymentsAccountId(String shopifyPaymentsAccountId) {
      this.shopifyPaymentsAccountId = shopifyPaymentsAccountId;
      return this;
    }

    /**
     * List of the digital wallets which the business entity supports.
     */
    public Builder supportedDigitalWallets(List<DigitalWallet> supportedDigitalWallets) {
      this.supportedDigitalWallets = supportedDigitalWallets;
      return this;
    }
  }
}
