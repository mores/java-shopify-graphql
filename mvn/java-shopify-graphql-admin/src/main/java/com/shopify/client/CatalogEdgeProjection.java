package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CatalogEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CatalogEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CatalogEdge"));
  }

  public CatalogEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CatalogProjection<CatalogEdgeProjection<PARENT, ROOT>, ROOT> node() {
     CatalogProjection<CatalogEdgeProjection<PARENT, ROOT>, ROOT> projection = new CatalogProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public CatalogEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
