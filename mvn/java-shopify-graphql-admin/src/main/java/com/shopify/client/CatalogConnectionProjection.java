package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CatalogConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CatalogConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CatalogConnection"));
  }

  public CatalogConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CatalogEdgeProjection<CatalogConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     CatalogEdgeProjection<CatalogConnectionProjection<PARENT, ROOT>, ROOT> projection = new CatalogEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public CatalogProjection<CatalogConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     CatalogProjection<CatalogConnectionProjection<PARENT, ROOT>, ROOT> projection = new CatalogProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<CatalogConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<CatalogConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
