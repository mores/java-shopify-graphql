package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MediaUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MediaUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MediaUserError"));
  }

  public MediaUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MediaUserErrorCodeProjection<MediaUserErrorProjection<PARENT, ROOT>, ROOT> code() {
     MediaUserErrorCodeProjection<MediaUserErrorProjection<PARENT, ROOT>, ROOT> projection = new MediaUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public MediaUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public MediaUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
