package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MediaConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MediaConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MediaConnection"));
  }

  public MediaConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MediaEdgeProjection<MediaConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     MediaEdgeProjection<MediaConnectionProjection<PARENT, ROOT>, ROOT> projection = new MediaEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public MediaProjection<MediaConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     MediaProjection<MediaConnectionProjection<PARENT, ROOT>, ROOT> projection = new MediaProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<MediaConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<MediaConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
