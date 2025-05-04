package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderEditUpdateShippingLineUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderEditUpdateShippingLineUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderEditUpdateShippingLineUserError"));
  }

  public OrderEditUpdateShippingLineUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderEditUpdateShippingLineUserErrorCodeProjection<OrderEditUpdateShippingLineUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     OrderEditUpdateShippingLineUserErrorCodeProjection<OrderEditUpdateShippingLineUserErrorProjection<PARENT, ROOT>, ROOT> projection = new OrderEditUpdateShippingLineUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public OrderEditUpdateShippingLineUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public OrderEditUpdateShippingLineUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
