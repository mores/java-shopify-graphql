package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderCustomerSetUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderCustomerSetUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderCustomerSetUserError"));
  }

  public OrderCustomerSetUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderCustomerSetUserErrorCodeProjection<OrderCustomerSetUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     OrderCustomerSetUserErrorCodeProjection<OrderCustomerSetUserErrorProjection<PARENT, ROOT>, ROOT> projection = new OrderCustomerSetUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public OrderCustomerSetUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public OrderCustomerSetUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
