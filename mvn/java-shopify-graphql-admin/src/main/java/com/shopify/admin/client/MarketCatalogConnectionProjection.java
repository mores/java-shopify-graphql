package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketCatalogConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketCatalogConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketCatalogConnection"));
  }

  public MarketCatalogConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketCatalogEdgeProjection<MarketCatalogConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     MarketCatalogEdgeProjection<MarketCatalogConnectionProjection<PARENT, ROOT>, ROOT> projection = new MarketCatalogEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public MarketCatalogProjection<MarketCatalogConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     MarketCatalogProjection<MarketCatalogConnectionProjection<PARENT, ROOT>, ROOT> projection = new MarketCatalogProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<MarketCatalogConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<MarketCatalogConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
