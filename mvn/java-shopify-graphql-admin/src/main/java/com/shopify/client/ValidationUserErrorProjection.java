package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ValidationUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ValidationUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ValidationUserError"));
  }

  public ValidationUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ValidationUserErrorCodeProjection<ValidationUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     ValidationUserErrorCodeProjection<ValidationUserErrorProjection<PARENT, ROOT>, ROOT> projection = new ValidationUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public ValidationUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public ValidationUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
