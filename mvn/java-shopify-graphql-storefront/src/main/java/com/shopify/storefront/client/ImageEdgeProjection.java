package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ImageEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ImageEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ImageEdge"));
  }

  public ImageEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ImageProjection<ImageEdgeProjection<PARENT, ROOT>, ROOT> node() {
     ImageProjection<ImageEdgeProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public ImageEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
