package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SegmentMembershipProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SegmentMembershipProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SegmentMembership"));
  }

  public SegmentMembershipProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SegmentMembershipProjection<PARENT, ROOT> isMember() {
    getFields().put("isMember", null);
    return this;
  }

  public SegmentMembershipProjection<PARENT, ROOT> segmentId() {
    getFields().put("segmentId", null);
    return this;
  }
}
