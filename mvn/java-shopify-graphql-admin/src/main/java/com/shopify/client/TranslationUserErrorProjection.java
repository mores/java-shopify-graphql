package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class TranslationUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public TranslationUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("TranslationUserError"));
  }

  public TranslationUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public TranslationErrorCodeProjection<TranslationUserErrorProjection<PARENT, ROOT>, ROOT> code() {
     TranslationErrorCodeProjection<TranslationUserErrorProjection<PARENT, ROOT>, ROOT> projection = new TranslationErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public TranslationUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public TranslationUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
