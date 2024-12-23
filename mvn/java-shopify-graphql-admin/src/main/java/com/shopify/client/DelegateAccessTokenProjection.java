package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DelegateAccessTokenProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DelegateAccessTokenProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DelegateAccessToken"));
  }

  public DelegateAccessTokenProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DelegateAccessTokenProjection<PARENT, ROOT> accessScopes() {
    getFields().put("accessScopes", null);
    return this;
  }

  public DelegateAccessTokenProjection<PARENT, ROOT> accessToken() {
    getFields().put("accessToken", null);
    return this;
  }

  public DelegateAccessTokenProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }
}
