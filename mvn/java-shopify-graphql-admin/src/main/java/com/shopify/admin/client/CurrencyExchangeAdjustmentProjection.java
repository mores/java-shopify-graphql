package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CurrencyExchangeAdjustmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CurrencyExchangeAdjustmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CurrencyExchangeAdjustment"));
  }

  public CurrencyExchangeAdjustmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<CurrencyExchangeAdjustmentProjection<PARENT, ROOT>, ROOT> adjustment() {
     MoneyV2Projection<CurrencyExchangeAdjustmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("adjustment", projection);
     return projection;
  }

  public MoneyV2Projection<CurrencyExchangeAdjustmentProjection<PARENT, ROOT>, ROOT> finalAmountSet(
      ) {
     MoneyV2Projection<CurrencyExchangeAdjustmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("finalAmountSet", projection);
     return projection;
  }

  public MoneyV2Projection<CurrencyExchangeAdjustmentProjection<PARENT, ROOT>, ROOT> originalAmountSet(
      ) {
     MoneyV2Projection<CurrencyExchangeAdjustmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("originalAmountSet", projection);
     return projection;
  }

  public CurrencyExchangeAdjustmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
