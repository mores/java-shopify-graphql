package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerSegmentMemberConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerSegmentMemberConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerSegmentMemberConnection"));
  }

  public CustomerSegmentMemberConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerSegmentMemberEdgeProjection<CustomerSegmentMemberConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     CustomerSegmentMemberEdgeProjection<CustomerSegmentMemberConnectionProjection<PARENT, ROOT>, ROOT> projection = new CustomerSegmentMemberEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public PageInfoProjection<CustomerSegmentMemberConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<CustomerSegmentMemberConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }

  public SegmentStatisticsProjection<CustomerSegmentMemberConnectionProjection<PARENT, ROOT>, ROOT> statistics(
      ) {
     SegmentStatisticsProjection<CustomerSegmentMemberConnectionProjection<PARENT, ROOT>, ROOT> projection = new SegmentStatisticsProjection<>(this, getRoot());
     getFields().put("statistics", projection);
     return projection;
  }

  public CustomerSegmentMemberConnectionProjection<PARENT, ROOT> totalCount() {
    getFields().put("totalCount", null);
    return this;
  }
}
