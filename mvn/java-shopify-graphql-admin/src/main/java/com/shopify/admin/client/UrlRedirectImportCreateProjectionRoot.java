package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class UrlRedirectImportCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public UrlRedirectImportCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("UrlRedirectImportCreatePayload"));
  }

  public UrlRedirectImportCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UrlRedirectImportProjection<UrlRedirectImportCreateProjectionRoot<PARENT, ROOT>, UrlRedirectImportCreateProjectionRoot<PARENT, ROOT>> urlRedirectImport(
      ) {
    UrlRedirectImportProjection<UrlRedirectImportCreateProjectionRoot<PARENT, ROOT>, UrlRedirectImportCreateProjectionRoot<PARENT, ROOT>> projection = new UrlRedirectImportProjection<>(this, this);    
    getFields().put("urlRedirectImport", projection);
    return projection;
  }

  public UrlRedirectImportUserErrorProjection<UrlRedirectImportCreateProjectionRoot<PARENT, ROOT>, UrlRedirectImportCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UrlRedirectImportUserErrorProjection<UrlRedirectImportCreateProjectionRoot<PARENT, ROOT>, UrlRedirectImportCreateProjectionRoot<PARENT, ROOT>> projection = new UrlRedirectImportUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
