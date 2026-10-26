package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryOptionDefinitionEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryOptionDefinitionEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryOptionDefinitionEdge"));
  }

  public DeliveryOptionDefinitionEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryOptionDefinitionProjection<DeliveryOptionDefinitionEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     DeliveryOptionDefinitionProjection<DeliveryOptionDefinitionEdgeProjection<PARENT, ROOT>, ROOT> projection = new DeliveryOptionDefinitionProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public DeliveryOptionDefinitionEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
