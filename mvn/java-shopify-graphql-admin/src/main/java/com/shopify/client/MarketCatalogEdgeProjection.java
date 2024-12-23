package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketCatalogEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketCatalogEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketCatalogEdge"));
  }

  public MarketCatalogEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketCatalogProjection<MarketCatalogEdgeProjection<PARENT, ROOT>, ROOT> node() {
     MarketCatalogProjection<MarketCatalogEdgeProjection<PARENT, ROOT>, ROOT> projection = new MarketCatalogProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public MarketCatalogEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
