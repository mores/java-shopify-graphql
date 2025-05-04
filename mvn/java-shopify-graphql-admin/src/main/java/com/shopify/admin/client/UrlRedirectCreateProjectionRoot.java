package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class UrlRedirectCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public UrlRedirectCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("UrlRedirectCreatePayload"));
  }

  public UrlRedirectCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UrlRedirectProjection<UrlRedirectCreateProjectionRoot<PARENT, ROOT>, UrlRedirectCreateProjectionRoot<PARENT, ROOT>> urlRedirect(
      ) {
    UrlRedirectProjection<UrlRedirectCreateProjectionRoot<PARENT, ROOT>, UrlRedirectCreateProjectionRoot<PARENT, ROOT>> projection = new UrlRedirectProjection<>(this, this);    
    getFields().put("urlRedirect", projection);
    return projection;
  }

  public UrlRedirectUserErrorProjection<UrlRedirectCreateProjectionRoot<PARENT, ROOT>, UrlRedirectCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UrlRedirectUserErrorProjection<UrlRedirectCreateProjectionRoot<PARENT, ROOT>, UrlRedirectCreateProjectionRoot<PARENT, ROOT>> projection = new UrlRedirectUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
