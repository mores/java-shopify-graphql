package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class BulkProductResourceFeedbackCreateUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public BulkProductResourceFeedbackCreateUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("BulkProductResourceFeedbackCreateUserError"));
  }

  public BulkProductResourceFeedbackCreateUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BulkProductResourceFeedbackCreateUserErrorCodeProjection<BulkProductResourceFeedbackCreateUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     BulkProductResourceFeedbackCreateUserErrorCodeProjection<BulkProductResourceFeedbackCreateUserErrorProjection<PARENT, ROOT>, ROOT> projection = new BulkProductResourceFeedbackCreateUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public BulkProductResourceFeedbackCreateUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public BulkProductResourceFeedbackCreateUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
