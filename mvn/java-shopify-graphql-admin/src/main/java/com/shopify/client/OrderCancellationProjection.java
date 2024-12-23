package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderCancellationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderCancellationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderCancellation"));
  }

  public OrderCancellationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderCancellationProjection<PARENT, ROOT> staffNote() {
    getFields().put("staffNote", null);
    return this;
  }
}
