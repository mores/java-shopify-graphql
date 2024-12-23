package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderEditAddLineItemDiscountProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderEditAddLineItemDiscountProjectionRoot() {
    super(null, null, java.util.Optional.of("OrderEditAddLineItemDiscountPayload"));
  }

  public OrderEditAddLineItemDiscountProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderStagedChangeAddLineItemDiscountProjection<OrderEditAddLineItemDiscountProjectionRoot<PARENT, ROOT>, OrderEditAddLineItemDiscountProjectionRoot<PARENT, ROOT>> addedDiscountStagedChange(
      ) {
    OrderStagedChangeAddLineItemDiscountProjection<OrderEditAddLineItemDiscountProjectionRoot<PARENT, ROOT>, OrderEditAddLineItemDiscountProjectionRoot<PARENT, ROOT>> projection = new OrderStagedChangeAddLineItemDiscountProjection<>(this, this);    
    getFields().put("addedDiscountStagedChange", projection);
    return projection;
  }

  public CalculatedLineItemProjection<OrderEditAddLineItemDiscountProjectionRoot<PARENT, ROOT>, OrderEditAddLineItemDiscountProjectionRoot<PARENT, ROOT>> calculatedLineItem(
      ) {
    CalculatedLineItemProjection<OrderEditAddLineItemDiscountProjectionRoot<PARENT, ROOT>, OrderEditAddLineItemDiscountProjectionRoot<PARENT, ROOT>> projection = new CalculatedLineItemProjection<>(this, this);    
    getFields().put("calculatedLineItem", projection);
    return projection;
  }

  public CalculatedOrderProjection<OrderEditAddLineItemDiscountProjectionRoot<PARENT, ROOT>, OrderEditAddLineItemDiscountProjectionRoot<PARENT, ROOT>> calculatedOrder(
      ) {
    CalculatedOrderProjection<OrderEditAddLineItemDiscountProjectionRoot<PARENT, ROOT>, OrderEditAddLineItemDiscountProjectionRoot<PARENT, ROOT>> projection = new CalculatedOrderProjection<>(this, this);    
    getFields().put("calculatedOrder", projection);
    return projection;
  }

  public UserErrorProjection<OrderEditAddLineItemDiscountProjectionRoot<PARENT, ROOT>, OrderEditAddLineItemDiscountProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<OrderEditAddLineItemDiscountProjectionRoot<PARENT, ROOT>, OrderEditAddLineItemDiscountProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
