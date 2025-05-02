package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PaymentSettingsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PaymentSettingsProjectionRoot() {
    super(null, null, java.util.Optional.of("PaymentSettings"));
  }

  public PaymentSettingsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CardBrandProjection<PaymentSettingsProjectionRoot<PARENT, ROOT>, PaymentSettingsProjectionRoot<PARENT, ROOT>> acceptedCardBrands(
      ) {
    CardBrandProjection<PaymentSettingsProjectionRoot<PARENT, ROOT>, PaymentSettingsProjectionRoot<PARENT, ROOT>> projection = new CardBrandProjection<>(this, this);    
    getFields().put("acceptedCardBrands", projection);
    return projection;
  }

  public CountryCodeProjection<PaymentSettingsProjectionRoot<PARENT, ROOT>, PaymentSettingsProjectionRoot<PARENT, ROOT>> countryCode(
      ) {
    CountryCodeProjection<PaymentSettingsProjectionRoot<PARENT, ROOT>, PaymentSettingsProjectionRoot<PARENT, ROOT>> projection = new CountryCodeProjection<>(this, this);    
    getFields().put("countryCode", projection);
    return projection;
  }

  public CurrencyCodeProjection<PaymentSettingsProjectionRoot<PARENT, ROOT>, PaymentSettingsProjectionRoot<PARENT, ROOT>> currencyCode(
      ) {
    CurrencyCodeProjection<PaymentSettingsProjectionRoot<PARENT, ROOT>, PaymentSettingsProjectionRoot<PARENT, ROOT>> projection = new CurrencyCodeProjection<>(this, this);    
    getFields().put("currencyCode", projection);
    return projection;
  }

  public CurrencyCodeProjection<PaymentSettingsProjectionRoot<PARENT, ROOT>, PaymentSettingsProjectionRoot<PARENT, ROOT>> enabledPresentmentCurrencies(
      ) {
    CurrencyCodeProjection<PaymentSettingsProjectionRoot<PARENT, ROOT>, PaymentSettingsProjectionRoot<PARENT, ROOT>> projection = new CurrencyCodeProjection<>(this, this);    
    getFields().put("enabledPresentmentCurrencies", projection);
    return projection;
  }

  public DigitalWalletProjection<PaymentSettingsProjectionRoot<PARENT, ROOT>, PaymentSettingsProjectionRoot<PARENT, ROOT>> supportedDigitalWallets(
      ) {
    DigitalWalletProjection<PaymentSettingsProjectionRoot<PARENT, ROOT>, PaymentSettingsProjectionRoot<PARENT, ROOT>> projection = new DigitalWalletProjection<>(this, this);    
    getFields().put("supportedDigitalWallets", projection);
    return projection;
  }

  public PaymentSettingsProjectionRoot<PARENT, ROOT> cardVaultUrl() {
    getFields().put("cardVaultUrl", null);
    return this;
  }

  public PaymentSettingsProjectionRoot<PARENT, ROOT> shopifyPaymentsAccountId() {
    getFields().put("shopifyPaymentsAccountId", null);
    return this;
  }
}
