package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderTransactionEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderTransactionEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderTransactionEdge"));
  }

  public OrderTransactionEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderTransactionProjection<OrderTransactionEdgeProjection<PARENT, ROOT>, ROOT> node() {
     OrderTransactionProjection<OrderTransactionEdgeProjection<PARENT, ROOT>, ROOT> projection = new OrderTransactionProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public OrderTransactionEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
