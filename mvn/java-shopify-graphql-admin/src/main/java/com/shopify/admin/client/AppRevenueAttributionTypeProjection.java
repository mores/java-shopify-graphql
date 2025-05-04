package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppRevenueAttributionTypeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppRevenueAttributionTypeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AppRevenueAttributionType"));
  }

  public AppRevenueAttributionTypeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
