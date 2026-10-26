package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AnalyticsAnnotationDeleteUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AnalyticsAnnotationDeleteUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AnalyticsAnnotationDeleteUserError"));
  }

  public AnalyticsAnnotationDeleteUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AnalyticsAnnotationDeleteUserErrorCodeProjection<AnalyticsAnnotationDeleteUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     AnalyticsAnnotationDeleteUserErrorCodeProjection<AnalyticsAnnotationDeleteUserErrorProjection<PARENT, ROOT>, ROOT> projection = new AnalyticsAnnotationDeleteUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public AnalyticsAnnotationDeleteUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public AnalyticsAnnotationDeleteUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
