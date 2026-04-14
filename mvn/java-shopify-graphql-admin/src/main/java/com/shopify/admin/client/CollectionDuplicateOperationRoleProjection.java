package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionDuplicateOperationRoleProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionDuplicateOperationRoleProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionDuplicateOperationRole"));
  }

  public CollectionDuplicateOperationRoleProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
