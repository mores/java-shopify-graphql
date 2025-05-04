package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderAdjustmentConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderAdjustmentConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderAdjustmentConnection"));
  }

  public OrderAdjustmentConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderAdjustmentEdgeProjection<OrderAdjustmentConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     OrderAdjustmentEdgeProjection<OrderAdjustmentConnectionProjection<PARENT, ROOT>, ROOT> projection = new OrderAdjustmentEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public OrderAdjustmentProjection<OrderAdjustmentConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     OrderAdjustmentProjection<OrderAdjustmentConnectionProjection<PARENT, ROOT>, ROOT> projection = new OrderAdjustmentProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<OrderAdjustmentConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<OrderAdjustmentConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
