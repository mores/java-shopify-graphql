package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketCurrencySettingsUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketCurrencySettingsUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketCurrencySettingsUserError"));
  }

  public MarketCurrencySettingsUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketCurrencySettingsUserErrorCodeProjection<MarketCurrencySettingsUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     MarketCurrencySettingsUserErrorCodeProjection<MarketCurrencySettingsUserErrorProjection<PARENT, ROOT>, ROOT> projection = new MarketCurrencySettingsUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public MarketCurrencySettingsUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public MarketCurrencySettingsUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
