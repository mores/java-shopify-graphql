package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderEditUpdateDiscountProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderEditUpdateDiscountProjectionRoot() {
    super(null, null, java.util.Optional.of("OrderEditUpdateDiscountPayload"));
  }

  public OrderEditUpdateDiscountProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CalculatedOrderProjection<OrderEditUpdateDiscountProjectionRoot<PARENT, ROOT>, OrderEditUpdateDiscountProjectionRoot<PARENT, ROOT>> calculatedOrder(
      ) {
    CalculatedOrderProjection<OrderEditUpdateDiscountProjectionRoot<PARENT, ROOT>, OrderEditUpdateDiscountProjectionRoot<PARENT, ROOT>> projection = new CalculatedOrderProjection<>(this, this);    
    getFields().put("calculatedOrder", projection);
    return projection;
  }

  public OrderEditUpdateDiscountUserErrorProjection<OrderEditUpdateDiscountProjectionRoot<PARENT, ROOT>, OrderEditUpdateDiscountProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    OrderEditUpdateDiscountUserErrorProjection<OrderEditUpdateDiscountProjectionRoot<PARENT, ROOT>, OrderEditUpdateDiscountProjectionRoot<PARENT, ROOT>> projection = new OrderEditUpdateDiscountUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
