package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReverseDeliveryEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReverseDeliveryEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReverseDeliveryEdge"));
  }

  public ReverseDeliveryEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReverseDeliveryProjection<ReverseDeliveryEdgeProjection<PARENT, ROOT>, ROOT> node() {
     ReverseDeliveryProjection<ReverseDeliveryEdgeProjection<PARENT, ROOT>, ROOT> projection = new ReverseDeliveryProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public ReverseDeliveryEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
