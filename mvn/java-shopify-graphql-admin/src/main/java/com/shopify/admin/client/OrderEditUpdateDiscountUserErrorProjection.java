package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderEditUpdateDiscountUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderEditUpdateDiscountUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderEditUpdateDiscountUserError"));
  }

  public OrderEditUpdateDiscountUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderEditUpdateDiscountUserErrorCodeProjection<OrderEditUpdateDiscountUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     OrderEditUpdateDiscountUserErrorCodeProjection<OrderEditUpdateDiscountUserErrorProjection<PARENT, ROOT>, ROOT> projection = new OrderEditUpdateDiscountUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public OrderEditUpdateDiscountUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public OrderEditUpdateDiscountUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
