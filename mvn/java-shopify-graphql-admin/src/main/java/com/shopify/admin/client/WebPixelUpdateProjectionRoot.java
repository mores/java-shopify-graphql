package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class WebPixelUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public WebPixelUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("WebPixelUpdatePayload"));
  }

  public WebPixelUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ErrorsWebPixelUserErrorProjection<WebPixelUpdateProjectionRoot<PARENT, ROOT>, WebPixelUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ErrorsWebPixelUserErrorProjection<WebPixelUpdateProjectionRoot<PARENT, ROOT>, WebPixelUpdateProjectionRoot<PARENT, ROOT>> projection = new ErrorsWebPixelUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public WebPixelProjection<WebPixelUpdateProjectionRoot<PARENT, ROOT>, WebPixelUpdateProjectionRoot<PARENT, ROOT>> webPixel(
      ) {
    WebPixelProjection<WebPixelUpdateProjectionRoot<PARENT, ROOT>, WebPixelUpdateProjectionRoot<PARENT, ROOT>> projection = new WebPixelProjection<>(this, this);    
    getFields().put("webPixel", projection);
    return projection;
  }
}
