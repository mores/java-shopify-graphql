package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderEditAddCustomItemProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderEditAddCustomItemProjectionRoot() {
    super(null, null, java.util.Optional.of("OrderEditAddCustomItemPayload"));
  }

  public OrderEditAddCustomItemProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CalculatedLineItemProjection<OrderEditAddCustomItemProjectionRoot<PARENT, ROOT>, OrderEditAddCustomItemProjectionRoot<PARENT, ROOT>> calculatedLineItem(
      ) {
    CalculatedLineItemProjection<OrderEditAddCustomItemProjectionRoot<PARENT, ROOT>, OrderEditAddCustomItemProjectionRoot<PARENT, ROOT>> projection = new CalculatedLineItemProjection<>(this, this);    
    getFields().put("calculatedLineItem", projection);
    return projection;
  }

  public CalculatedOrderProjection<OrderEditAddCustomItemProjectionRoot<PARENT, ROOT>, OrderEditAddCustomItemProjectionRoot<PARENT, ROOT>> calculatedOrder(
      ) {
    CalculatedOrderProjection<OrderEditAddCustomItemProjectionRoot<PARENT, ROOT>, OrderEditAddCustomItemProjectionRoot<PARENT, ROOT>> projection = new CalculatedOrderProjection<>(this, this);    
    getFields().put("calculatedOrder", projection);
    return projection;
  }

  public UserErrorProjection<OrderEditAddCustomItemProjectionRoot<PARENT, ROOT>, OrderEditAddCustomItemProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<OrderEditAddCustomItemProjectionRoot<PARENT, ROOT>, OrderEditAddCustomItemProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
