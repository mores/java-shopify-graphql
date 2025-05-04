package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CashRoundingAdjustmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CashRoundingAdjustmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CashRoundingAdjustment"));
  }

  public CashRoundingAdjustmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyBagProjection<CashRoundingAdjustmentProjection<PARENT, ROOT>, ROOT> paymentSet() {
     MoneyBagProjection<CashRoundingAdjustmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("paymentSet", projection);
     return projection;
  }

  public MoneyBagProjection<CashRoundingAdjustmentProjection<PARENT, ROOT>, ROOT> refundSet() {
     MoneyBagProjection<CashRoundingAdjustmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("refundSet", projection);
     return projection;
  }
}
