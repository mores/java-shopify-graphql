package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SellingPlanFulfillmentTriggerProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SellingPlanFulfillmentTriggerProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SellingPlanFulfillmentTrigger"));
  }

  public SellingPlanFulfillmentTriggerProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
