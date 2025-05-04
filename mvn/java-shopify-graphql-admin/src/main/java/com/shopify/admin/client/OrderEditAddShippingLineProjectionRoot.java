package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderEditAddShippingLineProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderEditAddShippingLineProjectionRoot() {
    super(null, null, java.util.Optional.of("OrderEditAddShippingLinePayload"));
  }

  public OrderEditAddShippingLineProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CalculatedOrderProjection<OrderEditAddShippingLineProjectionRoot<PARENT, ROOT>, OrderEditAddShippingLineProjectionRoot<PARENT, ROOT>> calculatedOrder(
      ) {
    CalculatedOrderProjection<OrderEditAddShippingLineProjectionRoot<PARENT, ROOT>, OrderEditAddShippingLineProjectionRoot<PARENT, ROOT>> projection = new CalculatedOrderProjection<>(this, this);    
    getFields().put("calculatedOrder", projection);
    return projection;
  }

  public CalculatedShippingLineProjection<OrderEditAddShippingLineProjectionRoot<PARENT, ROOT>, OrderEditAddShippingLineProjectionRoot<PARENT, ROOT>> calculatedShippingLine(
      ) {
    CalculatedShippingLineProjection<OrderEditAddShippingLineProjectionRoot<PARENT, ROOT>, OrderEditAddShippingLineProjectionRoot<PARENT, ROOT>> projection = new CalculatedShippingLineProjection<>(this, this);    
    getFields().put("calculatedShippingLine", projection);
    return projection;
  }

  public OrderEditAddShippingLineUserErrorProjection<OrderEditAddShippingLineProjectionRoot<PARENT, ROOT>, OrderEditAddShippingLineProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    OrderEditAddShippingLineUserErrorProjection<OrderEditAddShippingLineProjectionRoot<PARENT, ROOT>, OrderEditAddShippingLineProjectionRoot<PARENT, ROOT>> projection = new OrderEditAddShippingLineUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
