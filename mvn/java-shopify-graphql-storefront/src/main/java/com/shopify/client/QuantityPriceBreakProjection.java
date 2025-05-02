package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class QuantityPriceBreakProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public QuantityPriceBreakProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("QuantityPriceBreak"));
  }

  public QuantityPriceBreakProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<QuantityPriceBreakProjection<PARENT, ROOT>, ROOT> price() {
     MoneyV2Projection<QuantityPriceBreakProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("price", projection);
     return projection;
  }

  public QuantityPriceBreakProjection<PARENT, ROOT> minimumQuantity() {
    getFields().put("minimumQuantity", null);
    return this;
  }
}
