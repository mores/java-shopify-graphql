package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderDisplayFulfillmentStatusProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderDisplayFulfillmentStatusProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderDisplayFulfillmentStatus"));
  }

  public OrderDisplayFulfillmentStatusProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
