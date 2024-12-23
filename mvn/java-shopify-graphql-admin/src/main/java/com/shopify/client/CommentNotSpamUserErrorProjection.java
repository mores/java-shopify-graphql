package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CommentNotSpamUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CommentNotSpamUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CommentNotSpamUserError"));
  }

  public CommentNotSpamUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CommentNotSpamUserErrorCodeProjection<CommentNotSpamUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     CommentNotSpamUserErrorCodeProjection<CommentNotSpamUserErrorProjection<PARENT, ROOT>, ROOT> projection = new CommentNotSpamUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public CommentNotSpamUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public CommentNotSpamUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
