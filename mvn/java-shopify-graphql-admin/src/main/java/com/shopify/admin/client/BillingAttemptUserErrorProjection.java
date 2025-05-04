package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class BillingAttemptUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public BillingAttemptUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("BillingAttemptUserError"));
  }

  public BillingAttemptUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BillingAttemptUserErrorCodeProjection<BillingAttemptUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     BillingAttemptUserErrorCodeProjection<BillingAttemptUserErrorProjection<PARENT, ROOT>, ROOT> projection = new BillingAttemptUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public BillingAttemptUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public BillingAttemptUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
