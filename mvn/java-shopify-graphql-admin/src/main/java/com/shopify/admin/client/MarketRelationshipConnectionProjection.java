package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketRelationshipConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketRelationshipConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketRelationshipConnection"));
  }

  public MarketRelationshipConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketRelationshipEdgeProjection<MarketRelationshipConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     MarketRelationshipEdgeProjection<MarketRelationshipConnectionProjection<PARENT, ROOT>, ROOT> projection = new MarketRelationshipEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public MarketRelationshipProjection<MarketRelationshipConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     MarketRelationshipProjection<MarketRelationshipConnectionProjection<PARENT, ROOT>, ROOT> projection = new MarketRelationshipProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<MarketRelationshipConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<MarketRelationshipConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
