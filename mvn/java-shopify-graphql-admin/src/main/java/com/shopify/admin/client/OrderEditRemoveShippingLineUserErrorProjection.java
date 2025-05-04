package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderEditRemoveShippingLineUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderEditRemoveShippingLineUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderEditRemoveShippingLineUserError"));
  }

  public OrderEditRemoveShippingLineUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderEditRemoveShippingLineUserErrorCodeProjection<OrderEditRemoveShippingLineUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     OrderEditRemoveShippingLineUserErrorCodeProjection<OrderEditRemoveShippingLineUserErrorProjection<PARENT, ROOT>, ROOT> projection = new OrderEditRemoveShippingLineUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public OrderEditRemoveShippingLineUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public OrderEditRemoveShippingLineUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
