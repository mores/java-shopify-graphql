package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReverseDeliveryLineItemEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReverseDeliveryLineItemEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReverseDeliveryLineItemEdge"));
  }

  public ReverseDeliveryLineItemEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReverseDeliveryLineItemProjection<ReverseDeliveryLineItemEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     ReverseDeliveryLineItemProjection<ReverseDeliveryLineItemEdgeProjection<PARENT, ROOT>, ROOT> projection = new ReverseDeliveryLineItemProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public ReverseDeliveryLineItemEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
