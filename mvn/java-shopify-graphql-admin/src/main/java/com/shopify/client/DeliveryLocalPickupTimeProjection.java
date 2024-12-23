package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryLocalPickupTimeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryLocalPickupTimeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryLocalPickupTime"));
  }

  public DeliveryLocalPickupTimeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
