package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SellingPlanFixedDeliveryPolicyIntentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SellingPlanFixedDeliveryPolicyIntentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SellingPlanFixedDeliveryPolicyIntent"));
  }

  public SellingPlanFixedDeliveryPolicyIntentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
