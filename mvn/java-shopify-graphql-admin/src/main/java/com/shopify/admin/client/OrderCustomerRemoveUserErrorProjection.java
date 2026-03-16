package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderCustomerRemoveUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderCustomerRemoveUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderCustomerRemoveUserError"));
  }

  public OrderCustomerRemoveUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderCustomerRemoveUserErrorCodeProjection<OrderCustomerRemoveUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     OrderCustomerRemoveUserErrorCodeProjection<OrderCustomerRemoveUserErrorProjection<PARENT, ROOT>, ROOT> projection = new OrderCustomerRemoveUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public OrderCustomerRemoveUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public OrderCustomerRemoveUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
