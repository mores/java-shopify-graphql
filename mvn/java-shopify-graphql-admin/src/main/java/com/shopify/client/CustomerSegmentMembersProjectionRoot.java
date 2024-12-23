package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerSegmentMembersProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerSegmentMembersProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerSegmentMemberConnection"));
  }

  public CustomerSegmentMembersProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerSegmentMemberEdgeProjection<CustomerSegmentMembersProjectionRoot<PARENT, ROOT>, CustomerSegmentMembersProjectionRoot<PARENT, ROOT>> edges(
      ) {
    CustomerSegmentMemberEdgeProjection<CustomerSegmentMembersProjectionRoot<PARENT, ROOT>, CustomerSegmentMembersProjectionRoot<PARENT, ROOT>> projection = new CustomerSegmentMemberEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public PageInfoProjection<CustomerSegmentMembersProjectionRoot<PARENT, ROOT>, CustomerSegmentMembersProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<CustomerSegmentMembersProjectionRoot<PARENT, ROOT>, CustomerSegmentMembersProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }

  public SegmentStatisticsProjection<CustomerSegmentMembersProjectionRoot<PARENT, ROOT>, CustomerSegmentMembersProjectionRoot<PARENT, ROOT>> statistics(
      ) {
    SegmentStatisticsProjection<CustomerSegmentMembersProjectionRoot<PARENT, ROOT>, CustomerSegmentMembersProjectionRoot<PARENT, ROOT>> projection = new SegmentStatisticsProjection<>(this, this);    
    getFields().put("statistics", projection);
    return projection;
  }

  public CustomerSegmentMembersProjectionRoot<PARENT, ROOT> totalCount() {
    getFields().put("totalCount", null);
    return this;
  }
}
