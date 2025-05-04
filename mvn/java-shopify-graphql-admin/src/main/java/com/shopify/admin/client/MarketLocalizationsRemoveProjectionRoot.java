package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketLocalizationsRemoveProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketLocalizationsRemoveProjectionRoot() {
    super(null, null, java.util.Optional.of("MarketLocalizationsRemovePayload"));
  }

  public MarketLocalizationsRemoveProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketLocalizationProjection<MarketLocalizationsRemoveProjectionRoot<PARENT, ROOT>, MarketLocalizationsRemoveProjectionRoot<PARENT, ROOT>> marketLocalizations(
      ) {
    MarketLocalizationProjection<MarketLocalizationsRemoveProjectionRoot<PARENT, ROOT>, MarketLocalizationsRemoveProjectionRoot<PARENT, ROOT>> projection = new MarketLocalizationProjection<>(this, this);    
    getFields().put("marketLocalizations", projection);
    return projection;
  }

  public TranslationUserErrorProjection<MarketLocalizationsRemoveProjectionRoot<PARENT, ROOT>, MarketLocalizationsRemoveProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    TranslationUserErrorProjection<MarketLocalizationsRemoveProjectionRoot<PARENT, ROOT>, MarketLocalizationsRemoveProjectionRoot<PARENT, ROOT>> projection = new TranslationUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
