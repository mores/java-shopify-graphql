package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryCustomizationUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryCustomizationUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("DeliveryCustomizationUpdatePayload"));
  }

  public DeliveryCustomizationUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryCustomizationProjection<DeliveryCustomizationUpdateProjectionRoot<PARENT, ROOT>, DeliveryCustomizationUpdateProjectionRoot<PARENT, ROOT>> deliveryCustomization(
      ) {
    DeliveryCustomizationProjection<DeliveryCustomizationUpdateProjectionRoot<PARENT, ROOT>, DeliveryCustomizationUpdateProjectionRoot<PARENT, ROOT>> projection = new DeliveryCustomizationProjection<>(this, this);    
    getFields().put("deliveryCustomization", projection);
    return projection;
  }

  public DeliveryCustomizationErrorProjection<DeliveryCustomizationUpdateProjectionRoot<PARENT, ROOT>, DeliveryCustomizationUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    DeliveryCustomizationErrorProjection<DeliveryCustomizationUpdateProjectionRoot<PARENT, ROOT>, DeliveryCustomizationUpdateProjectionRoot<PARENT, ROOT>> projection = new DeliveryCustomizationErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
