package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReturnUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReturnUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReturnUserError"));
  }

  public ReturnUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReturnErrorCodeProjection<ReturnUserErrorProjection<PARENT, ROOT>, ROOT> code() {
     ReturnErrorCodeProjection<ReturnUserErrorProjection<PARENT, ROOT>, ROOT> projection = new ReturnErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public ReturnUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public ReturnUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
