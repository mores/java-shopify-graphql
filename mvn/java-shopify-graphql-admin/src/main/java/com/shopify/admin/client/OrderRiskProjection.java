package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderRiskProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderRiskProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderRisk"));
  }

  public OrderRiskProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderRiskLevelProjection<OrderRiskProjection<PARENT, ROOT>, ROOT> level() {
     OrderRiskLevelProjection<OrderRiskProjection<PARENT, ROOT>, ROOT> projection = new OrderRiskLevelProjection<>(this, getRoot());
     getFields().put("level", projection);
     return projection;
  }

  public OrderRiskProjection<PARENT, ROOT> display() {
    getFields().put("display", null);
    return this;
  }

  public OrderRiskProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
