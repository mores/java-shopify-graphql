package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PriceListPriceEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceListPriceEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PriceListPriceEdge"));
  }

  public PriceListPriceEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PriceListPriceProjection<PriceListPriceEdgeProjection<PARENT, ROOT>, ROOT> node() {
     PriceListPriceProjection<PriceListPriceEdgeProjection<PARENT, ROOT>, ROOT> projection = new PriceListPriceProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public PriceListPriceEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
