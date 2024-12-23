package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderInvoiceSendProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderInvoiceSendProjectionRoot() {
    super(null, null, java.util.Optional.of("OrderInvoiceSendPayload"));
  }

  public OrderInvoiceSendProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderProjection<OrderInvoiceSendProjectionRoot<PARENT, ROOT>, OrderInvoiceSendProjectionRoot<PARENT, ROOT>> order(
      ) {
    OrderProjection<OrderInvoiceSendProjectionRoot<PARENT, ROOT>, OrderInvoiceSendProjectionRoot<PARENT, ROOT>> projection = new OrderProjection<>(this, this);    
    getFields().put("order", projection);
    return projection;
  }

  public OrderInvoiceSendUserErrorProjection<OrderInvoiceSendProjectionRoot<PARENT, ROOT>, OrderInvoiceSendProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    OrderInvoiceSendUserErrorProjection<OrderInvoiceSendProjectionRoot<PARENT, ROOT>, OrderInvoiceSendProjectionRoot<PARENT, ROOT>> projection = new OrderInvoiceSendUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
