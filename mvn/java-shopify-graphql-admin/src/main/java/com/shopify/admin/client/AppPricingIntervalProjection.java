package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppPricingIntervalProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppPricingIntervalProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AppPricingInterval"));
  }

  public AppPricingIntervalProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
