package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ImageConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ImageConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ImageConnection"));
  }

  public ImageConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ImageEdgeProjection<ImageConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     ImageEdgeProjection<ImageConnectionProjection<PARENT, ROOT>, ROOT> projection = new ImageEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public ImageProjection<ImageConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     ImageProjection<ImageConnectionProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<ImageConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<ImageConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
