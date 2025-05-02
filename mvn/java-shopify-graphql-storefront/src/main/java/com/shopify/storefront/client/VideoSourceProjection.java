package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class VideoSourceProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public VideoSourceProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("VideoSource"));
  }

  public VideoSourceProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public VideoSourceProjection<PARENT, ROOT> format() {
    getFields().put("format", null);
    return this;
  }

  public VideoSourceProjection<PARENT, ROOT> height() {
    getFields().put("height", null);
    return this;
  }

  public VideoSourceProjection<PARENT, ROOT> mimeType() {
    getFields().put("mimeType", null);
    return this;
  }

  public VideoSourceProjection<PARENT, ROOT> url() {
    getFields().put("url", null);
    return this;
  }

  public VideoSourceProjection<PARENT, ROOT> width() {
    getFields().put("width", null);
    return this;
  }
}
