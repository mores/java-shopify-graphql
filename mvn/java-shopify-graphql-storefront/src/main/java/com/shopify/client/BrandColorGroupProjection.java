package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class BrandColorGroupProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public BrandColorGroupProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("BrandColorGroup"));
  }

  public BrandColorGroupProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BrandColorGroupProjection<PARENT, ROOT> background() {
    getFields().put("background", null);
    return this;
  }

  public BrandColorGroupProjection<PARENT, ROOT> foreground() {
    getFields().put("foreground", null);
    return this;
  }
}
