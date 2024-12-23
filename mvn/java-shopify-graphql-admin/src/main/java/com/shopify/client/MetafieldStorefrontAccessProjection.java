package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldStorefrontAccessProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldStorefrontAccessProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetafieldStorefrontAccess"));
  }

  public MetafieldStorefrontAccessProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
