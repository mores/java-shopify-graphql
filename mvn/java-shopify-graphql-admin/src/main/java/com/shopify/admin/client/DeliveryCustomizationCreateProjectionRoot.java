package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryCustomizationCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryCustomizationCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("DeliveryCustomizationCreatePayload"));
  }

  public DeliveryCustomizationCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryCustomizationProjection<DeliveryCustomizationCreateProjectionRoot<PARENT, ROOT>, DeliveryCustomizationCreateProjectionRoot<PARENT, ROOT>> deliveryCustomization(
      ) {
    DeliveryCustomizationProjection<DeliveryCustomizationCreateProjectionRoot<PARENT, ROOT>, DeliveryCustomizationCreateProjectionRoot<PARENT, ROOT>> projection = new DeliveryCustomizationProjection<>(this, this);    
    getFields().put("deliveryCustomization", projection);
    return projection;
  }

  public DeliveryCustomizationErrorProjection<DeliveryCustomizationCreateProjectionRoot<PARENT, ROOT>, DeliveryCustomizationCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    DeliveryCustomizationErrorProjection<DeliveryCustomizationCreateProjectionRoot<PARENT, ROOT>, DeliveryCustomizationCreateProjectionRoot<PARENT, ROOT>> projection = new DeliveryCustomizationErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
