package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryProfileCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryProfileCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("DeliveryProfileCreatePayload"));
  }

  public DeliveryProfileCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryProfileProjection<DeliveryProfileCreateProjectionRoot<PARENT, ROOT>, DeliveryProfileCreateProjectionRoot<PARENT, ROOT>> profile(
      ) {
    DeliveryProfileProjection<DeliveryProfileCreateProjectionRoot<PARENT, ROOT>, DeliveryProfileCreateProjectionRoot<PARENT, ROOT>> projection = new DeliveryProfileProjection<>(this, this);    
    getFields().put("profile", projection);
    return projection;
  }

  public UserErrorProjection<DeliveryProfileCreateProjectionRoot<PARENT, ROOT>, DeliveryProfileCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<DeliveryProfileCreateProjectionRoot<PARENT, ROOT>, DeliveryProfileCreateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
