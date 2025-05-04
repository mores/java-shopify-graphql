package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryProfileItemEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryProfileItemEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryProfileItemEdge"));
  }

  public DeliveryProfileItemEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryProfileItemProjection<DeliveryProfileItemEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     DeliveryProfileItemProjection<DeliveryProfileItemEdgeProjection<PARENT, ROOT>, ROOT> projection = new DeliveryProfileItemProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public DeliveryProfileItemEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
