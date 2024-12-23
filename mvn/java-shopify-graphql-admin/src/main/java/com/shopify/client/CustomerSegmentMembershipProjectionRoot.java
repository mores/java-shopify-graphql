package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerSegmentMembershipProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerSegmentMembershipProjectionRoot() {
    super(null, null, java.util.Optional.of("SegmentMembershipResponse"));
  }

  public CustomerSegmentMembershipProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SegmentMembershipProjection<CustomerSegmentMembershipProjectionRoot<PARENT, ROOT>, CustomerSegmentMembershipProjectionRoot<PARENT, ROOT>> memberships(
      ) {
    SegmentMembershipProjection<CustomerSegmentMembershipProjectionRoot<PARENT, ROOT>, CustomerSegmentMembershipProjectionRoot<PARENT, ROOT>> projection = new SegmentMembershipProjection<>(this, this);    
    getFields().put("memberships", projection);
    return projection;
  }
}
