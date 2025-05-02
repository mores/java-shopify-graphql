package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompletionErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompletionErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CompletionError"));
  }

  public CompletionErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompletionErrorCodeProjection<CompletionErrorProjection<PARENT, ROOT>, ROOT> code() {
     CompletionErrorCodeProjection<CompletionErrorProjection<PARENT, ROOT>, ROOT> projection = new CompletionErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public CompletionErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
