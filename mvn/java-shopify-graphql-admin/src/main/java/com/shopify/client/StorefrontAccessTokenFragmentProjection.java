package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class StorefrontAccessTokenFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public StorefrontAccessTokenFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("StorefrontAccessToken"));
  }

  public StorefrontAccessTokenFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AccessScopeProjection<StorefrontAccessTokenFragmentProjection<PARENT, ROOT>, ROOT> accessScopes(
      ) {
     AccessScopeProjection<StorefrontAccessTokenFragmentProjection<PARENT, ROOT>, ROOT> projection = new AccessScopeProjection<>(this, getRoot());
     getFields().put("accessScopes", projection);
     return projection;
  }

  public StorefrontAccessTokenFragmentProjection<PARENT, ROOT> accessToken() {
    getFields().put("accessToken", null);
    return this;
  }

  public StorefrontAccessTokenFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public StorefrontAccessTokenFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public StorefrontAccessTokenFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public StorefrontAccessTokenFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on StorefrontAccessToken {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
