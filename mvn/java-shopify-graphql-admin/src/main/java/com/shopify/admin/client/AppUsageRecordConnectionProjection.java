package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppUsageRecordConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppUsageRecordConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AppUsageRecordConnection"));
  }

  public AppUsageRecordConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppUsageRecordEdgeProjection<AppUsageRecordConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     AppUsageRecordEdgeProjection<AppUsageRecordConnectionProjection<PARENT, ROOT>, ROOT> projection = new AppUsageRecordEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public AppUsageRecordProjection<AppUsageRecordConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     AppUsageRecordProjection<AppUsageRecordConnectionProjection<PARENT, ROOT>, ROOT> projection = new AppUsageRecordProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<AppUsageRecordConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<AppUsageRecordConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
