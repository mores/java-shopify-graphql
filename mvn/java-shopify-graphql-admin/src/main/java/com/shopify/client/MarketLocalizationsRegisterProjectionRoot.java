package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketLocalizationsRegisterProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketLocalizationsRegisterProjectionRoot() {
    super(null, null, java.util.Optional.of("MarketLocalizationsRegisterPayload"));
  }

  public MarketLocalizationsRegisterProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketLocalizationProjection<MarketLocalizationsRegisterProjectionRoot<PARENT, ROOT>, MarketLocalizationsRegisterProjectionRoot<PARENT, ROOT>> marketLocalizations(
      ) {
    MarketLocalizationProjection<MarketLocalizationsRegisterProjectionRoot<PARENT, ROOT>, MarketLocalizationsRegisterProjectionRoot<PARENT, ROOT>> projection = new MarketLocalizationProjection<>(this, this);    
    getFields().put("marketLocalizations", projection);
    return projection;
  }

  public TranslationUserErrorProjection<MarketLocalizationsRegisterProjectionRoot<PARENT, ROOT>, MarketLocalizationsRegisterProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    TranslationUserErrorProjection<MarketLocalizationsRegisterProjectionRoot<PARENT, ROOT>, MarketLocalizationsRegisterProjectionRoot<PARENT, ROOT>> projection = new TranslationUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
