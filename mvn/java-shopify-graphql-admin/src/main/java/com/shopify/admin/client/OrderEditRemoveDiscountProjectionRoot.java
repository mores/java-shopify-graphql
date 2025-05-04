package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderEditRemoveDiscountProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderEditRemoveDiscountProjectionRoot() {
    super(null, null, java.util.Optional.of("OrderEditRemoveDiscountPayload"));
  }

  public OrderEditRemoveDiscountProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CalculatedOrderProjection<OrderEditRemoveDiscountProjectionRoot<PARENT, ROOT>, OrderEditRemoveDiscountProjectionRoot<PARENT, ROOT>> calculatedOrder(
      ) {
    CalculatedOrderProjection<OrderEditRemoveDiscountProjectionRoot<PARENT, ROOT>, OrderEditRemoveDiscountProjectionRoot<PARENT, ROOT>> projection = new CalculatedOrderProjection<>(this, this);    
    getFields().put("calculatedOrder", projection);
    return projection;
  }

  public OrderEditRemoveDiscountUserErrorProjection<OrderEditRemoveDiscountProjectionRoot<PARENT, ROOT>, OrderEditRemoveDiscountProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    OrderEditRemoveDiscountUserErrorProjection<OrderEditRemoveDiscountProjectionRoot<PARENT, ROOT>, OrderEditRemoveDiscountProjectionRoot<PARENT, ROOT>> projection = new OrderEditRemoveDiscountUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
