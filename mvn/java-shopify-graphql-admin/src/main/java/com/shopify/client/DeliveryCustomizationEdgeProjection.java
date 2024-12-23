package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryCustomizationEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryCustomizationEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryCustomizationEdge"));
  }

  public DeliveryCustomizationEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryCustomizationProjection<DeliveryCustomizationEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     DeliveryCustomizationProjection<DeliveryCustomizationEdgeProjection<PARENT, ROOT>, ROOT> projection = new DeliveryCustomizationProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public DeliveryCustomizationEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
