package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppUsageRecordEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppUsageRecordEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AppUsageRecordEdge"));
  }

  public AppUsageRecordEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppUsageRecordProjection<AppUsageRecordEdgeProjection<PARENT, ROOT>, ROOT> node() {
     AppUsageRecordProjection<AppUsageRecordEdgeProjection<PARENT, ROOT>, ROOT> projection = new AppUsageRecordProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public AppUsageRecordEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
