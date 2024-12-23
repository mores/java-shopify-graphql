package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ErrorsServerPixelUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ErrorsServerPixelUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ErrorsServerPixelUserError"));
  }

  public ErrorsServerPixelUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ErrorsServerPixelUserErrorCodeProjection<ErrorsServerPixelUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     ErrorsServerPixelUserErrorCodeProjection<ErrorsServerPixelUserErrorProjection<PARENT, ROOT>, ROOT> projection = new ErrorsServerPixelUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public ErrorsServerPixelUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public ErrorsServerPixelUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
