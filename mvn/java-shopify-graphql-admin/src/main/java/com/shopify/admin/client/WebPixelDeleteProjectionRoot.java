package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class WebPixelDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public WebPixelDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("WebPixelDeletePayload"));
  }

  public WebPixelDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ErrorsWebPixelUserErrorProjection<WebPixelDeleteProjectionRoot<PARENT, ROOT>, WebPixelDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ErrorsWebPixelUserErrorProjection<WebPixelDeleteProjectionRoot<PARENT, ROOT>, WebPixelDeleteProjectionRoot<PARENT, ROOT>> projection = new ErrorsWebPixelUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public WebPixelDeleteProjectionRoot<PARENT, ROOT> deletedWebPixelId() {
    getFields().put("deletedWebPixelId", null);
    return this;
  }
}
