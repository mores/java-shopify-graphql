package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class WebPixelProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public WebPixelProjectionRoot() {
    super(null, null, java.util.Optional.of("WebPixel"));
  }

  public WebPixelProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public WebPixelProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public WebPixelProjectionRoot<PARENT, ROOT> settings() {
    getFields().put("settings", null);
    return this;
  }
}
