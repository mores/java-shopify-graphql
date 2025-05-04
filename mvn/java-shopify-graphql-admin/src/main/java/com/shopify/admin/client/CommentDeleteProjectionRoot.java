package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CommentDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CommentDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("CommentDeletePayload"));
  }

  public CommentDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CommentDeleteUserErrorProjection<CommentDeleteProjectionRoot<PARENT, ROOT>, CommentDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CommentDeleteUserErrorProjection<CommentDeleteProjectionRoot<PARENT, ROOT>, CommentDeleteProjectionRoot<PARENT, ROOT>> projection = new CommentDeleteUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CommentDeleteProjectionRoot<PARENT, ROOT> deletedCommentId() {
    getFields().put("deletedCommentId", null);
    return this;
  }
}
