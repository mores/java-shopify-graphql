package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketWebPresenceEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketWebPresenceEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketWebPresenceEdge"));
  }

  public MarketWebPresenceEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketWebPresenceProjection<MarketWebPresenceEdgeProjection<PARENT, ROOT>, ROOT> node() {
     MarketWebPresenceProjection<MarketWebPresenceEdgeProjection<PARENT, ROOT>, ROOT> projection = new MarketWebPresenceProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public MarketWebPresenceEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
