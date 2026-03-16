package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionOperationsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionOperationsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionOperations"));
  }

  public CollectionOperationsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CollectionDuplicateOperationProjection<CollectionOperationsProjection<PARENT, ROOT>, ROOT> duplicate(
      ) {
     CollectionDuplicateOperationProjection<CollectionOperationsProjection<PARENT, ROOT>, ROOT> projection = new CollectionDuplicateOperationProjection<>(this, getRoot());
     getFields().put("duplicate", projection);
     return projection;
  }
}
