package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CurrencySettingProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CurrencySettingProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CurrencySetting"));
  }

  public CurrencySettingProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CurrencyCodeProjection<CurrencySettingProjection<PARENT, ROOT>, ROOT> currencyCode() {
     CurrencyCodeProjection<CurrencySettingProjection<PARENT, ROOT>, ROOT> projection = new CurrencyCodeProjection<>(this, getRoot());
     getFields().put("currencyCode", projection);
     return projection;
  }

  public CurrencySettingProjection<PARENT, ROOT> currencyName() {
    getFields().put("currencyName", null);
    return this;
  }

  public CurrencySettingProjection<PARENT, ROOT> enabled() {
    getFields().put("enabled", null);
    return this;
  }

  public CurrencySettingProjection<PARENT, ROOT> rateUpdatedAt() {
    getFields().put("rateUpdatedAt", null);
    return this;
  }
}
