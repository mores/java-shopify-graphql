package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AnalyticsAnnotationEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AnalyticsAnnotationEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AnalyticsAnnotationEdge"));
  }

  public AnalyticsAnnotationEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AnalyticsAnnotationProjection<AnalyticsAnnotationEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     AnalyticsAnnotationProjection<AnalyticsAnnotationEdgeProjection<PARENT, ROOT>, ROOT> projection = new AnalyticsAnnotationProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public AnalyticsAnnotationEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
