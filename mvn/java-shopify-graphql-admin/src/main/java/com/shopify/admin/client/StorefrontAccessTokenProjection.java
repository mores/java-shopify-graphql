package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class StorefrontAccessTokenProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StorefrontAccessTokenProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("StorefrontAccessToken"));
  }

  public StorefrontAccessTokenProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AccessScopeProjection<StorefrontAccessTokenProjection<PARENT, ROOT>, ROOT> accessScopes() {
     AccessScopeProjection<StorefrontAccessTokenProjection<PARENT, ROOT>, ROOT> projection = new AccessScopeProjection<>(this, getRoot());
     getFields().put("accessScopes", projection);
     return projection;
  }

  public StorefrontAccessTokenProjection<PARENT, ROOT> accessToken() {
    getFields().put("accessToken", null);
    return this;
  }

  public StorefrontAccessTokenProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public StorefrontAccessTokenProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public StorefrontAccessTokenProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public StorefrontAccessTokenProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
