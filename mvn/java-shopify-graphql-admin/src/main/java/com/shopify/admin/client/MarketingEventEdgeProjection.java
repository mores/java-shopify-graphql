package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketingEventEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketingEventEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketingEventEdge"));
  }

  public MarketingEventEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketingEventProjection<MarketingEventEdgeProjection<PARENT, ROOT>, ROOT> node() {
     MarketingEventProjection<MarketingEventEdgeProjection<PARENT, ROOT>, ROOT> projection = new MarketingEventProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public MarketingEventEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
