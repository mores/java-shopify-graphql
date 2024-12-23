package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountClassProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountClassProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountClass"));
  }

  public DiscountClassProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
