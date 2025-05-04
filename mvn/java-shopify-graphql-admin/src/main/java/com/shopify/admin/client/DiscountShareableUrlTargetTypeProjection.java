package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountShareableUrlTargetTypeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountShareableUrlTargetTypeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountShareableUrlTargetType"));
  }

  public DiscountShareableUrlTargetTypeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
