package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketCurrencySettingsUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketCurrencySettingsUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("MarketCurrencySettingsUpdatePayload"));
  }

  public MarketCurrencySettingsUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketProjection<MarketCurrencySettingsUpdateProjectionRoot<PARENT, ROOT>, MarketCurrencySettingsUpdateProjectionRoot<PARENT, ROOT>> market(
      ) {
    MarketProjection<MarketCurrencySettingsUpdateProjectionRoot<PARENT, ROOT>, MarketCurrencySettingsUpdateProjectionRoot<PARENT, ROOT>> projection = new MarketProjection<>(this, this);    
    getFields().put("market", projection);
    return projection;
  }

  public MarketCurrencySettingsUserErrorProjection<MarketCurrencySettingsUpdateProjectionRoot<PARENT, ROOT>, MarketCurrencySettingsUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    MarketCurrencySettingsUserErrorProjection<MarketCurrencySettingsUpdateProjectionRoot<PARENT, ROOT>, MarketCurrencySettingsUpdateProjectionRoot<PARENT, ROOT>> projection = new MarketCurrencySettingsUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
