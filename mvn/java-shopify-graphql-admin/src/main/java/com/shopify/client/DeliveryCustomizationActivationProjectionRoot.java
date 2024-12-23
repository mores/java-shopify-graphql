package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryCustomizationActivationProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryCustomizationActivationProjectionRoot() {
    super(null, null, java.util.Optional.of("DeliveryCustomizationActivationPayload"));
  }

  public DeliveryCustomizationActivationProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryCustomizationErrorProjection<DeliveryCustomizationActivationProjectionRoot<PARENT, ROOT>, DeliveryCustomizationActivationProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    DeliveryCustomizationErrorProjection<DeliveryCustomizationActivationProjectionRoot<PARENT, ROOT>, DeliveryCustomizationActivationProjectionRoot<PARENT, ROOT>> projection = new DeliveryCustomizationErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public DeliveryCustomizationActivationProjectionRoot<PARENT, ROOT> ids() {
    getFields().put("ids", null);
    return this;
  }
}
