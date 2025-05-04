package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class RefundLineItemRestockTypeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public RefundLineItemRestockTypeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("RefundLineItemRestockType"));
  }

  public RefundLineItemRestockTypeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
