package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DraftOrderAppliedDiscountTypeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DraftOrderAppliedDiscountTypeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DraftOrderAppliedDiscountType"));
  }

  public DraftOrderAppliedDiscountTypeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
