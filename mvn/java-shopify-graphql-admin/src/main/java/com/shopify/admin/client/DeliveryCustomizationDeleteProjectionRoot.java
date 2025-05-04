package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryCustomizationDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryCustomizationDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("DeliveryCustomizationDeletePayload"));
  }

  public DeliveryCustomizationDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryCustomizationErrorProjection<DeliveryCustomizationDeleteProjectionRoot<PARENT, ROOT>, DeliveryCustomizationDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    DeliveryCustomizationErrorProjection<DeliveryCustomizationDeleteProjectionRoot<PARENT, ROOT>, DeliveryCustomizationDeleteProjectionRoot<PARENT, ROOT>> projection = new DeliveryCustomizationErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public DeliveryCustomizationDeleteProjectionRoot<PARENT, ROOT> deletedId() {
    getFields().put("deletedId", null);
    return this;
  }
}
