package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryCustomizationErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryCustomizationErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryCustomizationError"));
  }

  public DeliveryCustomizationErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryCustomizationErrorCodeProjection<DeliveryCustomizationErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     DeliveryCustomizationErrorCodeProjection<DeliveryCustomizationErrorProjection<PARENT, ROOT>, ROOT> projection = new DeliveryCustomizationErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public DeliveryCustomizationErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public DeliveryCustomizationErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
