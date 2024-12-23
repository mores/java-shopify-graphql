package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerSegmentMembersQueryProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerSegmentMembersQueryProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerSegmentMembersQuery"));
  }

  public CustomerSegmentMembersQueryProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerSegmentMembersQueryProjectionRoot<PARENT, ROOT> currentCount() {
    getFields().put("currentCount", null);
    return this;
  }

  public CustomerSegmentMembersQueryProjectionRoot<PARENT, ROOT> done() {
    getFields().put("done", null);
    return this;
  }

  public CustomerSegmentMembersQueryProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
