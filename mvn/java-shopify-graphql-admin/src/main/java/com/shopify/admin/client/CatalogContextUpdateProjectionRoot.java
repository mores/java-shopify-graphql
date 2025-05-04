package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CatalogContextUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CatalogContextUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("CatalogContextUpdatePayload"));
  }

  public CatalogContextUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CatalogProjection<CatalogContextUpdateProjectionRoot<PARENT, ROOT>, CatalogContextUpdateProjectionRoot<PARENT, ROOT>> catalog(
      ) {
    CatalogProjection<CatalogContextUpdateProjectionRoot<PARENT, ROOT>, CatalogContextUpdateProjectionRoot<PARENT, ROOT>> projection = new CatalogProjection<>(this, this);    
    getFields().put("catalog", projection);
    return projection;
  }

  public CatalogUserErrorProjection<CatalogContextUpdateProjectionRoot<PARENT, ROOT>, CatalogContextUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CatalogUserErrorProjection<CatalogContextUpdateProjectionRoot<PARENT, ROOT>, CatalogContextUpdateProjectionRoot<PARENT, ROOT>> projection = new CatalogUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
