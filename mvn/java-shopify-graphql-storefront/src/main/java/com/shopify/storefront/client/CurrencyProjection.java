package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CurrencyProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CurrencyProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Currency"));
  }

  public CurrencyProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CurrencyCodeProjection<CurrencyProjection<PARENT, ROOT>, ROOT> isoCode() {
     CurrencyCodeProjection<CurrencyProjection<PARENT, ROOT>, ROOT> projection = new CurrencyCodeProjection<>(this, getRoot());
     getFields().put("isoCode", projection);
     return projection;
  }

  public CurrencyProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public CurrencyProjection<PARENT, ROOT> symbol() {
    getFields().put("symbol", null);
    return this;
  }
}
