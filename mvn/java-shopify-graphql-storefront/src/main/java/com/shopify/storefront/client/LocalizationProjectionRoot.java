package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class LocalizationProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public LocalizationProjectionRoot() {
    super(null, null, java.util.Optional.of("Localization"));
  }

  public LocalizationProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountryProjection<LocalizationProjectionRoot<PARENT, ROOT>, LocalizationProjectionRoot<PARENT, ROOT>> availableCountries(
      ) {
    CountryProjection<LocalizationProjectionRoot<PARENT, ROOT>, LocalizationProjectionRoot<PARENT, ROOT>> projection = new CountryProjection<>(this, this);    
    getFields().put("availableCountries", projection);
    return projection;
  }

  public LanguageProjection<LocalizationProjectionRoot<PARENT, ROOT>, LocalizationProjectionRoot<PARENT, ROOT>> availableLanguages(
      ) {
    LanguageProjection<LocalizationProjectionRoot<PARENT, ROOT>, LocalizationProjectionRoot<PARENT, ROOT>> projection = new LanguageProjection<>(this, this);    
    getFields().put("availableLanguages", projection);
    return projection;
  }

  public CountryProjection<LocalizationProjectionRoot<PARENT, ROOT>, LocalizationProjectionRoot<PARENT, ROOT>> country(
      ) {
    CountryProjection<LocalizationProjectionRoot<PARENT, ROOT>, LocalizationProjectionRoot<PARENT, ROOT>> projection = new CountryProjection<>(this, this);    
    getFields().put("country", projection);
    return projection;
  }

  public LanguageProjection<LocalizationProjectionRoot<PARENT, ROOT>, LocalizationProjectionRoot<PARENT, ROOT>> language(
      ) {
    LanguageProjection<LocalizationProjectionRoot<PARENT, ROOT>, LocalizationProjectionRoot<PARENT, ROOT>> projection = new LanguageProjection<>(this, this);    
    getFields().put("language", projection);
    return projection;
  }

  public MarketProjection<LocalizationProjectionRoot<PARENT, ROOT>, LocalizationProjectionRoot<PARENT, ROOT>> market(
      ) {
    MarketProjection<LocalizationProjectionRoot<PARENT, ROOT>, LocalizationProjectionRoot<PARENT, ROOT>> projection = new MarketProjection<>(this, this);    
    getFields().put("market", projection);
    return projection;
  }
}
