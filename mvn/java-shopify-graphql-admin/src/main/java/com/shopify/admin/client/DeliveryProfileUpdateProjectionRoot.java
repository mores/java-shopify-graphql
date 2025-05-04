package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryProfileUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryProfileUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("DeliveryProfileUpdatePayload"));
  }

  public DeliveryProfileUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryProfileProjection<DeliveryProfileUpdateProjectionRoot<PARENT, ROOT>, DeliveryProfileUpdateProjectionRoot<PARENT, ROOT>> profile(
      ) {
    DeliveryProfileProjection<DeliveryProfileUpdateProjectionRoot<PARENT, ROOT>, DeliveryProfileUpdateProjectionRoot<PARENT, ROOT>> projection = new DeliveryProfileProjection<>(this, this);    
    getFields().put("profile", projection);
    return projection;
  }

  public UserErrorProjection<DeliveryProfileUpdateProjectionRoot<PARENT, ROOT>, DeliveryProfileUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<DeliveryProfileUpdateProjectionRoot<PARENT, ROOT>, DeliveryProfileUpdateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
