package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountAutomaticNodeEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountAutomaticNodeEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountAutomaticNodeEdge"));
  }

  public DiscountAutomaticNodeEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountAutomaticNodeProjection<DiscountAutomaticNodeEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     DiscountAutomaticNodeProjection<DiscountAutomaticNodeEdgeProjection<PARENT, ROOT>, ROOT> projection = new DiscountAutomaticNodeProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public DiscountAutomaticNodeEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
