package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerAccessTokenProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerAccessTokenProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerAccessToken"));
  }

  public CustomerAccessTokenProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerAccessTokenProjection<PARENT, ROOT> accessToken() {
    getFields().put("accessToken", null);
    return this;
  }

  public CustomerAccessTokenProjection<PARENT, ROOT> expiresAt() {
    getFields().put("expiresAt", null);
    return this;
  }
}
