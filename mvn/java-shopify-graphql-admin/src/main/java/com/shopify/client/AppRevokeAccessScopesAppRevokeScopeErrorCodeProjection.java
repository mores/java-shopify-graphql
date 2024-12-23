package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppRevokeAccessScopesAppRevokeScopeErrorCodeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppRevokeAccessScopesAppRevokeScopeErrorCodeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AppRevokeAccessScopesAppRevokeScopeErrorCode"));
  }

  public AppRevokeAccessScopesAppRevokeScopeErrorCodeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
