package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CatalogDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CatalogDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("CatalogDeletePayload"));
  }

  public CatalogDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CatalogUserErrorProjection<CatalogDeleteProjectionRoot<PARENT, ROOT>, CatalogDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CatalogUserErrorProjection<CatalogDeleteProjectionRoot<PARENT, ROOT>, CatalogDeleteProjectionRoot<PARENT, ROOT>> projection = new CatalogUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CatalogDeleteProjectionRoot<PARENT, ROOT> deletedId() {
    getFields().put("deletedId", null);
    return this;
  }
}
