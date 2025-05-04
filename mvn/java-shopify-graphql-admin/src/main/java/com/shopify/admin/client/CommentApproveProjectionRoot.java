package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CommentApproveProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CommentApproveProjectionRoot() {
    super(null, null, java.util.Optional.of("CommentApprovePayload"));
  }

  public CommentApproveProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CommentProjection<CommentApproveProjectionRoot<PARENT, ROOT>, CommentApproveProjectionRoot<PARENT, ROOT>> comment(
      ) {
    CommentProjection<CommentApproveProjectionRoot<PARENT, ROOT>, CommentApproveProjectionRoot<PARENT, ROOT>> projection = new CommentProjection<>(this, this);    
    getFields().put("comment", projection);
    return projection;
  }

  public CommentApproveUserErrorProjection<CommentApproveProjectionRoot<PARENT, ROOT>, CommentApproveProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CommentApproveUserErrorProjection<CommentApproveProjectionRoot<PARENT, ROOT>, CommentApproveProjectionRoot<PARENT, ROOT>> projection = new CommentApproveUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
