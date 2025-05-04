package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderTransactionKindProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderTransactionKindProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderTransactionKind"));
  }

  public OrderTransactionKindProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
