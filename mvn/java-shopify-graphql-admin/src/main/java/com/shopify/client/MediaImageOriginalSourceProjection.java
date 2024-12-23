package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MediaImageOriginalSourceProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MediaImageOriginalSourceProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MediaImageOriginalSource"));
  }

  public MediaImageOriginalSourceProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MediaImageOriginalSourceProjection<PARENT, ROOT> fileSize() {
    getFields().put("fileSize", null);
    return this;
  }

  public MediaImageOriginalSourceProjection<PARENT, ROOT> url() {
    getFields().put("url", null);
    return this;
  }
}
