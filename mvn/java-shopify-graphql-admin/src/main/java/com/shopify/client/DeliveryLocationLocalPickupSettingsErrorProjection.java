package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryLocationLocalPickupSettingsErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryLocationLocalPickupSettingsErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryLocationLocalPickupSettingsError"));
  }

  public DeliveryLocationLocalPickupSettingsErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryLocationLocalPickupSettingsErrorCodeProjection<DeliveryLocationLocalPickupSettingsErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     DeliveryLocationLocalPickupSettingsErrorCodeProjection<DeliveryLocationLocalPickupSettingsErrorProjection<PARENT, ROOT>, ROOT> projection = new DeliveryLocationLocalPickupSettingsErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public DeliveryLocationLocalPickupSettingsErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public DeliveryLocationLocalPickupSettingsErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
