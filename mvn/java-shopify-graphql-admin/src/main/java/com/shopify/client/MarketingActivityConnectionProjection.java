package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketingActivityConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketingActivityConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketingActivityConnection"));
  }

  public MarketingActivityConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketingActivityEdgeProjection<MarketingActivityConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     MarketingActivityEdgeProjection<MarketingActivityConnectionProjection<PARENT, ROOT>, ROOT> projection = new MarketingActivityEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public MarketingActivityProjection<MarketingActivityConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     MarketingActivityProjection<MarketingActivityConnectionProjection<PARENT, ROOT>, ROOT> projection = new MarketingActivityProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<MarketingActivityConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<MarketingActivityConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
