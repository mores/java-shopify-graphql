package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketRelationshipEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketRelationshipEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketRelationshipEdge"));
  }

  public MarketRelationshipEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketRelationshipProjection<MarketRelationshipEdgeProjection<PARENT, ROOT>, ROOT> node() {
     MarketRelationshipProjection<MarketRelationshipEdgeProjection<PARENT, ROOT>, ROOT> projection = new MarketRelationshipProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public MarketRelationshipEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
