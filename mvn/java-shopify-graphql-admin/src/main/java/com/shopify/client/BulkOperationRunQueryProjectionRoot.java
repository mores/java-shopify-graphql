package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class BulkOperationRunQueryProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public BulkOperationRunQueryProjectionRoot() {
    super(null, null, java.util.Optional.of("BulkOperationRunQueryPayload"));
  }

  public BulkOperationRunQueryProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BulkOperationProjection<BulkOperationRunQueryProjectionRoot<PARENT, ROOT>, BulkOperationRunQueryProjectionRoot<PARENT, ROOT>> bulkOperation(
      ) {
    BulkOperationProjection<BulkOperationRunQueryProjectionRoot<PARENT, ROOT>, BulkOperationRunQueryProjectionRoot<PARENT, ROOT>> projection = new BulkOperationProjection<>(this, this);    
    getFields().put("bulkOperation", projection);
    return projection;
  }

  public BulkOperationUserErrorProjection<BulkOperationRunQueryProjectionRoot<PARENT, ROOT>, BulkOperationRunQueryProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    BulkOperationUserErrorProjection<BulkOperationRunQueryProjectionRoot<PARENT, ROOT>, BulkOperationRunQueryProjectionRoot<PARENT, ROOT>> projection = new BulkOperationUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
