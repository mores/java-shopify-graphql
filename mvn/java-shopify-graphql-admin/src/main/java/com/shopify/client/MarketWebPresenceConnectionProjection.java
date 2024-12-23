package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketWebPresenceConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketWebPresenceConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketWebPresenceConnection"));
  }

  public MarketWebPresenceConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketWebPresenceEdgeProjection<MarketWebPresenceConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     MarketWebPresenceEdgeProjection<MarketWebPresenceConnectionProjection<PARENT, ROOT>, ROOT> projection = new MarketWebPresenceEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public MarketWebPresenceProjection<MarketWebPresenceConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     MarketWebPresenceProjection<MarketWebPresenceConnectionProjection<PARENT, ROOT>, ROOT> projection = new MarketWebPresenceProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<MarketWebPresenceConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<MarketWebPresenceConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
