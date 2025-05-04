package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class UrlRedirectDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public UrlRedirectDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("UrlRedirectDeletePayload"));
  }

  public UrlRedirectDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UrlRedirectUserErrorProjection<UrlRedirectDeleteProjectionRoot<PARENT, ROOT>, UrlRedirectDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UrlRedirectUserErrorProjection<UrlRedirectDeleteProjectionRoot<PARENT, ROOT>, UrlRedirectDeleteProjectionRoot<PARENT, ROOT>> projection = new UrlRedirectUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public UrlRedirectDeleteProjectionRoot<PARENT, ROOT> deletedUrlRedirectId() {
    getFields().put("deletedUrlRedirectId", null);
    return this;
  }
}
