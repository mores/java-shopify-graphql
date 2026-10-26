package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketRelationshipsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketRelationshipsProjectionRoot() {
    super(null, null, java.util.Optional.of("MarketRelationshipConnection"));
  }

  public MarketRelationshipsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketRelationshipEdgeProjection<MarketRelationshipsProjectionRoot<PARENT, ROOT>, MarketRelationshipsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    MarketRelationshipEdgeProjection<MarketRelationshipsProjectionRoot<PARENT, ROOT>, MarketRelationshipsProjectionRoot<PARENT, ROOT>> projection = new MarketRelationshipEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public MarketRelationshipProjection<MarketRelationshipsProjectionRoot<PARENT, ROOT>, MarketRelationshipsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    MarketRelationshipProjection<MarketRelationshipsProjectionRoot<PARENT, ROOT>, MarketRelationshipsProjectionRoot<PARENT, ROOT>> projection = new MarketRelationshipProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<MarketRelationshipsProjectionRoot<PARENT, ROOT>, MarketRelationshipsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<MarketRelationshipsProjectionRoot<PARENT, ROOT>, MarketRelationshipsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
