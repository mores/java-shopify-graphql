package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyqlColumnOriginProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyqlColumnOriginProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyqlColumnOrigin"));
  }

  public ShopifyqlColumnOriginProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
