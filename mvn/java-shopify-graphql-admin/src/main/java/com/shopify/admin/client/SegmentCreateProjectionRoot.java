package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SegmentCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SegmentCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("SegmentCreatePayload"));
  }

  public SegmentCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SegmentProjection<SegmentCreateProjectionRoot<PARENT, ROOT>, SegmentCreateProjectionRoot<PARENT, ROOT>> segment(
      ) {
    SegmentProjection<SegmentCreateProjectionRoot<PARENT, ROOT>, SegmentCreateProjectionRoot<PARENT, ROOT>> projection = new SegmentProjection<>(this, this);    
    getFields().put("segment", projection);
    return projection;
  }

  public UserErrorProjection<SegmentCreateProjectionRoot<PARENT, ROOT>, SegmentCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<SegmentCreateProjectionRoot<PARENT, ROOT>, SegmentCreateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
