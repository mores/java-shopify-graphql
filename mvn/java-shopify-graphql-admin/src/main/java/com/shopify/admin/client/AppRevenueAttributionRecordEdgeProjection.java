package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppRevenueAttributionRecordEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppRevenueAttributionRecordEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AppRevenueAttributionRecordEdge"));
  }

  public AppRevenueAttributionRecordEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppRevenueAttributionRecordProjection<AppRevenueAttributionRecordEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     AppRevenueAttributionRecordProjection<AppRevenueAttributionRecordEdgeProjection<PARENT, ROOT>, ROOT> projection = new AppRevenueAttributionRecordProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public AppRevenueAttributionRecordEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
