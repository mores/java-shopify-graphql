package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PriceListEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceListEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PriceListEdge"));
  }

  public PriceListEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PriceListProjection<PriceListEdgeProjection<PARENT, ROOT>, ROOT> node() {
     PriceListProjection<PriceListEdgeProjection<PARENT, ROOT>, ROOT> projection = new PriceListProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public PriceListEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
