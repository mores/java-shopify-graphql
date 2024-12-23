package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReverseDeliveryCreateWithShippingProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReverseDeliveryCreateWithShippingProjectionRoot() {
    super(null, null, java.util.Optional.of("ReverseDeliveryCreateWithShippingPayload"));
  }

  public ReverseDeliveryCreateWithShippingProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReverseDeliveryProjection<ReverseDeliveryCreateWithShippingProjectionRoot<PARENT, ROOT>, ReverseDeliveryCreateWithShippingProjectionRoot<PARENT, ROOT>> reverseDelivery(
      ) {
    ReverseDeliveryProjection<ReverseDeliveryCreateWithShippingProjectionRoot<PARENT, ROOT>, ReverseDeliveryCreateWithShippingProjectionRoot<PARENT, ROOT>> projection = new ReverseDeliveryProjection<>(this, this);    
    getFields().put("reverseDelivery", projection);
    return projection;
  }

  public ReturnUserErrorProjection<ReverseDeliveryCreateWithShippingProjectionRoot<PARENT, ROOT>, ReverseDeliveryCreateWithShippingProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ReturnUserErrorProjection<ReverseDeliveryCreateWithShippingProjectionRoot<PARENT, ROOT>, ReverseDeliveryCreateWithShippingProjectionRoot<PARENT, ROOT>> projection = new ReturnUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
