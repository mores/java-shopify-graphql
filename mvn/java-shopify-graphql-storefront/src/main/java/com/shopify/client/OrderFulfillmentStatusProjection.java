package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderFulfillmentStatusProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderFulfillmentStatusProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderFulfillmentStatus"));
  }

  public OrderFulfillmentStatusProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
