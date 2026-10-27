package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AnalyticsTargetEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AnalyticsTargetEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AnalyticsTargetEdge"));
  }

  public AnalyticsTargetEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AnalyticsTargetProjection<AnalyticsTargetEdgeProjection<PARENT, ROOT>, ROOT> node() {
     AnalyticsTargetProjection<AnalyticsTargetEdgeProjection<PARENT, ROOT>, ROOT> projection = new AnalyticsTargetProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public AnalyticsTargetEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
