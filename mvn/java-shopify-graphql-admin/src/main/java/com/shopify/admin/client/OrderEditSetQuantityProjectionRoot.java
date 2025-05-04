package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderEditSetQuantityProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderEditSetQuantityProjectionRoot() {
    super(null, null, java.util.Optional.of("OrderEditSetQuantityPayload"));
  }

  public OrderEditSetQuantityProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CalculatedLineItemProjection<OrderEditSetQuantityProjectionRoot<PARENT, ROOT>, OrderEditSetQuantityProjectionRoot<PARENT, ROOT>> calculatedLineItem(
      ) {
    CalculatedLineItemProjection<OrderEditSetQuantityProjectionRoot<PARENT, ROOT>, OrderEditSetQuantityProjectionRoot<PARENT, ROOT>> projection = new CalculatedLineItemProjection<>(this, this);    
    getFields().put("calculatedLineItem", projection);
    return projection;
  }

  public CalculatedOrderProjection<OrderEditSetQuantityProjectionRoot<PARENT, ROOT>, OrderEditSetQuantityProjectionRoot<PARENT, ROOT>> calculatedOrder(
      ) {
    CalculatedOrderProjection<OrderEditSetQuantityProjectionRoot<PARENT, ROOT>, OrderEditSetQuantityProjectionRoot<PARENT, ROOT>> projection = new CalculatedOrderProjection<>(this, this);    
    getFields().put("calculatedOrder", projection);
    return projection;
  }

  public UserErrorProjection<OrderEditSetQuantityProjectionRoot<PARENT, ROOT>, OrderEditSetQuantityProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<OrderEditSetQuantityProjectionRoot<PARENT, ROOT>, OrderEditSetQuantityProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
