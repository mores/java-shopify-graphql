package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CommentSpamProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CommentSpamProjectionRoot() {
    super(null, null, java.util.Optional.of("CommentSpamPayload"));
  }

  public CommentSpamProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CommentProjection<CommentSpamProjectionRoot<PARENT, ROOT>, CommentSpamProjectionRoot<PARENT, ROOT>> comment(
      ) {
    CommentProjection<CommentSpamProjectionRoot<PARENT, ROOT>, CommentSpamProjectionRoot<PARENT, ROOT>> projection = new CommentProjection<>(this, this);    
    getFields().put("comment", projection);
    return projection;
  }

  public CommentSpamUserErrorProjection<CommentSpamProjectionRoot<PARENT, ROOT>, CommentSpamProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CommentSpamUserErrorProjection<CommentSpamProjectionRoot<PARENT, ROOT>, CommentSpamProjectionRoot<PARENT, ROOT>> projection = new CommentSpamUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
