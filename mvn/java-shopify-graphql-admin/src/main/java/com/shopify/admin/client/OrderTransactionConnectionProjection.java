package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderTransactionConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderTransactionConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderTransactionConnection"));
  }

  public OrderTransactionConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderTransactionEdgeProjection<OrderTransactionConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     OrderTransactionEdgeProjection<OrderTransactionConnectionProjection<PARENT, ROOT>, ROOT> projection = new OrderTransactionEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public OrderTransactionProjection<OrderTransactionConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     OrderTransactionProjection<OrderTransactionConnectionProjection<PARENT, ROOT>, ROOT> projection = new OrderTransactionProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<OrderTransactionConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<OrderTransactionConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
