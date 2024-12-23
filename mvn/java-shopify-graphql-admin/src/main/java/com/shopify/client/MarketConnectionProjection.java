package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketConnection"));
  }

  public MarketConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketEdgeProjection<MarketConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     MarketEdgeProjection<MarketConnectionProjection<PARENT, ROOT>, ROOT> projection = new MarketEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public MarketProjection<MarketConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     MarketProjection<MarketConnectionProjection<PARENT, ROOT>, ROOT> projection = new MarketProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<MarketConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<MarketConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
