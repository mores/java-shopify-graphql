package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class WebPixelCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public WebPixelCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("WebPixelCreatePayload"));
  }

  public WebPixelCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ErrorsWebPixelUserErrorProjection<WebPixelCreateProjectionRoot<PARENT, ROOT>, WebPixelCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ErrorsWebPixelUserErrorProjection<WebPixelCreateProjectionRoot<PARENT, ROOT>, WebPixelCreateProjectionRoot<PARENT, ROOT>> projection = new ErrorsWebPixelUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public WebPixelProjection<WebPixelCreateProjectionRoot<PARENT, ROOT>, WebPixelCreateProjectionRoot<PARENT, ROOT>> webPixel(
      ) {
    WebPixelProjection<WebPixelCreateProjectionRoot<PARENT, ROOT>, WebPixelCreateProjectionRoot<PARENT, ROOT>> projection = new WebPixelProjection<>(this, this);    
    getFields().put("webPixel", projection);
    return projection;
  }
}
