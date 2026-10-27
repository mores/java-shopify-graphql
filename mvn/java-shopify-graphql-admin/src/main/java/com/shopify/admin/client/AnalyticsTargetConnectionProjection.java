package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AnalyticsTargetConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AnalyticsTargetConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AnalyticsTargetConnection"));
  }

  public AnalyticsTargetConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AnalyticsTargetEdgeProjection<AnalyticsTargetConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     AnalyticsTargetEdgeProjection<AnalyticsTargetConnectionProjection<PARENT, ROOT>, ROOT> projection = new AnalyticsTargetEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public AnalyticsTargetProjection<AnalyticsTargetConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     AnalyticsTargetProjection<AnalyticsTargetConnectionProjection<PARENT, ROOT>, ROOT> projection = new AnalyticsTargetProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<AnalyticsTargetConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<AnalyticsTargetConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
