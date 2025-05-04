package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MediaWarningProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MediaWarningProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MediaWarning"));
  }

  public MediaWarningProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MediaWarningCodeProjection<MediaWarningProjection<PARENT, ROOT>, ROOT> code() {
     MediaWarningCodeProjection<MediaWarningProjection<PARENT, ROOT>, ROOT> projection = new MediaWarningCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public MediaWarningProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
