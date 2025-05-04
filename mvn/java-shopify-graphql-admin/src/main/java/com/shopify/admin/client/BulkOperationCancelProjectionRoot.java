package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class BulkOperationCancelProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public BulkOperationCancelProjectionRoot() {
    super(null, null, java.util.Optional.of("BulkOperationCancelPayload"));
  }

  public BulkOperationCancelProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BulkOperationProjection<BulkOperationCancelProjectionRoot<PARENT, ROOT>, BulkOperationCancelProjectionRoot<PARENT, ROOT>> bulkOperation(
      ) {
    BulkOperationProjection<BulkOperationCancelProjectionRoot<PARENT, ROOT>, BulkOperationCancelProjectionRoot<PARENT, ROOT>> projection = new BulkOperationProjection<>(this, this);    
    getFields().put("bulkOperation", projection);
    return projection;
  }

  public UserErrorProjection<BulkOperationCancelProjectionRoot<PARENT, ROOT>, BulkOperationCancelProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<BulkOperationCancelProjectionRoot<PARENT, ROOT>, BulkOperationCancelProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
