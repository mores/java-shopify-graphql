package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PaymentSettingsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PaymentSettingsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PaymentSettings"));
  }

  public PaymentSettingsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CardBrandProjection<PaymentSettingsProjection<PARENT, ROOT>, ROOT> acceptedCardBrands() {
     CardBrandProjection<PaymentSettingsProjection<PARENT, ROOT>, ROOT> projection = new CardBrandProjection<>(this, getRoot());
     getFields().put("acceptedCardBrands", projection);
     return projection;
  }

  public CountryCodeProjection<PaymentSettingsProjection<PARENT, ROOT>, ROOT> countryCode() {
     CountryCodeProjection<PaymentSettingsProjection<PARENT, ROOT>, ROOT> projection = new CountryCodeProjection<>(this, getRoot());
     getFields().put("countryCode", projection);
     return projection;
  }

  public CurrencyCodeProjection<PaymentSettingsProjection<PARENT, ROOT>, ROOT> currencyCode() {
     CurrencyCodeProjection<PaymentSettingsProjection<PARENT, ROOT>, ROOT> projection = new CurrencyCodeProjection<>(this, getRoot());
     getFields().put("currencyCode", projection);
     return projection;
  }

  public CurrencyCodeProjection<PaymentSettingsProjection<PARENT, ROOT>, ROOT> enabledPresentmentCurrencies(
      ) {
     CurrencyCodeProjection<PaymentSettingsProjection<PARENT, ROOT>, ROOT> projection = new CurrencyCodeProjection<>(this, getRoot());
     getFields().put("enabledPresentmentCurrencies", projection);
     return projection;
  }

  public DigitalWalletProjection<PaymentSettingsProjection<PARENT, ROOT>, ROOT> supportedDigitalWallets(
      ) {
     DigitalWalletProjection<PaymentSettingsProjection<PARENT, ROOT>, ROOT> projection = new DigitalWalletProjection<>(this, getRoot());
     getFields().put("supportedDigitalWallets", projection);
     return projection;
  }

  public PaymentSettingsProjection<PARENT, ROOT> cardVaultUrl() {
    getFields().put("cardVaultUrl", null);
    return this;
  }

  public PaymentSettingsProjection<PARENT, ROOT> shopifyPaymentsAccountId() {
    getFields().put("shopifyPaymentsAccountId", null);
    return this;
  }
}
