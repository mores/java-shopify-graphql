package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionDuplicateOperationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionDuplicateOperationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionDuplicateOperation"));
  }

  public CollectionDuplicateOperationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CollectionDuplicateOperationRoleProjection<CollectionDuplicateOperationProjection<PARENT, ROOT>, ROOT> collectionRole(
      ) {
     CollectionDuplicateOperationRoleProjection<CollectionDuplicateOperationProjection<PARENT, ROOT>, ROOT> projection = new CollectionDuplicateOperationRoleProjection<>(this, getRoot());
     getFields().put("collectionRole", projection);
     return projection;
  }

  public JobProjection<CollectionDuplicateOperationProjection<PARENT, ROOT>, ROOT> job() {
     JobProjection<CollectionDuplicateOperationProjection<PARENT, ROOT>, ROOT> projection = new JobProjection<>(this, getRoot());
     getFields().put("job", projection);
     return projection;
  }
}
