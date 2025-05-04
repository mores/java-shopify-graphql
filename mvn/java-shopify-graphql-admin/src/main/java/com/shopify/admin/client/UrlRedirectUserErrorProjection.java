package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class UrlRedirectUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public UrlRedirectUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("UrlRedirectUserError"));
  }

  public UrlRedirectUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UrlRedirectErrorCodeProjection<UrlRedirectUserErrorProjection<PARENT, ROOT>, ROOT> code() {
     UrlRedirectErrorCodeProjection<UrlRedirectUserErrorProjection<PARENT, ROOT>, ROOT> projection = new UrlRedirectErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public UrlRedirectUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public UrlRedirectUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
