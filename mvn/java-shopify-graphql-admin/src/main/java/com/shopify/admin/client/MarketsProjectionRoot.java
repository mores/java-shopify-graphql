package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketsProjectionRoot() {
    super(null, null, java.util.Optional.of("MarketConnection"));
  }

  public MarketsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketEdgeProjection<MarketsProjectionRoot<PARENT, ROOT>, MarketsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    MarketEdgeProjection<MarketsProjectionRoot<PARENT, ROOT>, MarketsProjectionRoot<PARENT, ROOT>> projection = new MarketEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public MarketProjection<MarketsProjectionRoot<PARENT, ROOT>, MarketsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    MarketProjection<MarketsProjectionRoot<PARENT, ROOT>, MarketsProjectionRoot<PARENT, ROOT>> projection = new MarketProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<MarketsProjectionRoot<PARENT, ROOT>, MarketsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<MarketsProjectionRoot<PARENT, ROOT>, MarketsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
