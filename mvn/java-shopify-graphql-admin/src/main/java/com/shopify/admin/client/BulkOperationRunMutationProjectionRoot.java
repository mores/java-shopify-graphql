package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class BulkOperationRunMutationProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public BulkOperationRunMutationProjectionRoot() {
    super(null, null, java.util.Optional.of("BulkOperationRunMutationPayload"));
  }

  public BulkOperationRunMutationProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BulkOperationProjection<BulkOperationRunMutationProjectionRoot<PARENT, ROOT>, BulkOperationRunMutationProjectionRoot<PARENT, ROOT>> bulkOperation(
      ) {
    BulkOperationProjection<BulkOperationRunMutationProjectionRoot<PARENT, ROOT>, BulkOperationRunMutationProjectionRoot<PARENT, ROOT>> projection = new BulkOperationProjection<>(this, this);    
    getFields().put("bulkOperation", projection);
    return projection;
  }

  public BulkMutationUserErrorProjection<BulkOperationRunMutationProjectionRoot<PARENT, ROOT>, BulkOperationRunMutationProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    BulkMutationUserErrorProjection<BulkOperationRunMutationProjectionRoot<PARENT, ROOT>, BulkOperationRunMutationProjectionRoot<PARENT, ROOT>> projection = new BulkMutationUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
