package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ErrorsWebPixelUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ErrorsWebPixelUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ErrorsWebPixelUserError"));
  }

  public ErrorsWebPixelUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ErrorsWebPixelUserErrorCodeProjection<ErrorsWebPixelUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     ErrorsWebPixelUserErrorCodeProjection<ErrorsWebPixelUserErrorProjection<PARENT, ROOT>, ROOT> projection = new ErrorsWebPixelUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public ErrorsWebPixelUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public ErrorsWebPixelUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
