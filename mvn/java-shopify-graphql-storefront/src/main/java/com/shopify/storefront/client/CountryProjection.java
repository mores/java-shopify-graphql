package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CountryProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CountryProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Country"));
  }

  public CountryProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LanguageProjection<CountryProjection<PARENT, ROOT>, ROOT> availableLanguages() {
     LanguageProjection<CountryProjection<PARENT, ROOT>, ROOT> projection = new LanguageProjection<>(this, getRoot());
     getFields().put("availableLanguages", projection);
     return projection;
  }

  public CurrencyProjection<CountryProjection<PARENT, ROOT>, ROOT> currency() {
     CurrencyProjection<CountryProjection<PARENT, ROOT>, ROOT> projection = new CurrencyProjection<>(this, getRoot());
     getFields().put("currency", projection);
     return projection;
  }

  public LanguageProjection<CountryProjection<PARENT, ROOT>, ROOT> defaultLanguage() {
     LanguageProjection<CountryProjection<PARENT, ROOT>, ROOT> projection = new LanguageProjection<>(this, getRoot());
     getFields().put("defaultLanguage", projection);
     return projection;
  }

  public CountryCodeProjection<CountryProjection<PARENT, ROOT>, ROOT> isoCode() {
     CountryCodeProjection<CountryProjection<PARENT, ROOT>, ROOT> projection = new CountryCodeProjection<>(this, getRoot());
     getFields().put("isoCode", projection);
     return projection;
  }

  public MarketProjection<CountryProjection<PARENT, ROOT>, ROOT> market() {
     MarketProjection<CountryProjection<PARENT, ROOT>, ROOT> projection = new MarketProjection<>(this, getRoot());
     getFields().put("market", projection);
     return projection;
  }

  public UnitSystemProjection<CountryProjection<PARENT, ROOT>, ROOT> unitSystem() {
     UnitSystemProjection<CountryProjection<PARENT, ROOT>, ROOT> projection = new UnitSystemProjection<>(this, getRoot());
     getFields().put("unitSystem", projection);
     return projection;
  }

  public CountryProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }
}
