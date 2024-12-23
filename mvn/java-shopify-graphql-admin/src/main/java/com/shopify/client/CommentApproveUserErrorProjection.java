package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CommentApproveUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CommentApproveUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CommentApproveUserError"));
  }

  public CommentApproveUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CommentApproveUserErrorCodeProjection<CommentApproveUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     CommentApproveUserErrorCodeProjection<CommentApproveUserErrorProjection<PARENT, ROOT>, ROOT> projection = new CommentApproveUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public CommentApproveUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public CommentApproveUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
