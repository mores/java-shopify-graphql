package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class BrandColorsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public BrandColorsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("BrandColors"));
  }

  public BrandColorsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BrandColorGroupProjection<BrandColorsProjection<PARENT, ROOT>, ROOT> primary() {
     BrandColorGroupProjection<BrandColorsProjection<PARENT, ROOT>, ROOT> projection = new BrandColorGroupProjection<>(this, getRoot());
     getFields().put("primary", projection);
     return projection;
  }

  public BrandColorGroupProjection<BrandColorsProjection<PARENT, ROOT>, ROOT> secondary() {
     BrandColorGroupProjection<BrandColorsProjection<PARENT, ROOT>, ROOT> projection = new BrandColorGroupProjection<>(this, getRoot());
     getFields().put("secondary", projection);
     return projection;
  }
}
