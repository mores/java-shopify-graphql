package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SuggestedOrderTransactionKindProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SuggestedOrderTransactionKindProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SuggestedOrderTransactionKind"));
  }

  public SuggestedOrderTransactionKindProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
