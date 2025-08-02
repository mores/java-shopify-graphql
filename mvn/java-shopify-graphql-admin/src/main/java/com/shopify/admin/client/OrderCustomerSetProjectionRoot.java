package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderCustomerSetProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderCustomerSetProjectionRoot() {
    super(null, null, java.util.Optional.of("OrderCustomerSetPayload"));
  }

  public OrderCustomerSetProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderProjection<OrderCustomerSetProjectionRoot<PARENT, ROOT>, OrderCustomerSetProjectionRoot<PARENT, ROOT>> order(
      ) {
    OrderProjection<OrderCustomerSetProjectionRoot<PARENT, ROOT>, OrderCustomerSetProjectionRoot<PARENT, ROOT>> projection = new OrderProjection<>(this, this);    
    getFields().put("order", projection);
    return projection;
  }

  public OrderCustomerSetUserErrorProjection<OrderCustomerSetProjectionRoot<PARENT, ROOT>, OrderCustomerSetProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    OrderCustomerSetUserErrorProjection<OrderCustomerSetProjectionRoot<PARENT, ROOT>, OrderCustomerSetProjectionRoot<PARENT, ROOT>> projection = new OrderCustomerSetUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
