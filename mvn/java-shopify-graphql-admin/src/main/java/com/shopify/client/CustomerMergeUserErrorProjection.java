package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerMergeUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerMergeUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerMergeUserError"));
  }

  public CustomerMergeUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerMergeErrorCodeProjection<CustomerMergeUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     CustomerMergeErrorCodeProjection<CustomerMergeUserErrorProjection<PARENT, ROOT>, ROOT> projection = new CustomerMergeErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public CustomerMergeUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public CustomerMergeUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
