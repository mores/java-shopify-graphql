package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class UrlRedirectImportUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public UrlRedirectImportUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("UrlRedirectImportUserError"));
  }

  public UrlRedirectImportUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UrlRedirectImportErrorCodeProjection<UrlRedirectImportUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     UrlRedirectImportErrorCodeProjection<UrlRedirectImportUserErrorProjection<PARENT, ROOT>, ROOT> projection = new UrlRedirectImportErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public UrlRedirectImportUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public UrlRedirectImportUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
