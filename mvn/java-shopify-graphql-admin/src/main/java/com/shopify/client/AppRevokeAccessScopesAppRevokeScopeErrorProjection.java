package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppRevokeAccessScopesAppRevokeScopeErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppRevokeAccessScopesAppRevokeScopeErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AppRevokeAccessScopesAppRevokeScopeError"));
  }

  public AppRevokeAccessScopesAppRevokeScopeErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppRevokeAccessScopesAppRevokeScopeErrorCodeProjection<AppRevokeAccessScopesAppRevokeScopeErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     AppRevokeAccessScopesAppRevokeScopeErrorCodeProjection<AppRevokeAccessScopesAppRevokeScopeErrorProjection<PARENT, ROOT>, ROOT> projection = new AppRevokeAccessScopesAppRevokeScopeErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public AppRevokeAccessScopesAppRevokeScopeErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public AppRevokeAccessScopesAppRevokeScopeErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
