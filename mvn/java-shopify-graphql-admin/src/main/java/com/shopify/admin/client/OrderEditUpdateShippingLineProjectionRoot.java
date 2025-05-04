package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderEditUpdateShippingLineProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderEditUpdateShippingLineProjectionRoot() {
    super(null, null, java.util.Optional.of("OrderEditUpdateShippingLinePayload"));
  }

  public OrderEditUpdateShippingLineProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CalculatedOrderProjection<OrderEditUpdateShippingLineProjectionRoot<PARENT, ROOT>, OrderEditUpdateShippingLineProjectionRoot<PARENT, ROOT>> calculatedOrder(
      ) {
    CalculatedOrderProjection<OrderEditUpdateShippingLineProjectionRoot<PARENT, ROOT>, OrderEditUpdateShippingLineProjectionRoot<PARENT, ROOT>> projection = new CalculatedOrderProjection<>(this, this);    
    getFields().put("calculatedOrder", projection);
    return projection;
  }

  public OrderEditUpdateShippingLineUserErrorProjection<OrderEditUpdateShippingLineProjectionRoot<PARENT, ROOT>, OrderEditUpdateShippingLineProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    OrderEditUpdateShippingLineUserErrorProjection<OrderEditUpdateShippingLineProjectionRoot<PARENT, ROOT>, OrderEditUpdateShippingLineProjectionRoot<PARENT, ROOT>> projection = new OrderEditUpdateShippingLineUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
