package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CatalogCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CatalogCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("CatalogCreatePayload"));
  }

  public CatalogCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CatalogProjection<CatalogCreateProjectionRoot<PARENT, ROOT>, CatalogCreateProjectionRoot<PARENT, ROOT>> catalog(
      ) {
    CatalogProjection<CatalogCreateProjectionRoot<PARENT, ROOT>, CatalogCreateProjectionRoot<PARENT, ROOT>> projection = new CatalogProjection<>(this, this);    
    getFields().put("catalog", projection);
    return projection;
  }

  public CatalogUserErrorProjection<CatalogCreateProjectionRoot<PARENT, ROOT>, CatalogCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CatalogUserErrorProjection<CatalogCreateProjectionRoot<PARENT, ROOT>, CatalogCreateProjectionRoot<PARENT, ROOT>> projection = new CatalogUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
