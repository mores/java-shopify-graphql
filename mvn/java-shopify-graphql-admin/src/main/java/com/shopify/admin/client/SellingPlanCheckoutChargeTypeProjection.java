package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SellingPlanCheckoutChargeTypeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SellingPlanCheckoutChargeTypeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SellingPlanCheckoutChargeType"));
  }

  public SellingPlanCheckoutChargeTypeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
