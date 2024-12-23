package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryMethodDefinitionEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryMethodDefinitionEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryMethodDefinitionEdge"));
  }

  public DeliveryMethodDefinitionEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryMethodDefinitionProjection<DeliveryMethodDefinitionEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     DeliveryMethodDefinitionProjection<DeliveryMethodDefinitionEdgeProjection<PARENT, ROOT>, ROOT> projection = new DeliveryMethodDefinitionProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public DeliveryMethodDefinitionEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
