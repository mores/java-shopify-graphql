package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderEditRemoveDiscountUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderEditRemoveDiscountUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderEditRemoveDiscountUserError"));
  }

  public OrderEditRemoveDiscountUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderEditRemoveDiscountUserErrorCodeProjection<OrderEditRemoveDiscountUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     OrderEditRemoveDiscountUserErrorCodeProjection<OrderEditRemoveDiscountUserErrorProjection<PARENT, ROOT>, ROOT> projection = new OrderEditRemoveDiscountUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public OrderEditRemoveDiscountUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public OrderEditRemoveDiscountUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
