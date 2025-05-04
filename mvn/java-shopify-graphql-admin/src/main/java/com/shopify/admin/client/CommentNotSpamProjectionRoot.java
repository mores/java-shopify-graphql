package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CommentNotSpamProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CommentNotSpamProjectionRoot() {
    super(null, null, java.util.Optional.of("CommentNotSpamPayload"));
  }

  public CommentNotSpamProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CommentProjection<CommentNotSpamProjectionRoot<PARENT, ROOT>, CommentNotSpamProjectionRoot<PARENT, ROOT>> comment(
      ) {
    CommentProjection<CommentNotSpamProjectionRoot<PARENT, ROOT>, CommentNotSpamProjectionRoot<PARENT, ROOT>> projection = new CommentProjection<>(this, this);    
    getFields().put("comment", projection);
    return projection;
  }

  public CommentNotSpamUserErrorProjection<CommentNotSpamProjectionRoot<PARENT, ROOT>, CommentNotSpamProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CommentNotSpamUserErrorProjection<CommentNotSpamProjectionRoot<PARENT, ROOT>, CommentNotSpamProjectionRoot<PARENT, ROOT>> projection = new CommentNotSpamUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
