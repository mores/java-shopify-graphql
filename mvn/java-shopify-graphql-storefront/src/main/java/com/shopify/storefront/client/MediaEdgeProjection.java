package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MediaEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MediaEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MediaEdge"));
  }

  public MediaEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MediaProjection<MediaEdgeProjection<PARENT, ROOT>, ROOT> node() {
     MediaProjection<MediaEdgeProjection<PARENT, ROOT>, ROOT> projection = new MediaProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public MediaEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
