package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderEditRemoveLineItemDiscountProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderEditRemoveLineItemDiscountProjectionRoot() {
    super(null, null, java.util.Optional.of("OrderEditRemoveLineItemDiscountPayload"));
  }

  public OrderEditRemoveLineItemDiscountProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CalculatedLineItemProjection<OrderEditRemoveLineItemDiscountProjectionRoot<PARENT, ROOT>, OrderEditRemoveLineItemDiscountProjectionRoot<PARENT, ROOT>> calculatedLineItem(
      ) {
    CalculatedLineItemProjection<OrderEditRemoveLineItemDiscountProjectionRoot<PARENT, ROOT>, OrderEditRemoveLineItemDiscountProjectionRoot<PARENT, ROOT>> projection = new CalculatedLineItemProjection<>(this, this);    
    getFields().put("calculatedLineItem", projection);
    return projection;
  }

  public CalculatedOrderProjection<OrderEditRemoveLineItemDiscountProjectionRoot<PARENT, ROOT>, OrderEditRemoveLineItemDiscountProjectionRoot<PARENT, ROOT>> calculatedOrder(
      ) {
    CalculatedOrderProjection<OrderEditRemoveLineItemDiscountProjectionRoot<PARENT, ROOT>, OrderEditRemoveLineItemDiscountProjectionRoot<PARENT, ROOT>> projection = new CalculatedOrderProjection<>(this, this);    
    getFields().put("calculatedOrder", projection);
    return projection;
  }

  public UserErrorProjection<OrderEditRemoveLineItemDiscountProjectionRoot<PARENT, ROOT>, OrderEditRemoveLineItemDiscountProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<OrderEditRemoveLineItemDiscountProjectionRoot<PARENT, ROOT>, OrderEditRemoveLineItemDiscountProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
