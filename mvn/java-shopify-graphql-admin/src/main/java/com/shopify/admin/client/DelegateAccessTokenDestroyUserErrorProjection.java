package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DelegateAccessTokenDestroyUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DelegateAccessTokenDestroyUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DelegateAccessTokenDestroyUserError"));
  }

  public DelegateAccessTokenDestroyUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DelegateAccessTokenDestroyUserErrorCodeProjection<DelegateAccessTokenDestroyUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     DelegateAccessTokenDestroyUserErrorCodeProjection<DelegateAccessTokenDestroyUserErrorProjection<PARENT, ROOT>, ROOT> projection = new DelegateAccessTokenDestroyUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public DelegateAccessTokenDestroyUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public DelegateAccessTokenDestroyUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
