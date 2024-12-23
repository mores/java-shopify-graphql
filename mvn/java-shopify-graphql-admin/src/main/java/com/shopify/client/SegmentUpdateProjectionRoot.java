package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SegmentUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SegmentUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("SegmentUpdatePayload"));
  }

  public SegmentUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SegmentProjection<SegmentUpdateProjectionRoot<PARENT, ROOT>, SegmentUpdateProjectionRoot<PARENT, ROOT>> segment(
      ) {
    SegmentProjection<SegmentUpdateProjectionRoot<PARENT, ROOT>, SegmentUpdateProjectionRoot<PARENT, ROOT>> projection = new SegmentProjection<>(this, this);    
    getFields().put("segment", projection);
    return projection;
  }

  public UserErrorProjection<SegmentUpdateProjectionRoot<PARENT, ROOT>, SegmentUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<SegmentUpdateProjectionRoot<PARENT, ROOT>, SegmentUpdateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
