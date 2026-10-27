package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AnalyticsAnnotationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AnalyticsAnnotationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AnalyticsAnnotation"));
  }

  public AnalyticsAnnotationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppProjection<AnalyticsAnnotationProjection<PARENT, ROOT>, ROOT> createdByApp() {
     AppProjection<AnalyticsAnnotationProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());
     getFields().put("createdByApp", projection);
     return projection;
  }

  public AnalyticsAnnotationSourceProjection<AnalyticsAnnotationProjection<PARENT, ROOT>, ROOT> source(
      ) {
     AnalyticsAnnotationSourceProjection<AnalyticsAnnotationProjection<PARENT, ROOT>, ROOT> projection = new AnalyticsAnnotationSourceProjection<>(this, getRoot());
     getFields().put("source", projection);
     return projection;
  }

  public AnalyticsAnnotationProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public AnalyticsAnnotationProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public AnalyticsAnnotationProjection<PARENT, ROOT> endedAt() {
    getFields().put("endedAt", null);
    return this;
  }

  public AnalyticsAnnotationProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public AnalyticsAnnotationProjection<PARENT, ROOT> startedAt() {
    getFields().put("startedAt", null);
    return this;
  }

  public AnalyticsAnnotationProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public AnalyticsAnnotationProjection<PARENT, ROOT> type() {
    getFields().put("type", null);
    return this;
  }

  public AnalyticsAnnotationProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
