package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketCurrencySettingsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketCurrencySettingsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketCurrencySettings"));
  }

  public MarketCurrencySettingsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CurrencySettingProjection<MarketCurrencySettingsProjection<PARENT, ROOT>, ROOT> baseCurrency(
      ) {
     CurrencySettingProjection<MarketCurrencySettingsProjection<PARENT, ROOT>, ROOT> projection = new CurrencySettingProjection<>(this, getRoot());
     getFields().put("baseCurrency", projection);
     return projection;
  }

  public MarketCurrencySettingsProjection<PARENT, ROOT> localCurrencies() {
    getFields().put("localCurrencies", null);
    return this;
  }

  public MarketCurrencySettingsProjection<PARENT, ROOT> roundingEnabled() {
    getFields().put("roundingEnabled", null);
    return this;
  }
}
