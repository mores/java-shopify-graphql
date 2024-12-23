package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CatalogUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CatalogUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CatalogUserError"));
  }

  public CatalogUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CatalogUserErrorCodeProjection<CatalogUserErrorProjection<PARENT, ROOT>, ROOT> code() {
     CatalogUserErrorCodeProjection<CatalogUserErrorProjection<PARENT, ROOT>, ROOT> projection = new CatalogUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public CatalogUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public CatalogUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
