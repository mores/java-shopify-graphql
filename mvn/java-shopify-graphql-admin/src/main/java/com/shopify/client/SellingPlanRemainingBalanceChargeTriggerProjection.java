package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SellingPlanRemainingBalanceChargeTriggerProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SellingPlanRemainingBalanceChargeTriggerProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SellingPlanRemainingBalanceChargeTrigger"));
  }

  public SellingPlanRemainingBalanceChargeTriggerProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
