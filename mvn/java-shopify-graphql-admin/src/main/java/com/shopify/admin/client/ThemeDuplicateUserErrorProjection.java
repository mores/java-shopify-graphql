package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ThemeDuplicateUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ThemeDuplicateUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ThemeDuplicateUserError"));
  }

  public ThemeDuplicateUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ThemeDuplicateUserErrorCodeProjection<ThemeDuplicateUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     ThemeDuplicateUserErrorCodeProjection<ThemeDuplicateUserErrorProjection<PARENT, ROOT>, ROOT> projection = new ThemeDuplicateUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public ThemeDuplicateUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public ThemeDuplicateUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
