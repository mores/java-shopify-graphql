package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class WebPixelProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public WebPixelProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("WebPixel"));
  }

  public WebPixelProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public WebPixelProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public WebPixelProjection<PARENT, ROOT> settings() {
    getFields().put("settings", null);
    return this;
  }
}
