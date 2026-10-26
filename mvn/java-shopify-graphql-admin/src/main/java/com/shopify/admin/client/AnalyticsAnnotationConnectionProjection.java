package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AnalyticsAnnotationConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AnalyticsAnnotationConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AnalyticsAnnotationConnection"));
  }

  public AnalyticsAnnotationConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AnalyticsAnnotationEdgeProjection<AnalyticsAnnotationConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     AnalyticsAnnotationEdgeProjection<AnalyticsAnnotationConnectionProjection<PARENT, ROOT>, ROOT> projection = new AnalyticsAnnotationEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public AnalyticsAnnotationProjection<AnalyticsAnnotationConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     AnalyticsAnnotationProjection<AnalyticsAnnotationConnectionProjection<PARENT, ROOT>, ROOT> projection = new AnalyticsAnnotationProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<AnalyticsAnnotationConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<AnalyticsAnnotationConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
