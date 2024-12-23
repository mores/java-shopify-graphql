package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerSegmentMembersQueryUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerSegmentMembersQueryUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerSegmentMembersQueryUserError"));
  }

  public CustomerSegmentMembersQueryUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerSegmentMembersQueryUserErrorCodeProjection<CustomerSegmentMembersQueryUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     CustomerSegmentMembersQueryUserErrorCodeProjection<CustomerSegmentMembersQueryUserErrorProjection<PARENT, ROOT>, ROOT> projection = new CustomerSegmentMembersQueryUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public CustomerSegmentMembersQueryUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public CustomerSegmentMembersQueryUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
