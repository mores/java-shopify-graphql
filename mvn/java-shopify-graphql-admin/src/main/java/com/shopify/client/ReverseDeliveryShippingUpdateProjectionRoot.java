package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReverseDeliveryShippingUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReverseDeliveryShippingUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("ReverseDeliveryShippingUpdatePayload"));
  }

  public ReverseDeliveryShippingUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReverseDeliveryProjection<ReverseDeliveryShippingUpdateProjectionRoot<PARENT, ROOT>, ReverseDeliveryShippingUpdateProjectionRoot<PARENT, ROOT>> reverseDelivery(
      ) {
    ReverseDeliveryProjection<ReverseDeliveryShippingUpdateProjectionRoot<PARENT, ROOT>, ReverseDeliveryShippingUpdateProjectionRoot<PARENT, ROOT>> projection = new ReverseDeliveryProjection<>(this, this);    
    getFields().put("reverseDelivery", projection);
    return projection;
  }

  public ReturnUserErrorProjection<ReverseDeliveryShippingUpdateProjectionRoot<PARENT, ROOT>, ReverseDeliveryShippingUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ReturnUserErrorProjection<ReverseDeliveryShippingUpdateProjectionRoot<PARENT, ROOT>, ReverseDeliveryShippingUpdateProjectionRoot<PARENT, ROOT>> projection = new ReturnUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
