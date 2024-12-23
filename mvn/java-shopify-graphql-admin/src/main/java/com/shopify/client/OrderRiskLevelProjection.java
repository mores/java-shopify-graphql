package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderRiskLevelProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderRiskLevelProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderRiskLevel"));
  }

  public OrderRiskLevelProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
