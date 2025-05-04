package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppRevenueAttributionRecordConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppRevenueAttributionRecordConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AppRevenueAttributionRecordConnection"));
  }

  public AppRevenueAttributionRecordConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppRevenueAttributionRecordEdgeProjection<AppRevenueAttributionRecordConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     AppRevenueAttributionRecordEdgeProjection<AppRevenueAttributionRecordConnectionProjection<PARENT, ROOT>, ROOT> projection = new AppRevenueAttributionRecordEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public AppRevenueAttributionRecordProjection<AppRevenueAttributionRecordConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     AppRevenueAttributionRecordProjection<AppRevenueAttributionRecordConnectionProjection<PARENT, ROOT>, ROOT> projection = new AppRevenueAttributionRecordProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<AppRevenueAttributionRecordConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<AppRevenueAttributionRecordConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
