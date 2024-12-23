package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketingEventConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketingEventConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketingEventConnection"));
  }

  public MarketingEventConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketingEventEdgeProjection<MarketingEventConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     MarketingEventEdgeProjection<MarketingEventConnectionProjection<PARENT, ROOT>, ROOT> projection = new MarketingEventEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public MarketingEventProjection<MarketingEventConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     MarketingEventProjection<MarketingEventConnectionProjection<PARENT, ROOT>, ROOT> projection = new MarketingEventProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<MarketingEventConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<MarketingEventConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
