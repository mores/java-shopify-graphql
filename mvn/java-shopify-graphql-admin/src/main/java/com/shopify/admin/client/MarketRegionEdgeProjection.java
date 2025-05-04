package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketRegionEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketRegionEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketRegionEdge"));
  }

  public MarketRegionEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketRegionProjection<MarketRegionEdgeProjection<PARENT, ROOT>, ROOT> node() {
     MarketRegionProjection<MarketRegionEdgeProjection<PARENT, ROOT>, ROOT> projection = new MarketRegionProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public MarketRegionEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
