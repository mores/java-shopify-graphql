package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CommentSpamUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CommentSpamUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CommentSpamUserError"));
  }

  public CommentSpamUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CommentSpamUserErrorCodeProjection<CommentSpamUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     CommentSpamUserErrorCodeProjection<CommentSpamUserErrorProjection<PARENT, ROOT>, ROOT> projection = new CommentSpamUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public CommentSpamUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public CommentSpamUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
