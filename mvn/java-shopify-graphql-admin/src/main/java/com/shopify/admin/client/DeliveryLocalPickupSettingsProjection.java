package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryLocalPickupSettingsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryLocalPickupSettingsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryLocalPickupSettings"));
  }

  public DeliveryLocalPickupSettingsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryLocalPickupTimeProjection<DeliveryLocalPickupSettingsProjection<PARENT, ROOT>, ROOT> pickupTime(
      ) {
     DeliveryLocalPickupTimeProjection<DeliveryLocalPickupSettingsProjection<PARENT, ROOT>, ROOT> projection = new DeliveryLocalPickupTimeProjection<>(this, getRoot());
     getFields().put("pickupTime", projection);
     return projection;
  }

  public DeliveryLocalPickupSettingsProjection<PARENT, ROOT> instructions() {
    getFields().put("instructions", null);
    return this;
  }
}
