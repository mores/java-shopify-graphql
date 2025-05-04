package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ThemePublishUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ThemePublishUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ThemePublishUserError"));
  }

  public ThemePublishUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ThemePublishUserErrorCodeProjection<ThemePublishUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     ThemePublishUserErrorCodeProjection<ThemePublishUserErrorProjection<PARENT, ROOT>, ROOT> projection = new ThemePublishUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public ThemePublishUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public ThemePublishUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
