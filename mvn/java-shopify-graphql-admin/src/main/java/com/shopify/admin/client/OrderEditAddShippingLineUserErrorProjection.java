package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderEditAddShippingLineUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderEditAddShippingLineUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderEditAddShippingLineUserError"));
  }

  public OrderEditAddShippingLineUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderEditAddShippingLineUserErrorCodeProjection<OrderEditAddShippingLineUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     OrderEditAddShippingLineUserErrorCodeProjection<OrderEditAddShippingLineUserErrorProjection<PARENT, ROOT>, ROOT> projection = new OrderEditAddShippingLineUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public OrderEditAddShippingLineUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public OrderEditAddShippingLineUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
