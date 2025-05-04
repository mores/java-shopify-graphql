package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerSegmentMembersQueryProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerSegmentMembersQueryProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerSegmentMembersQuery"));
  }

  public CustomerSegmentMembersQueryProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerSegmentMembersQueryProjection<PARENT, ROOT> currentCount() {
    getFields().put("currentCount", null);
    return this;
  }

  public CustomerSegmentMembersQueryProjection<PARENT, ROOT> done() {
    getFields().put("done", null);
    return this;
  }

  public CustomerSegmentMembersQueryProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
