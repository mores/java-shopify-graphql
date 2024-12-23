package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class UrlRedirectUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public UrlRedirectUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("UrlRedirectUpdatePayload"));
  }

  public UrlRedirectUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UrlRedirectProjection<UrlRedirectUpdateProjectionRoot<PARENT, ROOT>, UrlRedirectUpdateProjectionRoot<PARENT, ROOT>> urlRedirect(
      ) {
    UrlRedirectProjection<UrlRedirectUpdateProjectionRoot<PARENT, ROOT>, UrlRedirectUpdateProjectionRoot<PARENT, ROOT>> projection = new UrlRedirectProjection<>(this, this);    
    getFields().put("urlRedirect", projection);
    return projection;
  }

  public UrlRedirectUserErrorProjection<UrlRedirectUpdateProjectionRoot<PARENT, ROOT>, UrlRedirectUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UrlRedirectUserErrorProjection<UrlRedirectUpdateProjectionRoot<PARENT, ROOT>, UrlRedirectUpdateProjectionRoot<PARENT, ROOT>> projection = new UrlRedirectUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
