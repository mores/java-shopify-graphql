package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SellingPlanIntervalProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SellingPlanIntervalProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SellingPlanInterval"));
  }

  public SellingPlanIntervalProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
