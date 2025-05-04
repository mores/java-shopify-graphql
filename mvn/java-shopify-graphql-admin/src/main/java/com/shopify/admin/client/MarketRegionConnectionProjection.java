package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketRegionConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketRegionConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketRegionConnection"));
  }

  public MarketRegionConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketRegionEdgeProjection<MarketRegionConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     MarketRegionEdgeProjection<MarketRegionConnectionProjection<PARENT, ROOT>, ROOT> projection = new MarketRegionEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public MarketRegionProjection<MarketRegionConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     MarketRegionProjection<MarketRegionConnectionProjection<PARENT, ROOT>, ROOT> projection = new MarketRegionProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<MarketRegionConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<MarketRegionConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
