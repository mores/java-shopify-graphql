package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MoneyV2Projection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MoneyV2Projection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MoneyV2"));
  }

  public MoneyV2Projection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CurrencyCodeProjection<MoneyV2Projection<PARENT, ROOT>, ROOT> currencyCode() {
     CurrencyCodeProjection<MoneyV2Projection<PARENT, ROOT>, ROOT> projection = new CurrencyCodeProjection<>(this, getRoot());
     getFields().put("currencyCode", projection);
     return projection;
  }

  public MoneyV2Projection<PARENT, ROOT> amount() {
    getFields().put("amount", null);
    return this;
  }
}
