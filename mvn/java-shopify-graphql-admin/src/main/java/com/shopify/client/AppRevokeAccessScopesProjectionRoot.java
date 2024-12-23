package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppRevokeAccessScopesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppRevokeAccessScopesProjectionRoot() {
    super(null, null, java.util.Optional.of("AppRevokeAccessScopesPayload"));
  }

  public AppRevokeAccessScopesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AccessScopeProjection<AppRevokeAccessScopesProjectionRoot<PARENT, ROOT>, AppRevokeAccessScopesProjectionRoot<PARENT, ROOT>> revoked(
      ) {
    AccessScopeProjection<AppRevokeAccessScopesProjectionRoot<PARENT, ROOT>, AppRevokeAccessScopesProjectionRoot<PARENT, ROOT>> projection = new AccessScopeProjection<>(this, this);    
    getFields().put("revoked", projection);
    return projection;
  }

  public AppRevokeAccessScopesAppRevokeScopeErrorProjection<AppRevokeAccessScopesProjectionRoot<PARENT, ROOT>, AppRevokeAccessScopesProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    AppRevokeAccessScopesAppRevokeScopeErrorProjection<AppRevokeAccessScopesProjectionRoot<PARENT, ROOT>, AppRevokeAccessScopesProjectionRoot<PARENT, ROOT>> projection = new AppRevokeAccessScopesAppRevokeScopeErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
