package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CatalogsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CatalogsProjectionRoot() {
    super(null, null, java.util.Optional.of("CatalogConnection"));
  }

  public CatalogsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CatalogEdgeProjection<CatalogsProjectionRoot<PARENT, ROOT>, CatalogsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    CatalogEdgeProjection<CatalogsProjectionRoot<PARENT, ROOT>, CatalogsProjectionRoot<PARENT, ROOT>> projection = new CatalogEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public CatalogProjection<CatalogsProjectionRoot<PARENT, ROOT>, CatalogsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    CatalogProjection<CatalogsProjectionRoot<PARENT, ROOT>, CatalogsProjectionRoot<PARENT, ROOT>> projection = new CatalogProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<CatalogsProjectionRoot<PARENT, ROOT>, CatalogsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<CatalogsProjectionRoot<PARENT, ROOT>, CatalogsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
