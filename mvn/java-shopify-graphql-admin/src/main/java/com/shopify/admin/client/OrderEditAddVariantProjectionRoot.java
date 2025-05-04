package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderEditAddVariantProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderEditAddVariantProjectionRoot() {
    super(null, null, java.util.Optional.of("OrderEditAddVariantPayload"));
  }

  public OrderEditAddVariantProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CalculatedLineItemProjection<OrderEditAddVariantProjectionRoot<PARENT, ROOT>, OrderEditAddVariantProjectionRoot<PARENT, ROOT>> calculatedLineItem(
      ) {
    CalculatedLineItemProjection<OrderEditAddVariantProjectionRoot<PARENT, ROOT>, OrderEditAddVariantProjectionRoot<PARENT, ROOT>> projection = new CalculatedLineItemProjection<>(this, this);    
    getFields().put("calculatedLineItem", projection);
    return projection;
  }

  public CalculatedOrderProjection<OrderEditAddVariantProjectionRoot<PARENT, ROOT>, OrderEditAddVariantProjectionRoot<PARENT, ROOT>> calculatedOrder(
      ) {
    CalculatedOrderProjection<OrderEditAddVariantProjectionRoot<PARENT, ROOT>, OrderEditAddVariantProjectionRoot<PARENT, ROOT>> projection = new CalculatedOrderProjection<>(this, this);    
    getFields().put("calculatedOrder", projection);
    return projection;
  }

  public UserErrorProjection<OrderEditAddVariantProjectionRoot<PARENT, ROOT>, OrderEditAddVariantProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<OrderEditAddVariantProjectionRoot<PARENT, ROOT>, OrderEditAddVariantProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
