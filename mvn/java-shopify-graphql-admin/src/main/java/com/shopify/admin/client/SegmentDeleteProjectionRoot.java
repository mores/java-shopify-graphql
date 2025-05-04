package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SegmentDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SegmentDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("SegmentDeletePayload"));
  }

  public SegmentDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UserErrorProjection<SegmentDeleteProjectionRoot<PARENT, ROOT>, SegmentDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<SegmentDeleteProjectionRoot<PARENT, ROOT>, SegmentDeleteProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public SegmentDeleteProjectionRoot<PARENT, ROOT> deletedSegmentId() {
    getFields().put("deletedSegmentId", null);
    return this;
  }
}
