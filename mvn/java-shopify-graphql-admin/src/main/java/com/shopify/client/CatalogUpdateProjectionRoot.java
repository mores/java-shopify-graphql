package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CatalogUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CatalogUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("CatalogUpdatePayload"));
  }

  public CatalogUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CatalogProjection<CatalogUpdateProjectionRoot<PARENT, ROOT>, CatalogUpdateProjectionRoot<PARENT, ROOT>> catalog(
      ) {
    CatalogProjection<CatalogUpdateProjectionRoot<PARENT, ROOT>, CatalogUpdateProjectionRoot<PARENT, ROOT>> projection = new CatalogProjection<>(this, this);    
    getFields().put("catalog", projection);
    return projection;
  }

  public CatalogUserErrorProjection<CatalogUpdateProjectionRoot<PARENT, ROOT>, CatalogUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CatalogUserErrorProjection<CatalogUpdateProjectionRoot<PARENT, ROOT>, CatalogUpdateProjectionRoot<PARENT, ROOT>> projection = new CatalogUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
