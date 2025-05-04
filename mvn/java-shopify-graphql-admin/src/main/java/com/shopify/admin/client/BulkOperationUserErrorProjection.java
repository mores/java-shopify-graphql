package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class BulkOperationUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public BulkOperationUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("BulkOperationUserError"));
  }

  public BulkOperationUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BulkOperationUserErrorCodeProjection<BulkOperationUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     BulkOperationUserErrorCodeProjection<BulkOperationUserErrorProjection<PARENT, ROOT>, ROOT> projection = new BulkOperationUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public BulkOperationUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public BulkOperationUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
