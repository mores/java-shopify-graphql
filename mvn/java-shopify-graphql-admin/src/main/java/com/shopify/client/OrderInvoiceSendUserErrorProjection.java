package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderInvoiceSendUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderInvoiceSendUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderInvoiceSendUserError"));
  }

  public OrderInvoiceSendUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderInvoiceSendUserErrorCodeProjection<OrderInvoiceSendUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     OrderInvoiceSendUserErrorCodeProjection<OrderInvoiceSendUserErrorProjection<PARENT, ROOT>, ROOT> projection = new OrderInvoiceSendUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public OrderInvoiceSendUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public OrderInvoiceSendUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
