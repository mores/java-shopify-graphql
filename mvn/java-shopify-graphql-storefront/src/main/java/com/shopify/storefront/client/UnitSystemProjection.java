package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class UnitSystemProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public UnitSystemProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("UnitSystem"));
  }

  public UnitSystemProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
