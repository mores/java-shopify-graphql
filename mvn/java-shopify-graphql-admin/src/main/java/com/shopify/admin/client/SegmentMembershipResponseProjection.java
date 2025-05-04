package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SegmentMembershipResponseProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SegmentMembershipResponseProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SegmentMembershipResponse"));
  }

  public SegmentMembershipResponseProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SegmentMembershipProjection<SegmentMembershipResponseProjection<PARENT, ROOT>, ROOT> memberships(
      ) {
     SegmentMembershipProjection<SegmentMembershipResponseProjection<PARENT, ROOT>, ROOT> projection = new SegmentMembershipProjection<>(this, getRoot());
     getFields().put("memberships", projection);
     return projection;
  }
}
