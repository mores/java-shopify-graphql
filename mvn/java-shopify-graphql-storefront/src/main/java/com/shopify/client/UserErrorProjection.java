package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class UserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public UserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("UserError"));
  }

  public UserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public UserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
