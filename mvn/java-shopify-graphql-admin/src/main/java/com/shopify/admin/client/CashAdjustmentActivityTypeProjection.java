package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CashAdjustmentActivityTypeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CashAdjustmentActivityTypeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CashAdjustmentActivityType"));
  }

  public CashAdjustmentActivityTypeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
