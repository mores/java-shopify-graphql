package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class BulkMutationUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public BulkMutationUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("BulkMutationUserError"));
  }

  public BulkMutationUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BulkMutationErrorCodeProjection<BulkMutationUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     BulkMutationErrorCodeProjection<BulkMutationUserErrorProjection<PARENT, ROOT>, ROOT> projection = new BulkMutationErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public BulkMutationUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public BulkMutationUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
