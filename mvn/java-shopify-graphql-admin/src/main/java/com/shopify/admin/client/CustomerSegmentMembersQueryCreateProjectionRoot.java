package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerSegmentMembersQueryCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerSegmentMembersQueryCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerSegmentMembersQueryCreatePayload"));
  }

  public CustomerSegmentMembersQueryCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerSegmentMembersQueryProjection<CustomerSegmentMembersQueryCreateProjectionRoot<PARENT, ROOT>, CustomerSegmentMembersQueryCreateProjectionRoot<PARENT, ROOT>> customerSegmentMembersQuery(
      ) {
    CustomerSegmentMembersQueryProjection<CustomerSegmentMembersQueryCreateProjectionRoot<PARENT, ROOT>, CustomerSegmentMembersQueryCreateProjectionRoot<PARENT, ROOT>> projection = new CustomerSegmentMembersQueryProjection<>(this, this);    
    getFields().put("customerSegmentMembersQuery", projection);
    return projection;
  }

  public CustomerSegmentMembersQueryUserErrorProjection<CustomerSegmentMembersQueryCreateProjectionRoot<PARENT, ROOT>, CustomerSegmentMembersQueryCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CustomerSegmentMembersQueryUserErrorProjection<CustomerSegmentMembersQueryCreateProjectionRoot<PARENT, ROOT>, CustomerSegmentMembersQueryCreateProjectionRoot<PARENT, ROOT>> projection = new CustomerSegmentMembersQueryUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
