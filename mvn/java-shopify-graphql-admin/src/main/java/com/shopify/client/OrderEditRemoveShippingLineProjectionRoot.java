package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderEditRemoveShippingLineProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderEditRemoveShippingLineProjectionRoot() {
    super(null, null, java.util.Optional.of("OrderEditRemoveShippingLinePayload"));
  }

  public OrderEditRemoveShippingLineProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CalculatedOrderProjection<OrderEditRemoveShippingLineProjectionRoot<PARENT, ROOT>, OrderEditRemoveShippingLineProjectionRoot<PARENT, ROOT>> calculatedOrder(
      ) {
    CalculatedOrderProjection<OrderEditRemoveShippingLineProjectionRoot<PARENT, ROOT>, OrderEditRemoveShippingLineProjectionRoot<PARENT, ROOT>> projection = new CalculatedOrderProjection<>(this, this);    
    getFields().put("calculatedOrder", projection);
    return projection;
  }

  public OrderEditRemoveShippingLineUserErrorProjection<OrderEditRemoveShippingLineProjectionRoot<PARENT, ROOT>, OrderEditRemoveShippingLineProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    OrderEditRemoveShippingLineUserErrorProjection<OrderEditRemoveShippingLineProjectionRoot<PARENT, ROOT>, OrderEditRemoveShippingLineProjectionRoot<PARENT, ROOT>> projection = new OrderEditRemoveShippingLineUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
