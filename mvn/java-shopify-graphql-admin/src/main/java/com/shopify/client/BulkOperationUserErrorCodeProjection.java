package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class BulkOperationUserErrorCodeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public BulkOperationUserErrorCodeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("BulkOperationUserErrorCode"));
  }

  public BulkOperationUserErrorCodeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
