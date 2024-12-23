package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MediaErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MediaErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MediaError"));
  }

  public MediaErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MediaErrorCodeProjection<MediaErrorProjection<PARENT, ROOT>, ROOT> code() {
     MediaErrorCodeProjection<MediaErrorProjection<PARENT, ROOT>, ROOT> projection = new MediaErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public MediaErrorProjection<PARENT, ROOT> details() {
    getFields().put("details", null);
    return this;
  }

  public MediaErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
