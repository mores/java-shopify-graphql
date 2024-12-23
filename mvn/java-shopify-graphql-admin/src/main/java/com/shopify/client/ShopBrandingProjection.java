package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopBrandingProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopBrandingProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopBranding"));
  }

  public ShopBrandingProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
