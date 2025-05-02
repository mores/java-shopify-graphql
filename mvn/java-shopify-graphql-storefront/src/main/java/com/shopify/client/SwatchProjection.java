package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SwatchProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SwatchProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Swatch"));
  }

  public SwatchProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MediaImageProjection<SwatchProjection<PARENT, ROOT>, ROOT> image() {
     MediaImageProjection<SwatchProjection<PARENT, ROOT>, ROOT> projection = new MediaImageProjection<>(this, getRoot());
     getFields().put("image", projection);
     return projection;
  }

  public SwatchProjection<PARENT, ROOT> color() {
    getFields().put("color", null);
    return this;
  }
}
