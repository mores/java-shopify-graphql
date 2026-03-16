package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderCustomerRemoveProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderCustomerRemoveProjectionRoot() {
    super(null, null, java.util.Optional.of("OrderCustomerRemovePayload"));
  }

  public OrderCustomerRemoveProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderProjection<OrderCustomerRemoveProjectionRoot<PARENT, ROOT>, OrderCustomerRemoveProjectionRoot<PARENT, ROOT>> order(
      ) {
    OrderProjection<OrderCustomerRemoveProjectionRoot<PARENT, ROOT>, OrderCustomerRemoveProjectionRoot<PARENT, ROOT>> projection = new OrderProjection<>(this, this);    
    getFields().put("order", projection);
    return projection;
  }

  public OrderCustomerRemoveUserErrorProjection<OrderCustomerRemoveProjectionRoot<PARENT, ROOT>, OrderCustomerRemoveProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    OrderCustomerRemoveUserErrorProjection<OrderCustomerRemoveProjectionRoot<PARENT, ROOT>, OrderCustomerRemoveProjectionRoot<PARENT, ROOT>> projection = new OrderCustomerRemoveUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
