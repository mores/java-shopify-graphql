package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DelegateAccessTokenCreateUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DelegateAccessTokenCreateUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DelegateAccessTokenCreateUserError"));
  }

  public DelegateAccessTokenCreateUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DelegateAccessTokenCreateUserErrorCodeProjection<DelegateAccessTokenCreateUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     DelegateAccessTokenCreateUserErrorCodeProjection<DelegateAccessTokenCreateUserErrorProjection<PARENT, ROOT>, ROOT> projection = new DelegateAccessTokenCreateUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public DelegateAccessTokenCreateUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public DelegateAccessTokenCreateUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
