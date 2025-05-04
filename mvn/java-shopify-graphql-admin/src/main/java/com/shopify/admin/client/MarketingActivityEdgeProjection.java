package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketingActivityEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketingActivityEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketingActivityEdge"));
  }

  public MarketingActivityEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketingActivityProjection<MarketingActivityEdgeProjection<PARENT, ROOT>, ROOT> node() {
     MarketingActivityProjection<MarketingActivityEdgeProjection<PARENT, ROOT>, ROOT> projection = new MarketingActivityProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public MarketingActivityEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
