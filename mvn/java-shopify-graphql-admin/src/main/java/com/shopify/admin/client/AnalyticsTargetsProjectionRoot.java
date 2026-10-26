package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AnalyticsTargetsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AnalyticsTargetsProjectionRoot() {
    super(null, null, java.util.Optional.of("AnalyticsTargetConnection"));
  }

  public AnalyticsTargetsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AnalyticsTargetEdgeProjection<AnalyticsTargetsProjectionRoot<PARENT, ROOT>, AnalyticsTargetsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    AnalyticsTargetEdgeProjection<AnalyticsTargetsProjectionRoot<PARENT, ROOT>, AnalyticsTargetsProjectionRoot<PARENT, ROOT>> projection = new AnalyticsTargetEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public AnalyticsTargetProjection<AnalyticsTargetsProjectionRoot<PARENT, ROOT>, AnalyticsTargetsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    AnalyticsTargetProjection<AnalyticsTargetsProjectionRoot<PARENT, ROOT>, AnalyticsTargetsProjectionRoot<PARENT, ROOT>> projection = new AnalyticsTargetProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<AnalyticsTargetsProjectionRoot<PARENT, ROOT>, AnalyticsTargetsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<AnalyticsTargetsProjectionRoot<PARENT, ROOT>, AnalyticsTargetsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
