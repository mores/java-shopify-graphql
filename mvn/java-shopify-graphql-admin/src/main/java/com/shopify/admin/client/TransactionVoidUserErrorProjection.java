package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class TransactionVoidUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public TransactionVoidUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("TransactionVoidUserError"));
  }

  public TransactionVoidUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public TransactionVoidUserErrorCodeProjection<TransactionVoidUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     TransactionVoidUserErrorCodeProjection<TransactionVoidUserErrorProjection<PARENT, ROOT>, ROOT> projection = new TransactionVoidUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public TransactionVoidUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public TransactionVoidUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
